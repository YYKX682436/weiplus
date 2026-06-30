package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public abstract class SQLiteClosable implements java.io.Closeable {
    private int mReferenceCount = 1;

    public void acquireReference() {
        synchronized (this) {
            int i17 = this.mReferenceCount;
            if (i17 <= 0) {
                throw new java.lang.IllegalStateException("attempt to re-open an already-closed object: " + this);
            }
            this.mReferenceCount = i17 + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseReference();
    }

    public abstract void onAllReferencesReleased();

    @java.lang.Deprecated
    public void onAllReferencesReleasedFromContainer() {
        onAllReferencesReleased();
    }

    public void releaseReference() {
        boolean z17;
        synchronized (this) {
            z17 = true;
            int i17 = this.mReferenceCount - 1;
            this.mReferenceCount = i17;
            if (i17 != 0) {
                z17 = false;
            }
        }
        if (z17) {
            onAllReferencesReleased();
        }
    }

    @java.lang.Deprecated
    public void releaseReferenceFromContainer() {
        boolean z17;
        synchronized (this) {
            z17 = true;
            int i17 = this.mReferenceCount - 1;
            this.mReferenceCount = i17;
            if (i17 != 0) {
                z17 = false;
            }
        }
        if (z17) {
            onAllReferencesReleased();
        }
    }
}
