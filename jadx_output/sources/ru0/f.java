package ru0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399667a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399668b;

    /* renamed from: c, reason: collision with root package name */
    public final long f399669c;

    public f(java.lang.String text, long j17, long j18) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f399667a = text;
        this.f399668b = j17;
        this.f399669c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.f)) {
            return false;
        }
        ru0.f fVar = (ru0.f) obj;
        return kotlin.jvm.internal.o.b(this.f399667a, fVar.f399667a) && this.f399668b == fVar.f399668b && this.f399669c == fVar.f399669c;
    }

    public int hashCode() {
        return (((this.f399667a.hashCode() * 31) + java.lang.Long.hashCode(this.f399668b)) * 31) + java.lang.Long.hashCode(this.f399669c);
    }

    public java.lang.String toString() {
        return "SentenceInfo(text=" + this.f399667a + ", beginTimeMs=" + this.f399668b + ", endTimeMs=" + this.f399669c + ')';
    }
}
