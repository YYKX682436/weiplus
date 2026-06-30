package j00;

/* loaded from: classes9.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296895f;

    public t0(java.lang.String str, com.tencent.mm.storage.f9 f9Var, j00.k1 k1Var) {
        this.f296893d = str;
        this.f296894e = f9Var;
        this.f296895f = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEcsGiftMsgExpose, talker:");
        sb6.append(this.f296893d);
        sb6.append(", msg:");
        com.tencent.mm.storage.f9 f9Var = this.f296894e;
        sb6.append(f9Var.getMsgId());
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", sb6.toString());
        j00.k1 k1Var = this.f296895f;
        j00.k1.Bi(k1Var, f9Var);
        j00.k1.wi(k1Var, f9Var);
    }
}
