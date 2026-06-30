package gm2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f273390a;

    /* renamed from: b, reason: collision with root package name */
    public int f273391b;

    /* renamed from: c, reason: collision with root package name */
    public int f273392c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273393d;

    /* renamed from: e, reason: collision with root package name */
    public int f273394e;

    /* renamed from: f, reason: collision with root package name */
    public int f273395f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273396g;

    /* renamed from: h, reason: collision with root package name */
    public int f273397h;

    /* renamed from: i, reason: collision with root package name */
    public int f273398i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273399j;

    /* renamed from: k, reason: collision with root package name */
    public int f273400k;

    /* renamed from: l, reason: collision with root package name */
    public int f273401l;

    /* renamed from: m, reason: collision with root package name */
    public int f273402m;

    /* renamed from: n, reason: collision with root package name */
    public int f273403n;

    /* renamed from: o, reason: collision with root package name */
    public int f273404o;

    /* renamed from: p, reason: collision with root package name */
    public int f273405p;

    /* renamed from: q, reason: collision with root package name */
    public int f273406q;

    /* renamed from: r, reason: collision with root package name */
    public final int f273407r;

    /* renamed from: s, reason: collision with root package name */
    public final int f273408s;

    /* renamed from: t, reason: collision with root package name */
    public final int f273409t;

    public i(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, android.graphics.drawable.Drawable drawable, int i28, int i29, android.graphics.drawable.Drawable drawable2, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, kotlin.jvm.internal.i iVar) {
        java.lang.String level = (i66 & 1) != 0 ? "" : str;
        int color = (i66 & 2) != 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an) : i17;
        int e17 = (i66 & 4) != 0 ? gm2.c1.f273320a.e() : i18;
        java.lang.String fansName = (i66 & 8) == 0 ? str2 : "";
        int color2 = (i66 & 16) != 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an) : i19;
        int e18 = (i66 & 32) != 0 ? gm2.c1.f273320a.e() : i27;
        android.graphics.drawable.Drawable drawable3 = (i66 & 64) != 0 ? null : drawable;
        int h17 = (i66 & 128) != 0 ? gm2.c1.f273320a.h() : i28;
        int h18 = (i66 & 256) != 0 ? gm2.c1.f273320a.h() : i29;
        android.graphics.drawable.Drawable drawable4 = (i66 & 512) == 0 ? drawable2 : null;
        int i67 = (i66 & 1024) != 0 ? gm2.c1.f273320a.i() : i37;
        int h19 = (i66 & 2048) != 0 ? gm2.c1.f273320a.h() : i38;
        int color3 = (i66 & 4096) != 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : i39;
        int g17 = (i66 & 8192) != 0 ? gm2.c1.f273320a.g() : i47;
        int k17 = (i66 & 16384) != 0 ? gm2.c1.f273320a.k() : i48;
        int k18 = (i66 & 32768) != 0 ? gm2.c1.f273320a.k() : i49;
        int i68 = (i66 & 65536) != 0 ? 0 : i57;
        int i69 = (i66 & 131072) != 0 ? 1 : i58;
        int i76 = (i66 & 262144) != 0 ? 0 : i59;
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(fansName, "fansName");
        this.f273390a = level;
        this.f273391b = color;
        this.f273392c = e17;
        this.f273393d = fansName;
        this.f273394e = color2;
        this.f273395f = e18;
        this.f273396g = drawable3;
        this.f273397h = h17;
        this.f273398i = h18;
        this.f273399j = drawable4;
        this.f273400k = i67;
        this.f273401l = h19;
        this.f273402m = color3;
        this.f273403n = g17;
        this.f273404o = k17;
        this.f273405p = k18;
        this.f273406q = i68;
        this.f273407r = i69;
        this.f273408s = i76;
        this.f273409t = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479648bn);
    }

    public final int a() {
        android.graphics.drawable.Drawable drawable = this.f273396g;
        int i17 = this.f273409t;
        int i18 = drawable == null ? i17 : this.f273397h;
        if (this.f273399j != null) {
            i17 = this.f273400k / 2;
        }
        return (int) (i18 + this.f273408s + this.f273407r + gm2.c1.f273320a.p(this.f273393d, this.f273395f) + i17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.i)) {
            return false;
        }
        gm2.i iVar = (gm2.i) obj;
        return kotlin.jvm.internal.o.b(this.f273390a, iVar.f273390a) && this.f273391b == iVar.f273391b && this.f273392c == iVar.f273392c && kotlin.jvm.internal.o.b(this.f273393d, iVar.f273393d) && this.f273394e == iVar.f273394e && this.f273395f == iVar.f273395f && kotlin.jvm.internal.o.b(this.f273396g, iVar.f273396g) && this.f273397h == iVar.f273397h && this.f273398i == iVar.f273398i && kotlin.jvm.internal.o.b(this.f273399j, iVar.f273399j) && this.f273400k == iVar.f273400k && this.f273401l == iVar.f273401l && this.f273402m == iVar.f273402m && this.f273403n == iVar.f273403n && this.f273404o == iVar.f273404o && this.f273405p == iVar.f273405p && this.f273406q == iVar.f273406q && this.f273407r == iVar.f273407r && this.f273408s == iVar.f273408s;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f273390a.hashCode() * 31) + java.lang.Integer.hashCode(this.f273391b)) * 31) + java.lang.Integer.hashCode(this.f273392c)) * 31) + this.f273393d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f273394e)) * 31) + java.lang.Integer.hashCode(this.f273395f)) * 31;
        android.graphics.drawable.Drawable drawable = this.f273396g;
        int hashCode2 = (((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Integer.hashCode(this.f273397h)) * 31) + java.lang.Integer.hashCode(this.f273398i)) * 31;
        android.graphics.drawable.Drawable drawable2 = this.f273399j;
        return ((((((((((((((((((hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f273400k)) * 31) + java.lang.Integer.hashCode(this.f273401l)) * 31) + java.lang.Integer.hashCode(this.f273402m)) * 31) + java.lang.Integer.hashCode(this.f273403n)) * 31) + java.lang.Integer.hashCode(this.f273404o)) * 31) + java.lang.Integer.hashCode(this.f273405p)) * 31) + java.lang.Integer.hashCode(this.f273406q)) * 31) + java.lang.Integer.hashCode(this.f273407r)) * 31) + java.lang.Integer.hashCode(this.f273408s);
    }

    public java.lang.String toString() {
        return "FinderLiveFansSpanParams(level=" + this.f273390a + ", levelColor=" + this.f273391b + ", levelSize=" + this.f273392c + ", fansName=" + this.f273393d + ", fansNameColor=" + this.f273394e + ", fansNameSize=" + this.f273395f + ", leftIcon=" + this.f273396g + ", leftIconWidth=" + this.f273397h + ", leftIconHeight=" + this.f273398i + ", rightIcon=" + this.f273399j + ", rightIconWidth=" + this.f273400k + ", rightIconHeight=" + this.f273401l + ", bgColor=" + this.f273402m + ", bgHeight=" + this.f273403n + ", leftMargin=" + this.f273404o + ", rightMargin=" + this.f273405p + ", bgDrawable=" + this.f273406q + ", nameLeftMargin=" + this.f273407r + ", leftIconMargin=" + this.f273408s + ')';
    }
}
