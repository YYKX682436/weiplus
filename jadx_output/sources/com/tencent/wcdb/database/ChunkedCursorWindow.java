package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public class ChunkedCursorWindow extends com.tencent.wcdb.database.SQLiteClosable {
    public static final long CHUNK_NOT_FOUND = -1;
    private int mNumColumns = 0;
    long mWindowPtr;

    public ChunkedCursorWindow(int i17) {
        long nativeCreate = nativeCreate(i17);
        this.mWindowPtr = nativeCreate;
        if (nativeCreate == 0) {
            throw new com.tencent.wcdb.CursorWindowAllocationException("Cursor window allocation failed.");
        }
    }

    private void dispose() {
        long j17 = this.mWindowPtr;
        if (j17 != 0) {
            nativeDispose(j17);
            this.mWindowPtr = 0L;
        }
    }

    private static native void nativeClear(long j17);

    private static native long nativeCreate(int i17);

    private static native void nativeDispose(long j17);

    private static native void nativeEndRow(long j17, long j18);

    private static native byte[] nativeGetBlob(long j17, int i17);

    private static native double nativeGetDouble(long j17, int i17);

    private static native long nativeGetLong(long j17, int i17);

    private static native int nativeGetNumChunks(long j17);

    private static native long nativeGetRow(long j17, int i17);

    private static native java.lang.String nativeGetString(long j17, int i17);

    private static native int nativeGetType(long j17, int i17);

    private static native long nativeRemoveChunk(long j17, int i17);

    private static native boolean nativeSetNumColumns(long j17, int i17);

    public void clear() {
        acquireReference();
        try {
            nativeClear(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void endRowUnsafe(long j17) {
        if (j17 == 0) {
            return;
        }
        nativeEndRow(this.mWindowPtr, j17);
        releaseReference();
    }

    public void finalize() {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public byte[] getBlob(int i17, int i18) {
        long rowUnsafe = getRowUnsafe(i17);
        if (rowUnsafe != 0) {
            try {
                return nativeGetBlob(rowUnsafe, i18);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    public byte[] getBlobUnsafe(long j17, int i17) {
        return nativeGetBlob(j17, i17);
    }

    public double getDouble(int i17, int i18) {
        long rowUnsafe = getRowUnsafe(i17);
        if (rowUnsafe != 0) {
            try {
                return nativeGetDouble(rowUnsafe, i18);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    public double getDoubleUnsafe(long j17, int i17) {
        return nativeGetDouble(j17, i17);
    }

    public long getLong(int i17, int i18) {
        long rowUnsafe = getRowUnsafe(i17);
        if (rowUnsafe != 0) {
            try {
                return nativeGetLong(rowUnsafe, i18);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    public long getLongUnsafe(long j17, int i17) {
        return nativeGetLong(j17, i17);
    }

    public int getNumChunks() {
        acquireReference();
        try {
            return nativeGetNumChunks(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public int getNumColumns() {
        return this.mNumColumns;
    }

    public long getRowUnsafe(int i17) {
        acquireReference();
        long nativeGetRow = nativeGetRow(this.mWindowPtr, i17);
        if (nativeGetRow == 0) {
            releaseReference();
        }
        return nativeGetRow;
    }

    public java.lang.String getString(int i17, int i18) {
        long rowUnsafe = getRowUnsafe(i17);
        if (rowUnsafe != 0) {
            try {
                return nativeGetString(rowUnsafe, i18);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    public java.lang.String getStringUnsafe(long j17, int i17) {
        return nativeGetString(j17, i17);
    }

    public int getType(int i17, int i18) {
        long rowUnsafe = getRowUnsafe(i17);
        if (rowUnsafe != 0) {
            try {
                return nativeGetType(rowUnsafe, i18);
            } finally {
                endRowUnsafe(rowUnsafe);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    public int getTypeUnsafe(long j17, int i17) {
        return nativeGetType(j17, i17);
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose();
    }

    public long removeChunk(int i17) {
        acquireReference();
        try {
            return nativeRemoveChunk(this.mWindowPtr, i17);
        } finally {
            releaseReference();
        }
    }

    public boolean setNumColumns(int i17) {
        acquireReference();
        try {
            boolean nativeSetNumColumns = nativeSetNumColumns(this.mWindowPtr, i17);
            if (nativeSetNumColumns) {
                this.mNumColumns = i17;
            }
            return nativeSetNumColumns;
        } finally {
            releaseReference();
        }
    }
}
