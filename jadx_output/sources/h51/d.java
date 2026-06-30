package h51;

/* loaded from: classes12.dex */
public class d implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public java.io.File f279018d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f279019e;

    public d() {
        new java.util.ArrayList();
        this.f279019e = true;
        java.io.File createTempFile = java.io.File.createTempFile("mm_patch", "tmp");
        this.f279018d = createTempFile;
        createTempFile.deleteOnExit();
    }

    public void a() {
        try {
            java.io.File file = this.f279018d;
            if (file != null) {
                file.delete();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.i("HdiffApk-tempFile", "e = " + e17);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f279019e) {
            this.f279018d.delete();
        }
    }
}
