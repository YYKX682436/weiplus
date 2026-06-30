package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView;

/* loaded from: classes14.dex */
public class SphereImageView extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView {
    public static final /* synthetic */ int W = 0;
    public android.view.GestureDetector A;
    public float B;
    public long C;
    public boolean D;
    public float E;
    public boolean F;
    public jb4.b0 G;
    public int H;
    public final android.os.Handler I;

    /* renamed from: J, reason: collision with root package name */
    public int f165902J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public android.view.View.OnClickListener P;
    public android.view.View.OnLongClickListener Q;
    public android.graphics.Bitmap R;
    public boolean S;
    public java.lang.String T;
    public final android.view.TextureView.SurfaceTextureListener U;
    public jb4.c0 V;

    /* renamed from: s, reason: collision with root package name */
    public float f165903s;

    /* renamed from: t, reason: collision with root package name */
    public float f165904t;

    /* renamed from: u, reason: collision with root package name */
    public float f165905u;

    /* renamed from: v, reason: collision with root package name */
    public float f165906v;

    /* renamed from: w, reason: collision with root package name */
    public jb4.e0 f165907w;

    /* renamed from: x, reason: collision with root package name */
    public android.hardware.SensorManager f165908x;

    /* renamed from: y, reason: collision with root package name */
    public android.hardware.Sensor f165909y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f165910z;

    public SphereImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165910z = new float[3];
        this.B = 0.4f;
        this.C = 0L;
        this.D = true;
        this.F = false;
        this.I = new jb4.w(this);
        this.L = true;
        this.M = false;
        this.N = false;
        jb4.x xVar = new jb4.x(this);
        this.R = null;
        this.S = false;
        this.T = "";
        jb4.a0 a0Var = new jb4.a0(this);
        this.U = a0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        setEGLContextClientVersion(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSurfaceTextureListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        ((java.util.ArrayList) this.f165901q).add(a0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSurfaceTextureListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        jb4.e0 e0Var = new jb4.e0(context);
        this.f165907w = e0Var;
        setRenderer(e0Var);
        setRenderMode(0);
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f165908x = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        this.f165909y = defaultSensor;
        if (defaultSensor == null) {
            com.tencent.mars.xlog.Log.e("SphereImageView.SphereView", "device has no Gyroscope sensor, model=" + wo.w0.m() + ", brand=" + android.os.Build.BRAND);
        } else {
            com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "has Gyroscope sensor, model=" + wo.w0.m() + ", brand=" + android.os.Build.BRAND + ", sensor=" + this.f165909y);
        }
        this.G = new jb4.b0(this);
        int scaledTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop() / 4;
        this.H = scaledTouchSlop;
        if (scaledTouchSlop < 4) {
            this.H = 4;
        }
        this.A = new android.view.GestureDetector(context, xVar);
        this.E = context.getResources().getDisplayMetrics().density;
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "init, displayDensity=" + this.E + ", apiLevel=" + android.os.Build.VERSION.SDK_INT + ", touchSlop=" + this.H);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public static /* synthetic */ float[] f(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView sphereImageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        float[] fArr = sphereImageView.f165910z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return fArr;
    }

    public static /* synthetic */ jb4.e0 g(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView sphereImageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        jb4.e0 e0Var = sphereImageView.f165907w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return e0Var;
    }

    public android.graphics.PointF getCurAngle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurAngle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        android.graphics.PointF pointF = new android.graphics.PointF();
        jb4.e0 e0Var = this.f165907w;
        pointF.x = e0Var.f298796k;
        pointF.y = e0Var.f298797l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurAngle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return pointF;
    }

    public float h(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("px2Angle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (this.E == 0.0f) {
            this.E = 3.0f;
            com.tencent.mars.xlog.Log.e("SphereImageView.SphereView", "px2Angle , mDisplayDensity==0");
        }
        float f18 = (f17 / this.E) * this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("px2Angle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return f18;
    }

    public void i(float f17, float f18, float f19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        jb4.e0 e0Var = this.f165907w;
        e0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "setScaleParams, near=" + f17 + ", far=" + f18 + ", z=" + f19);
        if (f17 >= f18 || f18 < 20.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        } else {
            e0Var.f298800o = f17;
            e0Var.f298801p = f18;
            e0Var.f298802q = f19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void j(android.graphics.Bitmap bitmap, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        boolean isAvailable = isAvailable();
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "updateImage, isAvailable=" + isAvailable + ", hasPendingImage=" + this.S);
        if (isAvailable) {
            this.R = null;
            this.S = false;
            this.T = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            jb4.z zVar = new jb4.z(this, bitmap, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            c(zVar);
        } else {
            this.R = bitmap;
            this.S = true;
            this.T = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("zero", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "zero, hash=" + hashCode());
        jb4.e0 e0Var = this.f165907w;
        e0Var.f298797l = 90.0f;
        e0Var.f298796k = 0.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("zero", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        super.onAttachedToWindow();
        this.F = false;
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "onAttachedToWindow, hash=" + hashCode() + ", apiLevel=" + android.os.Build.VERSION.SDK_INT);
        k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        super.onDetachedFromWindow();
        this.F = true;
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "onDetachedFromWindow, hash=" + hashCode());
        this.R = null;
        this.S = false;
        this.T = "";
        setSensorEnabled(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        jb4.z zVar = new jb4.z(this, null, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        c(zVar);
        k();
        jb4.c0 c0Var = this.V;
        if (c0Var != null) {
            c0Var.onDetachedFromWindow();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        if (r14 != 3) goto L47;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEventListener(jb4.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.V = c0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.P = onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.Q = onLongClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setOnlyHorizontalScroll(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnlyHorizontalScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.N = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnlyHorizontalScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setSensorEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (z17 && this.F) {
            com.tencent.mars.xlog.Log.e("SphereImageView.SphereView", "setSensorEnabled when isDetachedFromWindow");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableSensor, enabled=");
        sb6.append(z17);
        sb6.append(", hash=");
        sb6.append(hashCode());
        sb6.append(", hasSensor=");
        sb6.append(this.f165909y != null);
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", sb6.toString());
        try {
            android.hardware.Sensor sensor = this.f165909y;
            if (sensor != null) {
                if (z17) {
                    jb4.b0 b0Var = this.G;
                    b0Var.f298773d = 0L;
                    this.f165908x.registerListener(b0Var, sensor, 0);
                } else {
                    this.f165908x.unregisterListener(this.G);
                    this.G.f298773d = 0L;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SphereImageView.SphereView", "setSensorEnabled exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setTouchEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "setTouchEnabled：" + z17 + ", hash=" + hashCode());
        this.D = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setTouchSensitivity(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchSensitivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (f17 > 0.0f) {
            this.B = f17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchSensitivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }
}
