package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public class MMFalseProgressBar extends android.widget.ProgressBar {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f197333o = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f197334d;

    /* renamed from: e, reason: collision with root package name */
    public float f197335e;

    /* renamed from: f, reason: collision with root package name */
    public float f197336f;

    /* renamed from: g, reason: collision with root package name */
    public float f197337g;

    /* renamed from: h, reason: collision with root package name */
    public float f197338h;

    /* renamed from: i, reason: collision with root package name */
    public float f197339i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197340m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f197341n;

    public MMFalseProgressBar(android.content.Context context) {
        this(context, null);
        b();
    }

    public void a() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f197341n;
        if (n3Var != null) {
            n3Var.sendEmptyMessage(1002);
        }
    }

    public final void b() {
        if (com.tencent.mars.comm.NetStatusUtil.isWifiOr4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            this.f197336f = 4.0f;
            this.f197337g = 1.0f;
            this.f197338h = 0.3f;
            this.f197339i = 50.0f;
            return;
        }
        this.f197336f = 2.0f;
        this.f197337g = 0.5f;
        this.f197338h = 0.15f;
        this.f197339i = 50.0f;
    }

    public void c() {
        if (this.f197340m && !this.f197334d) {
            this.f197334d = true;
            b();
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f197341n;
            if (n3Var != null) {
                n3Var.sendEmptyMessage(1000);
                n3Var.sendEmptyMessage(1001);
            }
        }
    }

    public MMFalseProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MMFalseProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197334d = false;
        this.f197335e = 0.0f;
        this.f197340m = true;
        this.f197341n = new db5.w1(this, android.os.Looper.getMainLooper());
        setMax(1000);
        b();
    }
}
