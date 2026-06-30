package fk4;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f263648a;

    /* renamed from: b, reason: collision with root package name */
    public final long f263649b;

    /* renamed from: c, reason: collision with root package name */
    public final long f263650c;

    /* renamed from: d, reason: collision with root package name */
    public final long f263651d;

    public o(long j17, long j18, long j19, long j27) {
        this.f263648a = j17;
        this.f263649b = j18;
        this.f263650c = j19;
        this.f263651d = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk4.o)) {
            return false;
        }
        fk4.o oVar = (fk4.o) obj;
        return this.f263648a == oVar.f263648a && this.f263649b == oVar.f263649b && this.f263650c == oVar.f263650c && this.f263651d == oVar.f263651d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f263648a) * 31) + java.lang.Long.hashCode(this.f263649b)) * 31) + java.lang.Long.hashCode(this.f263650c)) * 31) + java.lang.Long.hashCode(this.f263651d);
    }

    public java.lang.String toString() {
        return "Stat(progress=" + this.f263648a + ", totalLength=" + this.f263649b + ", moovOffset=" + this.f263650c + ", moovLength=" + this.f263651d + ')';
    }
}
