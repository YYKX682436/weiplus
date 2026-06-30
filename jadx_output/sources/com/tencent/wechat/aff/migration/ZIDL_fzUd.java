package com.tencent.wechat.aff.migration;

/* loaded from: classes8.dex */
class ZIDL_fzUd {
    public static void ZIDL_fzUdcSmS(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("AffMigrationPlatformOnLoader", "createMigrationPlatform begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.migration.c.f217388a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("AffMigrationPlatformOnLoader", "MigrationPlatform impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("AffMigrationPlatformOnLoader", "createMigrationPlatform done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
