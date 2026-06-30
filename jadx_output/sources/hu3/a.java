package hu3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f285082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285083b;

    /* renamed from: c, reason: collision with root package name */
    public int f285084c;

    public a(int i17, int i18) {
        this.f285082a = i17;
        this.f285083b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.a)) {
            return false;
        }
        hu3.a aVar = (hu3.a) obj;
        return this.f285082a == aVar.f285082a && this.f285083b == aVar.f285083b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f285082a) * 31) + java.lang.Integer.hashCode(this.f285083b);
    }

    public java.lang.String toString() {
        return "AudioConfig(sampleRate=" + this.f285082a + ", channelCount=" + this.f285083b + ')';
    }
}
