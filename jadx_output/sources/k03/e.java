package k03;

/* loaded from: classes10.dex */
public final class e implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f303116e = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f303117d;

    public e(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context != null ? context.getCacheDir() : null);
        sb6.append("/flutter/Pag/");
        java.lang.String sb7 = sb6.toString();
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        kotlin.jvm.internal.o.d(context2);
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context2);
        this.f303117d = mMPAGView;
        mMPAGView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        if (map != null && map.containsKey("pagPath")) {
            java.lang.Object obj = map.get("pagPath");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            h0Var.f310123d = (java.lang.String) obj;
        }
        if (r26.i0.A((java.lang.String) h0Var.f310123d, "http", false, 2, null)) {
            java.lang.Object obj2 = h0Var.f310123d;
            java.lang.String substring = ((java.lang.String) obj2).substring(r26.n0.O((java.lang.CharSequence) obj2, '/', 0, false, 6, null));
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
            java.lang.String str = sb7 + '/' + substring;
            h0Var3.f310123d = str;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.util.Map map2 = f303116e;
            if (!map2.containsKey(h0Var.f310123d)) {
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(sb7);
                    java.lang.String str3 = a18.f213279f;
                    if (str3 != null) {
                        java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (!a18.f213279f.equals(l18)) {
                            a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m18 = b3Var.m(a18, null);
                    if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
                        com.tencent.mm.vfs.z2 m19 = b3Var.m(a18, m18);
                        if (m19.a()) {
                            m19.f213266a.r(m19.f213267b);
                        }
                    }
                    ((ku5.t0) ku5.t0.f312615d).g(new k03.b(h0Var, h0Var3, methodChannel, h0Var2, this));
                }
            }
            map2.put(h0Var.f310123d, h0Var3.f310123d);
            com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load((java.lang.String) ((java.util.LinkedHashMap) map2).get(h0Var.f310123d));
            h0Var2.f310123d = Load;
            mMPAGView.setComposition(Load);
            mMPAGView.setRepeatCount(-1);
            mMPAGView.g();
        } else {
            com.tencent.mm.rfx.RfxPagFile Load2 = com.tencent.mm.rfx.RfxPagFile.Load(context != null ? context.getAssets() : null, (java.lang.String) h0Var.f310123d);
            h0Var2.f310123d = Load2;
            mMPAGView.setComposition(Load2);
            mMPAGView.setRepeatCount(-1);
            mMPAGView.g();
        }
        mMPAGView.a(new k03.c(methodChannel));
        ku5.u0 u0Var = ku5.t0.f312615d;
        k03.d dVar = new k03.d(this, methodChannel);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(dVar, 500L, false);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f303117d;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewAttached(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionUnlocked() {
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        if (!kotlin.jvm.internal.o.b(methodCall.method, "sendJSEvent") || (str = (java.lang.String) methodCall.argument(ya.b.METHOD)) == null) {
            return;
        }
        int hashCode = str.hashCode();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f303117d;
        if (hashCode == -1443414873) {
            if (str.equals("pagSetRepeat")) {
                java.util.Map map = (java.util.Map) methodCall.argument("params");
                java.lang.Object obj = map != null ? map.get("repeatCount") : null;
                if (mMPAGView != null) {
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    mMPAGView.setRepeatCount(((java.lang.Integer) obj).intValue());
                    return;
                }
                return;
            }
            return;
        }
        if (hashCode == -804162326) {
            if (str.equals("pagPlay") && mMPAGView != null) {
                mMPAGView.g();
                return;
            }
            return;
        }
        if (hashCode == -804064840 && str.equals("pagStop") && mMPAGView != null) {
            mMPAGView.n();
        }
    }
}
