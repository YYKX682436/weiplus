package gs0;

/* loaded from: classes14.dex */
public final class u implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f275024d;

    public u(gs0.w wVar) {
        this.f275024d = wVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage != null) {
            gs0.w wVar = this.f275024d;
            try {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "nextYUVImage, size:[" + acquireNextImage.getWidth() + 'x' + acquireNextImage.getHeight() + "], format:" + acquireNextImage.getFormat() + ", planes.size:" + acquireNextImage.getPlanes().length + ", timestamp:" + acquireNextImage.getTimestamp() + ", rowStride:" + acquireNextImage.getPlanes()[0].getRowStride() + ", pixelStride:" + acquireNextImage.getPlanes()[0].getPixelStride() + ",buffer.capacity:" + acquireNextImage.getPlanes()[0].getBuffer().capacity());
                    int width = acquireNextImage.getWidth();
                    int height = acquireNextImage.getHeight();
                    android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                    kotlin.jvm.internal.o.f(plane, "get(...)");
                    gs0.w.a(wVar, width, height, plane);
                    wVar.f275045o = wVar.f275045o + 1;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("end processImageYUVBufferToWriteYUVData, writeYuvCount:");
                    sb6.append(wVar.f275045o);
                    sb6.append(", renderYuvCount:");
                    sb6.append(wVar.f275044n);
                    com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", sb6.toString());
                    acquireNextImage.close();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.X264TransImageReaderEncoder", e17, "acquireNextImage error", new java.lang.Object[0]);
                    acquireNextImage.close();
                }
                wVar.f275046p.release();
            } catch (java.lang.Throwable th6) {
                acquireNextImage.close();
                wVar.f275046p.release();
                throw th6;
            }
        }
    }
}
