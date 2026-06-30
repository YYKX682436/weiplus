package l01;

/* loaded from: classes4.dex */
public class o0 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final int f314782d;

    /* renamed from: e, reason: collision with root package name */
    public final int f314783e;

    public o0(int i17, int i18) {
        this.f314782d = i17;
        this.f314783e = i18;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = this.f314782d;
        int i18 = this.f314783e;
        if (width == height) {
            float f17 = i17;
            if (i18 > 0 && i17 > 0) {
                f17 = (i17 * bitmap.getWidth()) / i18;
            }
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, f17);
            kotlin.jvm.internal.o.f(s07, "getRoundedCornerBitmap(...)");
            return s07;
        }
        int min = (int) java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (min <= 0) {
            min = (int) java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
        }
        android.graphics.Bitmap k07 = com.tencent.mm.sdk.platformtools.x.k0(bitmap, min, min, true);
        kotlin.jvm.internal.o.f(k07, "getCenterCropBitmap(...)");
        float f18 = i17;
        if (i18 > 0 && i17 > 0) {
            f18 = (i17 * k07.getWidth()) / i18;
        }
        android.graphics.Bitmap s08 = com.tencent.mm.sdk.platformtools.x.s0(k07, false, f18);
        kotlin.jvm.internal.o.f(s08, "getRoundedCornerBitmap(...)");
        return s08;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "RoundedCornerIcon_" + this.f314782d;
    }
}
