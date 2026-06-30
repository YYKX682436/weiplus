package m03;

/* loaded from: classes8.dex */
public final class a implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler, fe0.z3 {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f322550d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f322551e;

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
            r7.f322550d = r11
            java.lang.Class<fe0.v3> r0 = fe0.v3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.v3 r0 = (fe0.v3) r0
            if (r0 == 0) goto L1e
            fe0.a r3 = fe0.a.f261365e
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
            r7.f322551e = r8
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r8.setLayoutParams(r9)
            if (r11 == 0) goto L35
            r11.setMethodCallHandler(r7)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m03.a.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // fe0.z3
    public void a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.PlatformForm", "the onPlatFormViewEvent is called, params is " + params);
            java.util.HashMap hashMap = new java.util.HashMap(params);
            io.flutter.plugin.common.MethodChannel methodChannel = this.f322550d;
            if (methodChannel != null) {
                methodChannel.invokeMethod("platformViewEvent", hashMap);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.PlatformForm", "the onPlatFormViewEvent exception: " + th6.getMessage());
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("SnsAd.PlatformForm", "the PlatformFormWebView is dispose!!!");
        fe0.v3 v3Var = (fe0.v3) i95.n0.c(fe0.v3.class);
        if (v3Var != null) {
            ((ee0.t3) v3Var).Bi(this.f322551e, fe0.a.f261365e);
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f322550d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f322551e;
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
                com.tencent.mars.xlog.Log.e("SnsAd.PlatformForm", "the methodCall params is null or empty!");
                return;
            }
            l03.a aVar = l03.a.f314846a;
            java.util.Map a17 = aVar.a(map);
            java.lang.Object obj2 = a17.get("event");
            if (!(obj2 instanceof java.lang.String)) {
                com.tencent.mars.xlog.Log.e("SnsAd.PlatformForm", "the methodCall event is not string type!");
                return;
            }
            com.tencent.mars.xlog.Log.i("SnsAd.PlatformForm", "the methodCall event is " + obj2);
            java.lang.Object obj3 = a17.get("params");
            java.util.Map a18 = aVar.a(obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null);
            fe0.v3 v3Var = (fe0.v3) i95.n0.c(fe0.v3.class);
            if (v3Var == null) {
                return;
            }
            ((ee0.t3) v3Var).Ai(this.f322551e, fe0.a.f261365e, (java.lang.String) obj2, a18, null);
        }
    }
}
