package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddWw f138385d;

    public z(com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw) {
        this.f138385d = fTSAddWw;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddWw$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw = this.f138385d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSAddWw.f137910n)) {
            fTSAddWw.D = true;
            su4.k3.c(fTSAddWw.f137910n, fTSAddWw.E, 1, 16);
        }
        int i17 = com.tencent.mm.plugin.fts.ui.FTSAddWw.P;
        fTSAddWw.g7();
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddWw$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
