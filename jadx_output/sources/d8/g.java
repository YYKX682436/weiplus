package d8;

/* loaded from: classes7.dex */
public class g implements f8.b {
    public g(d8.i iVar) {
    }

    @Override // f8.b
    public boolean a(java.io.InputStream inputStream, android.graphics.Bitmap.Config config, f8.c cVar) {
        return true;
    }

    @Override // f8.b
    public com.github.henryye.nativeiv.bitmap.IBitmap b() {
        return new com.github.henryye.nativeiv.LegacyBitmap();
    }

    @Override // f8.b
    public void destroy() {
    }
}
