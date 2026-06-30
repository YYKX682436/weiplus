package om2;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346383a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f346384b;

    public u(java.lang.String uId, om2.p baseInfo) {
        kotlin.jvm.internal.o.g(uId, "uId");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f346383a = uId;
        this.f346384b = baseInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.u)) {
            return false;
        }
        om2.u uVar = (om2.u) obj;
        return kotlin.jvm.internal.o.b(this.f346383a, uVar.f346383a) && kotlin.jvm.internal.o.b(this.f346384b, uVar.f346384b);
    }

    public int hashCode() {
        return (this.f346383a.hashCode() * 31) + this.f346384b.hashCode();
    }

    public java.lang.String toString() {
        return "LiveSongScoreInfo(uId=" + this.f346383a + ", baseInfo=" + this.f346384b + ')';
    }
}
