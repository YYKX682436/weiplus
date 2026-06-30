package fu0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f266798a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f266799b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f266800c;

    /* renamed from: d, reason: collision with root package name */
    public final int f266801d;

    public m(java.util.List imagePaths, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, int i17) {
        kotlin.jvm.internal.o.g(imagePaths, "imagePaths");
        this.f266798a = imagePaths;
        this.f266799b = gVar;
        this.f266800c = gVar2;
        this.f266801d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu0.m)) {
            return false;
        }
        fu0.m mVar = (fu0.m) obj;
        return kotlin.jvm.internal.o.b(this.f266798a, mVar.f266798a) && kotlin.jvm.internal.o.b(this.f266799b, mVar.f266799b) && kotlin.jvm.internal.o.b(this.f266800c, mVar.f266800c) && this.f266801d == mVar.f266801d;
    }

    public int hashCode() {
        int hashCode = this.f266798a.hashCode() * 31;
        com.tencent.mm.protobuf.g gVar = this.f266799b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.tencent.mm.protobuf.g gVar2 = this.f266800c;
        return ((hashCode2 + (gVar2 != null ? gVar2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f266801d);
    }

    public java.lang.String toString() {
        return "ComposingCreationMusicRecommendContext(imagePaths=" + this.f266798a + ", classifyResultData=" + this.f266799b + ", promptRawText=" + this.f266800c + ", picNum=" + this.f266801d + ')';
    }
}
