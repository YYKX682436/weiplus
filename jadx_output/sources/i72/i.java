package i72;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i72.m f289421d;

    public i(i72.m mVar) {
        this.f289421d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f289421d.f289427d.f100107u) {
            com.tencent.mm.plugin.facedetect.model.n0 n0Var = this.f289421d.f289424a;
            if (n0Var == null) {
                return;
            }
            n0Var.c(null);
            com.tencent.mm.plugin.facedetect.model.v b17 = com.tencent.mm.plugin.facedetect.model.v.b();
            b17.getClass();
            synchronized (com.tencent.mm.plugin.facedetect.model.v.f100038c) {
                java.util.List list = b17.f100039a;
                if (list != null) {
                    list.clear();
                }
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f289421d.f289427d.f100098i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f289421d.f289424a.b();
            i72.m mVar = this.f289421d;
            mVar.f289424a = null;
            mVar.f289427d.f100102p = false;
        }
    }
}
