package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class t implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.y55 f148484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.u f148485b;

    public t(com.tencent.mm.plugin.mall.ui.u uVar, r45.y55 y55Var) {
        this.f148485b = uVar;
        this.f148484a = y55Var;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        r45.y55 y55Var = this.f148484a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "click switch: %s, id: %s", valueOf, y55Var.f390802d);
        if (z17) {
            y55Var.f390803e = 0;
        } else {
            y55Var.f390803e = 1;
        }
        com.tencent.mm.plugin.mall.ui.u uVar = this.f148485b;
        if (z17) {
            uVar.f148499f.announceForAccessibility(uVar.f148501h.getString(com.tencent.mm.R.string.gar));
        } else {
            uVar.f148499f.announceForAccessibility(uVar.f148501h.getString(com.tencent.mm.R.string.gaw));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(y55Var);
        com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI = uVar.f148501h;
        mallFunctionSettingsUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "do batch function operate");
        ef3.a aVar = new ef3.a(linkedList, mallFunctionSettingsUI.f148235i, 0);
        aVar.l().h(new com.tencent.mm.plugin.mall.ui.q(mallFunctionSettingsUI, aVar));
    }
}
