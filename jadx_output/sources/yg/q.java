package yg;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f462114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462115e;

    public q(com.tencent.magicbrush.MBRuntime mBRuntime, java.lang.Runnable runnable) {
        this.f462115e = mBRuntime;
        this.f462114d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462115e.f48577a == 0) {
            return;
        }
        this.f462114d.run();
    }
}
