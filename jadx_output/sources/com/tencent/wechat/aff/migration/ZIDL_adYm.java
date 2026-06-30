package com.tencent.wechat.aff.migration;

/* loaded from: classes8.dex */
class ZIDL_adYm {
    public static void ZIDL_adYmVsNp(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("AffMigrationProviderOnLoader", "createAffMigPlatformProvider begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.migration.d.f217389a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("AffMigrationProviderOnLoader", "AffMigPlatformProvider impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("AffMigrationProviderOnLoader", "createAffMigPlatformProvider done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
