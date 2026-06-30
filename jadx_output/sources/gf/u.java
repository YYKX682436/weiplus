package gf;

/* loaded from: classes7.dex */
public final class u implements com.tencent.skyline.IRouteDoneCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f271176a;

    public u(java.lang.Runnable runnable) {
        this.f271176a = runnable;
    }

    @Override // com.tencent.skyline.IRouteDoneCallback
    public void onDone() {
        java.lang.Runnable runnable = this.f271176a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
