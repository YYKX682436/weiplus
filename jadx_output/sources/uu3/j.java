package uu3;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu3.u f431285d;

    public j(uu3.u uVar) {
        this.f431285d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer$initHeaderContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!la5.b.f317600a.g(true)) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer$initHeaderContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(this.f431285d, false, 1, null);
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer$initHeaderContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
