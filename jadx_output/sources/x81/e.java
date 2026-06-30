package x81;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f452489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f452490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f452491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj f452492g;

    public e(int i17, long j17, long j18, com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj appBrandRecommendStatObj) {
        this.f452489d = i17;
        this.f452490e = j17;
        this.f452491f = j18;
        this.f452492g = appBrandRecommendStatObj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f452489d;
        if (i17 != 1) {
            new x81.d(this, i17, this.f452490e, this.f452491f, this.f452492g).l();
            return;
        }
        com.tencent.mm.modelbase.o a17 = x81.f.s(i17, this.f452490e, this.f452491f, this.f452492g).a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new x81.c(this));
    }
}
