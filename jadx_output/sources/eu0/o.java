package eu0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f256727a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f256728b;

    public o(java.lang.String finderTabContextId, java.lang.String finderContextId) {
        kotlin.jvm.internal.o.g(finderTabContextId, "finderTabContextId");
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        this.f256727a = finderTabContextId;
        this.f256728b = finderContextId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0.o)) {
            return false;
        }
        eu0.o oVar = (eu0.o) obj;
        return kotlin.jvm.internal.o.b(this.f256727a, oVar.f256727a) && kotlin.jvm.internal.o.b(this.f256728b, oVar.f256728b);
    }

    public int hashCode() {
        return (this.f256727a.hashCode() * 31) + this.f256728b.hashCode();
    }

    public java.lang.String toString() {
        return "ComposingCreationRawInfos: finderTabContextId=" + this.f256727a + ", finderContextId=" + this.f256728b;
    }
}
