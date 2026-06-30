package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeProphetPredictPositiveCallbackBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallbackBase stub;

    public CaraNativeProphetPredictPositiveCallbackBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeProphetPredictPositiveCallbackBase) obj;
    }

    public void invoke(byte[] bArr) {
        this.stub.invoke((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.tencent.wechat.zidl2.ZidlUtil.pbUnSerialize(com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.getDefaultInstance(), bArr));
    }
}
