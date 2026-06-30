package mm0;

/* loaded from: classes2.dex */
public final class d extends android.text.SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f328577d;

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.String toString() {
        if (this.f328577d == null) {
            java.lang.String spannableStringBuilder = super.toString();
            kotlin.jvm.internal.o.f(spannableStringBuilder, "toString(...)");
            return spannableStringBuilder;
        }
        return super.toString() + '_' + this.f328577d;
    }
}
