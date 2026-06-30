package mm2;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f329468a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f329469b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f329470c;

    /* renamed from: d, reason: collision with root package name */
    public int f329471d;

    /* renamed from: e, reason: collision with root package name */
    public int f329472e;

    public v0(boolean z17, java.util.List cheerIconInfos, java.lang.String str, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        if ((i19 & 2) != 0) {
            cheerIconInfos = java.util.Collections.synchronizedList(new java.util.LinkedList());
            kotlin.jvm.internal.o.f(cheerIconInfos, "synchronizedList(...)");
        }
        str = (i19 & 4) != 0 ? null : str;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(cheerIconInfos, "cheerIconInfos");
        this.f329468a = z17;
        this.f329469b = cheerIconInfos;
        this.f329470c = str;
        this.f329471d = i17;
        this.f329472e = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.v0)) {
            return false;
        }
        mm2.v0 v0Var = (mm2.v0) obj;
        return this.f329468a == v0Var.f329468a && kotlin.jvm.internal.o.b(this.f329469b, v0Var.f329469b) && kotlin.jvm.internal.o.b(this.f329470c, v0Var.f329470c) && this.f329471d == v0Var.f329471d && this.f329472e == v0Var.f329472e;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f329468a) * 31) + this.f329469b.hashCode()) * 31;
        java.lang.String str = this.f329470c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f329471d)) * 31) + java.lang.Integer.hashCode(this.f329472e);
    }

    public java.lang.String toString() {
        return "CheerInfo(hasChanged=" + this.f329468a + ", cheerIconInfos=" + this.f329469b + ", cheerIconUrl=" + this.f329470c + ", enable=" + this.f329471d + ", cheerType=" + this.f329472e + ')';
    }
}
