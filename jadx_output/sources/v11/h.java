package v11;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432393a;

    public h(java.util.List buttons) {
        kotlin.jvm.internal.o.g(buttons, "buttons");
        this.f432393a = buttons;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.h) && kotlin.jvm.internal.o.b(this.f432393a, ((v11.h) obj).f432393a);
    }

    public int hashCode() {
        return this.f432393a.hashCode();
    }

    public java.lang.String toString() {
        return "InteractOptionsUiModel(buttons=" + this.f432393a + ')';
    }
}
