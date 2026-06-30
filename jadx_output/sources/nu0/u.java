package nu0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340103a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f340104b;

    public u(java.lang.String imagePath, boolean z17) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        this.f340103a = imagePath;
        this.f340104b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0.u)) {
            return false;
        }
        nu0.u uVar = (nu0.u) obj;
        return kotlin.jvm.internal.o.b(this.f340103a, uVar.f340103a) && this.f340104b == uVar.f340104b;
    }

    public int hashCode() {
        return (this.f340103a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f340104b);
    }

    public java.lang.String toString() {
        return "ImageSceneData(imagePath=" + this.f340103a + ", isModified=" + this.f340104b + ')';
    }
}
