package df5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f232078a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f232079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f232080c;

    public e(android.widget.TextView tv6, android.text.SpannableStringBuilder newFullSSB, int i17) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(newFullSSB, "newFullSSB");
        this.f232078a = tv6;
        this.f232079b = newFullSSB;
        this.f232080c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.e)) {
            return false;
        }
        df5.e eVar = (df5.e) obj;
        return kotlin.jvm.internal.o.b(this.f232078a, eVar.f232078a) && kotlin.jvm.internal.o.b(this.f232079b, eVar.f232079b) && this.f232080c == eVar.f232080c;
    }

    public int hashCode() {
        return (((this.f232078a.hashCode() * 31) + this.f232079b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f232080c);
    }

    public java.lang.String toString() {
        return "FeederTask(tv=" + this.f232078a + ", newFullSSB=" + ((java.lang.Object) this.f232079b) + ", oldLen=" + this.f232080c + ')';
    }
}
