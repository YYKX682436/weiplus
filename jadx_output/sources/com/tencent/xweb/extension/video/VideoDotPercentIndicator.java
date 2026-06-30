package com.tencent.xweb.extension.video;

/* loaded from: classes13.dex */
public class VideoDotPercentIndicator extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f220266d;

    /* renamed from: e, reason: collision with root package name */
    public int f220267e;

    public VideoDotPercentIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220266d = android.view.LayoutInflater.from(context);
        setDotsNum(0);
    }

    public void setDotsNum(int i17) {
        if (i17 <= 1) {
            i17 = 8;
        }
        this.f220267e = i17;
        removeAllViews();
        for (int i18 = 0; i18 < this.f220267e; i18++) {
            addView((android.widget.ImageView) this.f220266d.inflate(com.tencent.xwebsdk.R.layout.xweb_video_dot_percent_indicator_dot, (android.view.ViewGroup) this, false));
        }
    }

    public void setProgress(float f17) {
        int rint = (int) java.lang.Math.rint(java.lang.Math.min(java.lang.Math.max(f17 / 100.0f, 0.0f), 1.0f) * this.f220267e);
        int i17 = 0;
        while (i17 < rint && i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_percent_indicator_dot_on_shape);
            i17++;
        }
        while (i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_percent_indicator_dot_off_shape);
            i17++;
        }
    }

    public VideoDotPercentIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220266d = android.view.LayoutInflater.from(context);
        setDotsNum(0);
    }
}
