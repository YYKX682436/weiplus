package va3;

@j95.b
/* loaded from: classes8.dex */
public class m0 extends i95.w implements u45.f {

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f434327d = new jt0.i(20, va3.m0.class);

    public synchronized android.graphics.Bitmap Ai(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f434327d).get(str);
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                return bitmap;
            }
        }
        return null;
    }

    public synchronized void Bi(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (((jt0.i) this.f434327d).get(str) != null) {
            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) this.f434327d).get(str);
            if (!bitmap2.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackAvatarCacheService", "bitmap recycle %s", bitmap2.toString());
                bitmap2.recycle();
            }
            ((jt0.i) this.f434327d).remove(str);
        }
        ((jt0.i) this.f434327d).put(str, bitmap);
        ((lt0.f) this.f434327d).size();
    }

    public synchronized void wi(java.lang.String str) {
        for (java.lang.String str2 : ((jt0.i) this.f434327d).l().keySet()) {
            if (str2.startsWith(str)) {
                ((jt0.i) this.f434327d).remove(str2);
            }
        }
    }
}
