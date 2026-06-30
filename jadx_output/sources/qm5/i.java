package qm5;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f364833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm5.j f364834e;

    public i(qm5.j jVar, android.graphics.Bitmap bitmap) {
        this.f364834e = jVar;
        this.f364833d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        qm5.j jVar = this.f364834e;
        if (jVar.f364837m != -1 || (bitmap = this.f364833d) == null || bitmap.isRecycled()) {
            return;
        }
        android.opengl.GLES20.glActiveTexture(33986);
        jVar.f364837m = qm5.k.b(bitmap, -1, false);
    }
}
