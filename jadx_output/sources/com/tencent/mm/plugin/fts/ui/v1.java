package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBizDetailUI f138200d;

    public v1(com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI) {
        this.f138200d = fTSBizDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = this.f138200d;
        a23.g gVar = fTSBizDetailUI.f137950t;
        if (gVar != null) {
            java.util.List b17 = gVar.b();
            b17.clear();
            a23.d.f848a.a(gVar.f870a, b17);
        }
        android.widget.LinearLayout linearLayout = fTSBizDetailUI.f137949s;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
