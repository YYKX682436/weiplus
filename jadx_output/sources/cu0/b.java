package cu0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.c f222307d;

    public b(cu0.c cVar) {
        this.f222307d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent$getView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uu3.u uVar = this.f222307d.f440224a;
        if (uVar != null) {
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(uVar, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent$getView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
