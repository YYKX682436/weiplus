package org.chromium.net.urlconnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class CronetInputStream extends java.io.InputStream {
    private static final int READ_BUFFER_SIZE = 32768;
    private java.nio.ByteBuffer mBuffer;
    private java.io.IOException mException;
    private final org.chromium.net.urlconnection.CronetHttpURLConnection mHttpURLConnection;
    private boolean mResponseDataCompleted;

    public CronetInputStream(org.chromium.net.urlconnection.CronetHttpURLConnection cronetHttpURLConnection) {
        this.mHttpURLConnection = cronetHttpURLConnection;
    }

    private void getMoreDataIfNeeded() {
        if (this.mResponseDataCompleted) {
            java.io.IOException iOException = this.mException;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (hasUnreadData()) {
                return;
            }
            if (this.mBuffer == null) {
                this.mBuffer = java.nio.ByteBuffer.allocateDirect(32768);
            }
            this.mHttpURLConnection.getMoreData(this.mBuffer);
            java.io.IOException iOException2 = this.mException;
            if (iOException2 != null) {
                throw iOException2;
            }
            java.nio.ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer != null) {
            }
        }
    }

    private boolean hasUnreadData() {
        java.nio.ByteBuffer byteBuffer = this.mBuffer;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public int available() {
        if (!this.mResponseDataCompleted) {
            if (hasUnreadData()) {
                return this.mBuffer.remaining();
            }
            return 0;
        }
        java.io.IOException iOException = this.mException;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public int read() {
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            return this.mBuffer.get() & 255;
        }
        return -1;
    }

    public void setResponseDataCompleted(java.io.IOException iOException) {
        this.mException = iOException;
        this.mResponseDataCompleted = true;
        this.mBuffer = null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i17 < 0 || i18 < 0 || i17 + i18 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i18 == 0) {
            return 0;
        }
        getMoreDataIfNeeded();
        if (!hasUnreadData()) {
            return -1;
        }
        int min = java.lang.Math.min(this.mBuffer.limit() - this.mBuffer.position(), i18);
        this.mBuffer.get(bArr, i17, min);
        return min;
    }
}
