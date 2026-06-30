package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ye0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ye0 f128384d = new com.tencent.mm.plugin.finder.storage.ye0();

    public ye0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "关注tab顶部是否展示红点", null, null, 12, null);
        aVar.a("FINDER_FOLLOW_TAB_REDDOT_SWITCH", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_follow_tab_reddot_switch, false, 2, null);
        return aVar;
    }
}
