package com.tencent.mm.plugin.finder.live.widget;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.if, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.of f118671d;

    public Cif(com.tencent.mm.plugin.finder.live.widget.of ofVar) {
        this.f118671d = ofVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.of ofVar = this.f118671d;
        android.view.View view2 = ofVar.f119289m;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("coverContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "delCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "delCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = ofVar.f119288i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("goSelectPhotoView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "delCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "delCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ofVar.f119298v = null;
        ofVar.f119299w = null;
        ofVar.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
