package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ff implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.of f118351d;

    public ff(com.tencent.mm.plugin.finder.live.widget.of ofVar) {
        this.f118351d = ofVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.of ofVar = this.f118351d;
        ofVar.getClass();
        boolean l17 = gm0.j1.u().l();
        android.content.Context context = ofVar.f118381d;
        if (l17) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.e((com.tencent.mm.ui.MMActivity) context, 20010, 1, 28, null);
        } else {
            db5.t7.l(context);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
