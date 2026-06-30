package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f121849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp2.b f121850g;

    public o2(in5.s0 s0Var, java.lang.String str, java.lang.Object obj, wp2.b bVar) {
        this.f121847d = s0Var;
        this.f121848e = str;
        this.f121849f = obj;
        this.f121850g = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$bindLive$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        android.content.Context context = this.f121847d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
            str = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        ml2.t1 t1Var = ml2.t1.f327942e;
        a4Var.b(str, b17, "square_card_friend_like_word", this.f121848e);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Aj(this.f121849f, this.f121850g.getFeedObject());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$bindLive$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
