package org.chromium.net;

/* loaded from: classes13.dex */
public abstract class UploadDataProvider implements java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long getLength();

    public abstract void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer);

    public abstract void rewind(org.chromium.net.UploadDataSink uploadDataSink);
}
