package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eb7 f117952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h4 f117953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f117954f;

    public c4(r45.eb7 eb7Var, com.tencent.mm.plugin.finder.live.widget.h4 h4Var, android.content.Context context) {
        this.f117952d = eb7Var;
        this.f117953e = h4Var;
        this.f117954f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$fillCards$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        r45.eb7 eb7Var = this.f117952d;
        r45.ce0 ce0Var = (r45.ce0) eb7Var.getCustom(3);
        if (ce0Var == null || (str = ce0Var.getString(0)) == null) {
            str = "";
        }
        b1Var.f317014b = str;
        r45.ce0 ce0Var2 = (r45.ce0) eb7Var.getCustom(3);
        if (ce0Var2 == null || (str2 = ce0Var2.getString(1)) == null) {
            str2 = "";
        }
        b1Var.f317022f = str2;
        b1Var.f317032k = 1205;
        zl2.b0 b0Var = zl2.b0.f473663a;
        com.tencent.mm.plugin.finder.live.widget.h4 h4Var = this.f117953e;
        b0Var.a(h4Var.f118528b.Y().f410646a, "", b1Var);
        android.content.Context context = h4Var.f118527a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class))).U6(h4Var.f118528b.Y().f410659n.getLong(0), b1Var);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context2 = this.f117954f;
            kotlin.jvm.internal.o.d(context2);
            dk2.q4.m(q4Var, context2, eVar, b1Var, true, null, 16, null);
        }
        long j17 = eb7Var.getLong(0);
        h4Var.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        gVar.o("commerceAction", 1028);
        gVar.p("productid", j17);
        ml2.r0.mj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$fillCards$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
