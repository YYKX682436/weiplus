package qc2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f361504a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361505b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f361506c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361507d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f361508e;

    public a(int i17, java.lang.String carouselAutoSequence, java.lang.String carouselManSequence, java.lang.String carouselShowSequence, java.lang.String carouselClickSequence, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        carouselAutoSequence = (i18 & 2) != 0 ? "" : carouselAutoSequence;
        carouselManSequence = (i18 & 4) != 0 ? "" : carouselManSequence;
        carouselShowSequence = (i18 & 8) != 0 ? "" : carouselShowSequence;
        carouselClickSequence = (i18 & 16) != 0 ? "" : carouselClickSequence;
        kotlin.jvm.internal.o.g(carouselAutoSequence, "carouselAutoSequence");
        kotlin.jvm.internal.o.g(carouselManSequence, "carouselManSequence");
        kotlin.jvm.internal.o.g(carouselShowSequence, "carouselShowSequence");
        kotlin.jvm.internal.o.g(carouselClickSequence, "carouselClickSequence");
        this.f361504a = i17;
        this.f361505b = carouselAutoSequence;
        this.f361506c = carouselManSequence;
        this.f361507d = carouselShowSequence;
        this.f361508e = carouselClickSequence;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc2.a)) {
            return false;
        }
        qc2.a aVar = (qc2.a) obj;
        return this.f361504a == aVar.f361504a && kotlin.jvm.internal.o.b(this.f361505b, aVar.f361505b) && kotlin.jvm.internal.o.b(this.f361506c, aVar.f361506c) && kotlin.jvm.internal.o.b(this.f361507d, aVar.f361507d) && kotlin.jvm.internal.o.b(this.f361508e, aVar.f361508e);
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f361504a) * 31) + this.f361505b.hashCode()) * 31) + this.f361506c.hashCode()) * 31) + this.f361507d.hashCode()) * 31) + this.f361508e.hashCode();
    }

    public java.lang.String toString() {
        return "(carouselIndex=" + this.f361504a + ", carouselAutoSequence=" + this.f361505b + ", carouselManSequence=" + this.f361506c + ", carouselShowSequence=" + this.f361507d + ", carouselClickSequence=" + this.f361508e + ')';
    }
}
