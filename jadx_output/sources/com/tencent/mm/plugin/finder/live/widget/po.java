package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class po implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f119394d;

    public po(com.tencent.mm.plugin.finder.live.widget.hp hpVar) {
        this.f119394d = hpVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f119394d;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = hpVar.V1;
            if (k0Var != null) {
                k0Var.u();
            }
            hpVar.h0(2);
            hpVar.k0(hpVar.P);
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491782e83);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.cp(hpVar, string, com.tencent.mm.R.raw.icons_outlined_done));
        }
    }
}
