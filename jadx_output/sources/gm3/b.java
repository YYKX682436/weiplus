package gm3;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f273541a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f273542b;

    public b(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        finderObject = (i17 & 2) != 0 ? null : finderObject;
        this.f273541a = str;
        this.f273542b = finderObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm3.b)) {
            return false;
        }
        gm3.b bVar = (gm3.b) obj;
        return kotlin.jvm.internal.o.b(this.f273541a, bVar.f273541a) && kotlin.jvm.internal.o.b(this.f273542b, bVar.f273542b);
    }

    public int hashCode() {
        java.lang.String str = this.f273541a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f273542b;
        return hashCode + (finderObject != null ? finderObject.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderItem(thumbUrl=" + this.f273541a + ", finderObj=" + this.f273542b + ')';
    }
}
