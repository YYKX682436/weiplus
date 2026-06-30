package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class v implements com.tencent.xweb.pinus.sdk.u {
    public by5.i0 A;
    public by5.i0 B;
    public by5.i0 C;
    public by5.i0 D;
    public by5.i0 E;
    public by5.i0 F;
    public by5.i0 G;
    public by5.i0 H;
    public by5.i0 I;

    /* renamed from: J, reason: collision with root package name */
    public by5.i0 f220471J;
    public by5.i0 K;
    public by5.i0 L;
    public by5.i0 M;
    public by5.i0 N;
    public by5.i0 O;
    public by5.i0 P;
    public by5.i0 Q;
    public by5.i0 R;
    public by5.i0 S;
    public by5.i0 T;
    public by5.i0 U;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220472a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220473b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220474c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f220475d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f220476e;

    /* renamed from: f, reason: collision with root package name */
    public by5.i0 f220477f;

    /* renamed from: g, reason: collision with root package name */
    public by5.i0 f220478g;

    /* renamed from: h, reason: collision with root package name */
    public by5.i0 f220479h;

    /* renamed from: i, reason: collision with root package name */
    public by5.i0 f220480i;

    /* renamed from: j, reason: collision with root package name */
    public by5.i0 f220481j;

    /* renamed from: k, reason: collision with root package name */
    public by5.i0 f220482k;

    /* renamed from: l, reason: collision with root package name */
    public by5.i0 f220483l;

    /* renamed from: m, reason: collision with root package name */
    public by5.i0 f220484m;

    /* renamed from: n, reason: collision with root package name */
    public by5.i0 f220485n;

    /* renamed from: o, reason: collision with root package name */
    public by5.i0 f220486o;

    /* renamed from: p, reason: collision with root package name */
    public by5.i0 f220487p;

    /* renamed from: q, reason: collision with root package name */
    public by5.i0 f220488q;

    /* renamed from: r, reason: collision with root package name */
    public by5.i0 f220489r;

    /* renamed from: s, reason: collision with root package name */
    public by5.i0 f220490s;

    /* renamed from: t, reason: collision with root package name */
    public by5.i0 f220491t;

    /* renamed from: u, reason: collision with root package name */
    public by5.i0 f220492u;

    /* renamed from: v, reason: collision with root package name */
    public by5.i0 f220493v;

    /* renamed from: w, reason: collision with root package name */
    public by5.i0 f220494w;

    /* renamed from: x, reason: collision with root package name */
    public by5.i0 f220495x;

    /* renamed from: y, reason: collision with root package name */
    public by5.i0 f220496y;

    /* renamed from: z, reason: collision with root package name */
    public by5.i0 f220497z;

    public v(java.lang.Object obj) {
        this.f220472a = obj;
    }

    public void a(boolean z17) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.B;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220472a, "setMediaPlaybackRequiresUserGesture", java.lang.Boolean.TYPE);
                    this.B = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    public void b(boolean z17) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.Q;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220472a, "setVideoPlaybackRequiresUserGesture", java.lang.Boolean.TYPE);
                    this.Q = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
