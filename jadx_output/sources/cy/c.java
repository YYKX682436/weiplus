package cy;

/* loaded from: classes5.dex */
public final class c implements io.flutter.plugin.platform.PlatformView {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f224657d;

    /* renamed from: e, reason: collision with root package name */
    public final int f224658e;

    /* renamed from: f, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f224659f;

    /* renamed from: g, reason: collision with root package name */
    public final cy.a f224660g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f224661h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f224662i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f224663m;

    /* renamed from: n, reason: collision with root package name */
    public cy.g f224664n;

    public c(android.content.Context hostContext, int i17, io.flutter.plugin.common.BinaryMessenger messenger, java.lang.String suffix, cy.a flutterApi, java.util.Map creationParams) {
        kotlin.jvm.internal.o.g(hostContext, "hostContext");
        kotlin.jvm.internal.o.g(messenger, "messenger");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        kotlin.jvm.internal.o.g(flutterApi, "flutterApi");
        kotlin.jvm.internal.o.g(creationParams, "creationParams");
        this.f224657d = hostContext;
        this.f224658e = i17;
        this.f224659f = messenger;
        this.f224660g = flutterApi;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(hostContext);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f224661h = frameLayout;
        java.lang.Object obj = creationParams.get("itemId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        this.f224662i = str;
        java.lang.Object obj2 = creationParams.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        this.f224663m = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardPlatformView", "skip ChatbotCardHostApi setup on trunk viewId=" + i17 + " suffix=" + suffix);
        if (str3.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatbotCardPlatformView", "empty scene, viewId=" + i17 + " itemId=" + str);
            a("empty scene");
            b("INVALID_ARGS", "empty scene");
            return;
        }
        cy.h hVar = cy.h.f224666a;
        java.util.Map map = cy.h.f224667b;
        if (((cy.f) ((java.util.LinkedHashMap) map).get(str3)) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotCardPlatformView", "scene builder not found: " + str3 + " viewId=" + i17 + " itemId=" + str + " registered=" + kz5.n0.S0(((java.util.LinkedHashMap) map).keySet()));
            a("unsupported scene: ".concat(str3));
            b("SCENE_NOT_FOUND", "scene=".concat(str3));
            return;
        }
        java.lang.Object obj3 = creationParams.get("payload");
        java.util.Map map2 = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
        java.util.Map map3 = kz5.q0.f314001d;
        java.util.Map map4 = map2 == null ? map3 : map2;
        java.lang.Object obj4 = creationParams.get("layout");
        java.util.Map map5 = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
        java.util.Map map6 = map5 == null ? map3 : map5;
        java.lang.Object obj5 = creationParams.get("theme");
        java.util.Map map7 = obj5 instanceof java.util.Map ? (java.util.Map) obj5 : null;
        try {
            dy.d dVar = new dy.d(hostContext, new cy.i(creationParams, map4, map6, map7 != null ? map7 : map3, flutterApi, str));
            this.f224664n = dVar;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            frameLayout.removeAllViews();
            frameLayout.addView(dVar, layoutParams);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scene view attached: scene=");
            sb6.append(str3);
            sb6.append(" viewId=");
            sb6.append(i17);
            sb6.append(" itemId=");
            sb6.append(str);
            sb6.append(" business=");
            sb6.append(this.f224664n != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardPlatformView", sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatbotCardPlatformView", "scene builder threw: scene=" + str3 + " viewId=" + i17 + ": " + th6);
            java.lang.String message = th6.getMessage();
            a("scene build failed: ".concat(message == null ? th6.getClass().getSimpleName() : message));
            b("SCENE_BUILD_FAILED", th6.getMessage());
        }
    }

    public final void a(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this.f224657d);
        textView.setText(str);
        textView.setTextColor(-7829368);
        textView.setGravity(17);
        textView.setPadding(16, 16, 16, 16);
        android.widget.FrameLayout frameLayout = this.f224661h;
        frameLayout.removeAllViews();
        frameLayout.addView(textView, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        try {
            cy.a aVar = this.f224660g;
            if (str2 == null) {
                str2 = "";
            }
            aVar.a(str, str2, new cy.b(str));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotCardPlatformView", "invokeError threw: " + th6);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardPlatformView", "platformView.dispose viewId=" + this.f224658e + " scene=" + this.f224663m + " itemId=" + this.f224662i);
        this.f224664n = null;
        this.f224661h.removeAllViews();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f224661h;
    }
}
