package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class eb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.eb f126701d = new com.tencent.mm.plugin.finder.storage.eb();

    public eb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "开启完播跟赞", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_follow_like_recommend_enable, false, 2, null);
        aVar.a("FINDER_ENABLE_FOLLOW_LIKE_RECOMMEND", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        return aVar;
    }
}
