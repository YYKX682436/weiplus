package lj2;

/* loaded from: classes10.dex */
public final class f implements ep0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj2.j f318854a;

    public f(lj2.j jVar) {
        this.f318854a = jVar;
    }

    public boolean a(ip0.a aVar, hp0.g gVar) {
        android.graphics.Bitmap bitmap = gVar != null ? (android.graphics.Bitmap) gVar.f282913a : null;
        android.graphics.Bitmap bitmap2 = bitmap instanceof android.graphics.Bitmap ? bitmap : null;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return true;
        }
        int pixel = bitmap2.getPixel(bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
        com.tencent.mars.xlog.Log.i(this.f318854a.getTAG(), "checkLocalFileValid url: " + aVar + " middlePixel: " + pixel + " hasAlpha: " + bitmap2.hasAlpha() + " bitmapSize: " + bitmap2.getByteCount());
        return (pixel == 0 || bitmap2.hasAlpha()) ? false : true;
    }
}
