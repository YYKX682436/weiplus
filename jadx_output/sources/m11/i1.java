package m11;

/* loaded from: classes12.dex */
public class i1 extends android.os.AsyncTask {
    public i1(m11.l1 l1Var) {
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        m11.j1 j1Var;
        android.graphics.Bitmap bitmap;
        m11.j1[] j1VarArr = (m11.j1[]) objArr;
        if (j1VarArr.length == 0 || com.tencent.mm.sdk.platformtools.t8.K0(j1VarArr[0].f322724a) || (bitmap = (j1Var = j1VarArr[0]).f322725b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UrlImageCacheService", "nothing to save");
            return null;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, j1Var.f322724a, false);
            return null;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UrlImageCacheService", "save bitmap to image failed: " + e17.toString());
            return null;
        }
    }
}
