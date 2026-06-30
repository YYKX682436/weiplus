package zu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f475683a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f475684b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f475685c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f475686d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f475687e;

    public l(com.tencent.maas.model.time.MJTime time, android.graphics.Bitmap bitmap, java.lang.String str) {
        kotlin.jvm.internal.o.g(time, "time");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f475683a = time;
        this.f475684b = bitmap;
        this.f475685c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(zu0.l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.data.beans.SnapshotImageData");
        zu0.l lVar = (zu0.l) obj;
        return kotlin.jvm.internal.o.b(this.f475683a, lVar.f475683a) && kotlin.jvm.internal.o.b(this.f475684b, lVar.f475684b) && kotlin.jvm.internal.o.b(this.f475685c, lVar.f475685c) && java.util.Arrays.equals(this.f475687e, lVar.f475687e) && kotlin.jvm.internal.o.b(this.f475686d, lVar.f475686d);
    }

    public int hashCode() {
        int hashCode = ((this.f475683a.hashCode() * 31) + this.f475684b.hashCode()) * 31;
        java.lang.String str = this.f475685c;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f475687e)) * 31;
        java.lang.String str2 = this.f475686d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SnapshotImageData(time=" + this.f475683a + ", bitmap=" + this.f475684b + ", imageOcrData=" + this.f475685c + ')';
    }
}
