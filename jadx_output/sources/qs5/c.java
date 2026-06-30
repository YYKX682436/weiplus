package qs5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f366423a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f366424b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f366425c;

    public c(int i17, java.lang.String title, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(title, "title");
        this.f366423a = i17;
        this.f366424b = title;
        this.f366425c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs5.c)) {
            return false;
        }
        qs5.c cVar = (qs5.c) obj;
        return this.f366423a == cVar.f366423a && kotlin.jvm.internal.o.b(this.f366424b, cVar.f366424b) && this.f366425c == cVar.f366425c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f366423a) * 31) + this.f366424b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f366425c);
    }

    public java.lang.String toString() {
        return "EffectInfo(beautyId=" + this.f366423a + ", title=" + this.f366424b + ", isBothSides=" + this.f366425c + ')';
    }
}
