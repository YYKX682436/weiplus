package gf;

/* loaded from: classes7.dex */
public final class t implements com.tencent.skyline.IRouteDoneCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f271172a;

    public t(java.lang.Runnable runnable) {
        this.f271172a = runnable;
    }

    @Override // com.tencent.skyline.IRouteDoneCallback
    public void onDone() {
        java.lang.Runnable runnable = this.f271172a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
