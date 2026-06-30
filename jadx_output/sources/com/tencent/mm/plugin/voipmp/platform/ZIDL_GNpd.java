package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes8.dex */
class ZIDL_GNpd {
    public static void ZIDL_GNpdI8iE4(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("VoipmpSystemauthNativeApiOnLoader", "createVoIPMPSystemAuthNativeAPI begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.mm.plugin.voipmp.platform.i1.f177272a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("VoipmpSystemauthNativeApiOnLoader", "VoIPMPSystemAuthNativeAPI impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("VoipmpSystemauthNativeApiOnLoader", "createVoIPMPSystemAuthNativeAPI done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
