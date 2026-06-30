package tf;

/* loaded from: classes7.dex */
public abstract class i implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f418818d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418819e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Runnable f418820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.j f418821g;

    public i(tf.j jVar, java.lang.Object obj, java.lang.Runnable runnable) {
        this.f418821g = jVar;
        this.f418818d = obj;
        this.f418819e = obj.hashCode();
        this.f418820f = runnable;
    }

    public final void a(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.Surface surface;
        tf.j jVar = this.f418821g;
        android.util.SparseArray sparseArray = jVar.f418828c;
        int i19 = this.f418819e;
        android.util.Pair pair = (android.util.Pair) sparseArray.get(i19);
        if (pair == null || pair.second != surfaceTexture) {
            android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
            pair = android.util.Pair.create(surface2, surfaceTexture);
            surface = surface2;
        } else {
            surface = (android.view.Surface) pair.first;
        }
        if (c(surface, i17, i18)) {
            jVar.f418828c.put(i19, pair);
        }
    }

    public abstract void b();

    public abstract boolean c(android.view.Surface surface, int i17, int i18);

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.String str = this.f418821g.f418826a;
        java.util.Objects.toString(this.f418818d);
        a(surfaceTexture, i17, i18);
        java.lang.Runnable runnable = this.f418820f;
        this.f418820f = null;
        if (runnable != null) {
            tf.j jVar = this.f418821g;
            com.tencent.mars.xlog.Log.i(jVar.f418826a, "scheduleAfterTransferToTask");
            tf.k0 a17 = tf.k0.a(surfaceTexture);
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            wu5.c z17 = t0Var.z(runnable, 300L, false);
            if (a17 != null) {
                tf.h hVar = new tf.h(jVar, z17, runnable, a17);
                if (tf.j.f418825f == null) {
                    tf.j.f418825f = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                android.os.Handler handler = tf.j.f418825f;
                synchronized (a17) {
                    tf.j0 j0Var = new tf.j0(hVar, handler);
                    ((java.util.ArrayList) a17.f418835b).remove(j0Var);
                    ((java.util.ArrayList) a17.f418835b).add(j0Var);
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        tf.j jVar = this.f418821g;
        java.lang.String str = jVar.f418826a;
        java.util.Objects.toString(this.f418818d);
        java.util.Objects.toString(surfaceTexture);
        b();
        android.util.SparseArray sparseArray = jVar.f418828c;
        int i17 = this.f418819e;
        android.util.Pair pair = (android.util.Pair) sparseArray.get(i17);
        if (pair == null) {
            return true;
        }
        jVar.f418828c.remove(i17);
        ((android.view.Surface) pair.first).release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        tf.j jVar = this.f418821g;
        if (jVar.f418829d) {
            a(surfaceTexture, i17, i18);
        } else {
            com.tencent.mars.xlog.Log.w(jVar.f418826a, "onSurfaceTextureSizeChanged, video is not in pip container");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
