package dr4;

/* loaded from: classes13.dex */
public final class e implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.h f242623d;

    public e(dr4.h hVar) {
        this.f242623d = hVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        dr4.h hVar = this.f242623d;
        if (hVar.f242680f.get()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EncodeWindowSurfaceRenderer", "current is release .not allow to acquireLatestImage");
            return;
        }
        android.media.Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            try {
                try {
                    dr4.h.o(hVar, vq4.c0.f439281a.a(acquireLatestImage), acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), false);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EncodeWindowSurfaceRenderer", e17.getMessage());
                }
            } finally {
                acquireLatestImage.close();
            }
        }
        if (acquireLatestImage == null) {
        }
    }
}
