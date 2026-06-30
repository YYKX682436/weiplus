package yw3;

/* loaded from: classes3.dex */
public final class h6 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw3.h6 f466763a = new yw3.h6();

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UrlImageCacheService", "trydownload imgback end:" + str + " bitmap:" + bitmap + " exist:" + com.tencent.mm.vfs.w6.j(str2) + " len:" + com.tencent.mm.vfs.w6.k(str2));
        if (bitmap != null) {
            com.tencent.mm.vfs.w6.j(str2);
        }
    }
}
