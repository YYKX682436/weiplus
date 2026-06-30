package sa2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f405299a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f405300b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.component.UIComponentFragment f405301c;

    public d(int i17, android.widget.FrameLayout container, com.tencent.mm.ui.component.UIComponentFragment fragment) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f405299a = i17;
        this.f405300b = container;
        this.f405301c = fragment;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2.d)) {
            return false;
        }
        sa2.d dVar = (sa2.d) obj;
        return this.f405299a == dVar.f405299a && kotlin.jvm.internal.o.b(this.f405300b, dVar.f405300b) && kotlin.jvm.internal.o.b(this.f405301c, dVar.f405301c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f405299a) * 31) + this.f405300b.hashCode()) * 31) + this.f405301c.hashCode();
    }

    public java.lang.String toString() {
        return "FragmentInfo(pos=" + this.f405299a + ", container=" + this.f405300b + ", fragment=" + this.f405301c + ')';
    }
}
