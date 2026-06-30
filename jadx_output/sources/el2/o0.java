package el2;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f253879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f253880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f253881g;

    public o0(el2.i1 i1Var, r45.kv1 kv1Var, boolean z17, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f253878d = i1Var;
        this.f253879e = kv1Var;
        this.f253880f = z17;
        this.f253881g = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        el2.i1 i1Var = this.f253878d;
        i1Var.f253821p = true;
        android.view.ViewGroup viewGroup = i1Var.f253812d;
        viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), i1Var.f253824s);
        r45.kv1 kv1Var = this.f253879e;
        el2.i1.l(i1Var, kv1Var, 1, this.f253880f);
        el2.i1.m(i1Var);
        this.f253881g.u();
        java.lang.String string = kv1Var.getString(0);
        if (string == null) {
            string = "";
        }
        i1Var.p(25, string, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
