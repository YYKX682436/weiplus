package nn4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f338696a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f338697b;

    public b(int i17, java.lang.String TranslatedText) {
        kotlin.jvm.internal.o.g(TranslatedText, "TranslatedText");
        this.f338696a = i17;
        this.f338697b = TranslatedText;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn4.b)) {
            return false;
        }
        nn4.b bVar = (nn4.b) obj;
        return this.f338696a == bVar.f338696a && kotlin.jvm.internal.o.b(this.f338697b, bVar.f338697b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f338696a) * 31) + this.f338697b.hashCode();
    }

    public java.lang.String toString() {
        return "TransResult(clientMsgId=" + this.f338696a + ", TranslatedText=" + this.f338697b + ')';
    }
}
