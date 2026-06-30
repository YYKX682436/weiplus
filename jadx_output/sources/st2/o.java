package st2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(st2.h1 h1Var) {
        super(2);
        this.f412403d = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        l81.b1 b1Var = (l81.b1) obj2;
        if (b1Var != null) {
            st2.c2.f412249a.k(b1Var);
            st2.h1 h1Var = this.f412403d;
            st2.h1.b(h1Var, b1Var);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = h1Var.f412337h;
            com.tencent.mm.plugin.finder.live.view.k0 R0 = lVar != null ? lVar.R0() : null;
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R0 : null;
            ((c61.p2) ybVar).Kj(finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null, 18054, zl2.r4.k0(zl2.r4.f473950a, h1Var.f412335f, 26, null, 0, null, 28, null));
            if (h1Var.f412334e.getLiveRole() == 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("if_show_tip", h1Var.Y ? 1 : 0);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Dj((ml2.r0) c17, ml2.f4.f327434h, b1Var.f317034l, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
                h1Var.Y = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
