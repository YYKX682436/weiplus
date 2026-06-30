package ia2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia2.b f289896d;

    public a(ia2.b bVar) {
        this.f289896d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx2.q qVar = this.f289896d.f285656a;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, gx2.r.f277376e, false, null, 13, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
