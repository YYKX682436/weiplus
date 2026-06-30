package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.c1 f141239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem f141240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.d1 f141242g;

    public b1(com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var, com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem, java.lang.String str) {
        this.f141242g = d1Var;
        this.f141239d = c1Var;
        this.f141240e = tabItem;
        this.f141241f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = this.f141242g;
        java.lang.String str = d1Var.f141256f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        d1Var.k(this.f141239d, this.f141240e, str.equalsIgnoreCase(this.f141241f), d1Var.f141257g);
    }
}
