package lb3;

/* loaded from: classes4.dex */
public class c extends lb3.b {
    public c(java.lang.String str, java.lang.String str2, byte[] bArr) {
        r45.a25 a25Var = new r45.a25();
        a25Var.f369668d = str;
        a25Var.f369669e = str2;
        a25Var.f369670f = com.tencent.mm.protobuf.g.b(bArr);
        this.f317754b = a25Var;
    }

    @Override // lb3.b
    public r45.js5 b() {
        return new r45.b25();
    }

    @Override // lb3.b
    public int c() {
        return 2701;
    }

    @Override // lb3.b
    public java.lang.String d() {
        return "/cgi-bin/mmbiz-bin/wxahb/openwxaapphb";
    }

    @Override // lb3.b
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiEnd ");
    }

    @Override // lb3.b
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiStart ");
    }
}
