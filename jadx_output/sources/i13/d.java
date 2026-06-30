package i13;

/* loaded from: classes2.dex */
public final class d extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287278m;

    public d(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f287278m = "MicroMsg.CgiAcceptForceNotify";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ru5 ru5Var = new r45.ru5();
        ru5Var.f385220d = data;
        lVar.f70664a = ru5Var;
        lVar.f70665b = new r45.su5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/subappforcepush";
        lVar.f70667d = 3743;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.su5 resp = (r45.su5) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        boolean a17 = gm0.j1.a();
        java.lang.String str2 = this.f287278m;
        if (!a17) {
            com.tencent.mars.xlog.Log.e(str2, "account nor ready");
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "CgiAcceptForceNotify errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e(str2, "report fail");
    }
}
