package om2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final om2.d f346381a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f346382b;

    public t(om2.d error, om2.p pVar) {
        kotlin.jvm.internal.o.g(error, "error");
        this.f346381a = error;
        this.f346382b = pVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.t)) {
            return false;
        }
        om2.t tVar = (om2.t) obj;
        return this.f346381a == tVar.f346381a && kotlin.jvm.internal.o.b(this.f346382b, tVar.f346382b);
    }

    public int hashCode() {
        int hashCode = this.f346381a.hashCode() * 31;
        om2.p pVar = this.f346382b;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public java.lang.String toString() {
        return "LiveSongResourceResult(error=" + this.f346381a + ", resourceInfo=" + this.f346382b + ')';
    }
}
