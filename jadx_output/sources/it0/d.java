package it0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f294490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294491b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f294492c;

    public d(int i17, java.lang.String lens, java.lang.String supportLevel) {
        kotlin.jvm.internal.o.g(lens, "lens");
        kotlin.jvm.internal.o.g(supportLevel, "supportLevel");
        this.f294490a = i17;
        this.f294491b = lens;
        this.f294492c = supportLevel;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it0.d)) {
            return false;
        }
        it0.d dVar = (it0.d) obj;
        return this.f294490a == dVar.f294490a && kotlin.jvm.internal.o.b(this.f294491b, dVar.f294491b) && kotlin.jvm.internal.o.b(this.f294492c, dVar.f294492c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f294490a) * 31) + this.f294491b.hashCode()) * 31) + this.f294492c.hashCode();
    }

    public java.lang.String toString() {
        return "CameraInfo(id=" + this.f294490a + ", lens=" + this.f294491b + ", supportLevel=" + this.f294492c + ')';
    }
}
