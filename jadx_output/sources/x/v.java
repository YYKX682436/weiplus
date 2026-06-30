package x;

/* loaded from: classes16.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lm f450858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450859e;

    public v(df2.lm lmVar, int i17) {
        this.f450858d = lmVar;
        this.f450859e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveHonorVisitorGuideController$realShowCard$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lm lmVar = this.f450858d;
        lmVar.getClass();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var2.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var2.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(lmVar.O6(), lmVar.O6().getString(com.tencent.mm.R.string.f490604zq), true, 3, new x.r(h0Var));
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) lmVar.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) lmVar.business(mm2.e1.class)).f328983m, 1, ek2.r1.f253524u.e(true));
        pq5.g l17 = r1Var.l();
        l17.K(new x.q(lmVar, h0Var2));
        l17.f((com.tencent.mm.ui.MMActivity) lmVar.O6());
        h0Var.f310123d = r1Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 4);
        jSONObject.put("click_soure", this.f450859e);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveHonorVisitorGuideController$realShowCard$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
