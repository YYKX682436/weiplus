package j00;

/* loaded from: classes9.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296906f;

    public u0(java.lang.String str, com.tencent.mm.storage.f9 f9Var, j00.k1 k1Var) {
        this.f296904d = str;
        this.f296905e = f9Var;
        this.f296906f = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveNewEcsGiftMsg, talker:");
        sb6.append(this.f296904d);
        sb6.append(", msg:");
        com.tencent.mm.storage.f9 f9Var = this.f296905e;
        sb6.append(f9Var.getMsgId());
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", sb6.toString());
        j00.k1 k1Var = this.f296906f;
        j00.k1.Bi(k1Var, f9Var);
        j00.k1.wi(k1Var, f9Var);
    }
}
