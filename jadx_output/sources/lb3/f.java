package lb3;

/* loaded from: classes4.dex */
public class f extends lb3.b {
    public f(r45.pr5 pr5Var) {
        this.f317754b = pr5Var;
    }

    @Override // lb3.b
    public r45.js5 b() {
        return new r45.qr5();
    }

    @Override // lb3.b
    public int c() {
        return 2857;
    }

    @Override // lb3.b
    public java.lang.String d() {
        return "/cgi-bin/mmbiz-bin/wxahb/requestwxaapphb";
    }

    @Override // lb3.b
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRequestWxaHB", "CgiRequestWxaHB.onCgiEnd ");
    }

    @Override // lb3.b
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRequestWxaHB", "CgiRequestWxaHB.onCgiStart ");
    }
}
