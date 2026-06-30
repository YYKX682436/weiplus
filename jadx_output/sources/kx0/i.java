package kx0;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f313260a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f313261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f313262c;

    /* renamed from: d, reason: collision with root package name */
    public final int f313263d;

    /* renamed from: e, reason: collision with root package name */
    public final int f313264e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313265f;

    /* renamed from: g, reason: collision with root package name */
    public final int f313266g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SizeF f313267h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SizeF f313268i;

    /* renamed from: j, reason: collision with root package name */
    public final android.util.SizeF f313269j;

    /* renamed from: k, reason: collision with root package name */
    public final android.util.SizeF f313270k;

    /* renamed from: l, reason: collision with root package name */
    public final android.util.SizeF f313271l;

    /* renamed from: n, reason: collision with root package name */
    public final float f313273n;

    /* renamed from: o, reason: collision with root package name */
    public final float f313274o;

    /* renamed from: p, reason: collision with root package name */
    public float f313275p;

    /* renamed from: r, reason: collision with root package name */
    public final float f313277r;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f313272m = new android.graphics.RectF();

    /* renamed from: q, reason: collision with root package name */
    public float f313276q = 0.0f;

    public i(android.content.Context context, kx0.h hVar) {
        if (hVar == kx0.h.RECORD) {
            this.f313260a = j65.q.a(context).getDrawable(com.tencent.mm.R.drawable.cpn, null);
            this.f313261b = j65.q.a(context).getDrawable(com.tencent.mm.R.drawable.f481885cp5, null);
            this.f313262c = i65.a.d(context, com.tencent.mm.R.color.f478502m);
            this.f313263d = i65.a.d(context, com.tencent.mm.R.color.f478502m);
            this.f313264e = i65.a.d(context, com.tencent.mm.R.color.adx);
            this.f313265f = i65.a.d(context, com.tencent.mm.R.color.f479397ad0);
            this.f313266g = i65.a.d(context, com.tencent.mm.R.color.ae9);
            this.f313267h = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aja), i65.a.f(context, com.tencent.mm.R.dimen.aja));
            this.f313268i = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aja), i65.a.f(context, com.tencent.mm.R.dimen.aja));
            this.f313269j = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aja), i65.a.f(context, com.tencent.mm.R.dimen.aja));
            this.f313270k = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aht), i65.a.f(context, com.tencent.mm.R.dimen.aht));
            android.util.SizeF sizeF = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.f480556aj4), i65.a.f(context, com.tencent.mm.R.dimen.f480556aj4));
            this.f313271l = sizeF;
            float f17 = i65.a.f(context, com.tencent.mm.R.dimen.ajc);
            this.f313273n = f17;
            this.f313274o = i65.a.f(context, com.tencent.mm.R.dimen.ajb);
            this.f313277r = java.lang.Math.min(f17 - (sizeF.getWidth() / 2.0f), 12.0f);
            return;
        }
        this.f313260a = j65.q.a(context).getDrawable(com.tencent.mm.R.drawable.a8h, null);
        this.f313261b = j65.q.a(context).getDrawable(com.tencent.mm.R.drawable.a8h, null);
        this.f313262c = i65.a.d(context, com.tencent.mm.R.color.f479397ad0);
        this.f313263d = i65.a.d(context, com.tencent.mm.R.color.a6p);
        this.f313264e = i65.a.d(context, com.tencent.mm.R.color.f479397ad0);
        this.f313265f = i65.a.d(context, com.tencent.mm.R.color.f479397ad0);
        this.f313266g = i65.a.d(context, com.tencent.mm.R.color.f479396a23);
        this.f313267h = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aj7), i65.a.f(context, com.tencent.mm.R.dimen.aj7));
        this.f313268i = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aj8), i65.a.f(context, com.tencent.mm.R.dimen.aj8));
        this.f313269j = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aj7), i65.a.f(context, com.tencent.mm.R.dimen.aj7));
        this.f313270k = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.f480557aj5), i65.a.f(context, com.tencent.mm.R.dimen.f480557aj5));
        android.util.SizeF sizeF2 = new android.util.SizeF(i65.a.f(context, com.tencent.mm.R.dimen.aj6), i65.a.f(context, com.tencent.mm.R.dimen.aj6));
        this.f313271l = sizeF2;
        float f18 = i65.a.f(context, com.tencent.mm.R.dimen.aj_);
        this.f313273n = f18;
        this.f313274o = i65.a.f(context, com.tencent.mm.R.dimen.aj9);
        this.f313277r = java.lang.Math.min(f18 - (sizeF2.getWidth() / 2.0f), 8.0f);
    }
}
