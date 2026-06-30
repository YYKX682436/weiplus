package hy4;

/* loaded from: classes8.dex */
public final class n0 implements o04.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.h0 f286182d;

    public n0(java.lang.String str, java.lang.String str2, java.lang.String str3, r01.h0 h0Var) {
        this.f286179a = str;
        this.f286180b = str2;
        this.f286181c = str3;
        this.f286182d = h0Var;
    }

    @Override // o04.p
    public r45.x60 a() {
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.odq);
        java.lang.String str = this.f286179a;
        if (str.length() > 0) {
            ((r01.l1) i95.n0.c(r01.l1.class)).getClass();
            if (com.tencent.mm.storage.z3.F3(str) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui()) {
                g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.pba);
            }
        }
        r45.x60 x60Var = new r45.x60();
        x60Var.f389813d = this.f286180b;
        x60Var.f389814e = "1";
        x60Var.f389816g = g17;
        r45.ea7 ea7Var = new r45.ea7();
        ea7Var.f373204d = this.f286181c;
        ea7Var.f373205e = this.f286182d.f368102j;
        try {
            x60Var.f389815f = com.tencent.mm.protobuf.g.b(ea7Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewRestorePageHelper", "set customInfo exception:%s", e17.getMessage());
        }
        return x60Var;
    }
}
