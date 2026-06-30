package ms4;

/* loaded from: classes8.dex */
public final class n extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f331067d;

    /* renamed from: e, reason: collision with root package name */
    public int f331068e;

    /* renamed from: f, reason: collision with root package name */
    public int f331069f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f331070g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f331071h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f331072i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331073m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331074n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331075o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331076p;

    /* renamed from: q, reason: collision with root package name */
    public long f331077q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f331078r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f331079s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData f331080t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331081u;

    public n(byte[] bArr, int i17) {
        this.f331067d = i17;
        new androidx.lifecycle.j0();
        this.f331073m = new androidx.lifecycle.j0();
        this.f331074n = new androidx.lifecycle.j0();
        this.f331075o = new androidx.lifecycle.j0();
        this.f331076p = new androidx.lifecycle.j0();
        this.f331081u = new androidx.lifecycle.j0();
        r45.ma7 ma7Var = new r45.ma7();
        if (bArr != null) {
            try {
                ma7Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            this.f331081u.postValue(ma7Var);
        }
        ma7Var = null;
        this.f331081u.postValue(ma7Var);
    }

    public final void N6(java.lang.String token, java.lang.String str, int i17, im5.b keeper) {
        kotlin.jvm.internal.o.g(token, "token");
        kotlin.jvm.internal.o.g(keeper, "keeper");
        androidx.lifecycle.j0 j0Var = this.f331076p;
        os4.a.a(j0Var, java.lang.Boolean.TRUE);
        O6(7, 1, 0, "");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(fe1.l.CTRL_INDEX, 96);
        com.tencent.mm.protobuf.g gVar = this.f331078r;
        androidx.lifecycle.j0 j0Var2 = this.f331073m;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashViewModel", "mCtxBuff is null!");
            os4.a.a(j0Var, java.lang.Boolean.FALSE);
            j0Var2.postValue(new ms4.a(3, -1, "", null, 8, null));
            g0Var.A(fe1.l.CTRL_INDEX, 98);
            O6(7, 3, -1, "mCtxBuff is null");
            return;
        }
        byte[] d17 = com.tencent.mm.network.j.f72026e.d(gVar != null ? gVar.f192156a : null);
        if (d17 != null) {
            com.tencent.mm.protobuf.g gVar2 = this.f331078r;
            kotlin.jvm.internal.o.d(gVar2);
            new ks4.c(token, gVar2, new com.tencent.mm.protobuf.g(d17, 0, d17.length), str, i17).l().h(new ms4.l(this, token, str, i17, keeper)).f(keeper);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashViewModel", "signedByte is null!");
            os4.a.a(j0Var, java.lang.Boolean.FALSE);
            j0Var2.postValue(new ms4.a(3, 4, "", null, 8, null));
            O6(7, 3, 4, "sign data failed");
            g0Var.A(fe1.l.CTRL_INDEX, 98);
            g0Var.A(fe1.l.CTRL_INDEX, 100);
        }
    }

    public final void O6(int i17, int i18, int i19, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData wecoinEncashKVData = this.f331080t;
        if (wecoinEncashKVData == null || (str2 = wecoinEncashKVData.f179137e) == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(wecoinEncashKVData != null ? wecoinEncashKVData.f179136d : 1);
        objArr[1] = str2;
        objArr[2] = this.f331079s;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str;
        g0Var.d(22129, objArr);
    }

    public final void P6(int i17) {
        com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData wecoinEncashKVData = this.f331080t;
        if (wecoinEncashKVData != null) {
            java.lang.String str = wecoinEncashKVData.f179137e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = wecoinEncashKVData.f179138f;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(wecoinEncashKVData.f179136d), str, java.lang.Integer.valueOf(i17), str2 != null ? str2 : "");
        }
    }
}
