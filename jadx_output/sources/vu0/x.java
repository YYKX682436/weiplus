package vu0;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final tu0.a f440171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f440173c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440174d;

    public x(tu0.a audioEncodeFormat, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(audioEncodeFormat, "audioEncodeFormat");
        this.f440171a = audioEncodeFormat;
        this.f440172b = i17;
        this.f440173c = i18;
        this.f440174d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0.x)) {
            return false;
        }
        vu0.x xVar = (vu0.x) obj;
        return this.f440171a == xVar.f440171a && this.f440172b == xVar.f440172b && this.f440173c == xVar.f440173c && this.f440174d == xVar.f440174d;
    }

    public int hashCode() {
        return (((((this.f440171a.hashCode() * 31) + java.lang.Integer.hashCode(this.f440172b)) * 31) + java.lang.Integer.hashCode(this.f440173c)) * 31) + java.lang.Integer.hashCode(this.f440174d);
    }

    public java.lang.String toString() {
        return "AudioDataFormat(audioEncodeFormat=" + this.f440171a + ", sampleFormat=" + this.f440172b + ", sampleRate=" + this.f440173c + ", channelCount=" + this.f440174d + ')';
    }

    public /* synthetic */ x(tu0.a aVar, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this((i27 & 1) != 0 ? tu0.a.f422070e : aVar, (i27 & 2) != 0 ? 2 : i17, (i27 & 4) != 0 ? 16000 : i18, (i27 & 8) != 0 ? 1 : i19);
    }
}
