package org.chromium.net.urlconnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class CronetFixedModeOutputStream extends org.chromium.net.urlconnection.CronetOutputStream {
    private static int sDefaultBufferLength = 16384;
    private final java.nio.ByteBuffer mBuffer;
    private long mBytesWritten;
    private final org.chromium.net.urlconnection.CronetHttpURLConnection mConnection;
    private final long mContentLength;
    private final org.chromium.net.urlconnection.MessageLoop mMessageLoop;
    private final org.chromium.net.UploadDataProvider mUploadDataProvider = new org.chromium.net.urlconnection.CronetFixedModeOutputStream.UploadDataProviderImpl();

    /* loaded from: classes13.dex */
    public class UploadDataProviderImpl extends org.chromium.net.UploadDataProvider {
        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return org.chromium.net.urlconnection.CronetFixedModeOutputStream.this.mContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= org.chromium.net.urlconnection.CronetFixedModeOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(org.chromium.net.urlconnection.CronetFixedModeOutputStream.this.mBuffer);
                uploadDataSink.onReadSucceeded(false);
                org.chromium.net.urlconnection.CronetFixedModeOutputStream.this.mMessageLoop.quit();
                return;
            }
            int limit = org.chromium.net.urlconnection.CronetFixedModeOutputStream.this.mBuffer.limit();
            byteBuffer.put(org.chromium.net.urlconnection.CronetFixedModeOutputStream.this.mBuffer);
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new java.net.HttpRetryException("Cannot retry streamed Http body", -1));
        }

        private UploadDataProviderImpl() {
        }
    }

    public CronetFixedModeOutputStream(org.chromium.net.urlconnection.CronetHttpURLConnection cronetHttpURLConnection, long j17, org.chromium.net.urlconnection.MessageLoop messageLoop) {
        cronetHttpURLConnection.getClass();
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.mContentLength = j17;
        this.mBuffer = java.nio.ByteBuffer.allocate((int) java.lang.Math.min(j17, sDefaultBufferLength));
        this.mConnection = cronetHttpURLConnection;
        this.mMessageLoop = messageLoop;
        this.mBytesWritten = 0L;
    }

    private void checkNotExceedContentLength(int i17) {
        if (this.mBytesWritten + i17 <= this.mContentLength) {
            return;
        }
        throw new java.net.ProtocolException("expected " + (this.mContentLength - this.mBytesWritten) + " bytes but received " + i17);
    }

    private void ensureBufferHasRemaining() {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    public static void setDefaultBufferLengthForTesting(int i17) {
        sDefaultBufferLength = i17;
    }

    private void uploadBufferInternal() {
        checkNotClosed();
        this.mMessageLoop.loop();
        checkNoException();
    }

    private void uploadIfComplete() {
        if (this.mBytesWritten == this.mContentLength) {
            uploadBufferInternal();
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() {
        if (this.mBytesWritten < this.mContentLength) {
            throw new java.net.ProtocolException("Content received is less than Content-Length.");
        }
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
        checkNotClosed();
        checkNotExceedContentLength(1);
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i17);
        this.mBytesWritten++;
        uploadIfComplete();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        checkNotClosed();
        if (bArr.length - i17 >= i18 && i17 >= 0 && i18 >= 0) {
            checkNotExceedContentLength(i18);
            int i19 = i18;
            while (i19 > 0) {
                ensureBufferHasRemaining();
                int min = java.lang.Math.min(i19, this.mBuffer.remaining());
                this.mBuffer.put(bArr, (i17 + i18) - i19, min);
                i19 -= min;
            }
            this.mBytesWritten += i18;
            uploadIfComplete();
            return;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}
