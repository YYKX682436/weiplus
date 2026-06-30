package com.tencent.mm.repairer.config.ting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/ting/RepairerConfigTingCenterControllerEnable;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigTingCenterControllerEnable extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_TingCenterControllerEnable";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "是否显示下拉中控";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupTing.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 1;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_ting_taskbar_xlab_force_control";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("根据播放行为决定是否显示中控", "显示中控", "不显示中控");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("0", "1", "2");
    }
}
