package zy3;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Number f477665a;

    /* renamed from: b, reason: collision with root package name */
    public final zy3.a f477666b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f477667c;

    public m(java.lang.Number number, zy3.a bankcard_res, byte[] bArr) {
        kotlin.jvm.internal.o.g(bankcard_res, "bankcard_res");
        this.f477665a = number;
        this.f477666b = bankcard_res;
        this.f477667c = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3.m)) {
            return false;
        }
        zy3.m mVar = (zy3.m) obj;
        return kotlin.jvm.internal.o.b(this.f477665a, mVar.f477665a) && kotlin.jvm.internal.o.b(this.f477666b, mVar.f477666b) && kotlin.jvm.internal.o.b(this.f477667c, mVar.f477667c);
    }

    public int hashCode() {
        java.lang.Number number = this.f477665a;
        int hashCode = (((number == null ? 0 : number.hashCode()) * 31) + this.f477666b.hashCode()) * 31;
        byte[] bArr = this.f477667c;
        return hashCode + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public java.lang.String toString() {
        return "OcrGetBankCardInfoWechatRegResp(errcode=" + this.f477665a + ", bankcard_res=" + this.f477666b + ", data_encrypt_key=" + java.util.Arrays.toString(this.f477667c) + ')';
    }
}
