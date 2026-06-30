package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hh0 f126896d = new com.tencent.mm.plugin.finder.storage.hh0();

    public hh0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(90, "发现页红点x同屏限制pctr计算时长", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_red_dot_x_strategy_pctr_cal_time, false, 2, null);
        aVar.a("FINDER_RED_DOT_X_STRATEGY_CAL_TIME", kz5.c0.i(1, 2, 7, 30, 90), kz5.c0.i("1天", "2天", "7天", "30天", "90天"));
        return aVar;
    }
}
