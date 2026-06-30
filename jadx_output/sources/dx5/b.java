package dx5;

/* loaded from: classes8.dex */
public interface b {
    void onCanceled(long j17, dx5.c cVar);

    void onFailed(long j17, jz5.l lVar);

    void onResponseStarted(long j17, int i17, java.util.Map map);

    void onStreamDataChunk(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    void onSucceeded(long j17, long j18);
}
