package d44;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d44.b f226425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f226426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d44.d f226427g;

    public c(d44.d dVar, int i17, d44.b bVar, java.lang.Object obj) {
        this.f226427g = dVar;
        this.f226424d = i17;
        this.f226425e = bVar;
        this.f226426f = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f226424d;
        d44.d dVar = this.f226427g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback$1");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingRequest", "onResult:: snsId = " + dVar.f226428a + ", action type = " + dVar.f226429b + ", errorCode = " + i17);
            this.f226425e.a(dVar.f226428a, dVar.f226429b, i17, this.f226426f);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback$1");
    }
}
