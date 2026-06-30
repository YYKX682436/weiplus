package om2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yx1 f346378a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f346379b;

    /* renamed from: c, reason: collision with root package name */
    public final om2.q f346380c;

    public s(r45.yx1 songInfo, om2.p baseInfo, om2.q musicResourceInfo) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        kotlin.jvm.internal.o.g(musicResourceInfo, "musicResourceInfo");
        this.f346378a = songInfo;
        this.f346379b = baseInfo;
        this.f346380c = musicResourceInfo;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f346378a.f391459e;
        return str == null ? "" : str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.s)) {
            return false;
        }
        om2.s sVar = (om2.s) obj;
        return kotlin.jvm.internal.o.b(this.f346378a, sVar.f346378a) && kotlin.jvm.internal.o.b(this.f346379b, sVar.f346379b) && kotlin.jvm.internal.o.b(this.f346380c, sVar.f346380c);
    }

    public int hashCode() {
        return (((this.f346378a.hashCode() * 31) + this.f346379b.hashCode()) * 31) + this.f346380c.hashCode();
    }

    public java.lang.String toString() {
        return "LiveSongPlayResourceInfo(songInfo=" + this.f346378a + ", baseInfo=" + this.f346379b + ", musicResourceInfo=" + this.f346380c + ')';
    }
}
