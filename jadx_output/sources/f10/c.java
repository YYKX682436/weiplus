package f10;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f258545a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f258546b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f258547c;

    /* renamed from: d, reason: collision with root package name */
    public final int f258548d;

    public c(int i17, java.lang.String str, boolean z17, int i18) {
        this.f258545a = i17;
        this.f258546b = str;
        this.f258547c = z17;
        this.f258548d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f10.c)) {
            return false;
        }
        f10.c cVar = (f10.c) obj;
        return this.f258545a == cVar.f258545a && kotlin.jvm.internal.o.b(this.f258546b, cVar.f258546b) && this.f258547c == cVar.f258547c && this.f258548d == cVar.f258548d;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f258545a) * 31;
        java.lang.String str = this.f258546b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f258547c)) * 31) + java.lang.Integer.hashCode(this.f258548d);
    }

    public java.lang.String toString() {
        return "EcsOrderAndCardEntranceInfo(showType=" + this.f258545a + ", iconUrl=" + this.f258546b + ", needPreload=" + this.f258547c + ", titleType=" + this.f258548d + ')';
    }
}
