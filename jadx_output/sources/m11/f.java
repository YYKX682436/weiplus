package m11;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f322683d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f322684e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f322685f;

    public f(java.lang.String str, java.util.HashMap hashMap, boolean z17) {
        this.f322683d = str;
        this.f322684e = hashMap;
        this.f322685f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        k70.u uVar;
        java.lang.String str = this.f322683d;
        byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(str);
        android.graphics.Bitmap bitmap = null;
        java.util.HashMap hashMap = this.f322684e;
        if (u07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnImageService", "download fail: url[%s] data is null", str);
            com.tencent.mm.sdk.platformtools.u3.h(new m11.e(str, null, hashMap, u07));
            return;
        }
        try {
            bitmap = com.tencent.mm.sdk.platformtools.x.G(u07);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnImageService", "download fail: url[%s] decode bitmap error[%s]", str, e17.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageService", "download finish, url[%s], do post job", str);
        if (this.f322685f) {
            com.tencent.mm.sdk.platformtools.u3.h(new m11.e(str, bitmap, hashMap, u07));
            return;
        }
        m11.b1.wi().c(str, bitmap);
        if (hashMap != null && (uVar = (k70.u) hashMap.remove(str)) != null) {
            uVar.a(bitmap, u07);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageService", "finish download post job, url[%s]", objArr);
    }
}
