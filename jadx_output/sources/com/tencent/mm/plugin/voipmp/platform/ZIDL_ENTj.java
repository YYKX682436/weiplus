package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes8.dex */
class ZIDL_ENTj {
    public static void ZIDL_ENTjpene(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("VoipmpRepairImplOnLoader", "createVoipmpRepairImplService begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.mm.plugin.voipmp.platform.g1.f177260a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("VoipmpRepairImplOnLoader", "VoipmpRepairImplService impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("VoipmpRepairImplOnLoader", "createVoipmpRepairImplService done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
