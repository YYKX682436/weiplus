package mf1;

/* loaded from: classes7.dex */
public class b extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf1.k f326026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf1.h f326027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Timer f326028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf1.c f326029g;

    public b(mf1.c cVar, mf1.k kVar, mf1.h hVar, java.util.Timer timer) {
        this.f326029g = cVar;
        this.f326026d = kVar;
        this.f326027e = hVar;
        this.f326028f = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        mf1.k kVar = this.f326026d;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkWcWssSocket", "connect response time out taskid:%s", kVar.getTaskId());
        ((yc1.o) this.f326027e).c("connect response time out");
        kVar.close();
        this.f326029g.h(kVar);
        cancel();
        this.f326028f.cancel();
    }
}
