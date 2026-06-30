package com.tencent.wechat.aff.ext_device;

/* loaded from: classes8.dex */
class ZIDL__YN8 {
    public static void ZIDL__YN8DBHB(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("ExtDeviceNativeOnLoader", "createExtDeviceNative begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ext_device.d.f216696a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("ExtDeviceNativeOnLoader", "ExtDeviceNative impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("ExtDeviceNativeOnLoader", "createExtDeviceNative done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
