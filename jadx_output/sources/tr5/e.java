package tr5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f421457d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f421458e;

    public e(java.lang.Runnable runnable, boolean z17) {
        this.f421457d = runnable;
        this.f421458e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f421457d.run();
    }
}
