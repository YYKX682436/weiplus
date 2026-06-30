package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.of f118755d;

    public jf(com.tencent.mm.plugin.finder.live.widget.of ofVar) {
        this.f118755d = ofVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.of ofVar = this.f118755d;
        com.tencent.mm.plugin.finder.live.view.n4 n4Var = new com.tencent.mm.plugin.finder.live.view.n4(ofVar.f118381d);
        n4Var.f116512y = new com.tencent.mm.plugin.finder.live.widget.kf(ofVar);
        n4Var.f116513z = new com.tencent.mm.plugin.finder.live.widget.lf(ofVar);
        int i17 = ofVar.f119296t;
        int i18 = ofVar.f119297u;
        n4Var.w();
        n4Var.f116510w = i17;
        n4Var.f116511x = i18;
        if (i17 == 0) {
            n4Var.z(true);
        } else if (i17 != 2) {
            n4Var.y(true);
        } else {
            n4Var.A(true);
        }
        ofVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
