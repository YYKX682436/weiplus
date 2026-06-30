package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class oc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oc0 f127306d = new com.tencent.mm.plugin.finder.storage.oc0();

    public oc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(20, "发表耗时上报同个模块最大条数", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_time_report_module_max_size, false, 2, null);
        aVar.a("FINDER_POST_TIME_REPORT_MODULE_MAX_SIZE", kz5.c0.i(10, 20, 50), kz5.c0.i("10条", "20条", "50条"));
        return aVar;
    }
}
