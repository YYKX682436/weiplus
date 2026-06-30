package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class q4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124693d;

    public q4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124693d = s4Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124693d;
            s4Var.c(null, 4, -1);
            com.tencent.mm.plugin.finder.profile.widget.s4.b(s4Var);
            s4Var.e();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = s4Var.f124768v;
            if (k0Var != null) {
                k0Var.u();
            }
        }
    }
}
