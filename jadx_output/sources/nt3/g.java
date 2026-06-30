package nt3;

/* loaded from: classes13.dex */
public final class g implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.k f339788d;

    public g(nt3.k kVar) {
        this.f339788d = kVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(android.media.ImageReader imageReader) {
        int i17;
        kotlin.jvm.internal.o.d(imageReader);
        android.media.Image acquireNextImage = imageReader.acquireNextImage();
        android.media.Image.Plane[] planes = acquireNextImage.getPlanes();
        int width = acquireNextImage.getWidth();
        int height = acquireNextImage.getHeight();
        int rowStride = planes[0].getRowStride() - (planes[0].getPixelStride() * width);
        java.nio.ByteBuffer buffer = planes[0].getBuffer();
        kotlin.jvm.internal.o.f(buffer, "getBuffer(...)");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        nt3.k kVar = this.f339788d;
        int i18 = kVar.f339794y;
        if (i18 > 0 && (i17 = kVar.f339795z) > 0 && kVar.f339792J == null) {
            kVar.f339792J = java.nio.ByteBuffer.allocateDirect(i18 * i17 * 4);
        }
        java.nio.ByteBuffer byteBuffer = kVar.f339792J;
        kotlin.jvm.internal.o.d(byteBuffer);
        byteBuffer.clear();
        java.nio.ByteBuffer byteBuffer2 = kVar.f339792J;
        kotlin.jvm.internal.o.d(byteBuffer2);
        byteBuffer2.order(buffer.order());
        int i19 = 0;
        for (int i27 = 0; i27 < height; i27++) {
            int i28 = (i27 * rowStride) + i19;
            int i29 = width * 4;
            buffer.limit(i28 + i29);
            buffer.position(i28);
            java.nio.ByteBuffer byteBuffer3 = kVar.f339792J;
            kotlin.jvm.internal.o.d(byteBuffer3);
            byteBuffer3.put(buffer);
            i19 += i29;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecFakeDecoder", "copyToByteArray cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        acquireNextImage.close();
        yz5.p pVar = kVar.I;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, kVar.f339792J);
        }
    }
}
