package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.b0 f154697d;

    public y(com.tencent.mm.plugin.profile.ui.tab.b0 b0Var) {
        this.f154697d = b0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            com.tencent.mm.plugin.profile.ui.tab.b0 b0Var = this.f154697d;
            java.lang.String UserName = b0Var.f154233b.f389233d.f383065d;
            kotlin.jvm.internal.o.f(UserName, "UserName");
            gr3.e.d(UserName, 1703, b0Var.f154235d, b0Var.f154232a.getIntent(), b0Var.f154248q, 0, 0, null, null, null, 0, 0, 4064, null);
            com.tencent.mm.plugin.profile.ui.tab.b0.d(b0Var, false);
        }
    }
}
