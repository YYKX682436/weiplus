package v5;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f433280a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f433281b;

    public e(android.graphics.drawable.Drawable drawable, boolean z17) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f433280a = drawable;
        this.f433281b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5.e)) {
            return false;
        }
        v5.e eVar = (v5.e) obj;
        return kotlin.jvm.internal.o.b(this.f433280a, eVar.f433280a) && this.f433281b == eVar.f433281b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f433280a.hashCode() * 31;
        boolean z17 = this.f433281b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    public java.lang.String toString() {
        return "DecodeResult(drawable=" + this.f433280a + ", isSampled=" + this.f433281b + ')';
    }
}
