package xt2;

/* loaded from: classes3.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s66 f457052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList f457053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f457054f;

    public u5(r45.s66 s66Var, com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList, int i17) {
        this.f457052d = s66Var;
        this.f457053e = finderLiveShoppingSkuList;
        this.f457054f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l onSkuItemClick;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList$getAndBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ce0 ce0Var = (r45.ce0) this.f457052d.getCustom(3);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList = this.f457053e;
        if (ce0Var != null && (onSkuItemClick = finderLiveShoppingSkuList.getOnSkuItemClick()) != null) {
            onSkuItemClick.invoke(ce0Var);
        }
        int i17 = com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList.f126333p;
        finderLiveShoppingSkuList.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.I;
        cm2.m0 m0Var = finderLiveShoppingSkuList.f126339i;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("item");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(m0Var.f43369w);
        st2.g3 g3Var = st2.g3.f412326a;
        cm2.m0 m0Var2 = finderLiveShoppingSkuList.f126339i;
        if (m0Var2 == null) {
            kotlin.jvm.internal.o.o("item");
            throw null;
        }
        org.json.JSONObject k17 = g3Var.k(m0Var2.f43368v);
        k17.put(ya.b.INDEX, this.f457054f);
        ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList$getAndBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
