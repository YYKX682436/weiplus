package dd5;

/* loaded from: classes12.dex */
public final class o1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final oi3.f f229235a;

    /* renamed from: b, reason: collision with root package name */
    public final xs.z0 f229236b;

    public o1(oi3.f simpleImgMsgInfo, xs.z0 preResolvedPaths) {
        kotlin.jvm.internal.o.g(simpleImgMsgInfo, "simpleImgMsgInfo");
        kotlin.jvm.internal.o.g(preResolvedPaths, "preResolvedPaths");
        this.f229235a = simpleImgMsgInfo;
        this.f229236b = preResolvedPaths;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.o1)) {
            return false;
        }
        dd5.o1 o1Var = (dd5.o1) obj;
        return kotlin.jvm.internal.o.b(this.f229235a, o1Var.f229235a) && kotlin.jvm.internal.o.b(this.f229236b, o1Var.f229236b);
    }

    public int hashCode() {
        return (this.f229235a.hashCode() * 31) + this.f229236b.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(simpleImgMsgInfo=" + this.f229235a + ", preResolvedPaths=" + this.f229236b + ')';
    }
}
