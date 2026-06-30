package jk2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f300061d;

    public b(gx2.q qVar) {
        this.f300061d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/LiveEntranceEducationDialogHelper$checkShowEducationDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328003x3, new java.util.HashMap(), null, "135", null, null, false, 116, null);
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f300061d, false, null, false, null, 15, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/LiveEntranceEducationDialogHelper$checkShowEducationDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
