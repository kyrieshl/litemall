var util = require('../../utils/util.js');
var api = require('../../config/api.js');
const pay = require('../../services/pay.js');

var app = getApp();
Page({
  data: {
    status: false,
    orderId: 0
  },
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
    this.setData({
      orderId: options.orderId,
      status: options.status === '1' ? true : false
    })
  },
  payOrder: function () {
    let that = this;
    wx.showModal({
      title: '目前不能微信支付',
      content: '点击确定模拟支付成功，点击取消模拟未支付成功',
      success: function (res) {
        if (res.confirm) {
          util.request(api.OrderPay, { orderId: that.data.orderId } , 'POST').then(res => {
            if (res.errno === 0) {
              wx.redirectTo({
                url: '/pages/payResult/payResult?status=1&orderId=' + that.data.orderId
              });
            }
            else {
              wx.redirectTo({
                url: '/pages/payResult/payResult?status=0&orderId=' + that.data.orderId
              });
            }
          })
        }
        else if (res.cancel) {
          wx.redirectTo({
            url: '/pages/payResult/payResult?status=0&orderId=' + that.data.orderId
          });
        }
      }
    })
  },
  onReady: function () {

  },
  onShow: function () {
    // 页面显示

  },
  onHide: function () {
    // 页面隐藏

  },
  onUnload: function () {
    // 页面关闭

  }  
})