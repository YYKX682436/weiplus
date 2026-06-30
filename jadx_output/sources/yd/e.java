package yd;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f460938j = "wagame://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj) + "/WAGameVConsole.html";

    /* renamed from: a, reason: collision with root package name */
    public yd.d0 f460939a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.d0 f460940b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f460941c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f460942d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.magicbrush.MagicBrush f460943e;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f460945g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f460946h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f460944f = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f460947i = false;

    public e(com.tencent.magicbrush.MagicBrush magicBrush, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        this.f460940b = d0Var;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
        this.f460941c = t37;
        this.f460942d = context;
        this.f460943e = magicBrush;
        if (wd.h.f444685a == null) {
            synchronized (wd.h.class) {
                if (wd.h.f444685a == null) {
                    wd.h.f444685a = new wd.h();
                }
            }
        }
        wd.h.f444685a.getClass();
        yd.z zVar = (yd.z) i95.n0.c(yd.z.class);
        yd.d0 d0Var2 = new yd.d0(new android.content.MutableContextWrapper(context), t37, zVar == null ? new yd.h() : zVar);
        this.f460939a = d0Var2;
        d0Var2.getProvider().O4().a(true);
        com.tencent.mm.plugin.appbrand.widget.b0 b0Var = new com.tencent.mm.plugin.appbrand.widget.b0(context);
        this.f460945g = b0Var;
        b0Var.setOnClickListener(new yd.a(this));
        this.f460939a.getProvider().N7(new yd.b(this));
        this.f460939a.getProvider().loadUrl(f460938j);
        this.f460939a.setTranslationY(100000.0f);
        this.f460939a.setVisibility(8);
    }

    public final int a() {
        return ((int) (this.f460943e.f48590n.find(0).getWidth() * this.f460942d.getResources().getDisplayMetrics().density)) + 1;
    }

    public final void b(java.lang.String str) {
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.utils.w2.a(str);
        this.f460939a.getProvider().jf("console._log('" + a17 + "')");
    }
}
