package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class h1 extends com.tencent.mm.plugin.voip.widget.BaseSmallView {

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f176955h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f176956i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f176957m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f176958n;

    public h1(android.content.Context context) {
        super(context, null);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d4u, this);
        this.f176958n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p59);
        this.f176955h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487625p83);
        this.f176957m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487626p84);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487624p82);
        this.f176956i = imageView;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_filled_voice_call, android.graphics.Color.parseColor("#07C160")));
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void c(boolean z17) {
        if (!z17) {
            super.c(false);
            return;
        }
        this.f176955h.setVisibility(8);
        android.widget.TextView textView = this.f176957m;
        textView.setVisibility(0);
        textView.setText(com.tencent.mm.R.string.kcl);
        textView.setContentDescription(getResources().getString(com.tencent.mm.R.string.jpv));
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public boolean d() {
        super.d();
        this.f176955h.setVisibility(8);
        android.widget.TextView textView = this.f176957m;
        textView.setVisibility(0);
        textView.setTextColor(android.graphics.Color.parseColor("#FA5151"));
        textView.setText(com.tencent.mm.R.string.kc_);
        this.f176956i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_call_end, android.graphics.Color.parseColor("#FA5151")));
        setContentDescription("");
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void f() {
        this.f176956i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_call, android.graphics.Color.parseColor("#07C160")));
        android.widget.TextView textView = this.f176957m;
        textView.setVisibility(8);
        textView.setTextColor(android.graphics.Color.parseColor("#07C160"));
        this.f176955h.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void g() {
        android.widget.TextView textView = this.f176957m;
        textView.setVisibility(0);
        this.f176956i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_filled_mike_off, android.graphics.Color.parseColor("#FA5151")));
        textView.setTextColor(android.graphics.Color.parseColor("#FA5151"));
        textView.setText(com.tencent.mm.R.string.kdc);
        this.f176955h.setVisibility(8);
        super.g();
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public com.tencent.mm.plugin.voip.video.OpenGlRender getBeautyData() {
        return null;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public com.tencent.mm.plugin.voip.video.OpenGlRender getSpatioTemporalFilterData() {
        return null;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void k(java.lang.String str) {
        android.widget.TextView textView = this.f176955h;
        textView.setTextSize(1, 12.0f);
        textView.setText(str);
        setContentDescription(getContext().getString(com.tencent.mm.R.string.jpx));
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void l(java.lang.String str) {
        android.widget.TextView textView = this.f176955h;
        textView.setTextSize(1, 14.0f);
        textView.setText(str);
        setContentDescription(java.lang.String.format(getContext().getString(com.tencent.mm.R.string.jpw), str));
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView, android.view.View
    public void onAnimationEnd() {
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setCaptureView(com.tencent.mm.plugin.voip.video.camera.prev.CaptureView captureView) {
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setVoicePlayDevice(int i17) {
        if (this.f177089e != i17) {
            this.f177089e = i17;
            android.widget.TextView textView = this.f176957m;
            textView.setVisibility(0);
            android.widget.ImageView imageView = this.f176956i;
            if (i17 == 1) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_volume_up, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.tencent.mm.R.string.kc9);
            } else if (i17 == 2) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_ear, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.tencent.mm.R.string.kc7);
            } else if (i17 == 3) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_headset, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.tencent.mm.R.string.kc8);
            } else if (i17 == 4) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_bluetooth, android.graphics.Color.parseColor("#07C160")));
                textView.setText(com.tencent.mm.R.string.kc6);
            }
            this.f176955h.setVisibility(8);
            super.setVoicePlayDevice(i17);
        }
    }
}
