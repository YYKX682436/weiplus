package x5;

/* loaded from: classes14.dex */
public final class e extends x5.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f451944a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f451945b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.d f451946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.graphics.drawable.Drawable drawable, boolean z17, v5.d dataSource) {
        super(null);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        this.f451944a = drawable;
        this.f451945b = z17;
        this.f451946c = dataSource;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5.e)) {
            return false;
        }
        x5.e eVar = (x5.e) obj;
        return kotlin.jvm.internal.o.b(this.f451944a, eVar.f451944a) && this.f451945b == eVar.f451945b && this.f451946c == eVar.f451946c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f451944a.hashCode() * 31;
        boolean z17 = this.f451945b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return ((hashCode + i17) * 31) + this.f451946c.hashCode();
    }

    public java.lang.String toString() {
        return "DrawableResult(drawable=" + this.f451944a + ", isSampled=" + this.f451945b + ", dataSource=" + this.f451946c + ')';
    }
}
