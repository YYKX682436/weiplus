package org.chromium.net.urlconnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class CronetOutputStream extends java.io.OutputStream {
    private boolean mClosed;
    private java.io.IOException mException;
    private boolean mRequestCompleted;

    public void checkNoException() {
        java.io.IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void checkNotClosed() {
        if (this.mRequestCompleted) {
            checkNoException();
            throw new java.io.IOException("Writing after request completed.");
        }
        if (this.mClosed) {
            throw new java.io.IOException("Stream has been closed.");
        }
    }

    public abstract void checkReceivedEnoughContent();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
    }

    public abstract org.chromium.net.UploadDataProvider getUploadDataProvider();

    public abstract void setConnected();

    public void setRequestCompleted(java.io.IOException iOException) {
        this.mException = iOException;
        this.mRequestCompleted = true;
    }
}
