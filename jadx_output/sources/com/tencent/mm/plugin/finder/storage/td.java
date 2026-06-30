package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class td extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.td f128078d = new com.tencent.mm.plugin.finder.storage.td();

    public td() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.sd sdVar = new com.tencent.mm.plugin.finder.storage.sd();
        sdVar.a("FINDER_FOLLOW_TWO_FLOW_FEED", kz5.c0.i(0, 1, 2), kz5.c0.i("关闭", "关注双列流", "关心双列流(测试下线用)"));
        lb2.j.d(sdVar, e42.d0.clicfg_finder_follow_two_flow_feed, false, 2, null);
        return sdVar;
    }
}
