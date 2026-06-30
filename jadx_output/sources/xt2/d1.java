package xt2;

/* loaded from: classes3.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f456681d;

    public d1(so2.j5 j5Var) {
        this.f456681d = j5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.j5 j5Var = this.f456681d;
        if (j5Var instanceof cm2.m0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.T;
            java.lang.String valueOf = java.lang.String.valueOf(((cm2.m0) j5Var).f43368v.getLong(0));
            org.json.JSONObject k17 = st2.g3.f412326a.k(((cm2.m0) j5Var).f43368v);
            k17.put("if_explaining", ((cm2.m0) j5Var).f43368v.getInteger(10));
            k17.put("if_bttn_click", "1");
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
