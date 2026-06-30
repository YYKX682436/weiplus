package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes8.dex */
class ZIDL_SIva {
    public static void ZIDL_SIvakOGD(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("VoipmpPlatformSurfaceTextureDriverOnLoader", "createVoIPMPPlatformSurfaceTextureDriver begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.mm.plugin.voipmp.platform.f1.f177253a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("VoipmpPlatformSurfaceTextureDriverOnLoader", "VoIPMPPlatformSurfaceTextureDriver impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("VoipmpPlatformSurfaceTextureDriverOnLoader", "createVoIPMPPlatformSurfaceTextureDriver done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
