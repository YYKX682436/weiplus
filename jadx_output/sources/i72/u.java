package i72;

/* loaded from: classes.dex */
public class u implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289439d;

    public u(java.lang.Runnable runnable) {
        this.f289439d = new java.lang.ref.WeakReference(runnable);
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f289439d.get();
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }
}
