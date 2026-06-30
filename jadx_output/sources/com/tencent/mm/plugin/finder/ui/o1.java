package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q21 f129565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129566e;

    public o1(r45.q21 q21Var, com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI) {
        this.f129565d = q21Var;
        this.f129566e = finderBlackListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1001) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f280114e;
            java.lang.String string = this.f129565d.getString(2);
            if (string == null) {
                string = "";
            }
            com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI = this.f129566e;
            yVar.getClass();
            r45.kh2 kh2Var = new r45.kh2();
            kh2Var.set(4, string);
            kh2Var.set(0, 2);
            hb2.w0.m(yVar, kh2Var, finderBlackListUI, false, false, null, null, 60, null);
            pm0.v.X(hb2.x.f280111d);
        }
    }
}
