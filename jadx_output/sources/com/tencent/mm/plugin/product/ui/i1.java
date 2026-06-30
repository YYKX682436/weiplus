package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153305d;

    public i1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153305d = mallProductUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI = this.f153305d;
        wq3.j jVar = mallProductUI.f153262w.f153367g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar.f448551d)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new wq3.m(jVar.i(), jVar.f448551d));
        }
        jVar.c();
        mallProductUI.finish();
        return true;
    }
}
