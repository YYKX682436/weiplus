package jj3;

/* loaded from: classes14.dex */
public final class b implements jj3.d, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public android.media.ImageReader f300002d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f300003e;

    @Override // jj3.d
    public void a() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.ImageReaderWrapper", "close");
        android.media.ImageReader imageReader = this.f300002d;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f300002d = null;
    }

    @Override // jj3.d
    public android.util.Size getRenderSize() {
        android.media.ImageReader imageReader = this.f300002d;
        return imageReader != null ? new android.util.Size(imageReader.getWidth(), imageReader.getHeight()) : new android.util.Size(0, 0);
    }

    @Override // jj3.d
    public java.lang.Object getRenderTarget() {
        android.media.ImageReader imageReader = this.f300002d;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // jj3.d
    public void setScreenOri(int i17) {
    }
}
