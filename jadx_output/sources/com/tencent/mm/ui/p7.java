package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class p7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.p7 f209495d = new com.tencent.mm.ui.p7();

    public p7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_is_find_tab_show_search, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.HomeUISearchEntranceHelper", "isFindTabShowSearch expt val:" + Ni);
        return java.lang.Boolean.valueOf(Ni == 1);
    }
}
