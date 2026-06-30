package kc2;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f306404d;

    public h0(kc2.g1 g1Var) {
        this.f306404d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.g1 g1Var = this.f306404d;
        g1Var.f306397u = g1Var.a();
        int e17 = c01.id.e();
        kc2.a2.a(g1Var.i(), e17, false, 2, null);
        com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "clickFindTab(" + java.lang.Thread.currentThread().getName() + ") curTime=" + e17 + " wxFriendCnt=" + g1Var.C);
    }
}
