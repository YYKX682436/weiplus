package fl4;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.media.TingMediaBrowserService f263940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f263943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263944h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263945i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263946m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService, java.lang.String str, android.graphics.Bitmap bitmap, bw5.jq0 jq0Var, int i17, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(0);
        this.f263940d = tingMediaBrowserService;
        this.f263941e = str;
        this.f263942f = bitmap;
        this.f263943g = jq0Var;
        this.f263944h = i17;
        this.f263945i = h0Var;
        this.f263946m = h0Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String coverUrl = this.f263941e;
        kotlin.jvm.internal.o.f(coverUrl, "$coverUrl");
        com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService = this.f263940d;
        tingMediaBrowserService.f174696s = coverUrl;
        android.graphics.Bitmap bitmap = this.f263942f;
        tingMediaBrowserService.f174697t = bitmap;
        tl4.a aVar = tingMediaBrowserService.f174695r;
        if (aVar != null) {
            bw5.jq0 jq0Var = this.f263943g;
            int i17 = this.f263944h;
            java.lang.String str = (java.lang.String) this.f263945i.f310123d;
            java.lang.String str2 = (java.lang.String) this.f263946m.f310123d;
            android.support.v4.media.session.f0 f0Var = tingMediaBrowserService.f174692o;
            if (f0Var == null) {
                kotlin.jvm.internal.o.o("mSession");
                throw null;
            }
            android.support.v4.media.session.MediaSessionCompat$Token b17 = f0Var.b();
            kotlin.jvm.internal.o.f(b17, "getSessionToken(...)");
            ((tl4.h) aVar).c(jq0Var, i17, str, str2, bitmap, b17);
        }
        return jz5.f0.f302826a;
    }
}
