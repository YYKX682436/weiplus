package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBizDetailUI f138166d;

    public r1(com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI) {
        this.f138166d = fTSBizDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$getFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = this.f138166d;
        com.tencent.mm.plugin.fts.ui.FTSBizDetailUI.f7(fTSBizDetailUI, fTSBizDetailUI.f137910n);
        r45.h55 h55Var = fTSBizDetailUI.E;
        if (h55Var != null) {
            fTSBizDetailUI.k7(h55Var, 3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$getFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
