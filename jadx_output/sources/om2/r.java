package om2;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final om2.c f346375a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.a f346376b;

    /* renamed from: c, reason: collision with root package name */
    public final om2.q f346377c;

    public r(om2.c error, zy.a aVar, om2.q qVar) {
        kotlin.jvm.internal.o.g(error, "error");
        this.f346375a = error;
        this.f346376b = aVar;
        this.f346377c = qVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.r)) {
            return false;
        }
        om2.r rVar = (om2.r) obj;
        return this.f346375a == rVar.f346375a && kotlin.jvm.internal.o.b(this.f346376b, rVar.f346376b) && kotlin.jvm.internal.o.b(this.f346377c, rVar.f346377c);
    }

    public int hashCode() {
        int hashCode = this.f346375a.hashCode() * 31;
        zy.a aVar = this.f346376b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        om2.q qVar = this.f346377c;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LiveSongMusicResourceResult(error=" + this.f346375a + ", resultParams=" + this.f346376b + ", musicResourceInfo=" + this.f346377c + ')';
    }
}
