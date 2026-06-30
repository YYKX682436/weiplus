package pf1;

/* loaded from: classes7.dex */
public abstract class q extends android.widget.FrameLayout implements pf1.c {

    /* renamed from: h, reason: collision with root package name */
    public static final pf1.o f353787h = new pf1.o(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.MutableContextWrapper f353788d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f353789e;

    /* renamed from: f, reason: collision with root package name */
    public final pf1.v f353790f;

    /* renamed from: g, reason: collision with root package name */
    public final pf1.e f353791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.MutableContextWrapper context, com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f353788d = context;
        this.f353789e = rt6;
        this.f353790f = new pf1.v(this);
        this.f353791g = new pf1.e(this);
    }

    public abstract void destroy();

    public android.content.Context getAndroidContext() {
        return getContext();
    }

    @Override // pf1.c
    public android.view.View getAndroidView() {
        return this;
    }

    public java.lang.String getAppId() {
        java.lang.String str = getRt().f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        return str;
    }

    @Override // android.view.View
    public android.content.MutableContextWrapper getContext() {
        return this.f353788d;
    }

    public pf1.b getController() {
        return this.f353791g;
    }

    public int getHtmlId() {
        return 0;
    }

    public final pf1.v getJsBridgeComponentDelegate() {
        return this.f353790f;
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRt() {
        return this.f353789e;
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return getRt();
    }

    public abstract /* synthetic */ pf1.d getWebView();
}
