package go5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f274114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f274115b;

    public a(int i17, int i18, int i19) {
        this.f274114a = i17;
        this.f274115b = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go5.a)) {
            return false;
        }
        go5.a aVar = (go5.a) obj;
        return this.f274114a == aVar.f274114a && this.f274115b == aVar.f274115b;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f274114a) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(this.f274115b);
    }

    public java.lang.String toString() {
        return "AudioPlayReport(errorCode=" + this.f274114a + ", sourceMode=0, frameCount=" + this.f274115b + ')';
    }
}
