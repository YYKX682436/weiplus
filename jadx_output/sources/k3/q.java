package k3;

/* loaded from: classes13.dex */
public class q implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f303809d;

    /* renamed from: e, reason: collision with root package name */
    public final int f303810e;

    public q(java.lang.String str, int i17) {
        this.f303809d = str;
        this.f303810e = i17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new k3.p(runnable, this.f303809d, this.f303810e);
    }
}
