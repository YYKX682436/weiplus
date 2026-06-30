package ir2;

/* loaded from: classes2.dex */
public final class t implements ir2.x {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f294218a;

    /* renamed from: b, reason: collision with root package name */
    public final ir2.z f294219b;

    public t(ir2.e1 data, ir2.z zVar, int i17, kotlin.jvm.internal.i iVar) {
        zVar = (i17 & 2) != 0 ? null : zVar;
        kotlin.jvm.internal.o.g(data, "data");
        this.f294218a = data;
        this.f294219b = zVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir2.t)) {
            return false;
        }
        ir2.t tVar = (ir2.t) obj;
        return kotlin.jvm.internal.o.b(this.f294218a, tVar.f294218a) && kotlin.jvm.internal.o.b(this.f294219b, tVar.f294219b);
    }

    public int hashCode() {
        int hashCode = this.f294218a.hashCode() * 31;
        ir2.z zVar = this.f294219b;
        return hashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    public java.lang.String toString() {
        return "LoadMoreEvent(data=" + this.f294218a + ", key=" + this.f294219b + ')';
    }
}
