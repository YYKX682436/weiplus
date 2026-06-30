package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigTinkerSuicideDisableV2;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigTinkerSuicideDisableV2 extends q55.i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f192219a = kz5.c0.i("否", "是");

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_DisableTinkerSuicideV2";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "禁用 Tinker 新的轮询检测重启策略";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupGlobal.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_android_tinker_suicide_disable_v2";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return f192219a;
    }
}
