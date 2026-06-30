package sx5;

/* loaded from: classes13.dex */
public class b1 implements sx5.a {

    /* renamed from: d, reason: collision with root package name */
    public final by5.i0 f413700d;

    /* renamed from: e, reason: collision with root package name */
    public final by5.i0 f413701e;

    /* renamed from: f, reason: collision with root package name */
    public final by5.i0 f413702f;

    /* renamed from: g, reason: collision with root package name */
    public final by5.i0 f413703g;

    /* renamed from: h, reason: collision with root package name */
    public final by5.i0 f413704h;

    /* renamed from: i, reason: collision with root package name */
    public final by5.i0 f413705i;

    /* renamed from: m, reason: collision with root package name */
    public final by5.i0 f413706m;

    /* renamed from: n, reason: collision with root package name */
    public final by5.i0 f413707n;

    /* renamed from: o, reason: collision with root package name */
    public final by5.i0 f413708o;

    /* renamed from: p, reason: collision with root package name */
    public final by5.i0 f413709p;

    /* renamed from: q, reason: collision with root package name */
    public final by5.i0 f413710q;

    /* renamed from: r, reason: collision with root package name */
    public final by5.i0 f413711r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Object f413712s;

    public b1(java.lang.Object obj) {
        this.f413712s = obj;
        this.f413700d = new by5.i0(obj, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, android.app.Activity.class, android.view.View.class, android.view.View.class, android.content.Context.class, java.lang.String.class);
        this.f413701e = new by5.i0(obj, "initConfigs", android.os.Bundle.class);
        java.lang.Class cls = java.lang.Boolean.TYPE;
        this.f413702f = new by5.i0(obj, "evaluteJavascript", cls, cls);
        this.f413703g = new by5.i0(obj, "onShowCustomView", android.view.View.class, android.webkit.WebChromeClient.CustomViewCallback.class);
        this.f413704h = new by5.i0(obj, "onHideCustomView", new java.lang.Class[0]);
        new by5.i0(obj, "hasEnteredFullscreen", new java.lang.Class[0]);
        this.f413705i = new by5.i0(obj, "registerJavascriptInterface", java.lang.Object.class);
        this.f413706m = new by5.i0(obj, "disableJsCallback", cls);
        this.f413707n = new by5.i0(obj, "setVideoJsCallback", java.lang.Object.class);
        new by5.i0(obj, "videoChangeStatus", new java.lang.Class[0]);
        this.f413708o = new by5.i0(obj, "videoPlay", new java.lang.Class[0]);
        this.f413709p = new by5.i0(obj, "videoPause", new java.lang.Class[0]);
        this.f413710q = new by5.i0(obj, "videoSeek", java.lang.Double.TYPE);
        new by5.i0(obj, "videoMute", cls);
        new by5.i0(obj, "videoPlaybackRate", java.lang.Double.TYPE);
        new by5.i0(obj, "videoExitFullscreen", new java.lang.Class[0]);
        this.f413711r = new by5.i0(obj, "supportSetRequestedOrientationCallback", new java.lang.Class[0]);
    }

    @Override // com.tencent.xweb.o0
    public void a(double d17) {
        try {
            this.f413710q.b(java.lang.Double.valueOf(d17));
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "videoSeek invoke error:" + th6);
        }
    }

    @Override // sx5.a
    public void b(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f413703g.b(view, customViewCallback);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "onShowCustomView error:" + th6);
        }
    }

    @Override // com.tencent.xweb.o0
    public void c() {
        try {
            this.f413709p.b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "videoPause invoke error:" + th6);
        }
    }

    @Override // com.tencent.xweb.o0
    public boolean d() {
        try {
            return ((java.lang.Boolean) this.f413711r.b(new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "supportSetRequestedOrientationCallback invoke error:" + th6);
            return false;
        }
    }

    @Override // sx5.a
    public void e() {
        try {
            this.f413704h.b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "onHideCustomView error:" + th6);
        }
    }

    @Override // sx5.a
    public boolean f(java.lang.Object obj) {
        cy5.h d17 = cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO);
        if (d17 == null || d17.f224879a < 10) {
            if (d17 != null) {
                by5.c4.f("VideoNativeInterfaceRuntime", "setVideoJsCallback return false, fullScreenVideoPlugin is not available, version:" + d17.f224879a);
            } else {
                by5.c4.f("VideoNativeInterfaceRuntime", "setVideoJsCallback return false, fullScreenVideoPlugin is not available");
            }
            return false;
        }
        try {
            return ((java.lang.Boolean) this.f413707n.b(obj)).booleanValue();
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "setVideoJsCallback invoke error:" + th6);
            return false;
        }
    }

    @Override // sx5.a
    public void g(boolean z17, boolean z18) {
        try {
            this.f413702f.b(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "evaluteJavascript error:" + th6);
        }
    }

    @Override // com.tencent.xweb.o0
    public void h() {
        try {
            this.f413708o.b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "videoPlay invoke error:" + th6);
        }
    }

    @Override // sx5.a
    public void i(boolean z17) {
        try {
            this.f413706m.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "disableJsCallback error:" + th6);
        }
    }

    @Override // sx5.a
    public void j(java.lang.Object obj) {
        try {
            this.f413705i.b(obj);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "registerJavascriptInterface error:" + th6);
        }
    }

    public void k(android.app.Activity activity, android.view.View view, android.view.View view2, android.content.Context context, java.lang.String str) {
        try {
            this.f413700d.b(activity, view, view2, context, str);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "init error:" + th6);
            throw new java.lang.Exception(th6);
        }
    }
}
