package gm2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: i, reason: collision with root package name */
    public static final int f273509i = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16.0f);

    /* renamed from: j, reason: collision with root package name */
    public static final int f273510j = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 10.0f);

    /* renamed from: k, reason: collision with root package name */
    public static final float f273511k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn);

    /* renamed from: l, reason: collision with root package name */
    public static final float f273512l = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f273513a;

    /* renamed from: b, reason: collision with root package name */
    public final float f273514b;

    /* renamed from: c, reason: collision with root package name */
    public final float f273515c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273516d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273517e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273518f;

    /* renamed from: g, reason: collision with root package name */
    public final int f273519g;

    /* renamed from: h, reason: collision with root package name */
    public final float f273520h;

    public w(java.lang.CharSequence text, float f17, float f18, int i17, int i18, int i19, int i27, float f19, int i28, kotlin.jvm.internal.i iVar) {
        f19 = (i28 & 128) != 0 ? f273512l : f19;
        kotlin.jvm.internal.o.g(text, "text");
        this.f273513a = text;
        this.f273514b = f17;
        this.f273515c = f18;
        this.f273516d = i17;
        this.f273517e = i18;
        this.f273518f = i19;
        this.f273519g = i27;
        this.f273520h = f19;
    }

    public java.lang.String toString() {
        return "text:" + ((java.lang.Object) this.f273513a) + ",leftPading:" + this.f273514b + ",rightPading:" + this.f273515c + ",bgColor:" + this.f273516d + ",bgHeight:" + this.f273517e + ",textColor:" + this.f273518f + ",textSize:" + this.f273519g + ",radius:" + this.f273520h;
    }
}
