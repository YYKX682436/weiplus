package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes14.dex */
public final class t implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.w f175721d;

    public t(com.tencent.mm.plugin.vlog.model.w wVar) {
        this.f175721d = wVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image acquireNextImage;
        com.tencent.mm.plugin.vlog.model.w wVar = this.f175721d;
        synchronized (wVar.f175774w) {
            android.media.ImageReader imageReader2 = wVar.f175762k;
            if (imageReader2 != null && (acquireNextImage = imageReader2.acquireNextImage()) != null) {
                try {
                    try {
                        wVar.D.frame("MicroMsg.CompositionSoftwareEncoder", "nextYUVImage, size:[" + acquireNextImage.getWidth() + 'x' + acquireNextImage.getHeight() + "], format:" + acquireNextImage.getFormat() + ", planes.size:" + acquireNextImage.getPlanes().length + ", timestamp:" + acquireNextImage.getTimestamp() + ", rowStride:" + acquireNextImage.getPlanes()[0].getRowStride() + ", pixelStride:" + acquireNextImage.getPlanes()[0].getPixelStride() + ",buffer.capacity:" + acquireNextImage.getPlanes()[0].getBuffer().capacity());
                        int width = acquireNextImage.getWidth();
                        int height = acquireNextImage.getHeight();
                        android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                        kotlin.jvm.internal.o.f(plane, "get(...)");
                        wVar.e(width, height, plane, acquireNextImage.getTimestamp());
                        wVar.f175777z = wVar.f175777z + 1;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CompositionSoftwareEncoder", e17, "acquireNextImage error", new java.lang.Object[0]);
                    }
                    acquireNextImage.close();
                } catch (java.lang.Throwable th6) {
                    acquireNextImage.close();
                    throw th6;
                }
            }
        }
        this.f175721d.f175775x.release();
    }
}
