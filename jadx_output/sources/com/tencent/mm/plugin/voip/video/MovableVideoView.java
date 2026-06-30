package com.tencent.mm.plugin.voip.video;

/* loaded from: classes.dex */
public class MovableVideoView extends com.tencent.mm.plugin.voip.video.OpenGlView {

    /* renamed from: u, reason: collision with root package name */
    public float f177041u;

    /* renamed from: v, reason: collision with root package name */
    public float f177042v;

    /* renamed from: w, reason: collision with root package name */
    public int f177043w;

    /* renamed from: x, reason: collision with root package name */
    public int f177044x;

    /* renamed from: y, reason: collision with root package name */
    public long f177045y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnClickListener f177046z;

    public MovableVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177043w = 800;
        this.f177044x = 480;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f177041u = motionEvent.getRawX();
            this.f177042v = motionEvent.getRawY();
            this.f177045y = java.lang.System.currentTimeMillis();
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f177045y;
            if (j17 != 0 && currentTimeMillis - j17 < 300 && currentTimeMillis - j17 >= 0 && (onClickListener = this.f177046z) != null) {
                onClickListener.onClick(this);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11079, 2);
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f177041u;
            float rawY = motionEvent.getRawY() - this.f177042v;
            if (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                int i17 = (int) (layoutParams.rightMargin - rawX);
                int i18 = (int) (layoutParams.topMargin + rawY);
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int i19 = this.f177044x;
                    if (i17 > i19) {
                        i17 = i19;
                    }
                }
                layoutParams.rightMargin = i17;
                if (i18 < 0) {
                    i18 = 0;
                } else {
                    int i27 = this.f177043w;
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                layoutParams.topMargin = i18;
                setLayoutParams(layoutParams);
                this.f177041u = motionEvent.getRawX();
                this.f177042v = motionEvent.getRawY();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f177046z = onClickListener;
    }
}
