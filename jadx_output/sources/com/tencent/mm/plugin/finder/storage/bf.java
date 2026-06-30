package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class bf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.bf f126526d = new com.tencent.mm.plugin.finder.storage.bf();

    public bf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300000, "分享场景展示历史 feed有效时间(ms)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_history_valid_period_time_ms, false, 2, null);
        aVar.a("FINDER_HISTORY_VALID_PERIOD_TIME_MS", kz5.c0.i(10000, 30000, 300000), kz5.c0.i("10s", "30s", "5min"));
        return aVar;
    }
}
