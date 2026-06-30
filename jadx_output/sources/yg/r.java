package yg;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f462116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462117e;

    public r(com.tencent.magicbrush.MBRuntime mBRuntime, java.lang.Runnable runnable) {
        this.f462117e = mBRuntime;
        this.f462116d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462117e.f48577a == 0) {
            return;
        }
        this.f462116d.run();
    }
}
