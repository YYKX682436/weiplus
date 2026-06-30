package com.tencent.wechat.aff.ext_device;

/* loaded from: classes8.dex */
class ZIDL_J9_A7 {
    public static void ZIDL_J9_A7t6S1(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("ExtDeviceNativeUtilOnLoader", "createExtDeviceNativeUtil begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ext_device.g.f216697a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("ExtDeviceNativeUtilOnLoader", "ExtDeviceNativeUtil impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("ExtDeviceNativeUtilOnLoader", "createExtDeviceNativeUtil done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
