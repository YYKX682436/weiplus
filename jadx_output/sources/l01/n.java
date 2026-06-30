package l01;

/* loaded from: classes7.dex */
public final class n implements l01.v {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f314781a = new l01.m(this, 31457280);

    public android.graphics.Bitmap a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        synchronized (this.f314781a) {
            java.lang.ref.Reference reference = (java.lang.ref.Reference) ((com.tencent.mm.sdk.platformtools.r2) this.f314781a).get(str);
            if (reference == null) {
                return null;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) reference.get();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
            ((com.tencent.mm.sdk.platformtools.r2) this.f314781a).remove(str);
            return null;
        }
    }

    public void b(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || bitmap == null) {
            return;
        }
        try {
            synchronized (this.f314781a) {
                ((com.tencent.mm.sdk.platformtools.r2) this.f314781a).put(str, new java.lang.ref.SoftReference(bitmap));
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }
}
