package gf;

/* loaded from: classes7.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.k1 f271196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f271197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(gf.k1 k1Var, gf.a2 a2Var) {
        super(1);
        this.f271196d = k1Var;
        this.f271197e = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        df.w1 skylineView;
        io.flutter.embedding.engine.renderer.FlutterRenderer obtainRenderer;
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        gf.k1 k1Var = this.f271196d;
        if (!(!k1Var.f271056p.isEmpty()) && (skylineView = k1Var.getSkylineView()) != null && (obtainRenderer = com.tencent.skyline.SkylineLogic.obtainRenderer(skylineView.f229580d)) != null) {
            com.tencent.mars.xlog.Log.i("SkylineViewRenderEngine", "[" + reason + "]sendViewportMetricsToFlutter, windowId:%d, width:%s, height:%s", this.f271197e.f271015g, java.lang.Integer.valueOf(k1Var.getWidth()), java.lang.Integer.valueOf(k1Var.getHeight()));
            gf.z flutterViewportMetricsCompat$luggage_skyline_ext_release = k1Var.getFlutterViewportMetricsCompat$luggage_skyline_ext_release();
            android.view.View view = flutterViewportMetricsCompat$luggage_skyline_ext_release.f271195b;
            int width = view.getWidth();
            io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics = flutterViewportMetricsCompat$luggage_skyline_ext_release.f271194a;
            viewportMetrics.width = width;
            viewportMetrics.height = view.getHeight();
            viewportMetrics.devicePixelRatio = view.getResources().getDisplayMetrics().density;
            viewportMetrics.physicalTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            obtainRenderer.setViewportMetrics(viewportMetrics);
        }
        return jz5.f0.f302826a;
    }
}
