package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class od implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sd f129600d;

    public od(com.tencent.mm.plugin.finder.ui.sd sdVar) {
        this.f129600d = sdVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.ui.sd sdVar = this.f129600d;
        switch (itemId) {
            case 4000:
                com.tencent.mm.plugin.finder.ui.sd.a(sdVar, false);
                return;
            case 4001:
                if (hz2.d.f286313a.a("personalInfo")) {
                    return;
                }
                sdVar.getClass();
                boolean l17 = gm0.j1.u().l();
                com.tencent.mm.ui.MMActivity mMActivity = sdVar.f129803a;
                if (!l17) {
                    db5.t7.k(mMActivity, null);
                    return;
                } else {
                    ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.l7.e(mMActivity, 2001, 1, 5, null);
                    return;
                }
            case 4002:
                com.tencent.mm.plugin.finder.ui.sd.a(sdVar, true);
                return;
            case com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE /* 4003 */:
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(sdVar.f129803a);
                u1Var.g(sdVar.f129803a.getResources().getString(com.tencent.mm.R.string.cnt));
                u1Var.a(true);
                u1Var.b(new com.tencent.mm.plugin.finder.ui.md(sdVar));
                u1Var.e(com.tencent.mm.plugin.finder.ui.nd.f129549d);
                u1Var.q(false);
                return;
            default:
                return;
        }
    }
}
