package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class y0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f214025q = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.l0g);

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f214029g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f214030h;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f214033n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f214034o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f214035p;

    /* renamed from: d, reason: collision with root package name */
    public int f214026d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f214027e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f214028f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214031i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f214032m = false;

    public abstract void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr);

    public abstract void I(com.tencent.mm.network.v0 v0Var);

    public com.tencent.mm.wallet_core.model.y0 J(com.tencent.mm.wallet_core.model.x0 x0Var) {
        if (this.f214032m) {
            x0Var.a(this.f214026d, this.f214027e, this.f214029g, this);
        }
        return this;
    }

    public void K(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f214035p = new java.lang.ref.WeakReference(mMActivity);
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return true;
    }

    public boolean N() {
        return this instanceof xw1.e;
    }

    public com.tencent.mm.wallet_core.model.y0 O(com.tencent.mm.wallet_core.model.x0 x0Var) {
        if (!this.f214031i && !this.f214032m) {
            x0Var.a(this.f214026d, this.f214027e, this.f214029g, this);
        }
        return this;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f214034o = u0Var;
        iz5.a.d("rr can't be null!", this.f214033n);
        com.tencent.mm.wallet_core.ui.b0.g(this.f214033n.f70713d);
        if (this.f214033n.getNewDNSBusinessType() == 0) {
            this.f214033n.setNewDNSBusinessType(2);
        }
        return dispatch(sVar, this.f214033n, this);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.ui.MMActivity mMActivity;
        if (i18 == 0 && i19 == 0) {
            this.f214031i = false;
        }
        if (!this.f214031i) {
            I(v0Var);
            if (this.f214028f != 0) {
                this.f214032m = true;
            }
        }
        this.f214026d = i19;
        this.f214027e = i18;
        this.f214029g = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewPayBase", "errType: %s, errCode: %s, errMsg: %s, retCode: %s, retMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f214028f), this.f214030h);
        H(i17, i18, i19, str, v0Var, bArr);
        v0Var.getType();
        java.lang.ref.WeakReference weakReference = this.f214035p;
        if (weakReference == null || (mMActivity = (com.tencent.mm.ui.MMActivity) weakReference.get()) == null) {
            return;
        }
        if (this.f214031i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneNewPayBase", "show net error alert");
            db5.e1.G(mMActivity, f214025q, null, false, new com.tencent.mm.wallet_core.model.v0(this, mMActivity));
            return;
        }
        if (!this.f214032m || com.tencent.mm.sdk.platformtools.t8.K0(this.f214030h)) {
            return;
        }
        if (N()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneNewPayBase", "show resp error toast");
            dp.a.makeText(mMActivity, this.f214030h, 1).show();
        } else if (M()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneNewPayBase", "show resp error alert");
            db5.e1.E(mMActivity, this.f214030h, null, mMActivity.getResources().getString(com.tencent.mm.R.string.krn), false, new com.tencent.mm.wallet_core.model.w0(this, mMActivity));
        }
    }
}
