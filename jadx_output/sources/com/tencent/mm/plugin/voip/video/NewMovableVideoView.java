package com.tencent.mm.plugin.voip.video;

/* loaded from: classes.dex */
public class NewMovableVideoView extends com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView {

    /* renamed from: d, reason: collision with root package name */
    public float f177047d;

    /* renamed from: e, reason: collision with root package name */
    public float f177048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f177049f;

    /* renamed from: g, reason: collision with root package name */
    public final int f177050g;

    /* renamed from: h, reason: collision with root package name */
    public long f177051h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f177052i;

    public NewMovableVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177049f = 800;
        this.f177050g = 480;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f177047d = motionEvent.getRawX();
            this.f177048e = motionEvent.getRawY();
            this.f177051h = java.lang.System.currentTimeMillis();
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f177051h;
            if (j17 != 0 && currentTimeMillis - j17 < 300 && currentTimeMillis - j17 >= 0 && (onClickListener = this.f177052i) != null) {
                onClickListener.onClick(this);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11079, 2);
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f177047d;
            float rawY = motionEvent.getRawY() - this.f177048e;
            if (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                int i17 = (int) (layoutParams.rightMargin - rawX);
                int i18 = (int) (layoutParams.topMargin + rawY);
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int i19 = this.f177050g;
                    if (i17 > i19) {
                        i17 = i19;
                    }
                }
                layoutParams.rightMargin = i17;
                if (i18 < 0) {
                    i18 = 0;
                } else {
                    int i27 = this.f177049f;
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                layoutParams.topMargin = i18;
                setLayoutParams(layoutParams);
                this.f177047d = motionEvent.getRawX();
                this.f177048e = motionEvent.getRawY();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f177052i = onClickListener;
    }
}
