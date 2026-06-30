package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class uq implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f133217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133218e;

    public uq(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.lang.String str) {
        this.f133217d = mgVar;
        this.f133218e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 162) {
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f133217d;
            dk2.v4 v4Var = mgVar.f113513z;
            java.lang.String str = this.f133218e;
            java.lang.String str2 = str == null ? "" : str;
            v4Var.getClass();
            v4Var.f234233f = str2;
            v4Var.f234234g = true;
            dk2.xf W0 = mgVar.W0();
            if (W0 != null) {
                ((dk2.r4) W0).j0(str, true, mgVar.f113513z);
            }
        }
    }
}
