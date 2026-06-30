package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f215055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f215057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f215058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f215059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f215060i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f215061m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f215062n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f215063o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215064p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215065q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f215066r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215067s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215068t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(int i17, java.lang.String str, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4, int i18, int i19, java.util.List list, zq5.e eVar, zq5.e eVar2, float f17, zq5.e eVar3, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var) {
        super(0);
        this.f215055d = i17;
        this.f215056e = str;
        this.f215057f = f0Var;
        this.f215058g = f0Var2;
        this.f215059h = f0Var3;
        this.f215060i = f0Var4;
        this.f215061m = i18;
        this.f215062n = i19;
        this.f215063o = list;
        this.f215064p = eVar;
        this.f215065q = eVar2;
        this.f215066r = f17;
        this.f215067s = eVar3;
        this.f215068t = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String a17 = gr5.s.f274946a.a(this.f215055d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. refreshTiles:");
        sb6.append(this.f215056e);
        sb6.append(". loadCount=");
        sb6.append(this.f215057f.f310116d);
        sb6.append('/');
        sb6.append(this.f215058g.f310116d);
        sb6.append(", freeCount=");
        sb6.append(this.f215059h.f310116d);
        sb6.append('/');
        sb6.append(this.f215060i.f310116d);
        sb6.append(". sampleSize=");
        sb6.append(this.f215061m);
        sb6.append(" -> ");
        sb6.append(this.f215062n);
        sb6.append(", foregroundTiles=");
        sb6.append(this.f215063o.size());
        sb6.append(", imageLoadRect=");
        sb6.append(zq5.f.b(this.f215064p));
        sb6.append(" -> ");
        sb6.append(zq5.f.b(this.f215065q));
        sb6.append(". scale=");
        sb6.append(this.f215066r);
        sb6.append(", contentVisibleRect=");
        sb6.append(zq5.f.b(this.f215067s));
        sb6.append(", contentSize=");
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f215068t;
        sb6.append(zq5.h.f(v1Var.f215128f));
        sb6.append(", continuousTransformType=");
        sb6.append(a17);
        sb6.append(", imageInfo=");
        sb6.append(v1Var.f215127e.a());
        sb6.append(", '");
        sb6.append(v1Var.f215124b.a());
        return sb6.toString();
    }
}
