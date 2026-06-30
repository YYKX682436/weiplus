package ut2;

/* loaded from: classes3.dex */
public final class b0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f430829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f430830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bw5.jj0 f430831c;

    public b0(ut2.k0 k0Var, java.util.List list, bw5.jj0 jj0Var) {
        this.f430829a = k0Var;
        this.f430830b = list;
        this.f430831c = jj0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            if (zl2.r4.f473950a.w1()) {
                ut2.k0.a(this.f430829a, 13);
                return;
            }
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.f4 f4Var = ml2.f4.f327446t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : this.f430830b) {
                if (((so2.j5) obj) instanceof cm2.k0) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
                arrayList2.add((cm2.k0) j5Var);
            }
            bw5.jj0 jj0Var = this.f430831c;
            java.lang.String str = jj0Var != null ? jj0Var.f28998g[1] ? jj0Var.f28995d : "" : null;
            r0Var.Ej(f4Var, arrayList2, str != null ? str : "");
        }
    }
}
