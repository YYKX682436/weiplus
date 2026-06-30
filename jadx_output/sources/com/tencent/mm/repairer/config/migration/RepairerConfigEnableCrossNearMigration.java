package com.tencent.mm.repairer.config.migration;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/migration/RepairerConfigEnableCrossNearMigration;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigEnableCrossNearMigration extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_EnableCrossNearMigration";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "是否开启跨平台近场迁移";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMigration.class;
    }

    @Override // q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_enable_cross_near_migration";
    }
}
