package hy4;

/* loaded from: classes8.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f286189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy4.s f286190e;

    public q(hy4.s sVar, android.graphics.Bitmap bitmap) {
        this.f286190e = sVar;
        this.f286189d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[3];
        hy4.s sVar = this.f286190e;
        sVar.getClass();
        if (hy4.s.f286193f == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
            sb6.append(com.tencent.mm.vfs.q7.c("webview_temp") + "/");
            sb6.append("common/");
            java.lang.String sb7 = sb6.toString();
            hy4.s.f286193f = sb7;
            com.tencent.mm.vfs.w6.u(sb7);
        }
        objArr[0] = hy4.s.f286193f;
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        android.graphics.Bitmap bitmap = this.f286189d;
        objArr[2] = java.lang.Integer.valueOf(bitmap.hashCode());
        sVar.f286196c = java.lang.String.format(locale, "%s%s_%08x", objArr);
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sVar.f286196c, true);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ViewCaptureHelper", "saveBitmapToImage failed, " + e17.getMessage());
            sVar.f286196c = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewCaptureHelper", "bitmap recycle %s", bitmap.toString());
        bitmap.recycle();
        sVar.f286194a.sendEmptyMessage(2);
    }
}
