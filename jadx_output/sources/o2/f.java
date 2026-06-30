package o2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f342340a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f342341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f342342c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f342343d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342344e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f342345f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f342346g;

    public f(java.lang.String name, java.lang.Object obj, boolean z17, boolean z18, boolean z19, java.lang.String str, boolean z27) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f342340a = name;
        this.f342341b = obj;
        this.f342342c = z17;
        this.f342343d = z18;
        this.f342344e = z19;
        this.f342345f = str;
        this.f342346g = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2.f)) {
            return false;
        }
        o2.f fVar = (o2.f) obj;
        return kotlin.jvm.internal.o.b(this.f342340a, fVar.f342340a) && kotlin.jvm.internal.o.b(this.f342341b, fVar.f342341b) && this.f342342c == fVar.f342342c && this.f342343d == fVar.f342343d && this.f342344e == fVar.f342344e && kotlin.jvm.internal.o.b(this.f342345f, fVar.f342345f) && this.f342346g == fVar.f342346g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f342340a.hashCode() * 31;
        java.lang.Object obj = this.f342341b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z17 = this.f342342c;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode2 + i17) * 31;
        boolean z18 = this.f342343d;
        int i19 = z18;
        if (z18 != 0) {
            i19 = 1;
        }
        int i27 = (i18 + i19) * 31;
        boolean z19 = this.f342344e;
        int i28 = z19;
        if (z19 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        java.lang.String str = this.f342345f;
        int hashCode3 = (i29 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z27 = this.f342346g;
        return hashCode3 + (z27 ? 1 : z27 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "ParameterInformation(name=" + this.f342340a + ", value=" + this.f342341b + ", fromDefault=" + this.f342342c + ", static=" + this.f342343d + ", compared=" + this.f342344e + ", inlineClass=" + this.f342345f + ", stable=" + this.f342346g + ')';
    }
}
