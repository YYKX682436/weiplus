package oa2;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.b0 f343846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb2.k0 f343847e;

    public z(oa2.b0 b0Var, vb2.k0 k0Var) {
        this.f343846d = b0Var;
        this.f343847e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicTabUIC$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f343846d.G7();
        vb2.k0 k0Var = this.f343847e;
        k0Var.f434641b.setVisibility(0);
        k0Var.f434643d.setVisibility(8);
        k0Var.f434642c.setVisibility(0);
        k0Var.f434641b.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicTabUIC$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
