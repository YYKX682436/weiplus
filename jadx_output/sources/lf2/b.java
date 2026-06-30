package lf2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final om2.m f318274a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f318275b;

    public b(om2.m reverbType, boolean z17) {
        kotlin.jvm.internal.o.g(reverbType, "reverbType");
        this.f318274a = reverbType;
        this.f318275b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2.b)) {
            return false;
        }
        lf2.b bVar = (lf2.b) obj;
        return this.f318274a == bVar.f318274a && this.f318275b == bVar.f318275b;
    }

    public int hashCode() {
        return (this.f318274a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f318275b);
    }

    public java.lang.String toString() {
        return "ReverberationItemData(reverbType=" + this.f318274a + ", selected=" + this.f318275b + ')';
    }
}
