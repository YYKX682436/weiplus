package uc0;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f426281a;

    /* renamed from: b, reason: collision with root package name */
    public final int f426282b;

    /* renamed from: c, reason: collision with root package name */
    public final int f426283c;

    /* renamed from: d, reason: collision with root package name */
    public final uc0.p f426284d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f426285e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f426286f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f426287g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f426288h;

    /* renamed from: i, reason: collision with root package name */
    public int f426289i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f426290j;

    /* renamed from: k, reason: collision with root package name */
    public uc0.s f426291k;

    /* renamed from: l, reason: collision with root package name */
    public uc0.m f426292l;

    public v(java.lang.String str, int i17, int i18, uc0.p pVar) {
        this.f426281a = str;
        this.f426282b = i17;
        this.f426283c = i18;
        this.f426284d = pVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0.v)) {
            return false;
        }
        uc0.v vVar = (uc0.v) obj;
        return kotlin.jvm.internal.o.b(this.f426281a, vVar.f426281a) && this.f426282b == vVar.f426282b && this.f426283c == vVar.f426283c && kotlin.jvm.internal.o.b(this.f426284d, vVar.f426284d);
    }

    public int hashCode() {
        java.lang.String str = this.f426281a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f426282b)) * 31) + java.lang.Integer.hashCode(this.f426283c)) * 31;
        uc0.p pVar = this.f426284d;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SelectTextData(originalContent=" + this.f426281a + ", currentLength=" + this.f426282b + ", maxLength=" + this.f426283c + ", callback=" + this.f426284d + ')';
    }
}
