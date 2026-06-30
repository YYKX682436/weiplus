package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class w2 extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public float f206185d;

    /* renamed from: e, reason: collision with root package name */
    public float f206186e;

    /* renamed from: f, reason: collision with root package name */
    public float f206187f;

    /* renamed from: g, reason: collision with root package name */
    public float f206188g;

    /* renamed from: h, reason: collision with root package name */
    public float f206189h;

    /* renamed from: i, reason: collision with root package name */
    public float f206190i;

    /* renamed from: m, reason: collision with root package name */
    public float f206191m;

    /* renamed from: n, reason: collision with root package name */
    public float f206192n;

    /* renamed from: o, reason: collision with root package name */
    public float f206193o;

    /* renamed from: p, reason: collision with root package name */
    public float f206194p;

    /* renamed from: q, reason: collision with root package name */
    public final int f206195q;

    /* renamed from: r, reason: collision with root package name */
    public final int f206196r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f206197s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f206198t = false;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f206199u = new com.tencent.mm.ui.chatting.v2(this);

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingAnimFrame f206200v;

    public w2(com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame, int i17, int i18) {
        this.f206200v = chattingAnimFrame;
        this.f206195q = 0;
        this.f206196r = 0;
        this.f206197s = false;
        this.f206195q = i17;
        this.f206196r = i18;
        this.f206197s = false;
    }

    public void a() {
        float f17 = this.f206185d;
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f206200v;
        int i17 = chattingAnimFrame.f198194h;
        this.f206189h = f17 * i17;
        this.f206190i = this.f206186e * i17;
        int i18 = this.f206195q;
        if (i18 == 2) {
            float f18 = this.f206187f;
            int i19 = chattingAnimFrame.f198195i;
            this.f206191m = f18 * i19;
            this.f206192n = this.f206188g * i19;
            return;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                float f19 = this.f206187f;
                int i27 = chattingAnimFrame.f198195i;
                this.f206191m = f19 * i27;
                this.f206192n = this.f206188g * i27;
                return;
            }
            float f27 = this.f206187f;
            int i28 = chattingAnimFrame.f198196m;
            this.f206191m = f27 * i28;
            this.f206192n = this.f206188g * i28;
            return;
        }
        float f28 = this.f206187f;
        int i29 = chattingAnimFrame.f198196m;
        this.f206191m = i29 * f28;
        float f29 = this.f206188g;
        this.f206192n = i29 * f29;
        if (chattingAnimFrame.f198201r) {
            int i37 = chattingAnimFrame.f198202s;
            this.f206191m = (f28 * i29) - i37;
            this.f206192n = (f29 * i29) - i37;
        }
        if (this.f206192n < 0.0f) {
            this.f206192n = 0.0f;
        }
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f206195q;
        if (f17 > 0.0f && !this.f206198t) {
            if (i17 == 1) {
                float f18 = this.f206187f;
                int i18 = this.f206200v.f198195i;
                this.f206191m = f18 * i18;
                this.f206192n = this.f206188g * i18;
            }
            this.f206198t = true;
        }
        float f19 = this.f206189h;
        float f27 = this.f206191m;
        float f28 = this.f206190i;
        if (f19 != f28) {
            f19 += (f28 - f19) * f17;
        }
        float f29 = this.f206192n;
        if (f27 != f29) {
            f27 += (f29 - f27) * f17;
            if (i17 == 2) {
                f27 -= this.f206196r;
            }
        }
        transformation.getMatrix().setTranslate(f19, f27);
        float f37 = this.f206193o;
        float f38 = this.f206194p;
        if (f37 == f38 || 3 != i17) {
            return;
        }
        float f39 = f37 + ((f38 - f37) * f17);
        transformation.getMatrix().postScale(f39, f39);
    }

    @Override // android.view.animation.Animation
    public void finalize() {
        super.finalize();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "finalize!");
        this.f206200v.removeOnLayoutChangeListener(this.f206199u);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f206200v;
        int i28 = this.f206195q;
        if (i28 == 1) {
            float a17 = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(0.1f, 0.9f);
            this.f206185d = a17;
            this.f206186e = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(a17 - 0.25f, a17 + 0.25f);
            this.f206187f = 1.1f;
            this.f206188g = -0.2f;
            setInterpolator(new android.view.animation.LinearInterpolator());
        } else if (i28 == 2) {
            this.f206185d = 0.0f;
            this.f206186e = 0.0f;
            this.f206187f = 0.0f;
            this.f206188g = 1.0f;
            setInterpolator(new ta5.a());
        } else if (i28 == 3) {
            this.f206185d = 0.0f;
            this.f206186e = 0.0f;
            this.f206187f = 1.5f;
            if (this.f206197s) {
                this.f206188g = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(0.4f, 0.55f);
            } else {
                this.f206188g = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(0.54999995f, 0.85f);
            }
            setInterpolator(new ta5.b(0.5f));
        } else if (i28 == 4) {
            int i29 = this.f206196r;
            float a18 = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(0.0f, 1.0f - ((i29 * 1.0f) / chattingAnimFrame.f198195i));
            this.f206185d = 1.0f;
            this.f206186e = 0.0f - ((i29 * 1.0f) / chattingAnimFrame.f198194h);
            this.f206187f = a18;
            this.f206188g = a18;
            setInterpolator(new android.view.animation.LinearInterpolator());
        } else if (i28 != 999) {
            float a19 = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(0.1f, 0.9f);
            this.f206185d = a19;
            this.f206186e = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(a19 - 0.5f, a19 + 0.5f);
            this.f206187f = -0.2f;
            this.f206188g = 1.1f;
            setInterpolator(new android.view.animation.LinearInterpolator());
        } else {
            float a27 = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(0.1f, 0.9f);
            this.f206185d = a27;
            this.f206186e = com.tencent.mm.ui.chatting.ChattingAnimFrame.a(a27 - 0.5f, a27 + 0.5f);
            this.f206187f = 0.0f;
            this.f206188g = 0.0f;
            this.f206193o = 0.8f;
            this.f206194p = 1.1f;
            setInterpolator(new android.view.animation.LinearInterpolator());
        }
        if (i28 != 0 && i28 != 1) {
            chattingAnimFrame.addOnLayoutChangeListener(this.f206199u);
        }
        a();
    }

    public w2(com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame, int i17, int i18, boolean z17) {
        this.f206200v = chattingAnimFrame;
        this.f206195q = 0;
        this.f206196r = 0;
        this.f206197s = false;
        this.f206195q = i17;
        this.f206196r = i18;
        this.f206197s = z17;
    }
}
