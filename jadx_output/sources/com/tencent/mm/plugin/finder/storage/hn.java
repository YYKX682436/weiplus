package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hn f126903d = new com.tencent.mm.plugin.finder.storage.hn();

    public hn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发表完成后landing到推荐tab", null, null, 12, null);
        aVar.a("FINDER_POST_LANDING_RECOMMEND_TAB", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        aVar.c(e42.c0.clicfg_finder_post_landing_recommend_tab, false);
        return aVar;
    }
}
