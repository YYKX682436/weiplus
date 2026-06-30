package el2;

/* loaded from: classes3.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f253868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f253870f;

    public n0(com.tencent.mm.ui.widget.dialog.k0 k0Var, el2.i1 i1Var, r45.kv1 kv1Var) {
        this.f253868d = k0Var;
        this.f253869e = i1Var;
        this.f253870f = kv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f253868d.u();
        el2.i1 i1Var = this.f253869e;
        android.view.ViewGroup viewGroup = i1Var.f253812d;
        viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), 0L);
        java.lang.String string = this.f253870f.getString(0);
        if (string == null) {
            string = "";
        }
        i1Var.p(24, string, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
