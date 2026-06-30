package ic3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f290386a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f290387b;

    public a(int i17, android.view.View.OnClickListener clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f290386a = i17;
        this.f290387b = clickListener;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic3.a)) {
            return false;
        }
        ic3.a aVar = (ic3.a) obj;
        return this.f290386a == aVar.f290386a && kotlin.jvm.internal.o.b(this.f290387b, aVar.f290387b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f290386a) * 31) + this.f290387b.hashCode();
    }

    public java.lang.String toString() {
        return "ButtonData(id=" + this.f290386a + ", clickListener=" + this.f290387b + ')';
    }
}
