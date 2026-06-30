package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBizDetailUI f138174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a23.e f138175e;

    public s1(com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI, a23.e eVar) {
        this.f138174d = fTSBizDetailUI;
        this.f138175e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a23.e eVar = this.f138175e;
        java.lang.String str = eVar.f849a;
        com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = this.f138174d;
        com.tencent.mm.plugin.fts.ui.FTSBizDetailUI.f7(fTSBizDetailUI, str);
        a23.g gVar = fTSBizDetailUI.f137950t;
        if (gVar != null) {
            gVar.a(eVar.f849a, false, fTSBizDetailUI.h7(), fTSBizDetailUI.g7(), java.lang.String.valueOf(fTSBizDetailUI.H));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
