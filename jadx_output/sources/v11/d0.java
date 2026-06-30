package v11;

/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f432354a;

    public d0(v11.j0 textView) {
        kotlin.jvm.internal.o.g(textView, "textView");
        this.f432354a = textView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.d0) && kotlin.jvm.internal.o.b(this.f432354a, ((v11.d0) obj).f432354a);
    }

    public int hashCode() {
        return this.f432354a.hashCode();
    }

    public java.lang.String toString() {
        return "NativeMarkdownMathBlockConfig(textView=" + this.f432354a + ')';
    }
}
