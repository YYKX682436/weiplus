package er5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final er5.c f256229d = new er5.c(-1299675000, android.content.res.Resources.getSystem().getDisplayMetrics().density * 3.0f, android.content.res.Resources.getSystem().getDisplayMetrics().density * 6.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f256230a;

    /* renamed from: b, reason: collision with root package name */
    public final float f256231b;

    /* renamed from: c, reason: collision with root package name */
    public final float f256232c;

    public c(int i17, float f17, float f18) {
        this.f256230a = i17;
        this.f256231b = f17;
        this.f256232c = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5.c)) {
            return false;
        }
        er5.c cVar = (er5.c) obj;
        return this.f256230a == cVar.f256230a && java.lang.Float.compare(this.f256231b, cVar.f256231b) == 0 && java.lang.Float.compare(this.f256232c, cVar.f256232c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f256230a) * 31) + java.lang.Float.hashCode(this.f256231b)) * 31) + java.lang.Float.hashCode(this.f256232c);
    }

    public java.lang.String toString() {
        return "ScrollBarSpec(color=" + this.f256230a + ", size=" + this.f256231b + ", margin=" + this.f256232c + ')';
    }
}
