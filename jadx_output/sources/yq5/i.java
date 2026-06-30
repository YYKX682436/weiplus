package yq5;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f464597a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f464598b;

    public i(int i17, java.util.List tiles) {
        kotlin.jvm.internal.o.g(tiles, "tiles");
        this.f464597a = i17;
        this.f464598b = tiles;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.i)) {
            return false;
        }
        yq5.i iVar = (yq5.i) obj;
        return this.f464597a == iVar.f464597a && kotlin.jvm.internal.o.b(this.f464598b, iVar.f464598b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f464597a) * 31) + this.f464598b.hashCode();
    }

    public java.lang.String toString() {
        return "SamplingTiles(sampleSize=" + this.f464597a + ", tiles=" + this.f464598b + ')';
    }
}
