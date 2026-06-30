package com.tencent.mm.plugin.webview.emojistore;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182040d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182041e;

    /* renamed from: f, reason: collision with root package name */
    public final int f182042f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f182043g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f182044h;

    /* renamed from: i, reason: collision with root package name */
    public int f182045i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f182046m = true;

    /* renamed from: n, reason: collision with root package name */
    public final long f182047n;

    public c(int i17, java.lang.String str, byte[] bArr, int i18, long j17) {
        this.f182044h = null;
        this.f182045i = -1;
        this.f182047n = 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mw5();
        lVar.f70665b = new r45.nw5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsearchemotion";
        lVar.f70667d = 234;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f182040d = lVar.a();
        this.f182042f = i17;
        this.f182043g = str;
        this.f182044h = bArr;
        this.f182045i = i18;
        this.f182047n = j17;
    }

    public r45.nw5 H() {
        com.tencent.mm.modelbase.o oVar = this.f182040d;
        if (oVar == null) {
            return null;
        }
        return (r45.nw5) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182041e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f182040d;
        r45.mw5 mw5Var = (r45.mw5) oVar.f70710a.f70684a;
        byte[] bArr = this.f182044h;
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            mw5Var.f380870f = new r45.cu5();
            this.f182046m = true;
        } else {
            mw5Var.f380870f = x51.j1.a(bArr);
            this.f182046m = false;
            mw5Var.f380871g = this.f182047n;
        }
        r45.cu5 cu5Var = mw5Var.f380870f;
        if (cu5Var != null) {
            cu5Var.toString();
        }
        mw5Var.f380868d = this.f182042f;
        mw5Var.f380869e = this.f182043g;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 234;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneSearchEmotion", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f182041e.onSceneEnd(i18, i19, str, this);
    }
}
