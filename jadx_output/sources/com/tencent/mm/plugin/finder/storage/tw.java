package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class tw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.tw f128102d = new com.tencent.mm.plugin.finder.storage.tw();

    public tw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "展示热门搜索标签", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_timeline_hot_word_enable, false, 2, null);
        aVar.a("展示热门搜索标签", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("不展示", "展示"));
        return aVar;
    }
}
