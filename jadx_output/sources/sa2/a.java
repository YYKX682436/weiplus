package sa2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f405294a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f405295b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.component.UIComponentFragment f405296c;

    public a(int i17, android.widget.FrameLayout container, com.tencent.mm.ui.component.UIComponentFragment fragment) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f405294a = i17;
        this.f405295b = container;
        this.f405296c = fragment;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2.a)) {
            return false;
        }
        sa2.a aVar = (sa2.a) obj;
        return this.f405294a == aVar.f405294a && kotlin.jvm.internal.o.b(this.f405295b, aVar.f405295b) && kotlin.jvm.internal.o.b(this.f405296c, aVar.f405296c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f405294a) * 31) + this.f405295b.hashCode()) * 31) + this.f405296c.hashCode();
    }

    public java.lang.String toString() {
        return "FragmentInfo(pos=" + this.f405294a + ", container=" + this.f405295b + ", fragment=" + this.f405296c + ')';
    }
}
