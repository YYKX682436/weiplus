package xc2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f453287a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f453288b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f453289c;

    public s(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        this.f453287a = jumpInfo;
        this.f453288b = new java.util.ArrayList();
        this.f453289c = new java.util.ArrayList();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc2.s) && kotlin.jvm.internal.o.b(this.f453287a, ((xc2.s) obj).f453287a);
    }

    public int hashCode() {
        return this.f453287a.hashCode();
    }

    public java.lang.String toString() {
        return "FinderCombineJumpInfo(jumpInfo=" + this.f453287a + ')';
    }
}
