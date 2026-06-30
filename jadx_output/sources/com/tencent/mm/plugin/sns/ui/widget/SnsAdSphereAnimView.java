package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAdSphereAnimView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f170813d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f170814e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer f170815f;

    /* renamed from: g, reason: collision with root package name */
    public v84.a f170816g;

    /* renamed from: h, reason: collision with root package name */
    public w84.a f170817h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f170818i;

    /* renamed from: m, reason: collision with root package name */
    public android.os.HandlerThread f170819m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Handler f170820n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f170821o;

    /* renamed from: p, reason: collision with root package name */
    public int f170822p;

    /* renamed from: q, reason: collision with root package name */
    public int f170823q;

    /* renamed from: r, reason: collision with root package name */
    public int f170824r;

    /* renamed from: s, reason: collision with root package name */
    public int f170825s;

    /* renamed from: t, reason: collision with root package name */
    public int f170826t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f170827u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f170828v;

    public SnsAdSphereAnimView(android.content.Context context) {
        super(context);
        this.f170818i = null;
        this.f170819m = null;
        this.f170821o = false;
        i(context);
    }

    public static /* synthetic */ int a(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        int i17 = snsAdSphereAnimView.f170824r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return i17;
    }

    public static /* synthetic */ w84.a b(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView, w84.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        snsAdSphereAnimView.f170817h = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return aVar;
    }

    public static /* synthetic */ android.content.Context c(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        android.content.Context context = snsAdSphereAnimView.f170813d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return context;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer d(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = snsAdSphereAnimView.f170815f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return gLViewContainer;
    }

    public static /* synthetic */ v84.a e(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView, v84.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        snsAdSphereAnimView.f170816g = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return aVar;
    }

    public static /* synthetic */ android.widget.FrameLayout f(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        android.widget.FrameLayout frameLayout = snsAdSphereAnimView.f170814e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return frameLayout;
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "clear");
        this.f170827u = false;
        v84.a aVar = this.f170816g;
        if (aVar != null) {
            aVar.c();
            this.f170816g = null;
        }
        w84.a aVar2 = this.f170817h;
        if (aVar2 != null) {
            aVar2.c();
            this.f170817h = null;
        }
        android.os.HandlerThread handlerThread = this.f170819m;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "exit Thread, hash=" + this.f170819m.hashCode());
        }
        android.os.Handler handler = this.f170818i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f170820n.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.h(int, int):void");
    }

    public void i(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        this.f170813d = context;
        this.f170820n = new android.os.Handler(android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseGLAnimView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        boolean z17 = false;
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_longpress_anim_gl, 0);
            boolean z18 = Ni > 0;
            com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "isUseGLAnimView, exptValue=" + Ni);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseGLAnimView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            z17 = z18;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdSphereAnimView", "isUseGLAnimView, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseGLAnimView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        }
        this.f170821o = z17;
        if (z17) {
            com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = new com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer(context, null);
            this.f170815f = gLViewContainer;
            addView(gLViewContainer, new android.widget.FrameLayout.LayoutParams(-1, -1));
            if (this.f170819m == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("ad_press_anim");
                this.f170819m = handlerThread;
                handlerThread.start();
                this.f170818i = new android.os.Handler(this.f170819m.getLooper());
                com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "new Thread, hash=" + this.f170819m.hashCode());
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 16);
        } else {
            this.f170814e = this;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public void j(android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "setData, sceneType=" + i17 + ", duration=" + i18 + ", bmp=" + bitmap);
        this.f170827u = false;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("SnsAdSphereAnimView", "setData, bmp==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            return;
        }
        this.f170828v = bitmap;
        this.f170824r = i17;
        this.f170825s = i18;
        this.f170826t = i19;
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            h(width, height);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        } else {
            com.tencent.mars.xlog.Log.w("SnsAdSphereAnimView", "setData, w,h==0");
            this.f170827u = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onDetachedFromWindow();
        g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onLayout(z17, i17, i18, i19, i27);
        getWidth();
        getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onMeasure(i17, i18);
        getMeasuredWidth();
        getMeasuredHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "onSizeChanged, w=" + i17 + ", h=" + i18 + ", isAppendAnim=" + this.f170827u);
        if (i17 != 0 && i18 != 0 && this.f170827u) {
            h(i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public SnsAdSphereAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170818i = null;
        this.f170819m = null;
        this.f170821o = false;
        i(context);
    }

    public SnsAdSphereAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170818i = null;
        this.f170819m = null;
        this.f170821o = false;
        i(context);
    }
}
