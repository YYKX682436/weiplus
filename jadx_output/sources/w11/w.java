package w11;

/* loaded from: classes12.dex */
public class w extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.tc f442156a = new r45.tc();

    /* renamed from: b, reason: collision with root package name */
    public int f442157b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f442158c;

    @Override // o45.xg
    public int getFuncId() {
        return this.f442157b;
    }

    @Override // o45.zg, o45.xg
    public boolean isAxAuth() {
        return true;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        r45.he a17 = o45.bh.a(this);
        r45.tc tcVar = this.f442156a;
        tcVar.setBaseRequest(a17);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        tcVar.f386285f = wo.w0.g(true);
        fo3.s sVar = fo3.s.INSTANCE;
        tcVar.f386286g = sVar.I3(0);
        tcVar.f386287h = com.tencent.mm.sdk.platformtools.t8.j0(context);
        tcVar.f386288i = o45.wf.f343026d;
        tcVar.f386289m = com.tencent.mm.storage.la.m0();
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAxAuth", "axauth lan: %s", f17);
        tcVar.f386290n = f17;
        tcVar.f386291o = "" + com.tencent.mm.sdk.platformtools.t8.k0();
        tcVar.f386292p = com.tencent.mm.sdk.platformtools.a0.f192439b;
        try {
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(h17);
            k57Var.f378396f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.L9());
            k57Var.f378400m = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.toByteArray());
            tcVar.f386293q = cu5Var3;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMReqRespAxAuth", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        long CreateAxEcdhCryptoEngine = com.tencent.mm.jni.utils.UtilsJni.CreateAxEcdhCryptoEngine(tcVar.f386283d, this.f442158c, tcVar.f386284e.f371841f.f192156a);
        setEcdhEngine(CreateAxEcdhCryptoEngine);
        return com.tencent.mm.jni.utils.UtilsJni.AxEcdhEncrypt(CreateAxEcdhCryptoEngine, tcVar.toByteArray());
    }
}
