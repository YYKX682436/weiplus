package st2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(st2.h1 h1Var) {
        super(3);
        this.f412311d = h1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errmsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        kotlin.jvm.internal.o.g((r45.o12) obj3, "<anonymous parameter 2>");
        st2.h1 h1Var = this.f412311d;
        if (booleanValue) {
            st2.h1.P(h1Var, null, 0, true, false, 8, null);
            ut2.j5 k17 = h1Var.k();
            r45.k74 k74Var = ((mm2.f6) k17.f430938f.a(mm2.f6.class)).f329031J;
            if (k74Var != null) {
                d92.f fVar = d92.f.f227470a;
                android.view.View findViewById = k17.i().findViewById(com.tencent.mm.R.id.fln);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                fVar.k(findViewById, 20.0f, 20.0f);
                android.view.View findViewById2 = k17.i().findViewById(com.tencent.mm.R.id.flo);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                fVar.h((android.widget.TextView) findViewById2, java.lang.Float.valueOf(12.0f));
                android.view.View i17 = k17.i();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(i17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkShowLicense", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(i17, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkShowLicense", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k17.i().setOnClickListener(new ut2.q4(k17, k74Var));
                android.view.View findViewById3 = k17.i().findViewById(com.tencent.mm.R.id.flo);
                android.widget.TextView textView = (android.widget.TextView) findViewById3;
                kotlin.jvm.internal.o.d(textView);
                java.lang.Float dpSize = java.lang.Float.valueOf(12.0f);
                kotlin.jvm.internal.o.g(dpSize, "dpSize");
                textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
                kotlin.jvm.internal.o.f(findViewById3, "apply(...)");
                ((android.widget.TextView) findViewById3).setTextSize(1, 12.0f);
            }
        } else {
            db5.t7.makeText(h1Var.f412333d.getContext(), h1Var.f412333d.getContext().getResources().getString(com.tencent.mm.R.string.eea), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
