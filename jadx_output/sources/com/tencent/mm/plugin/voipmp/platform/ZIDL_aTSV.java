package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes8.dex */
class ZIDL_aTSV {
    public static void ZIDL_aTSVJ9_Cs(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("VoipmpDartToNativeOnLoader", "createVoipNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.mm.plugin.voipmp.platform.a1.f177222a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("VoipmpDartToNativeOnLoader", "VoipNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("VoipmpDartToNativeOnLoader", "createVoipNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
