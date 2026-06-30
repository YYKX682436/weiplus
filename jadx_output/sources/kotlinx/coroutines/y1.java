package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class y1 extends kotlinx.coroutines.z1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f310701f;

    public y1(long j17, java.lang.Runnable runnable) {
        super(j17);
        this.f310701f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f310701f.run();
    }

    @Override // kotlinx.coroutines.z1
    public java.lang.String toString() {
        return super.toString() + this.f310701f;
    }
}
