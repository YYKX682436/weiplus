package gf;

/* loaded from: classes7.dex */
public final class v implements com.tencent.skyline.IRouteDoneCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f271179a;

    public v(java.lang.Runnable runnable) {
        this.f271179a = runnable;
    }

    @Override // com.tencent.skyline.IRouteDoneCallback
    public void onDone() {
        java.lang.Runnable runnable = this.f271179a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
