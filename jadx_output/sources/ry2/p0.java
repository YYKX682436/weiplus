package ry2;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ry2.q0 q0Var) {
        super(0);
        this.f401445d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.util.ArrayList arrayList = this.f401445d.f401457y;
        if (arrayList != null && (str = (java.lang.String) kz5.n0.Z(arrayList)) != null) {
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            java.lang.String aj6 = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).aj(str);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "setColorSpace ".concat(aj6));
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.setOriginColorSpace(aj6);
            }
        }
        return jz5.f0.f302826a;
    }
}
