package qm5;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f364826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm5.h f364827e;

    public g(qm5.h hVar, android.graphics.Bitmap bitmap) {
        this.f364827e = hVar;
        this.f364826d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        qm5.h hVar = this.f364827e;
        if (hVar.f364831r != -1 || (bitmap = this.f364826d) == null || bitmap.isRecycled()) {
            return;
        }
        android.opengl.GLES20.glActiveTexture(33987);
        hVar.f364831r = qm5.k.b(bitmap, -1, false);
    }
}
