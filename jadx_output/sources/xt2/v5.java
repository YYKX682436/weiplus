package xt2;

/* loaded from: classes3.dex */
public final class v5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList f457077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f457078b;

    public v5(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList, int i17) {
        this.f457077a = finderLiveShoppingSkuList;
        this.f457078b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.util.LinkedList list;
        r45.s66 s66Var;
        r45.ce0 ce0Var;
        java.util.LinkedList list2;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList = this.f457077a;
            cm2.m0 m0Var = finderLiveShoppingSkuList.f126339i;
            if (m0Var == null) {
                kotlin.jvm.internal.o.o("item");
                throw null;
            }
            r45.t66 t66Var = (r45.t66) m0Var.f43368v.getCustom(41);
            int size = (t66Var == null || (list2 = t66Var.getList(0)) == null) ? 0 : list2.size();
            int i17 = this.f457078b;
            if (i17 < size) {
                cm2.m0 m0Var2 = finderLiveShoppingSkuList.f126339i;
                if (m0Var2 == null) {
                    kotlin.jvm.internal.o.o("item");
                    throw null;
                }
                r45.t66 t66Var2 = (r45.t66) m0Var2.f43368v.getCustom(41);
                bw5.x7 x7Var = (t66Var2 == null || (list = t66Var2.getList(0)) == null || (s66Var = (r45.s66) list.get(i17)) == null || (ce0Var = (r45.ce0) s66Var.getCustom(3)) == null) ? null : (bw5.x7) ce0Var.getCustom(10);
                if (x7Var != null) {
                    android.content.Context context = finderLiveShoppingSkuList.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pq.a aVar = new pq.a(context);
                    i95.m c17 = i95.n0.c(pq.q.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    pq.q.h6((pq.q) c17, aVar, x7Var, null, null, 12, null);
                }
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c18;
            ml2.f4 f4Var = ml2.f4.H;
            cm2.m0 m0Var3 = finderLiveShoppingSkuList.f126339i;
            if (m0Var3 == null) {
                kotlin.jvm.internal.o.o("item");
                throw null;
            }
            java.lang.String valueOf = java.lang.String.valueOf(m0Var3.f43369w);
            st2.g3 g3Var = st2.g3.f412326a;
            cm2.m0 m0Var4 = finderLiveShoppingSkuList.f126339i;
            if (m0Var4 == null) {
                kotlin.jvm.internal.o.o("item");
                throw null;
            }
            org.json.JSONObject k17 = g3Var.k(m0Var4.f43368v);
            k17.put(ya.b.INDEX, i17);
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
        }
    }
}
