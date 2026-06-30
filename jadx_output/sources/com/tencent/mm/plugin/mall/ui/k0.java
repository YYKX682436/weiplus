package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexOSUI f148425d;

    public k0(com.tencent.mm.plugin.mall.ui.MallIndexOSUI mallIndexOSUI) {
        this.f148425d = mallIndexOSUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String[] strArr;
        com.tencent.mm.plugin.mall.ui.MallIndexOSUI mallIndexOSUI = this.f148425d;
        at4.s1 s1Var = mallIndexOSUI.f148271w;
        r45.z67 z67Var = s1Var.f13955r;
        boolean z17 = s1Var.f13956s;
        if (z17) {
            strArr = new java.lang.String[z67Var.f391755d.size() + 1];
            strArr[z67Var.f391755d.size()] = mallIndexOSUI.getString(com.tencent.mm.R.string.kmz);
        } else {
            strArr = new java.lang.String[z67Var.f391755d.size()];
        }
        java.lang.String[] strArr2 = strArr;
        for (int i17 = 0; i17 < z67Var.f391755d.size(); i17++) {
            strArr2[i17] = x51.j1.b(((r45.a77) z67Var.f391755d.get(i17)).f369809d);
        }
        db5.e1.h(mallIndexOSUI.getContext(), null, strArr2, null, false, new com.tencent.mm.plugin.mall.ui.j0(this, z67Var, z17));
        return true;
    }
}
