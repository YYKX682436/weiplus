package mm2;

/* loaded from: classes3.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f329574a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.z64 f329575b;

    /* renamed from: c, reason: collision with root package name */
    public final long f329576c;

    public y5(long j17, r45.z64 subsidyInfo, long j18) {
        kotlin.jvm.internal.o.g(subsidyInfo, "subsidyInfo");
        this.f329574a = j17;
        this.f329575b = subsidyInfo;
        this.f329576c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.y5)) {
            return false;
        }
        mm2.y5 y5Var = (mm2.y5) obj;
        return this.f329574a == y5Var.f329574a && kotlin.jvm.internal.o.b(this.f329575b, y5Var.f329575b) && this.f329576c == y5Var.f329576c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f329574a) * 31) + this.f329575b.hashCode()) * 31) + java.lang.Long.hashCode(this.f329576c);
    }

    public java.lang.String toString() {
        return "PendingSubsidyAnim(productId=" + this.f329574a + ", subsidyInfo=" + this.f329575b + ", enqueuedAtMs=" + this.f329576c + ')';
    }
}
