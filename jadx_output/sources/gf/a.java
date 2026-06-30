package gf;

/* loaded from: classes7.dex */
public final class a implements com.tencent.skyline.IBootstrapDoneCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f271009a;

    public a(java.lang.Runnable runnable) {
        this.f271009a = runnable;
    }

    @Override // com.tencent.skyline.IBootstrapDoneCallback
    public void onDone() {
        this.f271009a.run();
    }
}
