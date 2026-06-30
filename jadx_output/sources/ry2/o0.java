package ry2;

/* loaded from: classes10.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ry2.q0 q0Var) {
        super(0);
        this.f401443d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.h70 h70Var;
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        java.lang.String str;
        java.util.LinkedList linkedList2;
        r45.ho6 ho6Var2;
        java.util.LinkedList linkedList3;
        ry2.q0 q0Var = this.f401443d;
        r45.h70 h70Var2 = q0Var.B;
        if ((h70Var2 == null || (linkedList3 = h70Var2.f375897d) == null || linkedList3.size() != 1) ? false : true) {
            r45.h70 h70Var3 = q0Var.B;
            if (((h70Var3 == null || (linkedList2 = h70Var3.f375897d) == null || (ho6Var2 = (r45.ho6) kz5.n0.Z(linkedList2)) == null || ho6Var2.f376334e != 2) ? false : true) && (h70Var = q0Var.B) != null && (linkedList = h70Var.f375897d) != null && (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) != null && (str = ho6Var.f376333d) != null) {
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                java.lang.String aj6 = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).aj(str);
                com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "setColorSpace ".concat(aj6));
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setOriginColorSpace(aj6);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
