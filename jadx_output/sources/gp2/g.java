package gp2;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f274220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f274221b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f274222c;

    public g(int i17, int i18, boolean z17) {
        this.f274220a = i17;
        this.f274221b = i18;
        this.f274222c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp2.g)) {
            return false;
        }
        gp2.g gVar = (gp2.g) obj;
        return this.f274220a == gVar.f274220a && this.f274221b == gVar.f274221b && this.f274222c == gVar.f274222c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f274220a) * 31) + java.lang.Integer.hashCode(this.f274221b)) * 31) + java.lang.Boolean.hashCode(this.f274222c);
    }

    public java.lang.String toString() {
        return "LivePreviewMuteStateData(pos=" + this.f274220a + ", containerHashCode=" + this.f274221b + ", isMute=" + this.f274222c + ')';
    }
}
