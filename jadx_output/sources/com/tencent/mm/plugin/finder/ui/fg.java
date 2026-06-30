package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class fg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI f129238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f129239e;

    public fg(com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI, ya2.b2 b2Var) {
        this.f129238d = finderSelfQRCodeUI;
        this.f129239e = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String D0 = this.f129239e.D0();
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI.E;
        this.f129238d.c7(D0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
