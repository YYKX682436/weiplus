package kc2;

/* loaded from: classes15.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f306519d;

    public x0(kc2.g1 g1Var) {
        this.f306519d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.a2.a(this.f306519d.m(), e17, false, 2, null);
        com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "openWx(" + java.lang.Thread.currentThread().getName() + ") curTime=" + e17);
    }
}
