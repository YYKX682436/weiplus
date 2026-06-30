package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class h9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f129320d;

    public h9(int i17, v65.n nVar, int i18) {
        this.f129320d = nVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        v65.n nVar = this.f129320d;
        if (valueOf != null && valueOf.intValue() == 1) {
            nVar.a(com.tencent.mm.plugin.finder.ui.n8.f129540d);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            nVar.a(com.tencent.mm.plugin.finder.ui.n8.f129541e);
        }
    }
}
