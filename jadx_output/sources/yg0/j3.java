package yg0;

/* loaded from: classes8.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg0.o3 f462203d;

    public j3(yg0.o3 o3Var) {
        this.f462203d = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into h5PagePreCreateRunnable");
        ch0.k kVar = this.f462203d.f462230d.f41194a.f41240b;
        if (kVar != null) {
            this.f462203d.fj(kVar);
        }
    }
}
