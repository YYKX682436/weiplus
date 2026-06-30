package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class e20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.e20 f126685d = new com.tencent.mm.plugin.finder.storage.e20();

    public e20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.d20 d20Var = new com.tencent.mm.plugin.finder.storage.d20();
        d20Var.g(3901, "timeline_tab_cache_time_value");
        d20Var.a("KEEP_URL_VALID_TIME", kz5.c0.i(259200, 60), kz5.c0.i("默认3天", "1分钟"));
        return d20Var;
    }
}
