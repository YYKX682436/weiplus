package o45;

/* loaded from: classes12.dex */
public class bi extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yv4 f342909a = new r45.yv4();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f342910b;

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 126;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.yv4 yv4Var = this.f342909a;
        yv4Var.f391419u = cu5Var;
        yv4Var.setBaseRequest(o45.bh.a(this));
        yv4Var.f391413o = com.tencent.mm.sdk.platformtools.a0.f192440c;
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.f342910b)) {
            r45.ig0 ig0Var = new r45.ig0();
            ig0Var.f377011d = 713;
            com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
            com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
            com.tencent.mm.protocal.MMProtocalJni.generateECKey(ig0Var.f377011d, pByteArray, pByteArray2);
            byte[] bArr = pByteArray.value;
            byte[] bArr2 = pByteArray2.value;
            this.f342910b = bArr2 != null ? bArr2 : new byte[0];
            com.tencent.mm.sdk.platformtools.t8.j(bArr);
            com.tencent.mm.sdk.platformtools.t8.j(bArr2);
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(bArr);
            ig0Var.f377012e = cu5Var2;
            yv4Var.G = ig0Var;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMReg2.Req", "summerecdh pri key is not null, len:%d", java.lang.Integer.valueOf(this.f342910b.length));
        }
        try {
            fo3.s sVar = fo3.s.INSTANCE;
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(h17);
            k57Var.f378396f = cu5Var3;
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(sVar.L9());
            k57Var.f378400m = cu5Var4;
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(k57Var.toByteArray());
            yv4Var.S = cu5Var5;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMReg2.Req", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        yv4Var.W = new r45.ye5();
        com.tencent.mm.network.j jVar = com.tencent.mm.network.j.f72026e;
        java.lang.String a17 = jVar.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            r45.ye5 ye5Var = yv4Var.W;
            ye5Var.f391015d = 0;
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(new byte[0]);
            ye5Var.f391016e = cu5Var6;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMReg2.Req", "get sign key failed");
        } else {
            r45.ye5 ye5Var2 = yv4Var.W;
            jVar.b();
            ye5Var2.f391015d = jVar.f72027a.f391015d;
            r45.ye5 ye5Var3 = yv4Var.W;
            r45.cu5 cu5Var7 = new r45.cu5();
            cu5Var7.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            ye5Var3.f391016e = cu5Var7;
        }
        com.tencent.mm.network.i iVar = new com.tencent.mm.network.i();
        iVar.f72023b = jVar.a();
        jVar.b();
        iVar.f72022a = jVar.f72028b;
        setCGiVerifyKey(iVar);
        return yv4Var.toByteArray();
    }
}
