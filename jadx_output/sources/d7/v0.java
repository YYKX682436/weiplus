package d7;

/* loaded from: classes13.dex */
public final class v0 implements d7.u0 {
    @Override // d7.u0
    public void a(android.media.MediaMetadataRetriever mediaMetadataRetriever, java.lang.Object obj) {
        mediaMetadataRetriever.setDataSource(((android.os.ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
