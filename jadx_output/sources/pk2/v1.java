package pk2;

/* loaded from: classes2.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356299d;

    public v1(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f356299d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreFunctionOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356299d.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreFunctionOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
