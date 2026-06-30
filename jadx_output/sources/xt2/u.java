package xt2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q45 f457033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingTagView f457034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.p45 f457035f;

    public u(r45.q45 q45Var, com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingTagView finderLiveProductPairingTagView, r45.p45 p45Var) {
        this.f457033d = q45Var;
        this.f457034e = finderLiveProductPairingTagView;
        this.f457035f = p45Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductPairingTagView$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q45 q45Var = this.f457033d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) q45Var.getCustom(4);
        if (finderJumpInfo != null) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (ga0Var = (com.tencent.mm.plugin.finder.live.plugin.ga0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ga0.class)) != null) {
                r45.ac4 ac4Var = new r45.ac4();
                ac4Var.set(6, java.lang.Boolean.TRUE);
                ac4Var.set(1, finderJumpInfo);
                if (ga0Var.x0()) {
                    com.tencent.mm.plugin.finder.live.plugin.l.s1(ga0Var, "PORTRAIT_ACTION_DISPATCH_JUMP", ac4Var, 0, 4, null);
                } else {
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    android.content.Context context = ga0Var.f365323d.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
                }
            }
        }
        int i17 = com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingTagView.f126290e;
        this.f457034e.getClass();
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f327431e;
        gVar.o("commerceAction", 1069);
        r45.p45 p45Var = this.f457035f;
        gVar.h("pairing_id", p45Var != null ? java.lang.Long.valueOf(p45Var.getLong(0)) : null);
        gVar.p("product_id", q45Var.getLong(2));
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductPairingTagView$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
