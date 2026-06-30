package com.tencent.wechat.aff.ecs;

/* loaded from: classes8.dex */
class ZIDL_YIGt {
    public static void ZIDL_YIGtnab6(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EcsCppToNativeOnLoader", "createAffEcsCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ecs.d.f216630a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("EcsCppToNativeOnLoader", "AffEcsCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("EcsCppToNativeOnLoader", "createAffEcsCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
