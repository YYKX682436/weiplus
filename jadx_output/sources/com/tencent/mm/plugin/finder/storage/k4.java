package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.k4 f127046d = new com.tencent.mm.plugin.finder.storage.k4();

    public k4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "Timeline完播自动下滑", null, null, 12, null);
        aVar.a("FINDER_AUTO_SCROLL_NEXT_FEED_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_global_auto_scroll_next_feed, false, 2, null);
        return aVar;
    }
}
