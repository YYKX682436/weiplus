package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c70 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f133974g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f133975d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f133976e;

    /* renamed from: f, reason: collision with root package name */
    public int f133977f;

    static {
        new com.tencent.mm.plugin.finder.viewmodel.component.y60(null);
        f133974g = new java.util.HashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f133975d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.a70(this));
        this.f133976e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.b70(this));
        this.f133977f = -1;
    }

    public final androidx.recyclerview.widget.RecyclerView O6() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f133975d).getValue();
    }

    public final int P6() {
        return ((java.lang.Number) ((jz5.n) this.f133976e).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(3901, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        if (O6() == null) {
            return;
        }
        android.content.Context context = O6().getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        fc2.c b76 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).b7(P6());
        if (b76 != null) {
            b76.a(new com.tencent.mm.plugin.finder.viewmodel.component.z60(this));
        }
        f133974g.put(java.lang.Integer.valueOf(P6()), 0L);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(3901, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.network.v0 reqResp;
        if (i17 == 0 && i18 == 0) {
            java.lang.Object reqObj = (m1Var == null || (reqResp = m1Var.getReqResp()) == null) ? null : reqResp.getReqObj();
            if ((reqObj instanceof r45.ix2) && ((r45.ix2) reqObj).getInteger(11) == P6()) {
                this.f133977f = -1;
                f133974g.put(java.lang.Integer.valueOf(P6()), 0L);
                com.tencent.mars.xlog.Log.i("Finder.StreamPartialExposeUIC", "[onSceneEnd] tabType=" + P6() + " reset");
            }
        }
    }
}
