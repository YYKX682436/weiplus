package mx0;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f332404a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f332405b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f332406c;

    public w(java.lang.String musicId, java.lang.String musicName, java.lang.String singerNames) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(musicName, "musicName");
        kotlin.jvm.internal.o.g(singerNames, "singerNames");
        this.f332404a = musicId;
        this.f332405b = musicName;
        this.f332406c = singerNames;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx0.w)) {
            return false;
        }
        mx0.w wVar = (mx0.w) obj;
        return kotlin.jvm.internal.o.b(this.f332404a, wVar.f332404a) && kotlin.jvm.internal.o.b(this.f332405b, wVar.f332405b) && kotlin.jvm.internal.o.b(this.f332406c, wVar.f332406c);
    }

    public int hashCode() {
        return (((this.f332404a.hashCode() * 31) + this.f332405b.hashCode()) * 31) + this.f332406c.hashCode();
    }

    public java.lang.String toString() {
        return "MusicShowInfo(musicId=" + this.f332404a + ", musicName=" + this.f332405b + ", singerNames=" + this.f332406c + ')';
    }
}
