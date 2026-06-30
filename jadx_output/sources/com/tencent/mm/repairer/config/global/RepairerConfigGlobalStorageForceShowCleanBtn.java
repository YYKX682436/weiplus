package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigGlobalStorageForceShowCleanBtn;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RepairerConfigGlobalStorageForceShowCleanBtn extends q55.f {
    public static final boolean n() {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageOtherResAndAccSeparating()) > 0) {
            return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageForceShowCleanBtn()) > 0;
        }
        return false;
    }

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_GlobalStorageForceShowCleanBt_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "强制显示清理按钮(方便测试, 开启: >=1)";
    }

    @Override // q55.h
    public int d() {
        return 5;
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupStorage.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_clean_force_show_clean_btn";
    }
}
