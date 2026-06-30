package rp1;

/* loaded from: classes7.dex */
public class a implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public static final rp1.a f398352d = new rp1.a();

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        return (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) ? bitmap : com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, bitmap.getWidth() / 2, false, null);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "FloatBallIcon";
    }
}
