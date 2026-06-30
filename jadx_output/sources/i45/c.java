package i45;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f288396a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f288397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f288398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f288399d;

    public c(java.lang.String content, java.lang.String match, int i17, int i18) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(match, "match");
        this.f288396a = content;
        this.f288397b = match;
        this.f288398c = i17;
        this.f288399d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i45.c)) {
            return false;
        }
        i45.c cVar = (i45.c) obj;
        return kotlin.jvm.internal.o.b(this.f288396a, cVar.f288396a) && kotlin.jvm.internal.o.b(this.f288397b, cVar.f288397b) && this.f288398c == cVar.f288398c && this.f288399d == cVar.f288399d;
    }

    public int hashCode() {
        return (((((this.f288396a.hashCode() * 31) + this.f288397b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f288398c)) * 31) + java.lang.Integer.hashCode(this.f288399d);
    }

    public java.lang.String toString() {
        return "WeTypeVoiceToTextAfterSendText(content=" + this.f288396a + ", match=" + this.f288397b + ", interval=" + this.f288398c + ", maxTime=" + this.f288399d + ')';
    }
}
