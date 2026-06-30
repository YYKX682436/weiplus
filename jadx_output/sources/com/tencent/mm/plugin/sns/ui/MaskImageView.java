package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class MaskImageView extends com.tencent.mm.plugin.sns.ui.TagImageView {
    public static final /* synthetic */ int V = 0;
    public com.tencent.mm.sdk.platformtools.n3 K;
    public java.lang.Runnable L;
    public int M;
    public int N;
    public int P;
    public int Q;
    public boolean R;
    public final android.graphics.Paint S;
    public final android.graphics.Paint T;
    public final android.graphics.Rect U;

    public MaskImageView(android.content.Context context) {
        super(context);
        this.M = 90;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = new android.graphics.Paint(1);
        this.T = new android.graphics.Paint(1);
        this.U = new android.graphics.Rect();
        p();
    }

    @Override // com.tencent.mm.memory.ui.QPictureView, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onAttachedToWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    @Override // com.tencent.mm.memory.ui.QPictureView, com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.M, this.N, this.P, this.Q);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = ld4.a.f318107c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z17) {
            android.graphics.drawable.Drawable drawable = getDrawable();
            if (drawable instanceof com.tencent.mm.plugin.sns.model.p5) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.sns.model.p5 p5Var = (com.tencent.mm.plugin.sns.model.p5) drawable;
                sb6.append(p5Var.c().f68970d.getWidth());
                sb6.append("x");
                sb6.append(p5Var.c().f68970d.getHeight());
                java.lang.String sb7 = sb6.toString();
                android.graphics.Paint paint = this.S;
                paint.getTextBounds(sb7, 0, sb7.length(), this.U);
                canvas.drawRect(0.0f, 0.0f, r6.width() + 24, r6.height() + 24, this.T);
                canvas.drawText(sb7, 12.0f, r6.height() + 12, paint);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskImageView");
        this.K = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.L = new com.tencent.mm.plugin.sns.ui.s5(this);
        super.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.t5(this));
        super.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDebugInfo", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = ld4.a.f318107c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z17) {
            android.graphics.Paint paint = this.S;
            paint.setColor(-1);
            paint.setTextSize(i65.a.b(getContext(), 12));
            paint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            this.T.setColor(-65536);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDebugInfo", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public boolean q(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            this.K.removeCallbacks(this.L);
        } else if (action == 1 || action == 3) {
            this.K.post(this.L);
        }
        boolean z17 = (isClickable() || isLongClickable()) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        return z17;
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MaskImageView", "setClickable %b", java.lang.Boolean.valueOf(z17));
        super.setClickable(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MaskImageView", "setOnClickListener", new java.lang.Object[0]);
        super.setOnClickListener(onClickListener);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public void settouchEnable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        this.R = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public MaskImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = 90;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = new android.graphics.Paint(1);
        this.T = new android.graphics.Paint(1);
        this.U = new android.graphics.Rect();
        p();
    }
}
