package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeAppBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeAppBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeAppBase) obj;
    }

    public java.lang.String documentUser() {
        return this.stub.documentUser();
    }

    public java.lang.String exptValue(java.lang.String str) {
        return this.stub.exptValue(str);
    }

    public boolean isDebugging() {
        return this.stub.isDebugging();
    }

    public boolean isForeground() {
        return this.stub.isForeground();
    }

    public boolean[] kitchenBoolValue(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.booleanJavaToJniOptional(this.stub.kitchenBoolValue(str));
    }

    public float[] kitchenFloatValue(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.floatJavaToJniOptional(this.stub.kitchenFloatValue(str));
    }

    public int[] kitchenIntValue(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.intJavaToJniOptional(this.stub.kitchenIntValue(str));
    }

    public java.lang.String kitchenStringValue(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.stringJavaToJniOptional(this.stub.kitchenStringValue(str));
    }

    public byte[] packageServerData(int i17) {
        return com.tencent.wechat.zidl2.ZidlUtil.bytesJavaToJniOptional(this.stub.packageServerData(i17));
    }

    public void reportKV(int i17, java.lang.String str) {
        this.stub.reportKV(i17, str);
    }

    public double serverNow() {
        return this.stub.serverNow();
    }
}
