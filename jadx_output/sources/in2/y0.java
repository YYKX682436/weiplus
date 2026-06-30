package in2;

/* loaded from: classes10.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f292934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f292935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292936f;

    public y0(in2.a1 a1Var, dk2.yg ygVar, int i17) {
        this.f292934d = a1Var;
        this.f292935e = ygVar;
        this.f292936f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.a1 a1Var = this.f292934d;
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) a1Var.f292794d.a(mm2.m6.class)).f329245m.getValue();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            dk2.yg ygVar = this.f292935e;
            if (ygVar.a()) {
                if (ygVar.f234397e) {
                    int i17 = 0;
                    for (java.lang.Object obj : a1Var.f292798h) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        if (i17 == this.f292936f) {
                            a1Var.notifyItemChanged(i17, java.lang.Boolean.TRUE);
                        } else {
                            a1Var.notifyItemChanged(i17, java.lang.Boolean.FALSE);
                        }
                        i17 = i18;
                    }
                } else {
                    android.content.Context context = a1Var.f292795e;
                    db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.oyx));
                }
            }
        } else {
            android.content.Context context2 = a1Var.f292795e;
            db5.t7.g(context2, context2.getResources().getString(com.tencent.mm.R.string.okd));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
