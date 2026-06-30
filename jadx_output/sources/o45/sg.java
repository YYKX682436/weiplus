package o45;

/* loaded from: classes12.dex */
public class sg extends o45.ug {

    /* renamed from: b, reason: collision with root package name */
    public final r45.ji4 f343006b = new r45.ji4();

    /* renamed from: c, reason: collision with root package name */
    public boolean f343007c = false;

    @Override // o45.ug
    public java.lang.String a() {
        return o45.ag.f342892a ? "/cgi-bin/micromsg-bin/secmanualauth" : "/cgi-bin/micromsg-bin/manualauth";
    }

    @Override // o45.xg
    public int getFuncId() {
        return o45.ag.f342892a ? 252 : 701;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        int c17;
        int i17;
        gm0.m.f273235x = "";
        if (getSceneStatus() == 16) {
            c17 = 1;
        } else if (this.f343007c) {
            c17 = 3;
        } else {
            gm0.j1.i();
            c17 = gm0.j1.u().f273148a.c(46, 0);
        }
        if (10002 == x51.o1.f452064q && x51.o1.f452065r > 0) {
            x51.o1.f452065r = 0;
            o45.pi.f("", "", 0);
        }
        setRsaInfo(o45.pi.d());
        r45.ji4 ji4Var = this.f343006b;
        r45.ii4 ii4Var = ji4Var.f377839e;
        ii4Var.setBaseRequest(o45.bh.a(this));
        ii4Var.f377066e = wo.w0.g(true);
        fo3.s sVar = fo3.s.INSTANCE;
        ii4Var.f377067f = sVar.I3(c17);
        ii4Var.f377068g = 0;
        ii4Var.f377069h = gm0.m.e();
        ii4Var.f377070i = com.tencent.mm.sdk.platformtools.t8.j0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ii4Var.f377071m = o45.wf.f343026d;
        ii4Var.f377072n = com.tencent.mm.storage.la.m0();
        ii4Var.f377073o = com.tencent.mm.sdk.platformtools.m2.d();
        ii4Var.f377074p = "" + com.tencent.mm.sdk.platformtools.t8.k0();
        ii4Var.f377075q = com.tencent.mm.sdk.platformtools.a0.f192439b;
        if (10012 == x51.o1.f452064q && (i17 = x51.o1.f452065r) > 0) {
            ii4Var.f377075q = i17;
        }
        ii4Var.f377077s = o45.wf.f343024b;
        ii4Var.f377078t = o45.wf.f343025c;
        ii4Var.f377079u = wo.q.f447784e;
        ii4Var.f377080v = wo.w0.o();
        ii4Var.C = com.tencent.mm.sdk.platformtools.x2.f193072b;
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().f273148a.a(18);
        r45.zd zdVar = ii4Var.f377065d;
        int i18 = zdVar.f391927i;
        r45.z57 z57Var = zdVar.f391923e;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.h(str));
        z57Var.f391742g = cu5Var;
        try {
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            int i19 = ii4Var.f377084z;
            if (2 == i19 || 1 == i19 || i19 == 0) {
                if (sVar.wf("ie_login_id")) {
                    sVar.E7("ie_login_id");
                }
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(sVar.Ph("ie_login_id"));
                k57Var.f378394d = cu5Var2;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(sVar.Ci("ce_login_id"));
                k57Var.f378395e = cu5Var3;
                java.lang.String Sf = sVar.Sf("ce_login_id");
                if (Sf != null) {
                    r45.cu5 cu5Var4 = new r45.cu5();
                    cu5Var4.d(Sf.getBytes());
                    k57Var.f378401n = cu5Var4;
                }
            }
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(sVar.L9());
            k57Var.f378400m = cu5Var5;
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(h17);
            k57Var.f378396f = cu5Var6;
            r45.cu5 cu5Var7 = new r45.cu5();
            cu5Var7.d(k57Var.toByteArray());
            ii4Var.B = cu5Var7;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ManualReq", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        r45.ki4 ki4Var = ji4Var.f377838d;
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.f343011a)) {
            r45.cu5 cu5Var8 = new r45.cu5();
            cu5Var8.d(com.tencent.mm.sdk.platformtools.t8.s0());
            ki4Var.f378716d = cu5Var8;
            r45.ig0 ig0Var = new r45.ig0();
            ig0Var.f377011d = 713;
            com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
            com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
            com.tencent.mm.protocal.MMProtocalJni.generateECKey(ig0Var.f377011d, pByteArray, pByteArray2);
            byte[] bArr = pByteArray.value;
            byte[] bArr2 = pByteArray2.value;
            this.f343011a = bArr2 != null ? bArr2 : new byte[0];
            ii4Var.D = new r45.ye5();
            com.tencent.mm.network.j jVar = com.tencent.mm.network.j.f72026e;
            java.lang.String a17 = jVar.a();
            if (android.text.TextUtils.isEmpty(a17)) {
                r45.ye5 ye5Var = ii4Var.D;
                ye5Var.f391015d = 0;
                r45.cu5 cu5Var9 = new r45.cu5();
                cu5Var9.d(new byte[0]);
                ye5Var.f391016e = cu5Var9;
                com.tencent.mars.xlog.Log.e("MicroMsg.ManualReq", "get sign key failed");
            } else {
                r45.ye5 ye5Var2 = ii4Var.D;
                jVar.b();
                ye5Var2.f391015d = jVar.f72027a.f391015d;
                r45.ye5 ye5Var3 = ii4Var.D;
                r45.cu5 cu5Var10 = new r45.cu5();
                cu5Var10.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
                ye5Var3.f391016e = cu5Var10;
                com.tencent.mars.xlog.Log.i("MicroMsg.ManualReq", "manualauth add public key , length " + a17.length());
            }
            com.tencent.mm.network.i iVar = new com.tencent.mm.network.i();
            iVar.f72023b = jVar.a();
            jVar.b();
            iVar.f72022a = jVar.f72028b;
            setCGiVerifyKey(iVar);
            com.tencent.mm.sdk.platformtools.t8.j(bArr);
            com.tencent.mm.sdk.platformtools.t8.j(bArr2);
            r45.cu5 cu5Var11 = new r45.cu5();
            cu5Var11.d(bArr);
            ig0Var.f377012e = cu5Var11;
            ki4Var.f378717e = ig0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ManualReq", "summerauth manual IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d] DeviceBrand:%s DeviceModel:%s OSType:%s RealCountry:%s AndroidPackageName:%s", ii4Var.f377066e, ii4Var.f377067f, ii4Var.f377069h, ii4Var.f377070i, ii4Var.f377071m, ii4Var.f377072n, ii4Var.f377073o, ii4Var.f377074p, java.lang.Integer.valueOf(ii4Var.f377075q), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192440c), ii4Var.f377077s, ii4Var.f377078t, ii4Var.f377079u, ii4Var.f377080v, ii4Var.C);
        try {
            return ji4Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualReq", "summerauth toProtoBuf :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
