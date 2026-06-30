package com.tencent.xweb.extension.video;

/* loaded from: classes13.dex */
public class VideoStatusLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f220268d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.xweb.extension.video.VideoDotPercentIndicator f220269e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f220270f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f220271g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f220272h;

    /* renamed from: i, reason: collision with root package name */
    public sx5.f f220273i;

    /* renamed from: m, reason: collision with root package name */
    public int f220274m;

    public VideoStatusLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220274m = 1000;
        android.view.LayoutInflater.from(context).inflate(com.tencent.xwebsdk.R.layout.xweb_video_status, this);
        this.f220270f = (android.widget.TextView) findViewById(com.tencent.xwebsdk.R.id.tv_progress);
        this.f220268d = (android.widget.ImageView) findViewById(com.tencent.xwebsdk.R.id.image_xweb_video_status);
        this.f220269e = (com.tencent.xweb.extension.video.VideoDotPercentIndicator) findViewById(com.tencent.xwebsdk.R.id.progress_xweb_video_status);
        this.f220271g = (android.widget.TextView) findViewById(com.tencent.xwebsdk.R.id.text_xweb_video_status);
        this.f220272h = (android.widget.LinearLayout) findViewById(com.tencent.xwebsdk.R.id.layout_xweb_video_status);
        this.f220273i = new sx5.f(this, null);
        setVisibility(8);
    }

    public void a() {
        setVisibility(0);
        removeCallbacks(this.f220273i);
        postDelayed(this.f220273i, this.f220274m);
    }

    public void setBrightProgress(int i17) {
        this.f220269e.setProgress(i17);
        this.f220269e.setVisibility(0);
        this.f220271g.setText(com.tencent.xwebsdk.R.string.xweb_video_brightness);
        this.f220272h.setVisibility(0);
        this.f220268d.setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_brightness_icon);
        this.f220270f.setVisibility(8);
    }

    public void setDuration(int i17) {
        this.f220274m = i17;
    }

    public void setVideoTimeProgress(java.lang.String str) {
        this.f220270f.setText(str);
        this.f220270f.setVisibility(0);
        this.f220272h.setVisibility(8);
    }

    public void setVolumeProgress(int i17) {
        this.f220269e.setProgress(i17);
        this.f220269e.setVisibility(0);
        this.f220271g.setText(com.tencent.xwebsdk.R.string.xweb_video_volume);
        this.f220272h.setVisibility(0);
        this.f220268d.setImageResource(com.tencent.xwebsdk.R.drawable.xweb_video_volume_icon);
        this.f220270f.setVisibility(8);
    }
}
