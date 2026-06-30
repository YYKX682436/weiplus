package wj;

/* loaded from: classes5.dex */
public final class i0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj.p0 f446420e;

    public i0(java.lang.String str, wj.p0 p0Var) {
        this.f446419d = str;
        this.f446420e = p0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "reportAd, success, aid: " + this.f446419d + ", reportType: " + this.f446420e);
    }
}
