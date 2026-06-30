package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class du extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.du f126671d = new com.tencent.mm.plugin.finder.storage.du();

    public du() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "出「歌曲-喜欢」轮播条，一天最多展示几次", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_show_ting_like_carousel_day_limit_android, false, 2, null);
        aVar.a("FINDER_SHOW_TING_LIKE_CAROUSEL_DAY_LIMIT", kz5.c0.i(0, 1, 2, 3, 4, 5), kz5.c0.i("0", "1", "2", "3", "4", "5"));
        return aVar;
    }
}
