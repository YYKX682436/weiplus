package d7;

/* loaded from: classes13.dex */
public final class s0 implements d7.u0 {
    public s0(d7.q0 q0Var) {
    }

    @Override // d7.u0
    public void a(android.media.MediaMetadataRetriever mediaMetadataRetriever, java.lang.Object obj) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
