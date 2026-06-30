package vn1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438196a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f438197b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f438198c;

    public b(java.lang.String deviceId, byte[] data, boolean z17) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(data, "data");
        this.f438196a = deviceId;
        this.f438197b = data;
        this.f438198c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn1.b)) {
            return false;
        }
        vn1.b bVar = (vn1.b) obj;
        return kotlin.jvm.internal.o.b(this.f438196a, bVar.f438196a) && kotlin.jvm.internal.o.b(this.f438197b, bVar.f438197b) && this.f438198c == bVar.f438198c;
    }

    public int hashCode() {
        return (((this.f438196a.hashCode() * 31) + java.util.Arrays.hashCode(this.f438197b)) * 31) + java.lang.Boolean.hashCode(this.f438198c);
    }

    public java.lang.String toString() {
        return "SendPacket(deviceId=" + this.f438196a + ", data=" + java.util.Arrays.toString(this.f438197b) + ", isLast=" + this.f438198c + ')';
    }
}
