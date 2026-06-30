package n03;

/* loaded from: classes8.dex */
public final class a implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f333906d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f333907e;

    /* renamed from: f, reason: collision with root package name */
    public final fe0.v3 f333908f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r10 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r10, int r11, java.util.Map r12, io.flutter.plugin.common.MethodChannel r13) {
        /*
            r9 = this;
            r9.<init>()
            r9.f333906d = r13
            java.lang.Class<fe0.v3> r0 = fe0.v3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.v3 r0 = (fe0.v3) r0
            r9.f333908f = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "the PlatformPanoramaView is initing, "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SnsAd.PlatformPanoramaView"
            com.tencent.mars.xlog.Log.i(r2, r1)
            if (r0 == 0) goto L34
            fe0.a r5 = fe0.a.f261364d
            r8 = 0
            r3 = r0
            ee0.t3 r3 = (ee0.t3) r3
            r4 = r10
            r6 = r11
            r7 = r12
            android.view.View r10 = r3.wi(r4, r5, r6, r7, r8)
            if (r10 != 0) goto L3b
        L34:
            android.view.View r10 = new android.view.View
            android.content.Context r11 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r10.<init>(r11)
        L3b:
            r9.f333907e = r10
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = -1
            r11.<init>(r12, r12)
            r10.setLayoutParams(r11)
            if (r13 == 0) goto L4b
            r13.setMethodCallHandler(r9)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n03.a.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("SnsAd.PlatformPanoramaView", "the PlatformPanoramaView dispose is called " + this);
        fe0.v3 v3Var = this.f333908f;
        if (v3Var != null) {
            ((ee0.t3) v3Var).Bi(this.f333907e, fe0.a.f261364d);
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f333906d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f333907e;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str = methodCall.method;
        if (str == null) {
            str = "";
        }
        if (kotlin.jvm.internal.o.b("sendJSEvent", str)) {
            java.lang.Object obj = methodCall.arguments;
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map == null || map.isEmpty()) {
                com.tencent.mars.xlog.Log.e("SnsAd.PlatformPanoramaView", "the methodCall params is null or empty!");
                return;
            }
            java.lang.Object obj2 = map.get("event");
            if (!(obj2 instanceof java.lang.String)) {
                com.tencent.mars.xlog.Log.e("SnsAd.PlatformPanoramaView", "the methodCall event is not string type!");
                return;
            }
            com.tencent.mars.xlog.Log.i("SnsAd.PlatformPanoramaView", "the methodCall event is " + obj2);
            boolean b17 = kotlin.jvm.internal.o.b("startMonitoring", obj2);
            fe0.v3 v3Var = this.f333908f;
            if (b17) {
                if (v3Var != null) {
                    ((ee0.t3) v3Var).Ai(this.f333907e, fe0.a.f261364d, "startMonitoring", null, null);
                }
            } else {
                if (!kotlin.jvm.internal.o.b("stopMonitoring", obj2) || v3Var == null) {
                    return;
                }
                ((ee0.t3) v3Var).Ai(this.f333907e, fe0.a.f261364d, "stopMonitoring", null, null);
            }
        }
    }
}
