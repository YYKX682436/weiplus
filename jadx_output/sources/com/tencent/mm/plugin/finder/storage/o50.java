package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class o50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o50 f127288d = new com.tencent.mm.plugin.finder.storage.o50();

    public o50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(0L, "refresh假菊花时长", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_fake_preload_tab_refresh_time, false, 2, null);
        aVar.a("TIMELINE_REFRESH_EXPIRED_TIME", new java.util.ArrayList(kz5.c0.i(500L, 100L, 200L, 400L, 500L, 600L, 700L, 800L, 1000L, 3000L)), kz5.c0.i("默认(500)", "100", "200", "400", "500", "600", "700", "800", "1000", "3000"));
        return aVar;
    }
}
