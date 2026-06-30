package ut2;

/* loaded from: classes3.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.a4 f431142d;

    public w3(ut2.a4 a4Var) {
        this.f431142d = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String str;
        r45.l11 l11Var;
        bw5.x7 x7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.a4 a4Var = this.f431142d;
        st2.h1 h1Var = a4Var.f430820b;
        r45.dv1 dv1Var = ((mm2.f6) h1Var.f412335f.a(mm2.f6.class)).P;
        if (dv1Var == null || (l11Var = (r45.l11) dv1Var.getCustom(27)) == null || (x7Var = (bw5.x7) l11Var.getCustom(2)) == null) {
            f0Var = null;
        } else {
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = h1Var.h().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.q.Lb((pq.q) c17, new pq.a(context), x7Var, null, 4, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var != null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        st2.h1 h1Var2 = a4Var.f430820b;
        h1Var2.getClass();
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 110);
            az2.c cVar = az2.f.f16125d;
            android.view.ViewGroup viewGroup = h1Var2.f412333d;
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            az2.f a17 = az2.c.a(cVar, context2, viewGroup.getContext().getString(com.tencent.mm.R.string.f490604zq), 500L, null, 8, null);
            a17.a();
            dk2.xf xfVar = h1Var2.f412336g;
            if (xfVar != null) {
                android.content.Context context3 = viewGroup.getContext();
                kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context3;
                long j17 = e1Var.f328988r.getLong(0);
                long j18 = e1Var.f328983m;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var == null || (str = c1Var.f328852o) == null) {
                    str = "";
                }
                ((dk2.r4) xfVar).a0(mMActivity, j17, j18, str, hx0Var, new st2.f(a17, h1Var2));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
