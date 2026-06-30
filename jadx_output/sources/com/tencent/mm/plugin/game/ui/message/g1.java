package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class g1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.h1 f141555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f141556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.j1 f141557f;

    public g1(com.tencent.mm.plugin.game.ui.message.j1 j1Var, com.tencent.mm.plugin.game.ui.message.h1 h1Var, android.view.View view) {
        this.f141557f = j1Var;
        this.f141555d = h1Var;
        this.f141556e = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 11) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().delete(this.f141555d.f141562a, new java.lang.String[0]);
            com.tencent.mm.plugin.game.ui.message.i1 i1Var = this.f141557f.f141576e;
            if (i1Var != null) {
                i1Var.a();
                return;
            }
            return;
        }
        if (menuItem.getItemId() != 12) {
            if (menuItem.getItemId() == 13) {
                r53.f.C(this.f141555d.f141562a.K2.f140561s, false);
                db5.t7.h(this.f141556e.getContext(), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.fpc));
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.fon));
        u1Var.m(com.tencent.mm.R.string.foo);
        u1Var.a(true);
        u1Var.b(new com.tencent.mm.plugin.game.ui.message.f1(this));
        u1Var.e(new com.tencent.mm.plugin.game.ui.message.e1(this));
        u1Var.q(false);
    }
}
