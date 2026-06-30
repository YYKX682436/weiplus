package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.of f118428d;

    public gf(com.tencent.mm.plugin.finder.live.widget.of ofVar) {
        this.f118428d = ofVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yg2.b viewScope;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.widget.of ofVar = this.f118428d;
        ofVar.getClass();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
            kotlinx.coroutines.l.d(viewScope, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.nf(context, ofVar, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
