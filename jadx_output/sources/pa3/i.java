package pa3;

/* loaded from: classes8.dex */
public final class i extends com.tencent.mm.plugin.ball.service.s4 {
    public static final pa3.g C = new pa3.g(null);
    public long A;
    public java.lang.String B;

    /* renamed from: v, reason: collision with root package name */
    public final dp1.x f352983v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f352984w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f352985x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f352986y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f352987z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dp1.x pageAdapter) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        this.f352983v = pageAdapter;
        this.f352984w = "";
        this.f352985x = "";
        this.f352986y = "";
        this.B = "liteapp";
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void A(boolean z17, int i17) {
        t0();
        super.A(z17, i17);
        ((ku5.t0) ku5.t0.f312615d).g(new pa3.h(this));
    }

    public final void t0() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo.G != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", this.f352984w);
            bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, this.f352985x);
            bundle.putString("query", this.f352986y);
            bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, this.f352987z);
            ballInfo.G = bundle;
        }
    }
}
