package tf;

/* loaded from: classes7.dex */
public abstract class j implements pd1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final pd1.f f418824e = new tf.g();

    /* renamed from: f, reason: collision with root package name */
    public static android.os.Handler f418825f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418826a = "MicroMsg.AppBrand.AbsXWebVideoContainerChannel#" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f418827b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f418828c = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public boolean f418829d = false;

    @Override // pd1.l
    public pd1.f a() {
        return f418824e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pd1.l
    public void b(android.view.View view) {
        this.f418827b.remove(view.hashCode());
        ((tf.p) view).setSurfaceTextureListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pd1.l
    public void c(android.view.View view, java.lang.Runnable runnable) {
        java.lang.String str = this.f418826a;
        com.tencent.mars.xlog.Log.i(str, "transferTo, textureImageViewLike: " + view);
        this.f418829d = true;
        ((tf.p) view).setImageBitmap(null);
        int hashCode = view.hashCode();
        android.util.SparseArray sparseArray = this.f418827b;
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = (android.view.TextureView.SurfaceTextureListener) sparseArray.get(hashCode);
        if (surfaceTextureListener == null) {
            tf.i g17 = g(view, runnable);
            ((tf.p) view).setSurfaceTextureListener(g17);
            sparseArray.put(hashCode, g17);
            return;
        }
        com.tencent.mars.xlog.Log.w(str, "transferTo, surfaceTextureListener is not null");
        android.graphics.SurfaceTexture surfaceTexture = ((tf.p) view).getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, view.getWidth(), view.getHeight());
        }
        if (runnable != null) {
            com.tencent.mars.xlog.Log.i(str, "transferTo, run afterTransferToTask when surfaceTextureListener is not null");
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pd1.l
    public void f(android.view.View view) {
        java.lang.String str = this.f418826a;
        com.tencent.mars.xlog.Log.i(str, "onPlayEndWorkaround, textureImageViewLike: " + view);
        if (!this.f418829d) {
            com.tencent.mars.xlog.Log.i(str, "onPlayEndWorkaround, video is not in pip container");
        }
        tf.p pVar = (tf.p) view;
        android.graphics.Bitmap bitmap = pVar.getBitmap();
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w(str, "onPlayEndWorkaround, bitmap is null");
        } else {
            pVar.setImageBitmap(bitmap);
        }
    }

    public abstract tf.i g(android.view.View view, java.lang.Runnable runnable);
}
