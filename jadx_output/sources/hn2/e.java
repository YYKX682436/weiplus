package hn2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f282519a;

    /* renamed from: b, reason: collision with root package name */
    public int f282520b;

    /* renamed from: c, reason: collision with root package name */
    public int f282521c;

    public e(boolean z17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        this.f282519a = z17;
        this.f282520b = i17;
        this.f282521c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn2.e)) {
            return false;
        }
        hn2.e eVar = (hn2.e) obj;
        return this.f282519a == eVar.f282519a && this.f282520b == eVar.f282520b && this.f282521c == eVar.f282521c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f282519a) * 31) + java.lang.Integer.hashCode(this.f282520b)) * 31) + java.lang.Integer.hashCode(this.f282521c);
    }

    public java.lang.String toString() {
        return "FinderLiveKtvSongSegment(hasSegment=" + this.f282519a + ", segmentStart=" + this.f282520b + ", segmentEnd=" + this.f282521c + ')';
    }
}
