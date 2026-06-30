package com.tencent.wechat.aff.star;

/* loaded from: classes8.dex */
class ZIDL_dZKg {
    public static void ZIDL_dZKgH7aUo(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("StarSyncCppToNativeOnLoader", "createAffStarSyncCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.star.j.f217514a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("StarSyncCppToNativeOnLoader", "AffStarSyncCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("StarSyncCppToNativeOnLoader", "createAffStarSyncCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
