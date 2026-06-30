package xk0;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f454999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455000b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f455001c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f455002d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.SpannableString f455003e;

    public q(int i17, int i18, boolean z17, boolean z18, android.text.SpannableString spannableString) {
        this.f454999a = i17;
        this.f455000b = i18;
        this.f455001c = z17;
        this.f455002d = z18;
        this.f455003e = spannableString;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk0.q)) {
            return false;
        }
        xk0.q qVar = (xk0.q) obj;
        return this.f454999a == qVar.f454999a && this.f455000b == qVar.f455000b && this.f455001c == qVar.f455001c && this.f455002d == qVar.f455002d && kotlin.jvm.internal.o.b(this.f455003e, qVar.f455003e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f454999a) * 31) + java.lang.Integer.hashCode(this.f455000b)) * 31) + java.lang.Boolean.hashCode(this.f455001c)) * 31) + java.lang.Boolean.hashCode(this.f455002d)) * 31;
        android.text.SpannableString spannableString = this.f455003e;
        return hashCode + (spannableString == null ? 0 : spannableString.hashCode());
    }

    public java.lang.String toString() {
        return "TextItemDrawInfo(mColor=" + this.f454999a + ", mBgColor=" + this.f455000b + ", mStoke=" + this.f455001c + ", mShadow=" + this.f455002d + ", mText=" + ((java.lang.Object) this.f455003e) + ')';
    }
}
