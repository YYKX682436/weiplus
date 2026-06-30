package com.tencent.mm.repairer.config.textstatus.multiple;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/textstatus/multiple/RepairerConfigTextStatusAllSwitchDebugOpt;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigTextStatusAllSwitchDebugOpt extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_".concat(com.tencent.mm.repairer.config.textstatus.multiple.RepairerConfigTextStatusAllSwitchDebugOpt.class.getName());
    }

    @Override // q55.h
    public java.lang.String c() {
        return "状态性能优化总开关 (by realhe)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.textstatus.multiple.RepairerGroupTextStatusMultipleTest.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a() ? 1 : 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_status_perf_opt_all_switch_debug";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("强制全关", "强制全开", "使用独立开关");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("0", "1", "2");
    }
}
