package org.chromium.net.urlconnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class CronetBufferedOutputStream extends org.chromium.net.urlconnection.CronetOutputStream {
    private static final int INITIAL_BUFFER_SIZE = 16384;
    private java.nio.ByteBuffer mBuffer;
    private boolean mConnected;
    private final org.chromium.net.urlconnection.CronetHttpURLConnection mConnection;
    private final int mInitialContentLength;
    private final org.chromium.net.UploadDataProvider mUploadDataProvider = new org.chromium.net.urlconnection.CronetBufferedOutputStream.UploadDataProviderImpl();

    /* loaded from: classes13.dex */
    public class UploadDataProviderImpl extends org.chromium.net.UploadDataProvider {
        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            if (org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mInitialContentLength == -1) {
                return org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mConnected ? org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mBuffer.limit() : org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mBuffer.position();
            }
            return org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mInitialContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mBuffer.array(), org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mBuffer.position(), remaining);
            } else {
                byteBuffer.put(org.chromium.net.urlconnection.CronetBufferedOutputStream.this.mBuffer);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindSucceeded();
        }

        private UploadDataProviderImpl() {
        }
    }

    public CronetBufferedOutputStream(org.chromium.net.urlconnection.CronetHttpURLConnection cronetHttpURLConnection, long j17) {
        if (cronetHttpURLConnection == null) {
            throw new java.lang.NullPointerException("Argument connection cannot be null.");
        }
        if (j17 > 2147483647L) {
            throw new java.lang.IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j17 >= 0) {
            this.mConnection = cronetHttpURLConnection;
            int i17 = (int) j17;
            this.mInitialContentLength = i17;
            this.mBuffer = java.nio.ByteBuffer.allocate(i17);
            return;
        }
        throw new java.lang.IllegalArgumentException("Content length < 0.");
    }

    private void ensureCanWrite(int i17) {
        if (this.mInitialContentLength != -1 && this.mBuffer.position() + i17 > this.mInitialContentLength) {
            throw new java.net.ProtocolException("exceeded content-length limit of " + this.mInitialContentLength + " bytes");
        }
        if (this.mConnected) {
            throw new java.lang.IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        if (this.mInitialContentLength == -1 && this.mBuffer.limit() - this.mBuffer.position() <= i17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(java.lang.Math.max(this.mBuffer.capacity() * 2, this.mBuffer.capacity() + i17));
            allocate.put(this.mBuffer);
            this.mBuffer = allocate;
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() {
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public org.chromium.net.UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void setConnected() {
        this.mConnected = true;
        if (this.mBuffer.position() < this.mInitialContentLength) {
            throw new java.net.ProtocolException("Content received is less than Content-Length");
        }
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        checkNotClosed();
        ensureCanWrite(1);
        this.mBuffer.put((byte) i17);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        checkNotClosed();
        ensureCanWrite(i18);
        this.mBuffer.put(bArr, i17, i18);
    }

    public CronetBufferedOutputStream(org.chromium.net.urlconnection.CronetHttpURLConnection cronetHttpURLConnection) {
        cronetHttpURLConnection.getClass();
        this.mConnection = cronetHttpURLConnection;
        this.mInitialContentLength = -1;
        this.mBuffer = java.nio.ByteBuffer.allocate(16384);
    }
}
