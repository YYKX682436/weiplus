package m11;

/* loaded from: classes12.dex */
public class h1 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f322707a;

    public h1(m11.l1 l1Var) {
        this.f322707a = l1Var;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        java.lang.String[] strArr = (java.lang.String[]) objArr;
        if (strArr.length <= 0) {
            return null;
        }
        java.lang.String c17 = m11.l1.c(strArr[0]);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c17);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            return com.tencent.mm.sdk.platformtools.x.i0(c17);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        m11.l1 l1Var = this.f322707a;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UrlImageCacheService", "try load from " + l1Var.f322750b.f322728a);
            m11.b1.wi().a(l1Var.f322750b.f322728a, true, l1Var);
            return;
        }
        if (!l1Var.f322751c) {
            if (l1Var.f322750b != null) {
                m11.b1.wi().c(l1Var.f322750b.f322728a, bitmap);
                k70.f0 f0Var = (k70.f0) l1Var.f322750b.f322730c.get();
                if (f0Var != null) {
                    java.lang.String str = l1Var.f322750b.f322728a;
                    f0Var.a(str, bitmap, m11.l1.c(str));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.UrlImageCacheService", "onPostExecute mCurTaskItem is null");
            }
        }
        l1Var.f322750b = null;
        l1Var.e();
    }
}
