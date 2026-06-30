package xx3;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f457993a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f457994b;

    public a(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17) {
        this.f457993a = finderObject;
        this.f457994b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx3.a)) {
            return false;
        }
        xx3.a aVar = (xx3.a) obj;
        return kotlin.jvm.internal.o.b(this.f457993a, aVar.f457993a) && this.f457994b == aVar.f457994b;
    }

    public int hashCode() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f457993a;
        return ((finderObject == null ? 0 : finderObject.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f457994b);
    }

    public java.lang.String toString() {
        return "FinderObjectDesc(finderObject=" + this.f457993a + ", unAvailable=" + this.f457994b + ')';
    }
}
