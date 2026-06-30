package xh2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f454546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f454547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f454548c;

    public g(boolean z17, int i17, boolean z18) {
        this.f454546a = z17;
        this.f454547b = i17;
        this.f454548c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.g)) {
            return false;
        }
        xh2.g gVar = (xh2.g) obj;
        return this.f454546a == gVar.f454546a && this.f454547b == gVar.f454547b && this.f454548c == gVar.f454548c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f454546a) * 31) + java.lang.Integer.hashCode(this.f454547b)) * 31) + java.lang.Boolean.hashCode(this.f454548c);
    }

    public java.lang.String toString() {
        return "LiveUserMicMuteModel(notTalking=" + this.f454546a + ", userState=" + this.f454547b + ", isDiffMuteByAnchor=" + this.f454548c + ')';
    }
}
