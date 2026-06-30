package vg2;

/* loaded from: classes3.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.v0 f436586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f436587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f436588f;

    public t0(vg2.v0 v0Var, java.util.List list, km2.q qVar) {
        this.f436586d = v0Var;
        this.f436587e = list;
        this.f436588f = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$showWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.v0 v0Var = this.f436586d;
        vg2.j0 j0Var = new vg2.j0(v0Var.f436600a);
        j0Var.f436523h = vg2.r0.f436559d;
        j0Var.f436524i = new vg2.s0(v0Var);
        java.util.List couponInfoList = this.f436587e;
        kotlin.jvm.internal.o.g(couponInfoList, "couponInfoList");
        j0Var.f436529q = this.f436588f;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) j0Var.f436528p;
        arrayList2.clear();
        arrayList2.addAll(couponInfoList);
        vg2.h0 h0Var = j0Var.f436527o;
        if (h0Var != null) {
            h0Var.notifyDataSetChanged();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = j0Var.f436525m;
        if (weImageView != null) {
            weImageView.setOnClickListener(new vg2.i0(j0Var));
        }
        j0Var.w();
        v0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$showWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
