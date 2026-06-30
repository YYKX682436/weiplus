package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class se0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.se0 f127545d = new com.tencent.mm.plugin.finder.storage.se0();

    public se0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否过滤TAB内的朋友红点", null, null, 12, null);
        aVar.a("FINDER_FILTER_FRIEND_REDDOT_IN_FRIEND_TAB", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_enable_filter_friend_reddot_in_friend_tab, false, 2, null);
        return aVar;
    }
}
