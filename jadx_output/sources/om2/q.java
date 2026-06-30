package om2;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f346372a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f346373b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f346374c;

    public q(boolean z17, java.lang.String accompanyLocalPath, java.lang.String str) {
        kotlin.jvm.internal.o.g(accompanyLocalPath, "accompanyLocalPath");
        this.f346372a = z17;
        this.f346373b = accompanyLocalPath;
        this.f346374c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.q)) {
            return false;
        }
        om2.q qVar = (om2.q) obj;
        return this.f346372a == qVar.f346372a && kotlin.jvm.internal.o.b(this.f346373b, qVar.f346373b) && kotlin.jvm.internal.o.b(this.f346374c, qVar.f346374c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f346372a) * 31) + this.f346373b.hashCode()) * 31;
        java.lang.String str = this.f346374c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "LiveSongMusicResourceInfo(hasOriginal=" + this.f346372a + ", accompanyLocalPath=" + this.f346373b + ", originalLocalPath=" + this.f346374c + ')';
    }
}
