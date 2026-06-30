package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class we0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.we0 f128249d = new com.tencent.mm.plugin.finder.storage.we0();

    public we0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否过滤TAB内的同城红点", null, null, 12, null);
        aVar.a("FINDER_FILTER_SAME_CITY_REDDOT_IN_SAME_CITY_TAB", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_enable_filter_same_city_reddot_in_same_city_tab, false, 2, null);
        return aVar;
    }
}
