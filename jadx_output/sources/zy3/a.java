package zy3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f477642a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f477643b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f477644c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f477645d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Number f477646e;

    public a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.Number number) {
        this.f477642a = bArr;
        this.f477643b = bArr2;
        this.f477644c = bArr3;
        this.f477645d = bArr4;
        this.f477646e = number;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3.a)) {
            return false;
        }
        zy3.a aVar = (zy3.a) obj;
        return kotlin.jvm.internal.o.b(this.f477642a, aVar.f477642a) && kotlin.jvm.internal.o.b(this.f477643b, aVar.f477643b) && kotlin.jvm.internal.o.b(this.f477644c, aVar.f477644c) && kotlin.jvm.internal.o.b(this.f477645d, aVar.f477645d) && kotlin.jvm.internal.o.b(this.f477646e, aVar.f477646e);
    }

    public int hashCode() {
        byte[] bArr = this.f477642a;
        int hashCode = (bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31;
        byte[] bArr2 = this.f477643b;
        int hashCode2 = (hashCode + (bArr2 == null ? 0 : java.util.Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.f477644c;
        int hashCode3 = (hashCode2 + (bArr3 == null ? 0 : java.util.Arrays.hashCode(bArr3))) * 31;
        byte[] bArr4 = this.f477645d;
        int hashCode4 = (hashCode3 + (bArr4 == null ? 0 : java.util.Arrays.hashCode(bArr4))) * 31;
        java.lang.Number number = this.f477646e;
        return hashCode4 + (number != null ? number.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BankCardOcrEncryptData(cipher_text=" + java.util.Arrays.toString(this.f477642a) + ", tag=" + java.util.Arrays.toString(this.f477643b) + ", iv=" + java.util.Arrays.toString(this.f477644c) + ", aad=" + java.util.Arrays.toString(this.f477645d) + ", key_seq=" + this.f477646e + ')';
    }
}
