package ry4;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401604d;

    public c1(ry4.d1 d1Var) {
        this.f401604d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$updateEmptyState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry4.d1 d1Var = this.f401604d;
        ry4.h.a(d1Var.getActivity(), d1Var.f401608d);
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$updateEmptyState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
