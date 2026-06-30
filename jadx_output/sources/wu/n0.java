package wu;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f449603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.view.View view) {
        super(1);
        this.f449603d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.aw2 aw2Var = (r45.aw2) obj;
        if (aw2Var != null) {
            aw2Var.set(15, "");
            m40.h0 h0Var = (m40.h0) i95.n0.c(m40.h0.class);
            android.content.Context context = this.f449603d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((j40.m) h0Var).getClass();
            c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
            p2Var.getClass();
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = aw2Var.getString(4);
            b1Var.f317022f = aw2Var.getString(5);
            b1Var.f317012a = aw2Var.getString(6);
            b1Var.f317032k = 1176;
            b1Var.f317034l = "";
            zl2.q4 q4Var = zl2.q4.f473933a;
            b1Var.f317016c = q4Var.x();
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            if (aw2Var.getInteger(35) == 0) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                finderJumpInfo.setJumpinfo_type(6);
                r45.k74 k74Var = new r45.k74();
                k74Var.set(0, aw2Var.getString(8));
                k74Var.set(1, aw2Var.getString(9));
                k74Var.set(2, java.net.URLDecoder.decode(aw2Var.getString(7), com.tencent.mapsdk.internal.rv.f51270c));
                finderJumpInfo.setLite_app_info(k74Var);
                com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo = new com.tencent.mm.protocal.protobuf.MiniAppInfo();
                miniAppInfo.setApp_id(aw2Var.getString(4));
                miniAppInfo.setPath(aw2Var.getString(5));
                miniAppInfo.setAppusername(aw2Var.getString(6));
                miniAppInfo.setVersion_type(q4Var.x());
                finderJumpInfo.setMini_app_info(miniAppInfo);
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                java.lang.String string = aw2Var.getString(15);
                java.lang.String str = string != null ? string : "";
                ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
                com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h.b(str, finderJumpInfo);
                c61.yb.nd(p2Var, context, finderJumpInfo, b1Var, 0, null, 24, null);
            } else {
                dk2.ah ahVar = new dk2.ah();
                java.lang.String string2 = aw2Var.getString(7);
                if (string2 == null) {
                    string2 = "";
                }
                ahVar.f233226v = string2;
                b1Var.f317028i = ahVar;
                s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
                java.lang.String string3 = aw2Var.getString(15);
                ((com.tencent.mm.feature.finder.live.v4) w0Var2).Dj(string3 != null ? string3 : "", b1Var);
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
