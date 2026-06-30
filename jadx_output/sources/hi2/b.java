package hi2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f281506a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f281507b;

    public b(byte[] bArr, boolean z17) {
        this.f281506a = bArr;
        this.f281507b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi2.b)) {
            return false;
        }
        hi2.b bVar = (hi2.b) obj;
        return kotlin.jvm.internal.o.b(this.f281506a, bVar.f281506a) && this.f281507b == bVar.f281507b;
    }

    public int hashCode() {
        byte[] bArr = this.f281506a;
        return ((bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31) + java.lang.Boolean.hashCode(this.f281507b);
    }

    public java.lang.String toString() {
        return "VistorMicRequestExtData(buffer=" + java.util.Arrays.toString(this.f281506a) + ", isAutoLink=" + this.f281507b + ')';
    }
}
