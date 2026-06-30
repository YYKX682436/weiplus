package lf3;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final lf3.l f318326a = new lf3.l();

    public final lf3.k a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
        ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, mMBitmapFactory$Options);
        if (d17 != null) {
            d17.recycle();
        }
        int i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
        int i18 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
        boolean z17 = com.tencent.mm.sdk.platformtools.q2.c(i17, i18) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth > 480;
        boolean z18 = com.tencent.mm.sdk.platformtools.q2.e(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight > 480;
        if (z17 || z18) {
            i18 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
            i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        if (a17 == 90 || a17 == 270) {
            int i19 = i18;
            i18 = i17;
            i17 = i19;
        }
        return new lf3.k(i17, i18, z17, z18);
    }
}
