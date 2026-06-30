package dp1;

/* loaded from: classes14.dex */
public class e implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.k f242126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f242128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dp1.l f242129g;

    public e(dp1.l lVar, dp1.k kVar, int i17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f242129g = lVar;
        this.f242126d = kVar;
        this.f242127e = i17;
        this.f242128f = ballInfo;
    }

    @Override // l01.u
    public void b() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f242128f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMenuAdapter", "onLoadFailed, iconResId:%s, iconUrl:%s", java.lang.Integer.valueOf(ballInfo.f93060u), ballInfo.f93057r);
        this.f242129g.z(this.f242126d, this.f242127e, ballInfo);
    }

    @Override // l01.u
    public void d() {
        this.f242129g.z(this.f242126d, this.f242127e, this.f242128f);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "FloatMenuIcon#" + this.f242128f.e();
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        dp1.k kVar = this.f242126d;
        kVar.f242139g.setVisibility(8);
        kVar.f242138f.setVisibility(0);
        kVar.f242138f.setImageBitmap(bitmap);
    }
}
