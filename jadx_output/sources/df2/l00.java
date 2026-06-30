package df2;

/* loaded from: classes3.dex */
public final class l00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230620d;

    public l00(df2.m00 m00Var) {
        this.f230620d = m00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ce0 ce0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ShopVIPController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.m00 m00Var = this.f230620d;
        r45.j92 j92Var = (r45.j92) ((mm2.f6) m00Var.business(mm2.f6.class)).f329042p1.getValue();
        if (j92Var != null && (ce0Var = (r45.ce0) j92Var.getCustom(1)) != null) {
            st2.c2 c2Var = st2.c2.f412249a;
            android.content.Context O6 = m00Var.O6();
            byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
            kotlin.jvm.internal.o.f(s07, "getUuidRandom(...)");
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(m00Var.O6(), c2Var.d(O6, ce0Var, 1177, s07, "", m00Var.getStore().getLiveRoomData()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ShopVIPController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
