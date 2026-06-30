package ru0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399690a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399691b;

    /* renamed from: c, reason: collision with root package name */
    public final long f399692c;

    public n(java.lang.String word, long j17, long j18) {
        kotlin.jvm.internal.o.g(word, "word");
        this.f399690a = word;
        this.f399691b = j17;
        this.f399692c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.n)) {
            return false;
        }
        ru0.n nVar = (ru0.n) obj;
        return kotlin.jvm.internal.o.b(this.f399690a, nVar.f399690a) && this.f399691b == nVar.f399691b && this.f399692c == nVar.f399692c;
    }

    public int hashCode() {
        return (((this.f399690a.hashCode() * 31) + java.lang.Long.hashCode(this.f399691b)) * 31) + java.lang.Long.hashCode(this.f399692c);
    }

    public java.lang.String toString() {
        return "WordInfo(word=" + this.f399690a + ", beginTimeMs=" + this.f399691b + ", endTimeMs=" + this.f399692c + ')';
    }
}
