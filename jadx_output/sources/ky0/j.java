package ky0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ky0.j f313483a = new ky0.j();

    public final java.lang.String a(java.lang.String str, android.graphics.Bitmap bitmap, ly0.p pVar) {
        java.lang.String c17 = dw3.h.f244211a.c(pVar.toString(), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        boolean D0 = com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, c17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AITemplateSizeUtils", "path:" + str + " makeImageValid result:" + D0 + " tempPath:" + c17);
        return D0 ? c17 : str;
    }
}
