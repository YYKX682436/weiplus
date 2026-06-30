package om2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346367a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.y f346368b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f346369c;

    /* renamed from: d, reason: collision with root package name */
    public final om2.w f346370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f346371e;

    public p(java.lang.String songMid, om2.y qrcRes, boolean z17, om2.w wVar, int i17) {
        kotlin.jvm.internal.o.g(songMid, "songMid");
        kotlin.jvm.internal.o.g(qrcRes, "qrcRes");
        this.f346367a = songMid;
        this.f346368b = qrcRes;
        this.f346369c = z17;
        this.f346370d = wVar;
        this.f346371e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.p)) {
            return false;
        }
        om2.p pVar = (om2.p) obj;
        return kotlin.jvm.internal.o.b(this.f346367a, pVar.f346367a) && kotlin.jvm.internal.o.b(this.f346368b, pVar.f346368b) && this.f346369c == pVar.f346369c && kotlin.jvm.internal.o.b(this.f346370d, pVar.f346370d) && this.f346371e == pVar.f346371e;
    }

    public int hashCode() {
        int hashCode = ((((this.f346367a.hashCode() * 31) + this.f346368b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f346369c)) * 31;
        om2.w wVar = this.f346370d;
        return ((hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f346371e);
    }

    public java.lang.String toString() {
        return "LiveSongBaseResourceInfo(songMid=" + this.f346367a + ", qrcRes=" + this.f346368b + ", hasNote=" + this.f346369c + ", noteRes=" + this.f346370d + ", songDuration=" + this.f346371e + ')';
    }
}
