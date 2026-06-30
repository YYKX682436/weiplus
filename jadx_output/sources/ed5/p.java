package ed5;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f251376a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f251377b;

    public p(android.view.View view, java.lang.String sectionKey) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(sectionKey, "sectionKey");
        this.f251376a = view;
        this.f251377b = sectionKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed5.p)) {
            return false;
        }
        ed5.p pVar = (ed5.p) obj;
        return kotlin.jvm.internal.o.b(this.f251376a, pVar.f251376a) && kotlin.jvm.internal.o.b(this.f251377b, pVar.f251377b);
    }

    public int hashCode() {
        return (this.f251376a.hashCode() * 31) + this.f251377b.hashCode();
    }

    public java.lang.String toString() {
        return "NearestTimeline(view=" + this.f251376a + ", sectionKey=" + this.f251377b + ')';
    }
}
