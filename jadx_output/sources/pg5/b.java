package pg5;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.Spannable f354250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354251b;

    public b(android.text.Spannable spannable, int i17) {
        this.f354250a = spannable;
        this.f354251b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg5.b)) {
            return false;
        }
        pg5.b bVar = (pg5.b) obj;
        return kotlin.jvm.internal.o.b(this.f354250a, bVar.f354250a) && this.f354251b == bVar.f354251b;
    }

    public int hashCode() {
        android.text.Spannable spannable = this.f354250a;
        return ((spannable == null ? 0 : spannable.hashCode()) * 31) + java.lang.Integer.hashCode(this.f354251b);
    }

    public java.lang.String toString() {
        return "EmojiProcessResult(resultSpannableString=" + ((java.lang.Object) this.f354250a) + ", allTypeEmojiCount=" + this.f354251b + ')';
    }
}
