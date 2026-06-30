package w11;

/* loaded from: classes12.dex */
public final class n0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442090d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.network.v0 f442091e;

    /* renamed from: f, reason: collision with root package name */
    public final long f442092f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f442093g;

    /* renamed from: h, reason: collision with root package name */
    public final int f442094h;

    public n0(long j17, byte[] bArr) {
        this.f442092f = -1L;
        this.f442094h = 0;
        this.f442092f = j17;
        this.f442093g = bArr;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        byte[] bArr = this.f442093g;
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneNotifyData", "dkpush %s", "get keyBuf failed");
            return -1;
        }
        int i17 = this.f442094h;
        if (i17 == 0) {
            this.f442091e = new w11.l0();
        } else {
            w11.m0 m0Var = new w11.m0();
            this.f442091e = m0Var;
            m0Var.f442087c = i17;
        }
        long j17 = this.f442092f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNotifyData", "doScene now:%d buf:%s", java.lang.Long.valueOf(j17), com.tencent.mm.sdk.platformtools.t8.k(bArr, 0, 0));
        ((o45.zh) this.f442091e.getReqObj()).f343047b = j17;
        ((o45.zh) this.f442091e.getReqObj()).f343046a = bArr;
        this.f442090d = u0Var;
        return dispatch(sVar, this.f442091e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 268369922;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNotifyData", "onGYNetEnd [%d,%d] %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f442090d.onSceneEnd(i18, i19, str, this);
    }

    public n0(long j17, byte[] bArr, int i17) {
        this.f442092f = -1L;
        this.f442094h = 0;
        this.f442092f = j17;
        this.f442093g = bArr;
        this.f442094h = i17;
    }
}
