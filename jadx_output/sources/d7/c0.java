package d7;

/* loaded from: classes13.dex */
public final class c0 implements t6.f {
    @Override // t6.f
    public com.bumptech.glide.load.ImageHeaderParser$ImageType a(java.io.InputStream inputStream) {
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // t6.f
    public com.bumptech.glide.load.ImageHeaderParser$ImageType b(java.nio.ByteBuffer byteBuffer) {
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // t6.f
    public int c(java.io.InputStream inputStream, x6.b bVar) {
        int attributeInt = new android.media.ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
