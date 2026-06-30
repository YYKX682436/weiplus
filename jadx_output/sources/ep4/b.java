package ep4;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep4.j f255731d;

    public b(ep4.j jVar) {
        this.f255731d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/read/EditReadPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ep4.j jVar = this.f255731d;
        jVar.f255750h = -1;
        jVar.f255751i = false;
        ((android.view.ViewGroup) ((jz5.n) jVar.f255753n).getValue()).setVisibility(4);
        jVar.f255748f.setVisibility(8);
        ju3.c0 c0Var = ju3.c0.F2;
        ju3.d0 d0Var = jVar.f465332d;
        ju3.d0.k(d0Var, c0Var, null, 2, null);
        ju3.d0.k(d0Var, ju3.c0.f301914x2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/read/EditReadPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
