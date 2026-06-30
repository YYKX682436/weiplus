package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.d30 f126623d = new com.tencent.mm.plugin.finder.storage.d30();

    public d30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5000, "统计网络情况时间间隔MS", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_network_statistic_interval_ms, false, 2, null);
        aVar.a("NETWORK_STATISTIC_INTERVAL_MS", kz5.c0.i(-1, 5000, 10000), kz5.c0.i("不统计", "5s", "10s"));
        return aVar;
    }
}
