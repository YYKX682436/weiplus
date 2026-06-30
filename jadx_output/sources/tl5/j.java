package tl5;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f420362a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f420363b;

    /* renamed from: c, reason: collision with root package name */
    public final long f420364c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420365d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f420366e;

    public j(android.graphics.RectF frame, android.graphics.drawable.Drawable drawable, long j17, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(frame, "frame");
        this.f420362a = frame;
        this.f420363b = drawable;
        this.f420364c = j17;
        this.f420365d = i17;
        this.f420366e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.j)) {
            return false;
        }
        tl5.j jVar = (tl5.j) obj;
        return kotlin.jvm.internal.o.b(this.f420362a, jVar.f420362a) && kotlin.jvm.internal.o.b(this.f420363b, jVar.f420363b) && this.f420364c == jVar.f420364c && this.f420365d == jVar.f420365d && this.f420366e == jVar.f420366e;
    }

    public int hashCode() {
        int hashCode = this.f420362a.hashCode() * 31;
        android.graphics.drawable.Drawable drawable = this.f420363b;
        return ((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Long.hashCode(this.f420364c)) * 31) + java.lang.Integer.hashCode(this.f420365d)) * 31) + java.lang.Boolean.hashCode(this.f420366e);
    }

    public java.lang.String toString() {
        return "PinchZoomTransitSnapshot(frame=" + this.f420362a + ", drawable=" + this.f420363b + ", stableId=" + this.f420364c + ", adapterPosition=" + this.f420365d + ", isFullSpan=" + this.f420366e + ')';
    }
}
