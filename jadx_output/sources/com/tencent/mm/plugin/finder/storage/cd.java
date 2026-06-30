package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cd f126579d = new com.tencent.mm.plugin.finder.storage.cd();

    public cd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "首个Feed显示后台下发下滑引导", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_first_feed_show_recommend_tips, false, 2, null);
        aVar.a("FINDER_FIRST_FEED_SHOW_RECOMMEND_TIPS", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
