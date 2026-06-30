package oy2;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f349992a;

    /* renamed from: b, reason: collision with root package name */
    public final float f349993b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f349994c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f349995d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f349996e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f349997f;

    public p(int i17, float f17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 1 : i17;
        f17 = (i18 & 2) != 0 ? 0.75f : f17;
        z17 = (i18 & 4) != 0 ? true : z17;
        str = (i18 & 8) != 0 ? null : str;
        str2 = (i18 & 16) != 0 ? null : str2;
        str3 = (i18 & 32) != 0 ? null : str3;
        this.f349992a = i17;
        this.f349993b = f17;
        this.f349994c = z17;
        this.f349995d = str;
        this.f349996e = str2;
        this.f349997f = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy2.p)) {
            return false;
        }
        oy2.p pVar = (oy2.p) obj;
        return this.f349992a == pVar.f349992a && java.lang.Float.compare(this.f349993b, pVar.f349993b) == 0 && this.f349994c == pVar.f349994c && kotlin.jvm.internal.o.b(this.f349995d, pVar.f349995d) && kotlin.jvm.internal.o.b(this.f349996e, pVar.f349996e) && kotlin.jvm.internal.o.b(this.f349997f, pVar.f349997f);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f349992a) * 31) + java.lang.Float.hashCode(this.f349993b)) * 31) + java.lang.Boolean.hashCode(this.f349994c)) * 31;
        java.lang.String str = this.f349995d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f349996e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f349997f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ScConfig(style=" + this.f349992a + ", peekRatio=" + this.f349993b + ", expandable=" + this.f349994c + ", openPopupWording=" + this.f349995d + ", openPopupTitle=" + this.f349996e + ", transitCommonUxInfo=" + this.f349997f + ')';
    }
}
