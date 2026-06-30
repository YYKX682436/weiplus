package yf2;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f461705a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461706b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f461707c;

    public h0(java.lang.String title, java.lang.String content, java.lang.CharSequence checkboxText) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(checkboxText, "checkboxText");
        this.f461705a = title;
        this.f461706b = content;
        this.f461707c = checkboxText;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2.h0)) {
            return false;
        }
        yf2.h0 h0Var = (yf2.h0) obj;
        return kotlin.jvm.internal.o.b(this.f461705a, h0Var.f461705a) && kotlin.jvm.internal.o.b(this.f461706b, h0Var.f461706b) && kotlin.jvm.internal.o.b(this.f461707c, h0Var.f461707c);
    }

    public int hashCode() {
        return (((this.f461705a.hashCode() * 31) + this.f461706b.hashCode()) * 31) + this.f461707c.hashCode();
    }

    public java.lang.String toString() {
        return "LicenseData(title=" + this.f461705a + ", content=" + this.f461706b + ", checkboxText=" + ((java.lang.Object) this.f461707c) + ')';
    }
}
