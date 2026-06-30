package h92;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h92.d f279688d;

    public c(h92.d dVar) {
        this.f279688d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawerBuilder$onBuildDrawerFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.view.drawer.RecyclerViewDrawer.o(this.f279688d.n(), false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawerBuilder$onBuildDrawerFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
