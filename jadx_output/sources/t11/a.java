package t11;

/* loaded from: classes12.dex */
public abstract class a {
    public static android.graphics.Bitmap a(n11.c cVar, java.lang.String str, int i17, int i18) {
        try {
            return (i17 <= 0 || i18 <= 0) ? com.tencent.mm.sdk.platformtools.x.f0(0, str, null, null, true, 0.0f, 0, 0) : com.tencent.mm.sdk.platformtools.x.f0(0, str, null, null, true, 0.0f, i17, i18);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.imageloader.ImageLoaderUtils", "get bitmap from assert failed. :%s", e17.toString());
            return null;
        }
    }
}
