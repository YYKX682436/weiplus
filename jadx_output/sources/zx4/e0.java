package zx4;

/* loaded from: classes8.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f477120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f477123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f477124h;

    public e0(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, yz5.a aVar, yz5.a aVar2) {
        this.f477120d = bitmap;
        this.f477121e = str;
        this.f477122f = str2;
        this.f477123g = aVar;
        this.f477124h = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f477120d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f477121e);
        try {
            zx4.b0 b0Var = new zx4.b0(this.f477122f, this.f477120d);
            boolean z17 = com.tencent.mm.sdk.platformtools.x.f193064a;
            com.tencent.mm.sdk.platformtools.x.o0(r6Var.o(), b0Var);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f477122f)) {
                android.media.ExifInterface exifInterface = new android.media.ExifInterface(r6Var.o());
                exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT, this.f477122f);
                exifInterface.saveAttributes();
            }
            ((ku5.t0) ku5.t0.f312615d).B(new zx4.c0(this.f477123g));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", e17.toString());
            ((ku5.t0) ku5.t0.f312615d).B(new zx4.d0(this.f477124h));
        }
    }
}
