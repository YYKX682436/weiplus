package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBizDetailUI f138379d;

    public y1(com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI) {
        this.f138379d = fTSBizDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        a23.g gVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$updateFooterView$5$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag != null && (tag instanceof r45.jo0)) {
            r45.jo0 jo0Var = (r45.jo0) tag;
            r45.di6 di6Var = jo0Var.f377986d;
            java.lang.String str2 = di6Var != null ? di6Var.f372512d : null;
            com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = this.f138379d;
            com.tencent.mm.plugin.fts.ui.FTSBizDetailUI.f7(fTSBizDetailUI, str2);
            r45.h55 h55Var = fTSBizDetailUI.E;
            if (h55Var != null) {
                fTSBizDetailUI.j7(jo0Var, h55Var, 3);
            }
            if (fTSBizDetailUI.f137948r && (gVar = fTSBizDetailUI.f137950t) != null) {
                r45.di6 di6Var2 = jo0Var.f377986d;
                if (di6Var2 == null || (str = di6Var2.f372512d) == null) {
                    str = "";
                }
                gVar.a(str, false, fTSBizDetailUI.h7(), fTSBizDetailUI.g7(), java.lang.String.valueOf(fTSBizDetailUI.H));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$updateFooterView$5$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
