package rn5;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f397971a;

    public a(int i17, long j17, int i18) {
        this.f397971a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn5.a)) {
            return false;
        }
        rn5.a aVar = (rn5.a) obj;
        aVar.getClass();
        return this.f397971a == aVar.f397971a;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(4) * 31) + java.lang.Long.hashCode(this.f397971a)) * 31) + java.lang.Integer.hashCode(2);
    }

    public java.lang.String toString() {
        return "LoaderExtInfo(pullType=4, loaderId=" + this.f397971a + ", specialRequestScene=2)";
    }
}
