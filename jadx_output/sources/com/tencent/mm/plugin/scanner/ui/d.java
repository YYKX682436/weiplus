package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.f f159523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f159524e;

    public d(com.tencent.mm.plugin.scanner.ui.f fVar, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f159523d = fVar;
        this.f159524e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/BaseScanF2FHongbaoUIC$showGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f159523d.getClass();
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("scan_f2f_hongbao");
        if (R != null) {
            R.putBoolean("scan_f2f_hongbao_guide_shown", true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseScanF2FHongbaoUIC", "markGuideShown: guide marked as shown for user");
        this.f159524e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/BaseScanF2FHongbaoUIC$showGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
