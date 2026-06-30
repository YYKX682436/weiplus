package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yg f128387d = new com.tencent.mm.plugin.finder.storage.yg();

    public yg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否开启星标/点赞搜索", null, null, 12, null);
        aVar.a("FINDER_INTERACTION_SEARCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_interaction_search_switch_android, false, 2, null);
        return aVar;
    }
}
