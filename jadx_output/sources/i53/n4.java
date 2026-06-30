package i53;

/* loaded from: classes8.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.SoftReference f288679e;

    public n4(java.lang.String str, java.lang.ref.SoftReference softReference) {
        this.f288678d = str;
        this.f288679e = softReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.ref.SoftReference softReference;
        android.widget.ImageView imageView;
        jt0.i iVar = (jt0.i) i53.o4.f288686a;
        java.lang.String str = this.f288678d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) iVar.i(str);
        if (bitmap == null || bitmap.isRecycled()) {
            android.graphics.Bitmap createVideoThumbnail = android.media.ThumbnailUtils.createVideoThumbnail(str, 2);
            if (createVideoThumbnail == null || createVideoThumbnail.isRecycled()) {
                bitmap = null;
            } else {
                bitmap = android.media.ThumbnailUtils.extractThumbnail(createVideoThumbnail, 537, 402, 2);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(((android.graphics.Bitmap) iVar.put(str, bitmap)) == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.SimpleVideoAnalyzer", "createVideoThumbail, too big size = %b", objArr);
            }
        }
        if (bitmap == null || bitmap.isRecycled() || (softReference = this.f288679e) == null || (imageView = (android.widget.ImageView) softReference.get()) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new i53.m4(this, imageView, bitmap));
    }
}
