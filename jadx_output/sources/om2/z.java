package om2;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346392a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f346393b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f346394c;

    /* renamed from: d, reason: collision with root package name */
    public final int f346395d;

    public z(java.lang.String uId, java.lang.String songId, java.lang.String songUid, int i17) {
        kotlin.jvm.internal.o.g(uId, "uId");
        kotlin.jvm.internal.o.g(songId, "songId");
        kotlin.jvm.internal.o.g(songUid, "songUid");
        this.f346392a = uId;
        this.f346393b = songId;
        this.f346394c = songUid;
        this.f346395d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.z)) {
            return false;
        }
        om2.z zVar = (om2.z) obj;
        return kotlin.jvm.internal.o.b(this.f346392a, zVar.f346392a) && kotlin.jvm.internal.o.b(this.f346393b, zVar.f346393b) && kotlin.jvm.internal.o.b(this.f346394c, zVar.f346394c) && this.f346395d == zVar.f346395d;
    }

    public int hashCode() {
        return (((((this.f346392a.hashCode() * 31) + this.f346393b.hashCode()) * 31) + this.f346394c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f346395d);
    }

    public java.lang.String toString() {
        return "SEISongData(uId=" + this.f346392a + ", songId=" + this.f346393b + ", songUid=" + this.f346394c + ", os=" + this.f346395d + ')';
    }
}
