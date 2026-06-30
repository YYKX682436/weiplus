package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class af extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.af f126430d = new com.tencent.mm.plugin.finder.storage.af();

    public af() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(90, "播放上报时间间隔(单位秒)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_heart_report_timer_interval, false, 2, null);
        aVar.a("FINDER_HEART_REPORT_TIMER_INTERVAL", kz5.c0.i(0, 10, 30, 90), kz5.c0.i("0s", "10s", "30s", "90s"));
        return aVar;
    }
}
