package i55;

/* loaded from: classes8.dex */
public final class e extends g55.i {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f288844e;

    /* renamed from: f, reason: collision with root package name */
    public int f288845f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288846g;

    public e(long j17) {
        super(j17);
        this.f288844e = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof i55.e) {
            i55.e eVar = (i55.e) obj;
            if (kotlin.jvm.internal.o.b(eVar.f288844e, this.f288844e) && eVar.f288846g == this.f288846g && eVar.f288845f == this.f288845f) {
                return true;
            }
        }
        return false;
    }

    @Override // g55.i
    public java.lang.String toString() {
        return super.toString() + "curRedDotText [" + this.f288844e + "] curRedDotUnReadCnt [" + this.f288845f + "] curIsRedDot = [" + this.f288846g + ']';
    }
}
