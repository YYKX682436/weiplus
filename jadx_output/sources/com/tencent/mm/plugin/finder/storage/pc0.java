package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pc0 f127364d = new com.tencent.mm.plugin.finder.storage.pc0();

    public pc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(100, "发表耗时上报整体最大条数", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_time_report_total_max_size, false, 2, null);
        aVar.a("FINDER_POST_TIME_REPORT_TOTAL_MAX_SIZE", kz5.c0.i(20, 100, 300), kz5.c0.i("20条", "100条", "300条"));
        return aVar;
    }
}
