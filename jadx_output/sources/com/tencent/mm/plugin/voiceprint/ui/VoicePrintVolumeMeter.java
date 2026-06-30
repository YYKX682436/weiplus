package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class VoicePrintVolumeMeter extends android.view.View {

    /* renamed from: r, reason: collision with root package name */
    public static int f176207r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f176208s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f176209t;

    /* renamed from: u, reason: collision with root package name */
    public static final float f176210u;

    /* renamed from: v, reason: collision with root package name */
    public static final float f176211v;

    /* renamed from: w, reason: collision with root package name */
    public static final float f176212w;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f176213d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f176214e;

    /* renamed from: f, reason: collision with root package name */
    public int f176215f;

    /* renamed from: g, reason: collision with root package name */
    public int f176216g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f176217h;

    /* renamed from: i, reason: collision with root package name */
    public float f176218i;

    /* renamed from: m, reason: collision with root package name */
    public float f176219m;

    /* renamed from: n, reason: collision with root package name */
    public float f176220n;

    /* renamed from: o, reason: collision with root package name */
    public float f176221o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f176222p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176223q;

    static {
        android.graphics.Color.rgb(240, 250, 235);
        f176207r = android.graphics.Color.rgb(210, 240, 200);
        f176208s = 100;
        f176209t = 20;
        f176210u = 2.0f;
        f176211v = 0.1f;
        f176212w = 0.05f;
    }

    public VoicePrintVolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f176215f = -1;
        this.f176216g = -1;
        this.f176217h = null;
        this.f176218i = 0.0f;
        this.f176219m = 0.0f;
        this.f176220n = 0.0f;
        this.f176221o = -1.0f;
        this.f176222p = true;
        this.f176223q = false;
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f176213d = new android.graphics.Paint();
        context.getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_1);
        f176207r = context.getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_3);
        this.f176217h = new com.tencent.mm.sdk.platformtools.b4("VoicePrintVolumeMeter", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voiceprint.ui.t0(this), true);
    }

    public final void b() {
        android.view.View view = this.f176214e;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int[] iArr = new int[2];
        this.f176214e.getLocationOnScreen(iArr);
        if (iArr[0] == 0 || iArr[1] == 0) {
            return;
        }
        int width = this.f176214e.getWidth();
        int height = this.f176214e.getHeight();
        if (height == 0 || width == 0) {
            return;
        }
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        this.f176215f = iArr[0] + (width / 2);
        this.f176216g = (iArr[1] + (height / 2)) - iArr2[1];
        float f17 = width / 2.0f;
        this.f176218i = f17;
        this.f176219m = f176210u * f17;
        this.f176220n = f17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f176223q) {
            if (this.f176215f == -1 || this.f176216g == -1) {
                b();
            }
            this.f176213d.setAlpha(f176208s);
            float f17 = this.f176220n;
            float f18 = this.f176219m;
            if (f17 > f18) {
                this.f176220n = f18;
            }
            float f19 = this.f176220n;
            float f27 = this.f176218i;
            if (f19 < f27) {
                this.f176220n = f27;
            }
            this.f176213d.setColor(f176207r);
            canvas.drawCircle(this.f176215f, this.f176216g, this.f176220n, this.f176213d);
        }
    }

    public void setArchView(android.view.View view) {
        this.f176214e = view;
    }

    public void setVolume(float f17) {
        if (f17 > this.f176221o) {
            this.f176222p = true;
        } else {
            this.f176222p = false;
        }
        this.f176221o = f17;
    }

    public VoicePrintVolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f176215f = -1;
        this.f176216g = -1;
        this.f176217h = null;
        this.f176218i = 0.0f;
        this.f176219m = 0.0f;
        this.f176220n = 0.0f;
        this.f176221o = -1.0f;
        this.f176222p = true;
        this.f176223q = false;
        a(context);
    }
}
