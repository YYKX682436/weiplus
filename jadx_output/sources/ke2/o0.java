package ke2;

/* loaded from: classes3.dex */
public final class o0 extends az2.j {

    /* renamed from: v, reason: collision with root package name */
    public static final ke2.n0 f306976v = new ke2.n0(null);

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306977t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f306978u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(java.lang.String cgiUri, int i17, com.tencent.mm.protobuf.f req, r45.ld2 baseRequest, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(cgiUri, "cgiUri");
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(baseRequest, "baseRequest");
        this.f306977t = cgiUri;
        this.f306978u = "Finder.CgiFinderLiveTransferBuffer";
        r45.md2 md2Var = new r45.md2();
        md2Var.set(1, db2.t4.f228171a.b(i17, qt2Var));
        md2Var.set(2, baseRequest);
        md2Var.set(3, hc2.b.a(req));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = md2Var;
        r45.nd2 nd2Var = new r45.nd2();
        nd2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) nd2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = nd2Var;
        lVar.f70666c = cgiUri;
        lVar.f70667d = i17;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveTransferBuffer", "init cgiUri:" + cgiUri + ", cgiNumber:" + i17 + ", baseRequest:" + pm0.b0.g(baseRequest));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.nd2 resp = (r45.nd2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306978u, "[onCgiBack] cgiUri:" + this.f306977t + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
