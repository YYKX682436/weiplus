package d0;

/* loaded from: classes14.dex */
public final class g0 implements d0.f0, d0.z {

    /* renamed from: a, reason: collision with root package name */
    public final p2.f f225119a;

    /* renamed from: b, reason: collision with root package name */
    public final long f225120b;

    public g0(p2.f fVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f225119a = fVar;
        this.f225120b = j17;
    }

    @Override // d0.z
    public z0.t a(z0.t tVar, z0.d alignment) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return tVar.k(new d0.q(alignment, false, androidx.compose.ui.platform.e3.f10553d));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0.g0)) {
            return false;
        }
        d0.g0 g0Var = (d0.g0) obj;
        return kotlin.jvm.internal.o.b(this.f225119a, g0Var.f225119a) && p2.c.b(this.f225120b, g0Var.f225120b);
    }

    public int hashCode() {
        return (this.f225119a.hashCode() * 31) + java.lang.Long.hashCode(this.f225120b);
    }

    public java.lang.String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f225119a + ", constraints=" + ((java.lang.Object) p2.c.k(this.f225120b)) + ')';
    }
}
