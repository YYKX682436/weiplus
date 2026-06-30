package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes8.dex */
class ZIDL_oeNi {
    public static void ZIDL_oeNivDgq(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("VoipmpPlatformCameraDriverOnLoader", "createVoIPMPPlatformCameraDriver begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.mm.plugin.voipmp.platform.d1.f177238a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("VoipmpPlatformCameraDriverOnLoader", "VoIPMPPlatformCameraDriver impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("VoipmpPlatformCameraDriverOnLoader", "createVoIPMPPlatformCameraDriver done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
