package o45;

/* loaded from: classes12.dex */
public class mg extends o45.ug {

    /* renamed from: b, reason: collision with root package name */
    public final r45.oc f342980b = new r45.oc();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f342981c;

    @Override // o45.ug
    public java.lang.String a() {
        return o45.ag.f342892a ? "/cgi-bin/micromsg-bin/secautoauth" : "/cgi-bin/micromsg-bin/autoauth";
    }

    @Override // o45.xg
    public int getFuncId() {
        return o45.ag.f342892a ? 763 : 702;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        int c17;
        gm0.m.f273235x = "";
        if (getSceneStatus() == 12) {
            c17 = 1;
        } else {
            gm0.j1.i();
            c17 = gm0.j1.u().f273148a.c(46, 0);
        }
        setRsaInfo(o45.pi.d());
        if (10002 == x51.o1.f452064q && x51.o1.f452065r > 0) {
            x51.o1.f452065r = 0;
            o45.pi.f("", "", 0);
        }
        r45.oc ocVar = this.f342980b;
        r45.mc mcVar = ocVar.f382142e;
        mcVar.setBaseRequest(o45.bh.a(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoReq", "summerauth autoauth toProtoBuf uin[%d]", java.lang.Integer.valueOf(getUin()));
        mcVar.f380345f = wo.w0.g(true);
        fo3.s sVar = fo3.s.INSTANCE;
        mcVar.f380346g = sVar.I3(c17);
        mcVar.f380347h = 0;
        mcVar.f380348i = gm0.m.e();
        mcVar.f380349m = com.tencent.mm.sdk.platformtools.t8.j0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        mcVar.f380350n = o45.wf.f343026d;
        mcVar.f380351o = com.tencent.mm.storage.la.m0();
        mcVar.f380352p = com.tencent.mm.sdk.platformtools.m2.d();
        mcVar.f380353q = "" + com.tencent.mm.sdk.platformtools.t8.k0();
        mcVar.f380354r = com.tencent.mm.sdk.platformtools.a0.f192439b;
        mcVar.f380358v = com.tencent.mm.sdk.platformtools.x2.f193072b;
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().f273148a.a(18);
        r45.zd zdVar = mcVar.f380343d;
        int i17 = zdVar.f391927i;
        r45.z57 z57Var = zdVar.f391923e;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.h(str));
        z57Var.f391742g = cu5Var;
        try {
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(h17);
            k57Var.f378396f = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(sVar.L9());
            k57Var.f378400m = cu5Var3;
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(k57Var.toByteArray());
            mcVar.f380356t = cu5Var4;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AutoReq", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        mcVar.f380359w = new r45.ye5();
        com.tencent.mm.network.j jVar = com.tencent.mm.network.j.f72026e;
        java.lang.String a17 = jVar.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            r45.ye5 ye5Var = mcVar.f380359w;
            ye5Var.f391015d = 0;
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(new byte[0]);
            ye5Var.f391016e = cu5Var5;
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoReq", "get sign key failed");
        } else {
            r45.ye5 ye5Var2 = mcVar.f380359w;
            jVar.b();
            ye5Var2.f391015d = jVar.f72027a.f391015d;
            r45.ye5 ye5Var3 = mcVar.f380359w;
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            ye5Var3.f391016e = cu5Var6;
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoReq", "autoauth add public key , length " + a17.length());
        }
        com.tencent.mm.network.i iVar = new com.tencent.mm.network.i();
        iVar.f72023b = jVar.a();
        jVar.b();
        iVar.f72022a = jVar.f72028b;
        setCGiVerifyKey(iVar);
        r45.pc pcVar = ocVar.f382141d;
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.f343011a)) {
            r45.ig0 ig0Var = new r45.ig0();
            pcVar.f382936e = ig0Var;
            ig0Var.f377011d = 713;
            r45.cu5 cu5Var7 = new r45.cu5();
            cu5Var7.d(this.f343011a);
            ig0Var.f377012e = cu5Var7;
            r45.ig0 ig0Var2 = new r45.ig0();
            ig0Var2.f377011d = 713;
            com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
            com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
            com.tencent.mm.protocal.MMProtocalJni.generateECKey(ig0Var2.f377011d, pByteArray, pByteArray2);
            byte[] bArr = pByteArray.value;
            byte[] bArr2 = pByteArray2.value;
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f343011a = bArr2;
            r45.cu5 cu5Var8 = new r45.cu5();
            cu5Var8.d(bArr);
            ig0Var2.f377012e = cu5Var8;
            pcVar.f382936e = ig0Var2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoReq", "summerauth auto IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s AndroidPackageName:%s chan[%d,%d,%d]", mcVar.f380345f, mcVar.f380346g, mcVar.f380348i, mcVar.f380349m, mcVar.f380350n, mcVar.f380351o, mcVar.f380352p, mcVar.f380353q, mcVar.f380358v, java.lang.Integer.valueOf(mcVar.f380354r), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192440c));
        try {
            return ocVar.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoReq", "summerauth toProtoBuf :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
