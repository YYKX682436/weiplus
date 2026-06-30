package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class TouchImageView extends android.widget.ImageView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f167646m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f167647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f167648e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f167649f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f167650g;

    /* renamed from: h, reason: collision with root package name */
    public final int f167651h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167652i;

    public TouchImageView(android.content.Context context) {
        super(context);
        this.f167649f = new android.graphics.RectF();
        this.f167650g = new android.graphics.Paint();
        this.f167651h = 90;
        this.f167652i = true;
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TouchImageView");
        this.f167647d = new com.tencent.mm.sdk.platformtools.n3();
        this.f167648e = new com.tencent.mm.plugin.sns.ui.gy(this);
        super.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.hy(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onAttachedToWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            float paddingLeft = getPaddingLeft();
            android.graphics.RectF rectF = this.f167649f;
            rectF.left = paddingLeft;
            rectF.top = getPaddingTop();
            rectF.right = getWidth() - getPaddingRight();
            rectF.bottom = getHeight() - getPaddingBottom();
            android.graphics.Paint paint = this.f167650g;
            paint.setARGB(this.f167651h, 0, 0, 0);
            canvas.drawRoundRect(rectF, getWidth() / 10, getHeight() / 10, paint);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public void settouchEnable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        this.f167652i = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public TouchImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167649f = new android.graphics.RectF();
        this.f167650g = new android.graphics.Paint();
        this.f167651h = 90;
        this.f167652i = true;
        a();
    }
}
