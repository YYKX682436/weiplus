package yi4;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f462614a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f462615b;

    public i(byte[] bArr, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f462614a = bArr;
        this.f462615b = callback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi4.i)) {
            return false;
        }
        yi4.i iVar = (yi4.i) obj;
        return kotlin.jvm.internal.o.b(this.f462614a, iVar.f462614a) && kotlin.jvm.internal.o.b(this.f462615b, iVar.f462615b);
    }

    public int hashCode() {
        byte[] bArr = this.f462614a;
        return ((bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31) + this.f462615b.hashCode();
    }

    public java.lang.String toString() {
        return "PendingSelectPoi(current=" + java.util.Arrays.toString(this.f462614a) + ", callback=" + this.f462615b + ')';
    }
}
