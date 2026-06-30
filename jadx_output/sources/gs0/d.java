package gs0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f274980a;

    /* renamed from: b, reason: collision with root package name */
    public final long f274981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f274982c;

    public d(byte[] bArr, long j17, boolean z17) {
        this.f274980a = bArr;
        this.f274981b = j17;
        this.f274982c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0.d)) {
            return false;
        }
        gs0.d dVar = (gs0.d) obj;
        return kotlin.jvm.internal.o.b(this.f274980a, dVar.f274980a) && this.f274981b == dVar.f274981b && this.f274982c == dVar.f274982c;
    }

    public int hashCode() {
        byte[] bArr = this.f274980a;
        return ((((bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31) + java.lang.Long.hashCode(this.f274981b)) * 31) + java.lang.Boolean.hashCode(this.f274982c);
    }

    public java.lang.String toString() {
        return "EncoderData(pcmData=" + java.util.Arrays.toString(this.f274980a) + ", pts=" + this.f274981b + ", isLast=" + this.f274982c + ')';
    }
}
