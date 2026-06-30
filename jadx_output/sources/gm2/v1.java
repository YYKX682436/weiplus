package gm2;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f273502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273503b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f273504c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f273505d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f273506e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f273507f;

    /* renamed from: g, reason: collision with root package name */
    public final int f273508g;

    public v1(int i17, int i18, android.graphics.Bitmap swipeBitmap, android.graphics.Bitmap topLightBitmap, android.graphics.Bitmap bottomLightBitmap, android.graphics.Bitmap bitmap, int i19) {
        kotlin.jvm.internal.o.g(swipeBitmap, "swipeBitmap");
        kotlin.jvm.internal.o.g(topLightBitmap, "topLightBitmap");
        kotlin.jvm.internal.o.g(bottomLightBitmap, "bottomLightBitmap");
        this.f273502a = i17;
        this.f273503b = i18;
        this.f273504c = swipeBitmap;
        this.f273505d = topLightBitmap;
        this.f273506e = bottomLightBitmap;
        this.f273507f = bitmap;
        this.f273508g = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.v1)) {
            return false;
        }
        gm2.v1 v1Var = (gm2.v1) obj;
        return this.f273502a == v1Var.f273502a && this.f273503b == v1Var.f273503b && kotlin.jvm.internal.o.b(this.f273504c, v1Var.f273504c) && kotlin.jvm.internal.o.b(this.f273505d, v1Var.f273505d) && kotlin.jvm.internal.o.b(this.f273506e, v1Var.f273506e) && kotlin.jvm.internal.o.b(this.f273507f, v1Var.f273507f) && this.f273508g == v1Var.f273508g;
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f273502a) * 31) + java.lang.Integer.hashCode(this.f273503b)) * 31) + this.f273504c.hashCode()) * 31) + this.f273505d.hashCode()) * 31) + this.f273506e.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f273507f;
        return ((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Integer.hashCode(this.f273508g);
    }

    public java.lang.String toString() {
        return "FgParams(animtionTime=" + this.f273502a + ", animationInterval=" + this.f273503b + ", swipeBitmap=" + this.f273504c + ", topLightBitmap=" + this.f273505d + ", bottomLightBitmap=" + this.f273506e + ", lightBitmap=" + this.f273507f + ", lightAnimLevel=" + this.f273508g + ')';
    }
}
