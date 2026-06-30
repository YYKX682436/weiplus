package fc3;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static android.graphics.Typeface f261042g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f261043a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f261044b;

    /* renamed from: c, reason: collision with root package name */
    public final fc3.s f261045c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f261046d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f261047e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f261048f;

    public h(android.content.Context context, android.widget.FrameLayout layout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f261043a = context;
        this.f261044b = layout;
        this.f261045c = new fc3.s(context, layout);
        this.f261047e = kz5.p0.f313996d;
    }

    public final void a() {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        if (this.f261046d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyWordCloudTextHelper", "startTextCloud, but helper is destroy, would not start");
            return;
        }
        if (this.f261047e.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyWordCloudTextHelper", "textCloud is empty, would not start");
            return;
        }
        android.widget.FrameLayout frameLayout = this.f261044b;
        float f17 = 2;
        android.graphics.PointF pointF = new android.graphics.PointF(frameLayout.getWidth() / f17, frameLayout.getHeight() / f17);
        fc3.s sVar = this.f261045c;
        sVar.getClass();
        sVar.f261080e = pointF;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyWordCloudTextHelper", hashCode() + " startTextCloud startPos:" + sVar.f261080e + ' ');
        if (this.f261048f == null) {
            this.f261048f = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new fc3.g(this), true);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f261048f;
        kotlin.jvm.internal.o.d(b4Var2);
        if (!b4Var2.e() || (b4Var = this.f261048f) == null) {
            return;
        }
        b4Var.c(0L, 700L);
    }

    public final void b(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyWordCloudTextHelper", hashCode() + " stopAll withAnimation:" + z17);
        this.f261045c.d(z17);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f261048f;
        if (b4Var2 != null) {
            kotlin.jvm.internal.o.d(b4Var2);
            if (!b4Var2.e() && (b4Var = this.f261048f) != null) {
                b4Var.d();
            }
        }
        this.f261048f = null;
    }
}
