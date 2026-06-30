package com.tencent.mm.plugin.voip.video.cs;

/* loaded from: classes.dex */
public class MovableVideoView extends com.tencent.mm.plugin.voip.video.OpenGlView {

    /* renamed from: u, reason: collision with root package name */
    public float f177081u;

    /* renamed from: v, reason: collision with root package name */
    public float f177082v;

    /* renamed from: w, reason: collision with root package name */
    public int f177083w;

    /* renamed from: x, reason: collision with root package name */
    public int f177084x;

    /* renamed from: y, reason: collision with root package name */
    public long f177085y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnClickListener f177086z;

    public MovableVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177083w = 800;
        this.f177084x = 480;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f177081u = motionEvent.getRawX();
            this.f177082v = motionEvent.getRawY();
            this.f177085y = java.lang.System.currentTimeMillis();
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f177085y;
            if (j17 != 0 && currentTimeMillis - j17 < 300 && currentTimeMillis - j17 >= 0 && (onClickListener = this.f177086z) != null) {
                onClickListener.onClick(this);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11079, 2);
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f177081u;
            float rawY = motionEvent.getRawY() - this.f177082v;
            if (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                int i17 = (int) (layoutParams.rightMargin - rawX);
                int i18 = (int) (layoutParams.topMargin + rawY);
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int i19 = this.f177084x;
                    if (i17 > i19) {
                        i17 = i19;
                    }
                }
                layoutParams.rightMargin = i17;
                if (i18 < 0) {
                    i18 = 0;
                } else {
                    int i27 = this.f177083w;
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                layoutParams.topMargin = i18;
                setLayoutParams(layoutParams);
                this.f177081u = motionEvent.getRawX();
                this.f177082v = motionEvent.getRawY();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f177086z = onClickListener;
    }
}
