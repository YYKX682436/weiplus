package m31;

/* loaded from: classes9.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f323157e;

    public j0(m31.p1 p1Var, java.util.List list) {
        this.f323156d = p1Var;
        this.f323157e = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m31.q0 q0Var = (m31.q0) this.f323157e.get(0);
        m31.p1 p1Var = this.f323156d;
        if (!p1Var.F) {
            android.view.View a17 = o31.i.f342675a.a(p1Var.f323180d, q0Var.f323202c, 0);
            a17.setId(android.view.View.generateViewId());
            p1Var.G = java.lang.Integer.valueOf(a17.getId());
            android.view.View view2 = p1Var.f323193t;
            ((android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.cg7)).addView(a17);
            android.view.View view3 = p1Var.f323193t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "showSample", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Item;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "showSample", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Item;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p1Var.B.setText(p1Var.N);
            p1Var.f323196w.setOnClickListener(new m31.m1(p1Var));
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new m31.o1(p1Var));
            m31.o0 o0Var = p1Var.L;
            if (o0Var != null) {
                o0Var.a(q0Var.f323203d, q0Var.f323200a, ((java.util.ArrayList) p1Var.E).indexOf(q0Var));
            }
            p1Var.F = true;
        }
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
