package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class v6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.x6 f151501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f151502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f151503f;

    public v6(com.tencent.mm.plugin.mv.ui.uic.x6 x6Var, r45.ss4 ss4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f151501d = x6Var;
        this.f151502e = ss4Var;
        this.f151503f = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.mv.ui.uic.x6 x6Var = this.f151501d;
        int i18 = x6Var.f151531e;
        r45.ss4 ss4Var = this.f151502e;
        if (itemId == i18) {
            x6Var.f151535i = xy2.c.e(x6Var.getContext()).length() == 0;
            x6Var.P6(true, true, ss4Var);
        } else if (itemId != x6Var.f151532f) {
            this.f151503f.u();
        } else {
            x6Var.f151535i = false;
            x6Var.P6(false, false, ss4Var);
        }
    }
}
