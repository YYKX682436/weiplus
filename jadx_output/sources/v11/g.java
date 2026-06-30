package v11;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432376a;

    public g(java.util.List buttons) {
        kotlin.jvm.internal.o.g(buttons, "buttons");
        this.f432376a = buttons;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.g) && kotlin.jvm.internal.o.b(this.f432376a, ((v11.g) obj).f432376a);
    }

    public int hashCode() {
        return this.f432376a.hashCode();
    }

    public java.lang.String toString() {
        return "InteractOptions(buttons=" + this.f432376a + ')';
    }
}
