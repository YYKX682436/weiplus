package ki;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f308084a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f308085b;

    public b(boolean z17, java.util.ArrayList delayMillis) {
        kotlin.jvm.internal.o.g(delayMillis, "delayMillis");
        this.f308084a = z17;
        this.f308085b = delayMillis;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki.b)) {
            return false;
        }
        ki.b bVar = (ki.b) obj;
        return this.f308084a == bVar.f308084a && kotlin.jvm.internal.o.b(this.f308085b, bVar.f308085b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z17 = this.f308084a;
        ?? r07 = z17;
        if (z17) {
            r07 = 1;
        }
        int i17 = r07 * 31;
        java.util.ArrayList arrayList = this.f308085b;
        return i17 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TrimMemoryConfig(enable=" + this.f308084a + ", delayMillis=" + this.f308085b + ")";
    }
}
