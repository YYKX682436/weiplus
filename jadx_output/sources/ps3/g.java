package ps3;

/* loaded from: classes11.dex */
public final class g implements c01.zc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358083d;

    public g(ps3.m mVar) {
        this.f358083d = mVar;
    }

    @Override // c01.zc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        java.lang.String g17 = x51.j1.g(addMsgInfo.f70726a.f377561h);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 != null && kotlin.jvm.internal.o.b(d17.get(".sysmsg.addcontact.type"), "1")) {
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.addcontact.username");
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.addcontact.encryptusername");
            if (!(str == null || r26.n0.N(str))) {
                if (!(str2 == null || r26.n0.N(str2))) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    z3Var.X1(str);
                    z3Var.K1(str2);
                    this.f358083d.e(z3Var);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.RadarAddContact", "error! server return incorrect content! : %s", g17);
        }
    }

    @Override // c01.zc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
        throw new jz5.k("An operation is not implemented: not implemented");
    }
}
