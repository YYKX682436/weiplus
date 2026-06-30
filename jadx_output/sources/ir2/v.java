package ir2;

/* loaded from: classes2.dex */
public final class v implements ir2.x {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f294228a;

    /* renamed from: b, reason: collision with root package name */
    public final ir2.z f294229b;

    public v(ir2.e1 data, ir2.z zVar, int i17, kotlin.jvm.internal.i iVar) {
        zVar = (i17 & 2) != 0 ? null : zVar;
        kotlin.jvm.internal.o.g(data, "data");
        this.f294228a = data;
        this.f294229b = zVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir2.v)) {
            return false;
        }
        ir2.v vVar = (ir2.v) obj;
        return kotlin.jvm.internal.o.b(this.f294228a, vVar.f294228a) && kotlin.jvm.internal.o.b(this.f294229b, vVar.f294229b);
    }

    public int hashCode() {
        int hashCode = this.f294228a.hashCode() * 31;
        ir2.z zVar = this.f294229b;
        return hashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    public java.lang.String toString() {
        return "RefreshEvent(data=" + this.f294228a + ", key=" + this.f294229b + ')';
    }
}
