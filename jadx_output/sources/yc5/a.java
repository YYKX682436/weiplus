package yc5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f460885a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f460886b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f460887c;

    public a(boolean z17, boolean z18, boolean z19) {
        this.f460885a = z17;
        this.f460886b = z18;
        this.f460887c = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc5.a)) {
            return false;
        }
        yc5.a aVar = (yc5.a) obj;
        return this.f460885a == aVar.f460885a && this.f460886b == aVar.f460886b && this.f460887c == aVar.f460887c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f460885a) * 31) + java.lang.Boolean.hashCode(this.f460886b)) * 31) + java.lang.Boolean.hashCode(this.f460887c);
    }

    public java.lang.String toString() {
        return "BatchResult(hasSuccess=" + this.f460885a + ", hasExpired=" + this.f460886b + ", hasFailed=" + this.f460887c + ')';
    }
}
