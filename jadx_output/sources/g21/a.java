package g21;

/* loaded from: classes5.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, kd0.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f267784d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f267785e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f267786f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f267787g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f267788h;

    /* renamed from: i, reason: collision with root package name */
    public int f267789i;

    /* renamed from: m, reason: collision with root package name */
    public int f267790m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f267791n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f267792o;

    /* renamed from: p, reason: collision with root package name */
    public int f267793p;

    public a(java.lang.String str, int i17, int i18) {
        this(str, i17, i18, "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f267785e = u0Var;
        return dispatch(sVar, this.f267784d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return be1.r0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f267784d;
            r45.cm3 cm3Var = (r45.cm3) oVar.f70710a.f70684a;
            r45.dm3 dm3Var = (r45.dm3) oVar.f70711b.f70700a;
            java.lang.String g17 = x51.j1.g(cm3Var.f371663d);
            this.f267788h = x51.j1.e(dm3Var.f372560d, new byte[0]);
            java.lang.String str2 = dm3Var.f372562f;
            this.f267786f = str2;
            this.f267790m = dm3Var.f372566m;
            this.f267791n = dm3Var.f372567n;
            int i27 = dm3Var.f372561e;
            this.f267789i = i27;
            java.lang.String str3 = dm3Var.f372565i;
            if (str3 == null) {
                str3 = "";
            }
            this.f267792o = str3;
            this.f267793p = dm3Var.f372568o;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = str2;
            objArr[1] = dm3Var.f372563g;
            objArr[2] = dm3Var.f372564h;
            objArr[3] = java.lang.Integer.valueOf(i27);
            objArr[4] = this.f267792o;
            byte[] bArr2 = this.f267788h;
            objArr[5] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
            objArr[6] = java.lang.Integer.valueOf(this.f267793p);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetQRCode", "expiredWording:%s, revokeId:%s, revokeWording:%s respStyle:%s respQrUrl:%s, qrcodeBuf.size: %s, respQrStatus: %s", objArr);
            if (c01.z1.r().equals(g17)) {
                java.lang.String str4 = dm3Var.f372563g;
                java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(66563, "");
                if (str4 != null && !str5.equals(str4)) {
                    gm0.j1.u().c().w(66563, str4);
                    this.f267787g = dm3Var.f372564h;
                }
            }
        }
        this.f267785e.onSceneEnd(i18, i19, str, this);
    }

    public a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f267785e = null;
        this.f267786f = null;
        this.f267787g = null;
        this.f267788h = null;
        this.f267789i = 0;
        this.f267790m = 0;
        this.f267791n = null;
        this.f267792o = "";
        this.f267793p = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cm3();
        lVar.f70665b = new r45.dm3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getqrcode";
        lVar.f70667d = be1.r0.CTRL_INDEX;
        lVar.f70668e = 67;
        lVar.f70669f = 1000000067;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f267784d = a17;
        r45.cm3 cm3Var = (r45.cm3) a17.f70710a.f70684a;
        cm3Var.f371663d = x51.j1.i(str);
        cm3Var.f371664e = i17;
        cm3Var.f371665f = i18;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str2 != null ? str2 : "";
        du5Var.f372757e = true;
        cm3Var.f371666g = du5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetQRCode", "username:%s, style:%d, opcode:%d, url:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
    }
}
