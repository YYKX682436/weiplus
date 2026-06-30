package sq3;

/* loaded from: classes12.dex */
public final class f extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f411361f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f411362g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f411363h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f411364i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f411365m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jm0.o plugin) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f411362g = "TIME";
        this.f411363h = "Buffer_";
        this.f411364i = "Quota_";
        this.f411365m = "QuotaCost_";
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f411361f = com.tencent.mm.sdk.platformtools.o4.M("PreDownloadCheckMMKV");
    }

    public final long T6(int i17) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f411361f;
        if (o4Var == null) {
            return 0L;
        }
        return o4Var.q(this.f411364i + i17, 0L);
    }
}
