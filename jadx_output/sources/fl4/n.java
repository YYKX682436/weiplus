package fl4;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f263947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.media.TingMediaBrowserService f263948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263951h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263952i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bw5.jq0 jq0Var, com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService, java.lang.String str, int i17, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(1);
        this.f263947d = jq0Var;
        this.f263948e = tingMediaBrowserService;
        this.f263949f = str;
        this.f263950g = i17;
        this.f263951h = h0Var;
        this.f263952i = h0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (kotlin.jvm.internal.o.b(this.f263947d, this.f263948e.f174701x)) {
            if (bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingMediaBrowserService", "fetch bitmap fail:" + this.f263949f);
            } else {
                d75.b.g(new fl4.m(this.f263948e, this.f263949f, bitmap, this.f263947d, this.f263950g, this.f263951h, this.f263952i));
            }
        }
        return jz5.f0.f302826a;
    }
}
