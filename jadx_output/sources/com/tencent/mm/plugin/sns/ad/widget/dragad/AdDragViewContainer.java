package com.tencent.mm.plugin.sns.ad.widget.dragad;

/* loaded from: classes4.dex */
public class AdDragViewContainer extends android.widget.FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f163558w = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163559d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f163560e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f163561f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f163562g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f163563h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f163564i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f163565m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f163566n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f163567o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163568p;

    /* renamed from: q, reason: collision with root package name */
    public int f163569q;

    /* renamed from: r, reason: collision with root package name */
    public int f163570r;

    /* renamed from: s, reason: collision with root package name */
    public s84.j f163571s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f163572t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f163573u;

    /* renamed from: v, reason: collision with root package name */
    public final int f163574v;

    public AdDragViewContainer(android.content.Context context) {
        super(context);
        this.f163560e = new android.graphics.Rect();
        this.f163561f = new android.graphics.Rect();
        this.f163562g = new android.graphics.Rect();
        this.f163563h = new android.graphics.Rect();
        this.f163564i = new android.graphics.Rect();
        this.f163566n = false;
        this.f163567o = false;
        this.f163568p = false;
        this.f163571s = new s84.i(this);
        this.f163573u = false;
        this.f163574v = android.graphics.Color.parseColor("#33000000");
        c(context);
    }

    public static /* synthetic */ android.widget.ImageView a(com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        android.widget.ImageView imageView = adDragViewContainer.f163565m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        return imageView;
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (this.f163565m.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("AdDragViewContainer", "hideDragView, anim=" + z17);
            if (z17) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f163565m, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.addListener(new s84.h(this));
                ofFloat.start();
            } else {
                this.f163565m.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        this.f163559d = context;
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "init, new dragView");
        android.widget.ImageView imageView = new android.widget.ImageView(this.f163559d);
        this.f163565m = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.f163565m.setVisibility(8);
        addView(this.f163565m, new android.widget.FrameLayout.LayoutParams(0, 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTestSwitch", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        try {
            if (ca4.m0.c0() && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigDrawDragAdRect()) == 1) {
                this.f163573u = true;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDragViewContainer", "initTestSwitch, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTestSwitch", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDragState", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "resetDragState");
        this.f163567o = false;
        this.f163568p = false;
        this.f163564i.set(this.f163563h);
        this.f163565m.setScaleX(1.0f);
        this.f163565m.setScaleY(1.0f);
        android.widget.ImageView imageView = this.f163565m;
        android.graphics.Rect rect = this.f163560e;
        imageView.setX(rect.left);
        this.f163565m.setY(rect.top);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDragState", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        super.dispatchDraw(canvas);
        if (this.f163573u) {
            canvas.drawColor(this.f163574v);
            if (this.f163572t == null) {
                android.graphics.Paint paint = new android.graphics.Paint();
                this.f163572t = paint;
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                this.f163572t.setStrokeWidth(3.0f);
            }
            android.graphics.Rect rect = this.f163560e;
            if (rect != null) {
                this.f163572t.setColor(-16776961);
                canvas.drawRect(rect, this.f163572t);
            }
            android.graphics.Rect rect2 = this.f163561f;
            if (rect2 != null) {
                this.f163572t.setColor(-16776961);
                canvas.drawRect(rect2, this.f163572t);
            }
            android.graphics.Rect rect3 = this.f163564i;
            if (rect3 != null) {
                this.f163572t.setColor(-256);
                canvas.drawRect(rect3, this.f163572t);
            }
            android.graphics.Rect rect4 = this.f163562g;
            if (rect4 != null) {
                if (this.f163568p) {
                    this.f163572t.setColor(-65536);
                } else {
                    this.f163572t.setColor(-256);
                }
                canvas.drawRect(rect4, this.f163572t);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5 != 3) goto L59;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDragEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDragEnabled", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (this.f163566n != z17) {
            this.f163566n = z17;
            com.tencent.mars.xlog.Log.i("AdDragViewContainer", "setDragEnabled, enabled=" + z17);
            if (!z17 && this.f163567o && this.f163571s != null) {
                this.f163567o = false;
                this.f163568p = false;
                this.f163564i.set(this.f163563h);
                this.f163571s.d();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDragEnabled", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void setDragEventCallback(s84.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDragEventCallback", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        this.f163571s = jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDragEventCallback", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void setDragViewImg(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDragViewImg", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "setDragViewImg");
        this.f163565m.setImageBitmap(bitmap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDragViewImg", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public AdDragViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163560e = new android.graphics.Rect();
        this.f163561f = new android.graphics.Rect();
        this.f163562g = new android.graphics.Rect();
        this.f163563h = new android.graphics.Rect();
        this.f163564i = new android.graphics.Rect();
        this.f163566n = false;
        this.f163567o = false;
        this.f163568p = false;
        this.f163571s = new s84.i(this);
        this.f163573u = false;
        this.f163574v = android.graphics.Color.parseColor("#33000000");
        c(context);
    }

    public AdDragViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163560e = new android.graphics.Rect();
        this.f163561f = new android.graphics.Rect();
        this.f163562g = new android.graphics.Rect();
        this.f163563h = new android.graphics.Rect();
        this.f163564i = new android.graphics.Rect();
        this.f163566n = false;
        this.f163567o = false;
        this.f163568p = false;
        this.f163571s = new s84.i(this);
        this.f163573u = false;
        this.f163574v = android.graphics.Color.parseColor("#33000000");
        c(context);
    }
}
