package gr5;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final gr5.y f274954b = new gr5.y(null, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final gr5.a0 f274955a;

    public y(gr5.a0 panToScaleTransformer, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            gr5.a0.f274908a.getClass();
            panToScaleTransformer = gr5.z.f274957b;
        }
        kotlin.jvm.internal.o.g(panToScaleTransformer, "panToScaleTransformer");
        this.f274955a = panToScaleTransformer;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr5.y) && kotlin.jvm.internal.o.b(this.f274955a, ((gr5.y) obj).f274955a);
    }

    public int hashCode() {
        return ((gr5.t) this.f274955a).f274947b;
    }

    public java.lang.String toString() {
        return "OneFingerScaleSpec(panToScaleTransformer=" + this.f274955a + ')';
    }
}
