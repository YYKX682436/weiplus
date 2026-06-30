package oo5;

/* loaded from: classes8.dex */
public final class e implements io.flutter.plugin.platform.PlatformView {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f347205d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f347206e;

    /* renamed from: f, reason: collision with root package name */
    public final io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding f347207f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f347208g;

    /* renamed from: h, reason: collision with root package name */
    public oo5.f f347209h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f347210i;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f347211m;

    /* renamed from: n, reason: collision with root package name */
    public int f347212n;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0169, code lost:
    
        if (r2.f347215c == true) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r21, io.flutter.plugin.common.BinaryMessenger r22, int r23, java.util.Map r24, io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding r25) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo5.e.<init>(android.content.Context, io.flutter.plugin.common.BinaryMessenger, int, java.util.Map, io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding):void");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        try {
            java.lang.String str = this.f347210i;
            oo5.f fVar = this.f347209h;
            com.tencent.xweb.r1.a(str, fVar != null ? fVar.f347213a : null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "dispose finishReadFile failed", e17);
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f347211m;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f347211m = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f347208g;
    }
}
