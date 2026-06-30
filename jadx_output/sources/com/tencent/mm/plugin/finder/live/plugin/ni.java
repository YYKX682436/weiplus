package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ni extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f113634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oi f113635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(ya2.b2 b2Var, com.tencent.mm.plugin.finder.live.plugin.oi oiVar) {
        super(0);
        this.f113634d = b2Var;
        this.f113635e = oiVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.u74 u74Var;
        com.tencent.mm.plugin.finder.live.plugin.oi oiVar = this.f113635e;
        ya2.b2 b2Var = this.f113634d;
        if (b2Var != null) {
            boolean f17 = hc2.s.f(b2Var);
            boolean a17 = hc2.s.a(b2Var);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFollowGuidePlugin", "liveFollowGuideQuitBtnTv click, nickName:" + b2Var.w0() + ", isPrivate:" + f17 + " , isBlock" + a17);
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = oiVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
            java.lang.String D0 = b2Var.D0();
            long j17 = ((mm2.e1) oiVar.P0(mm2.e1.class)).f328983m;
            dk2.xf W0 = oiVar.W0();
            r45.o72 K = W0 != null ? ((dk2.r4) W0).K(((mm2.e1) oiVar.P0(mm2.e1.class)).f328988r.getLong(0)) : null;
            com.tencent.mm.protobuf.g h17 = pm0.b0.h(((mm2.e1) oiVar.P0(mm2.e1.class)).f328985o);
            r45.v74 v74Var = ((mm2.e1) oiVar.P0(mm2.e1.class)).f328980g;
            c61.yb.R8(ybVar, V6, D0, 1, j17, f17, null, K, 3, null, h17, (v74Var == null || (u74Var = (r45.u74) v74Var.getCustom(2)) == null) ? null : u74Var.getByteString(0), null, null, 6432, null);
            android.view.ViewGroup viewGroup = oiVar.f365323d;
            db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.f492274fw4));
            if (a17) {
                java.lang.String D02 = b2Var.D0();
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveFollowGuidePlugin", "[doBlockOpLog] ");
                oiVar.f113757q = new com.tencent.mm.plugin.finder.live.plugin.ei();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.j9.b(ya2.r.f460525a, D02, false, null, null, oiVar.f113757q, 12, null);
            }
        }
        oiVar.K0(8);
        oiVar.f113756p.statusChange(qo0.b.E4, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.f327951h, null, null, null, null, null, false, 126, null);
        return jz5.f0.f302826a;
    }
}
