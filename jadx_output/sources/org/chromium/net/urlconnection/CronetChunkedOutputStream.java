package org.chromium.net.urlconnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class CronetChunkedOutputStream extends org.chromium.net.urlconnection.CronetOutputStream {
    private final java.nio.ByteBuffer mBuffer;
    private final org.chromium.net.urlconnection.CronetHttpURLConnection mConnection;
    private boolean mLastChunk;
    private final org.chromium.net.urlconnection.MessageLoop mMessageLoop;
    private final org.chromium.net.UploadDataProvider mUploadDataProvider = new org.chromium.net.urlconnection.CronetChunkedOutputStream.UploadDataProviderImpl();

    /* loaded from: classes13.dex */
    public class UploadDataProviderImpl extends org.chromium.net.UploadDataProvider {
        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return -1L;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() < org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mBuffer.remaining()) {
                int limit = org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mBuffer.limit();
                byteBuffer.put(org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mBuffer);
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            byteBuffer.put(org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mBuffer);
            uploadDataSink.onReadSucceeded(org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mLastChunk);
            if (org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mLastChunk) {
                return;
            }
            org.chromium.net.urlconnection.CronetChunkedOutputStream.this.mMessageLoop.quit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new java.net.HttpRetryException("Cannot retry streamed Http body", -1));
        }

        private UploadDataProviderImpl() {
        }
    }

    public CronetChunkedOutputStream(org.chromium.net.urlconnection.CronetHttpURLConnection cronetHttpURLConnection, int i17, org.chromium.net.urlconnection.MessageLoop messageLoop) {
        cronetHttpURLConnection.getClass();
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.mBuffer = java.nio.ByteBuffer.allocate(i17);
        this.mConnection = cronetHttpURLConnection;
        this.mMessageLoop = messageLoop;
    }

    private void ensureBufferHasRemaining() {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    private void uploadBufferInternal() {
        checkNotClosed();
        this.mMessageLoop.loop();
        checkNoException();
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() {
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.mLastChunk) {
            return;
        }
        this.mLastChunk = true;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public org.chromium.net.UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void setConnected() {
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i17);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        checkNotClosed();
        if (bArr.length - i17 < i18 || i17 < 0 || i18 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i19 = i18;
        while (i19 > 0) {
            int min = java.lang.Math.min(i19, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i17 + i18) - i19, min);
            i19 -= min;
            ensureBufferHasRemaining();
        }
    }
}
