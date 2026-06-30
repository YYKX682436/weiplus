package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ao extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ao f126478d = new com.tencent.mm.plugin.finder.storage.ao();

    public ao() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "需要多少数据起播", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_preload_packet_duration_ms, false, 2, null);
        aVar.a("FINDER_PRELOAD_PACKET_DURATION_MS", kz5.c0.i(0, 3000, 5000, 10000), kz5.c0.i("0s", "3s", "5s", "10s"));
        return aVar;
    }
}
