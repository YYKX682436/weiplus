package y1;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final y1.h f458713d = new y1.h(0.0f, new e06.e(0.0f, 0.0f), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f458714a;

    /* renamed from: b, reason: collision with root package name */
    public final e06.f f458715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f458716c;

    public h(float f17, e06.f range, int i17) {
        kotlin.jvm.internal.o.g(range, "range");
        this.f458714a = f17;
        this.f458715b = range;
        this.f458716c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.h)) {
            return false;
        }
        y1.h hVar = (y1.h) obj;
        return ((this.f458714a > hVar.f458714a ? 1 : (this.f458714a == hVar.f458714a ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f458715b, hVar.f458715b) && this.f458716c == hVar.f458716c;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f458714a) * 31) + this.f458715b.hashCode()) * 31) + this.f458716c;
    }

    public java.lang.String toString() {
        return "ProgressBarRangeInfo(current=" + this.f458714a + ", range=" + this.f458715b + ", steps=" + this.f458716c + ')';
    }
}
