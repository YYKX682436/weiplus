package um5;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.xeffect.LayoutInfo f429135a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.xeffect.LayoutInfo f429136b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.xeffect.InputAnimation f429137c;

    public b0(com.tencent.mm.xeffect.LayoutInfo fromLayout, com.tencent.mm.xeffect.LayoutInfo toLayout, com.tencent.mm.xeffect.InputAnimation animate) {
        kotlin.jvm.internal.o.g(fromLayout, "fromLayout");
        kotlin.jvm.internal.o.g(toLayout, "toLayout");
        kotlin.jvm.internal.o.g(animate, "animate");
        this.f429135a = fromLayout;
        this.f429136b = toLayout;
        this.f429137c = animate;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.b0)) {
            return false;
        }
        um5.b0 b0Var = (um5.b0) obj;
        return kotlin.jvm.internal.o.b(this.f429135a, b0Var.f429135a) && kotlin.jvm.internal.o.b(this.f429136b, b0Var.f429136b) && kotlin.jvm.internal.o.b(this.f429137c, b0Var.f429137c);
    }

    public int hashCode() {
        return (((this.f429135a.hashCode() * 31) + this.f429136b.hashCode()) * 31) + this.f429137c.hashCode();
    }

    public java.lang.String toString() {
        return "TextureLayoutAnimation(fromLayout=" + this.f429135a + ", toLayout=" + this.f429136b + ", animate=" + this.f429137c + ')';
    }
}
