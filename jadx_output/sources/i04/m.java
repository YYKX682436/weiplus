package i04;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f286559a;

    /* renamed from: b, reason: collision with root package name */
    public final int f286560b;

    public m(boolean z17, int i17) {
        this.f286559a = z17;
        this.f286560b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i04.m)) {
            return false;
        }
        i04.m mVar = (i04.m) obj;
        return this.f286559a == mVar.f286559a && this.f286560b == mVar.f286560b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f286559a) * 31) + java.lang.Integer.hashCode(this.f286560b);
    }

    public java.lang.String toString() {
        return "UserStats(disable=" + this.f286559a + ", time=" + this.f286560b + ')';
    }
}
