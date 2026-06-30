package tt2;

/* loaded from: classes3.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f421967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421968f;

    public n0(tt2.e1 e1Var, int i17, ut2.s3 s3Var) {
        this.f421966d = e1Var;
        this.f421967e = i17;
        this.f421968f = s3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.y23 y23Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.e1 e1Var = this.f421966d;
        int i17 = this.f421967e;
        so2.j5 P = e1Var.P(i17);
        cm2.m0 m0Var = P instanceof cm2.m0 ? (cm2.m0) P : null;
        tt2.e1.K(e1Var, this.f421968f, i17, (m0Var == null || (y23Var = m0Var.f43368v) == null) ? null : (r45.bd5) y23Var.getCustom(70));
        so2.j5 P2 = e1Var.P(i17);
        cm2.m0 m0Var2 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
        if (m0Var2 != null) {
            tt2.e1.W(this.f421966d, ml2.f4.f327437m, m0Var2, 1, null, this.f421968f, null, 32, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
