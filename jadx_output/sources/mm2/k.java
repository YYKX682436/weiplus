package mm2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f329185a;

    /* renamed from: b, reason: collision with root package name */
    public final long f329186b;

    public k(long j17, long j18) {
        this.f329185a = j17;
        this.f329186b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.k)) {
            return false;
        }
        mm2.k kVar = (mm2.k) obj;
        return this.f329185a == kVar.f329185a && this.f329186b == kVar.f329186b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f329185a) * 31) + java.lang.Long.hashCode(this.f329186b);
    }

    public java.lang.String toString() {
        return "LivingAdVideoProgress(progressMs=" + this.f329185a + ", durationMs=" + this.f329186b + ')';
    }
}
