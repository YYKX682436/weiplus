package ff0;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f261595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f261596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f261597c;

    public z(int i17, int i18, int i19) {
        this.f261595a = i17;
        this.f261596b = i18;
        this.f261597c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0.z)) {
            return false;
        }
        ff0.z zVar = (ff0.z) obj;
        return this.f261595a == zVar.f261595a && this.f261596b == zVar.f261596b && this.f261597c == zVar.f261597c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f261595a) * 31) + java.lang.Integer.hashCode(this.f261596b)) * 31) + java.lang.Integer.hashCode(this.f261597c);
    }

    public java.lang.String toString() {
        return "TingImagePickColorResult(playerBackgroundColor=" + this.f261595a + ", minibarColor=" + this.f261596b + ", linkColor=" + this.f261597c + ')';
    }
}
