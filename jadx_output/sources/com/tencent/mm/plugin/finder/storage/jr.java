package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jr f127026d = new com.tencent.mm.plugin.finder.storage.jr();

    public jr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "热门搜索推荐", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_search_hot, false, 2, null);
        aVar.a("FINDER_SEARCH_HOT", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
