package fl1;

/* loaded from: classes7.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.h1 f263812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.p1 f263813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f263814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263815g;

    public n1(fl1.h1 h1Var, fl1.p1 p1Var, yz5.l lVar, int i17) {
        this.f263812d = h1Var;
        this.f263813e = p1Var;
        this.f263814f = lVar;
        this.f263815g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.h1 h1Var = this.f263812d;
        h1Var.f263784f = true;
        fl1.p1 p1Var = this.f263813e;
        p1Var.j(true, h1Var);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : p1Var.f263843e) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            fl1.h1 h1Var2 = (fl1.h1) obj;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            int i19 = this.f263815g;
            if (i19 != i17) {
                if (h1Var2 != null && h1Var2.f263784f) {
                    h1Var2.f263784f = false;
                    arrayList2.add(java.lang.Integer.valueOf(i19));
                }
            }
            i17 = i18;
        }
        this.f263814f.invoke(arrayList2);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
