package o03;

/* loaded from: classes8.dex */
public final class a implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler, fe0.z3 {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f341894d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f341895e;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r8 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, int r9, java.util.Map r10, io.flutter.plugin.common.MethodChannel r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.f341894d = r11
            java.lang.Class<fe0.v3> r0 = fe0.v3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.v3 r0 = (fe0.v3) r0
            if (r0 == 0) goto L1e
            fe0.a r3 = fe0.a.f261366f
            r1 = r0
            ee0.t3 r1 = (ee0.t3) r1
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r7
            android.view.View r8 = r1.wi(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L25
        L1e:
            android.view.View r8 = new android.view.View
            android.content.Context r9 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r8.<init>(r9)
        L25:
            r7.f341895e = r8
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r8.setLayoutParams(r9)
            if (r11 == 0) goto L35
            r11.setMethodCallHandler(r7)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o03.a.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // fe0.z3
    public void a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.PlatformWebView", "the onPlatFormViewEvent is called, params is " + params);
            io.flutter.plugin.common.MethodChannel methodChannel = this.f341894d;
            if (methodChannel != null) {
                methodChannel.invokeMethod("platformViewEvent", params);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.PlatformWebView", "the onPlatFormViewEvent exception: " + th6.getMessage());
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("SnsAd.PlatformWebView", "the PlatformCommonWebView is dispose!!!");
        fe0.v3 v3Var = (fe0.v3) i95.n0.c(fe0.v3.class);
        if (v3Var != null) {
            ((ee0.t3) v3Var).Bi(this.f341895e, fe0.a.f261366f);
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f341894d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f341895e;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
    }
}
