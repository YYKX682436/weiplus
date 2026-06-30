package dk2;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.iy1 f233416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f233417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r45.iy1 iy1Var, dk2.g0 g0Var) {
        super(0);
        this.f233416d = iy1Var;
        this.f233417e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLayerShowView: verify_mode:");
        r45.iy1 iy1Var = this.f233416d;
        sb6.append(iy1Var.getInteger(0));
        sb6.append(", verification_id:");
        sb6.append(iy1Var.getString(2));
        sb6.append(", remaining_seconds:");
        sb6.append(iy1Var.getInteger(3));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", sb6.toString());
        int integer = iy1Var.getInteger(0);
        dk2.g0 g0Var = this.f233417e;
        if (integer == 1 || integer == 2) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = g0Var.f233469b;
            if (k0Var != null) {
                java.lang.String string = iy1Var.getString(6);
                com.tencent.mm.plugin.finder.live.view.k0.showVerificationLayerInfo$default(k0Var, string == null ? "" : string, iy1Var.getString(1), iy1Var.getString(5), true, false, g0Var.f233480m, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX, null);
            }
            dk2.g0.a(g0Var, iy1Var.getInteger(3));
            g0Var.f233477j = iy1Var.getString(10);
        } else if (integer == 3) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = g0Var.f233469b;
            if (k0Var2 != null) {
                java.lang.String string2 = iy1Var.getString(6);
                com.tencent.mm.plugin.finder.live.view.k0.showVerificationLayerInfo$default(k0Var2, string2 == null ? "" : string2, iy1Var.getString(1), iy1Var.getString(5), true, false, g0Var.f233480m, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX, null);
            }
            dk2.g0.a(g0Var, iy1Var.getInteger(3));
            g0Var.f233477j = iy1Var.getString(10);
        } else if (integer == 4) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var3 = g0Var.f233469b;
            if (k0Var3 != null) {
                java.lang.String string3 = iy1Var.getString(6);
                com.tencent.mm.plugin.finder.live.view.k0.showVerificationLayerInfo$default(k0Var3, string3 == null ? "" : string3, iy1Var.getString(1), iy1Var.getString(5), true, false, g0Var.f233480m, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            }
        } else if (integer == 5) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var4 = g0Var.f233469b;
            if (k0Var4 != null) {
                java.lang.String string4 = iy1Var.getString(6);
                java.lang.String str = string4 == null ? "" : string4;
                java.lang.String string5 = iy1Var.getString(1);
                java.util.LinkedList list = iy1Var.getList(15);
                com.tencent.mm.plugin.finder.live.view.k0.showVerificationLayerInfo$default(k0Var4, str, string5, null, true, false, g0Var.f233480m, list != null ? kz5.n0.S0(list) : null, (com.tencent.mm.protocal.protobuf.FinderJumpInfo) iy1Var.getCustom(16), iy1Var.getString(17), 16, null);
            }
            g0Var.f233474g = iy1Var.getString(8);
            g0Var.f233475h = iy1Var.getInteger(12);
            g0Var.f233476i = iy1Var.getString(5);
            g0Var.f233477j = iy1Var.getString(10);
            g0Var.f233478k = iy1Var.getInteger(9);
            g0Var.f233479l = iy1Var.getInteger(18);
            dk2.g0.a(g0Var, iy1Var.getInteger(11));
        }
        return jz5.f0.f302826a;
    }
}
