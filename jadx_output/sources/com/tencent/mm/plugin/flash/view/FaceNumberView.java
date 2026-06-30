package com.tencent.mm.plugin.flash.view;

/* loaded from: classes14.dex */
public class FaceNumberView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f137273d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f137274e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f137275f;

    public FaceNumberView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setNumber(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "setNumber :%s", str);
        this.f137274e.setText(str);
    }

    public FaceNumberView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f137275f = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aa7, (android.view.ViewGroup) this, true);
        setGravity(17);
        this.f137273d = findViewById(com.tencent.mm.R.id.dny);
        this.f137274e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dnu);
    }
}
