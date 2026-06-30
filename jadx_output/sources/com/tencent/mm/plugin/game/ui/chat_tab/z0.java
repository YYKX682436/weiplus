package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f141345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f141346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.c1 f141347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.d1 f141348g;

    public z0(com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var, boolean z17, int i17, com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var) {
        this.f141348g = d1Var;
        this.f141345d = z17;
        this.f141346e = i17;
        this.f141347f = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f141345d;
        com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = this.f141347f;
        if (!z17) {
            c1Var.f141250d.setVisibility(4);
            c1Var.f141249c.setVisibility(8);
            return;
        }
        int i17 = this.f141346e;
        if (i17 <= 0) {
            c1Var.f141250d.setVisibility(4);
            c1Var.f141249c.setVisibility(0);
        } else {
            this.f141348g.d(c1Var.f141250d, i17);
            c1Var.f141249c.setVisibility(4);
        }
    }
}
