package tt2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f421959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421960f;

    public m0(tt2.e1 e1Var, int i17, ut2.s3 s3Var) {
        this.f421958d = e1Var;
        this.f421959e = i17;
        this.f421960f = s3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.nt2 nt2Var;
        r45.nt2 nt2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.e1 e1Var = this.f421958d;
        int i17 = this.f421959e;
        if (e1Var.P(i17) instanceof cm2.m0) {
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
            int i18 = 0;
            if ((f6Var == null || (nt2Var2 = f6Var.E) == null || nt2Var2.getInteger(1) != 0) ? false : true) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.j0 j0Var = (ml2.j0) c17;
                mm2.f6 f6Var2 = (mm2.f6) efVar.i(mm2.f6.class);
                if (f6Var2 != null && (nt2Var = f6Var2.E) != null) {
                    i18 = nt2Var.getInteger(1);
                }
                ml2.j0.Qj(j0Var, 4, i18, 0L, 0, 12, null);
            }
        }
        tt2.e1.K(e1Var, this.f421960f, i17, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
