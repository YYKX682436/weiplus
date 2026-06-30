package d8;

/* loaded from: classes7.dex */
public class k implements com.github.henryye.nativeiv.bitmap.IBitmap {
    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public void decodeInputStream(java.io.InputStream inputStream, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.c cVar) {
        if (inputStream == null) {
            throw new java.io.IOException("Null input stream");
        }
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public long getDecodeTime() {
        return 0L;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public com.github.henryye.nativeiv.bitmap.BitmapType getType() {
        return com.github.henryye.nativeiv.bitmap.BitmapType.Native;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public /* bridge */ /* synthetic */ java.lang.Object provide() {
        return null;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public void recycle() {
    }
}
