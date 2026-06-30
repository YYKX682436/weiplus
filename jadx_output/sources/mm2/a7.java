package mm2;

/* loaded from: classes3.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f328750a;

    /* renamed from: b, reason: collision with root package name */
    public final qs5.s f328751b;

    public a7(boolean z17, qs5.s fromScene) {
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        this.f328750a = z17;
        this.f328751b = fromScene;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.a7)) {
            return false;
        }
        mm2.a7 a7Var = (mm2.a7) obj;
        return this.f328750a == a7Var.f328750a && this.f328751b == a7Var.f328751b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f328750a) * 31) + this.f328751b.hashCode();
    }

    public java.lang.String toString() {
        return "WishPanelClickData(open=" + this.f328750a + ", fromScene=" + this.f328751b + ')';
    }

    public /* synthetic */ a7(boolean z17, qs5.s sVar, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? qs5.s.f366464d : sVar);
    }
}
