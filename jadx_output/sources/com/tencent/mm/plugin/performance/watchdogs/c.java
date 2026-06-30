package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.c f153033d = new com.tencent.mm.plugin.performance.watchdogs.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(java.lang.Math.random() < 1.0d / ((double) ih.a.c(e42.c0.clicfg_matrix_biz_memory_stat_enable_pss_stat, -1L)));
    }
}
