package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class RecordVoiceBaseView extends android.widget.TextView implements bt3.z2, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f155332d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f155333e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f155334f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f155335g;

    /* renamed from: h, reason: collision with root package name */
    public bt3.a3 f155336h;

    /* renamed from: i, reason: collision with root package name */
    public int f155337i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f155338m;

    /* renamed from: n, reason: collision with root package name */
    public int f155339n;

    public RecordVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155332d = false;
        this.f155337i = -1;
        this.f155338m = "";
        this.f155335g = context;
        b();
    }

    public static void a(com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView) {
        if (!recordVoiceBaseView.f155336h.b(recordVoiceBaseView.f155338m, recordVoiceBaseView.f155339n)) {
            dp.a.makeText(recordVoiceBaseView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
        } else {
            if (recordVoiceBaseView.f155332d) {
                return;
            }
            recordVoiceBaseView.f155332d = true;
            recordVoiceBaseView.setCompoundDrawablesWithIntrinsicBounds(recordVoiceBaseView.f155334f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            recordVoiceBaseView.f155334f.stop();
            recordVoiceBaseView.f155334f.start();
        }
    }

    public final void b() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f155333e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f155333e.setRepeatCount(-1);
        this.f155333e.setRepeatMode(2);
        this.f155334f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f155334f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f155334f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f155334f.addFrame(drawable3, 300);
        this.f155334f.setOneShot(false);
        this.f155334f.setVisible(true, true);
    }

    public void c() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f155333e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f155332d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f155334f.stop();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new com.tencent.mm.plugin.record.ui.h2(this));
    }

    public void setVoiceHelper(bt3.a3 a3Var) {
        this.f155336h = a3Var;
        java.util.List list = a3Var.f24204o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((bt3.z2) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }

    public RecordVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f155332d = false;
        this.f155337i = -1;
        this.f155338m = "";
        this.f155335g = context;
        b();
    }
}
