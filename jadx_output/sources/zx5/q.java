package zx5;

/* loaded from: classes13.dex */
public class q extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx5.u f477256d;

    public q(zx5.u uVar) {
        this.f477256d = uVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task retry execute! mRetrytimes = ");
        zx5.u uVar = this.f477256d;
        sb6.append(uVar.f477274h);
        by5.c4.a("XWebHttpTask", sb6.toString());
        zx5.r rVar = uVar.f477273g;
        zx5.b bVar = uVar.f477272f;
        int i17 = uVar.f477274h;
        zx5.u uVar2 = new zx5.u();
        uVar2.f477272f = bVar;
        uVar2.f477273g = rVar;
        uVar2.f477274h = i17;
        uVar2.f477276j = java.lang.System.currentTimeMillis();
        uVar2.e(uVar2.f477273g);
        java.util.Timer timer = uVar.f477275i;
        if (timer != null) {
            timer.cancel();
            uVar.f477275i = null;
        }
    }
}
