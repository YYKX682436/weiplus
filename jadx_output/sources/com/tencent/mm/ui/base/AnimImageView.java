package com.tencent.mm.ui.base;

/* loaded from: classes12.dex */
public class AnimImageView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f197224d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f197225e;

    /* renamed from: f, reason: collision with root package name */
    public int f197226f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f197227g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f197228h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f197229i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f197230m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f197231n;

    public AnimImageView(android.content.Context context) {
        super(context);
        this.f197224d = false;
        this.f197225e = false;
        this.f197226f = 1;
        this.f197231n = false;
    }

    public final void a() {
        if (this.f197231n) {
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f197227g = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f197227g.setRepeatCount(-1);
        this.f197227g.setRepeatMode(2);
        this.f197228h = new ig5.a();
        android.graphics.drawable.Drawable d17 = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478139bn);
        d17.setBounds(0, 0, d17.getIntrinsicWidth(), d17.getIntrinsicHeight());
        this.f197228h.addFrame(d17, 300);
        android.graphics.drawable.Drawable d18 = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478140bo);
        d18.setBounds(0, 0, d18.getIntrinsicWidth(), d18.getIntrinsicHeight());
        this.f197228h.addFrame(d18, 300);
        android.graphics.drawable.Drawable d19 = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478141bp);
        d19.setBounds(0, 0, d19.getIntrinsicWidth(), d19.getIntrinsicHeight());
        this.f197228h.addFrame(d19, 300);
        this.f197228h.setOneShot(false);
        this.f197228h.setVisible(true, true);
        this.f197229i = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.chatto_voice_playing_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f197229i.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.chatto_voice_playing_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f197229i.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.chatto_voice_playing_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f197229i.addFrame(drawable3, 300);
        this.f197229i.setOneShot(false);
        this.f197229i.setVisible(true, true);
        this.f197230m = new ig5.a();
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.chatto_voice_playing_f1, getResources().getColor(com.tencent.mm.R.color.FG_0));
        e17.setBounds(0, 0, e17.getIntrinsicWidth(), e17.getIntrinsicHeight());
        this.f197230m.addFrame(e17, 300);
        android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.chatto_voice_playing_f2, getResources().getColor(com.tencent.mm.R.color.FG_0));
        e18.setBounds(0, 0, e18.getIntrinsicWidth(), e18.getIntrinsicHeight());
        this.f197230m.addFrame(e18, 300);
        android.graphics.drawable.Drawable e19 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.chatto_voice_playing_f3, getResources().getColor(com.tencent.mm.R.color.FG_0));
        e19.setBounds(0, 0, e19.getIntrinsicWidth(), e19.getIntrinsicHeight());
        this.f197230m.addFrame(e19, 300);
        this.f197230m.setOneShot(false);
        this.f197230m.setVisible(true, true);
        this.f197231n = true;
    }

    public void b() {
        a();
        int i17 = this.f197226f;
        if (i17 == 0) {
            if (this.f197225e) {
                setBackgroundDrawable(i65.a.i(getContext(), com.tencent.mm.R.drawable.f481181mh));
            } else {
                setBackgroundDrawable(i65.a.i(getContext(), com.tencent.mm.R.drawable.o_));
            }
            setAnimation(this.f197227g);
            this.f197227g.startNow();
            return;
        }
        if (i17 == 1) {
            if (this.f197224d) {
                return;
            }
            this.f197224d = true;
            if (this.f197225e) {
                setCompoundDrawablesWithIntrinsicBounds(this.f197228h, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                this.f197228h.stop();
                this.f197228h.start();
                return;
            } else {
                setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, this.f197229i, (android.graphics.drawable.Drawable) null);
                this.f197229i.stop();
                this.f197229i.start();
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
        } else if (this.f197225e) {
            setBackgroundResource(com.tencent.mm.R.color.f478764gk);
        } else {
            setBackgroundResource(com.tencent.mm.R.color.f478765gl);
        }
        if (this.f197224d) {
            return;
        }
        this.f197224d = true;
        if (this.f197225e) {
            setCompoundDrawablesWithIntrinsicBounds(this.f197228h, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            this.f197228h.stop();
            this.f197228h.start();
        } else {
            setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, this.f197230m, (android.graphics.drawable.Drawable) null);
            this.f197230m.stop();
            this.f197230m.start();
        }
    }

    public void c() {
        a();
        android.view.animation.AlphaAnimation alphaAnimation = this.f197227g;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        int i17 = this.f197226f;
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            this.f197224d = false;
            setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            this.f197228h.stop();
            this.f197229i.stop();
            this.f197230m.stop();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    public void setCustomDuration(int i17) {
        android.graphics.drawable.AnimationDrawable animationDrawable = this.f197228h;
        if (animationDrawable != null) {
            ((ig5.a) animationDrawable).a(i17);
        }
        android.graphics.drawable.AnimationDrawable animationDrawable2 = this.f197229i;
        if (animationDrawable2 != null) {
            ((ig5.a) animationDrawable2).a(i17);
        }
    }

    public void setFromGroup(boolean z17) {
    }

    public void setFromVoice(boolean z17) {
        this.f197225e = z17;
    }

    public void setType(int i17) {
        this.f197226f = i17;
        if (this.f197225e) {
            if (i17 == 2) {
                setBackgroundResource(com.tencent.mm.R.color.f478764gk);
                return;
            } else if (i17 == 3) {
                setBackgroundDrawable(null);
                return;
            } else {
                setBackgroundDrawable(i65.a.i(getContext(), com.tencent.mm.R.drawable.f481181mh));
                return;
            }
        }
        if (i17 == 2) {
            setBackgroundResource(com.tencent.mm.R.color.f478765gl);
        } else if (i17 == 3) {
            setBackgroundDrawable(null);
        } else {
            setBackgroundDrawable(i65.a.i(getContext(), com.tencent.mm.R.drawable.o_));
        }
    }

    public AnimImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197224d = false;
        this.f197225e = false;
        this.f197226f = 1;
        this.f197231n = false;
    }

    public AnimImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197224d = false;
        this.f197225e = false;
        this.f197226f = 1;
        this.f197231n = false;
    }
}
