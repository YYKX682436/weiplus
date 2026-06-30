package uh1;

/* loaded from: classes7.dex */
public class m0 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf1.k f427838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf1.h f427839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Timer f427840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uh1.q0 f427841g;

    public m0(uh1.q0 q0Var, mf1.k kVar, mf1.h hVar, java.util.Timer timer) {
        this.f427841g = q0Var;
        this.f427838d = kVar;
        this.f427839e = hVar;
        this.f427840f = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkWebSocket", "connect response time out");
        mf1.k kVar = this.f427838d;
        kVar.close();
        this.f427841g.i(kVar);
        ((yc1.o) this.f427839e).c("connect response time out");
        cancel();
        this.f427840f.cancel();
    }
}
