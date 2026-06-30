package el2;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rc2 f253801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f253802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(r45.rc2 rc2Var, el2.i2 i2Var) {
        super(0);
        this.f253801d = rc2Var;
        this.f253802e = i2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        byte[] bArr = null;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = k0Var != null ? (com.tencent.mm.plugin.finder.live.plugin.ea0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ea0.class) : null;
        el2.i2 i2Var = this.f253802e;
        if (ea0Var != null) {
            r45.rc2 rc2Var = this.f253801d;
            r45.f52 f52Var = (r45.f52) rc2Var.getCustom(3);
            if (f52Var != null && f52Var.getInteger(0) == 5) {
                com.tencent.mars.xlog.Log.i(i2Var.f253829m, "[startPollingPromoteInfo] need_reexpose_report, trigger reReportExpose");
                r45.y23 y23Var = new r45.y23();
                r45.f52 f52Var2 = (r45.f52) rc2Var.getCustom(3);
                if (f52Var2 != null && (byteString = f52Var2.getByteString(2)) != null) {
                    bArr = byteString.g();
                }
                if (bArr != null) {
                    try {
                        y23Var.parseFrom(bArr);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                boolean z17 = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f329049w instanceof cm2.m0;
                java.lang.String str = ea0Var.f112390t;
                if (z17) {
                    com.tencent.mars.xlog.Log.i(str, "tryReportBubbleReExpose");
                    xt2.e3 y17 = ea0Var.y1();
                    y17.getClass();
                    int liveRole = y17.f456703e.getLiveRole();
                    java.lang.String str2 = y17.f456706h;
                    if (liveRole != 0) {
                        com.tencent.mars.xlog.Log.i(str2, "reReportExpose return, role != VISITOR");
                    } else if (y23Var.getLong(0) == 0) {
                        com.tencent.mars.xlog.Log.i(str2, "reReportExpose return, productData is null or invalid");
                    } else if (y17.R == null) {
                        com.tencent.mars.xlog.Log.i(str2, "reReportExpose return, liveData is null");
                    } else {
                        com.tencent.mars.xlog.Log.i(str2, "reReportExpose, productId=" + y23Var.getLong(0));
                        y17.g(124, y23Var);
                        y17.h(new cm2.m0(y23Var));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(str, "tryReportBubbleReExpose return, no product bubble shown");
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.i(i2Var.f253829m, "[startPollingPromoteInfo] need rereport expose but no product bubble plugin or not product type");
        return jz5.f0.f302826a;
    }
}
