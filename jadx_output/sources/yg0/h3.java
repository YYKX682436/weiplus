package yg0;

/* loaded from: classes8.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg0.o3 f462191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch0.k f462192e;

    public h3(yg0.o3 o3Var, ch0.k kVar) {
        this.f462191d = o3Var;
        this.f462192e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "will load h5 box for WebView");
        this.f462191d.fj(this.f462192e);
    }
}
