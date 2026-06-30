package w41;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f442845a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f442846b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442847c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442848d;

    public a(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, java.lang.String str2) {
        this.f442845a = charSequence;
        this.f442846b = charSequence2;
        this.f442847c = str;
        this.f442848d = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w41.a)) {
            return false;
        }
        w41.a aVar = (w41.a) obj;
        return kotlin.jvm.internal.o.b(this.f442845a, aVar.f442845a) && kotlin.jvm.internal.o.b(this.f442846b, aVar.f442846b) && kotlin.jvm.internal.o.b(this.f442847c, aVar.f442847c) && kotlin.jvm.internal.o.b(this.f442848d, aVar.f442848d);
    }

    public int hashCode() {
        java.lang.CharSequence charSequence = this.f442845a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        java.lang.CharSequence charSequence2 = this.f442846b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        java.lang.String str = this.f442847c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f442848d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OpenIMConfirmDialogData(name=" + ((java.lang.Object) this.f442845a) + ", companyName=" + ((java.lang.Object) this.f442846b) + ", userName=" + this.f442847c + ", spamWording=" + this.f442848d + ')';
    }
}
