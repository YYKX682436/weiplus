package d0;

/* loaded from: classes14.dex */
public final class e2 implements d0.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f225108a;

    /* renamed from: b, reason: collision with root package name */
    public final float f225109b;

    /* renamed from: c, reason: collision with root package name */
    public final float f225110c;

    /* renamed from: d, reason: collision with root package name */
    public final float f225111d;

    public e2(float f17, float f18, float f19, float f27, kotlin.jvm.internal.i iVar) {
        this.f225108a = f17;
        this.f225109b = f18;
        this.f225110c = f19;
        this.f225111d = f27;
    }

    public float a(p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return layoutDirection == p2.s.Ltr ? this.f225108a : this.f225110c;
    }

    public float b(p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return layoutDirection == p2.s.Ltr ? this.f225110c : this.f225108a;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof d0.e2)) {
            return false;
        }
        d0.e2 e2Var = (d0.e2) obj;
        return p2.h.a(this.f225108a, e2Var.f225108a) && p2.h.a(this.f225109b, e2Var.f225109b) && p2.h.a(this.f225110c, e2Var.f225110c) && p2.h.a(this.f225111d, e2Var.f225111d);
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f225108a) * 31) + java.lang.Float.hashCode(this.f225109b)) * 31) + java.lang.Float.hashCode(this.f225110c)) * 31) + java.lang.Float.hashCode(this.f225111d);
    }

    public java.lang.String toString() {
        return "PaddingValues(start=" + ((java.lang.Object) p2.h.b(this.f225108a)) + ", top=" + ((java.lang.Object) p2.h.b(this.f225109b)) + ", end=" + ((java.lang.Object) p2.h.b(this.f225110c)) + ", bottom=" + ((java.lang.Object) p2.h.b(this.f225111d)) + ')';
    }
}
