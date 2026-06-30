package ic5;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f290434a;

    /* renamed from: b, reason: collision with root package name */
    public final r15.d f290435b;

    public c(int i17, r15.d groupInfo) {
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        this.f290434a = i17;
        this.f290435b = groupInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic5.c)) {
            return false;
        }
        ic5.c cVar = (ic5.c) obj;
        return this.f290434a == cVar.f290434a && kotlin.jvm.internal.o.b(this.f290435b, cVar.f290435b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f290434a) * 31) + this.f290435b.hashCode();
    }

    public java.lang.String toString() {
        return "GroupInfoCacheEntry(contentHash=" + this.f290434a + ", groupInfo=" + this.f290435b + ')';
    }
}
