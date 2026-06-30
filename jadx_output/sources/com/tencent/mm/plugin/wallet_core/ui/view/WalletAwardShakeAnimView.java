package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class WalletAwardShakeAnimView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f180702d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180703e;

    /* renamed from: f, reason: collision with root package name */
    public q35.d f180704f;

    /* renamed from: g, reason: collision with root package name */
    public long f180705g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f180706h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f180707i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180708m;

    /* renamed from: n, reason: collision with root package name */
    public int f180709n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f180710o;

    /* renamed from: p, reason: collision with root package name */
    public int f180711p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f180712q;

    /* renamed from: r, reason: collision with root package name */
    public gt4.x f180713r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f180714s;

    public WalletAwardShakeAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180706h = false;
        this.f180707i = false;
        this.f180709n = 0;
        this.f180711p = 0;
        this.f180714s = new gt4.t(this);
        c();
    }

    public void a() {
        q35.d dVar = this.f180704f;
        if (dVar != null) {
            dVar.b();
            this.f180704f = null;
        }
        this.f180707i = false;
        this.f180706h = false;
        android.animation.ValueAnimator valueAnimator = this.f180712q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f180702d.setRotation(0.0f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180708m)) {
            this.f180703e.setText(getResources().getText(com.tencent.mm.R.string.kzw));
        } else {
            this.f180703e.setText(this.f180708m);
        }
        int i17 = this.f180709n;
        if (i17 != 0) {
            this.f180703e.setTextColor(i17);
        } else {
            this.f180703e.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479482a31));
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f180714s);
    }

    public final void b() {
        android.animation.ValueAnimator valueAnimator = this.f180712q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(-30.0f, 30.0f);
        this.f180712q = ofFloat;
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f180712q.setRepeatMode(2);
        this.f180712q.setRepeatCount(-1);
        this.f180712q.setDuration(300L);
        this.f180712q.addUpdateListener(new gt4.w(this));
        this.f180712q.start();
    }

    public final void c() {
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489610d55, this);
        findViewById(com.tencent.mm.R.id.aai).setBackground(getResources().getDrawable(com.tencent.mm.R.raw.wallet_new_shakea_anim_view_bg));
        this.f180702d = findViewById(com.tencent.mm.R.id.mqq);
        this.f180703e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mqp);
    }

    public void setAfterHintWording(java.lang.String str) {
        this.f180710o = str;
    }

    public void setAfterHintWordingColor(int i17) {
        this.f180711p = i17;
    }

    public void setShakeHintWording(java.lang.String str) {
        this.f180708m = str;
        this.f180703e.setText(str);
    }

    public void setShakeHintWordingColor(int i17) {
        this.f180709n = i17;
        this.f180703e.setTextColor(i17);
    }

    public void setShakeOrClickCallback(gt4.x xVar) {
        this.f180713r = xVar;
    }

    public WalletAwardShakeAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180706h = false;
        this.f180707i = false;
        this.f180709n = 0;
        this.f180711p = 0;
        this.f180714s = new gt4.t(this);
        c();
    }
}
