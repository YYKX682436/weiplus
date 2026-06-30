package sf3;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f407393a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.BitmapFactory.Options f407394b;

    /* renamed from: c, reason: collision with root package name */
    public final sf3.g f407395c;

    public i(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options, sf3.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        options = (i17 & 2) != 0 ? null : options;
        gVar = (i17 & 4) != 0 ? null : gVar;
        this.f407393a = bitmap;
        this.f407394b = options;
        this.f407395c = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf3.i)) {
            return false;
        }
        sf3.i iVar = (sf3.i) obj;
        return kotlin.jvm.internal.o.b(this.f407393a, iVar.f407393a) && kotlin.jvm.internal.o.b(this.f407394b, iVar.f407394b) && kotlin.jvm.internal.o.b(this.f407395c, iVar.f407395c);
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f407393a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        android.graphics.BitmapFactory.Options options = this.f407394b;
        int hashCode2 = (hashCode + (options == null ? 0 : options.hashCode())) * 31;
        sf3.g gVar = this.f407395c;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ImageParserResult(bitmap=" + this.f407393a + ", options=" + this.f407394b + ", param=" + this.f407395c + ')';
    }
}
