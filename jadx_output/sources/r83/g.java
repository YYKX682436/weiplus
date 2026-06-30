package r83;

/* loaded from: classes14.dex */
public class g extends k83.b {
    @Override // k83.b
    public int[] d() {
        return new int[]{227};
    }

    @Override // k83.b
    public int e() {
        return 7;
    }

    @Override // k83.b
    public void g() {
    }

    @Override // k83.b
    public void h() {
    }

    @Override // k83.b
    public void i(k83.g gVar) {
        if (gVar != null) {
            c01.d9.e().g(new p83.l(gVar.f304898a, gVar.f304900c, gVar.M));
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportService", "start report, roomid: %d, callseq: %d, isAccept: %b", java.lang.Integer.valueOf(gVar.f304898a), java.lang.Long.valueOf(gVar.f304900c), java.lang.Boolean.valueOf(gVar.M));
        }
    }
}
