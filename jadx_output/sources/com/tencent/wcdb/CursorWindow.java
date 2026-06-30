package com.tencent.wcdb;

/* loaded from: classes12.dex */
public class CursorWindow extends com.tencent.wcdb.database.SQLiteClosable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.wcdb.CursorWindow> CREATOR;
    private static final java.lang.String STATS_TAG = "WCDB.CursorWindowStats";
    private static int sCursorWindowSize;
    private final java.lang.String mName;
    private int mStartPos;
    public long mWindowPtr;

    static {
        int identifier = android.content.res.Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", com.eclipsesource.mmv8.Platform.ANDROID);
        if (identifier != 0) {
            sCursorWindowSize = android.content.res.Resources.getSystem().getInteger(identifier) * 1024;
        } else {
            sCursorWindowSize = 2097152;
        }
        CREATOR = new android.os.Parcelable.Creator<com.tencent.wcdb.CursorWindow>() { // from class: com.tencent.wcdb.CursorWindow.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.wcdb.CursorWindow createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.wcdb.CursorWindow(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.wcdb.CursorWindow[] newArray(int i17) {
                return new com.tencent.wcdb.CursorWindow[i17];
            }
        };
    }

    private void dispose() {
        long j17 = this.mWindowPtr;
        if (j17 != 0) {
            nativeDispose(j17);
            this.mWindowPtr = 0L;
        }
    }

    private static native boolean nativeAllocRow(long j17);

    private static native void nativeClear(long j17);

    private static native void nativeCopyStringToBuffer(long j17, int i17, int i18, android.database.CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(java.lang.String str, int i17);

    private static native void nativeDispose(long j17);

    private static native void nativeFreeLastRow(long j17);

    private static native byte[] nativeGetBlob(long j17, int i17, int i18);

    private static native double nativeGetDouble(long j17, int i17, int i18);

    private static native long nativeGetLong(long j17, int i17, int i18);

    private static native int nativeGetNumRows(long j17);

    private static native java.lang.String nativeGetString(long j17, int i17, int i18);

    private static native int nativeGetType(long j17, int i17, int i18);

    private static native boolean nativePutBlob(long j17, byte[] bArr, int i17, int i18);

    private static native boolean nativePutDouble(long j17, double d17, int i17, int i18);

    private static native boolean nativePutLong(long j17, long j18, int i17, int i18);

    private static native boolean nativePutNull(long j17, int i17, int i18);

    private static native boolean nativePutString(long j17, java.lang.String str, int i17, int i18);

    private static native boolean nativeSetNumColumns(long j17, int i17);

    public static com.tencent.wcdb.CursorWindow newFromParcel(android.os.Parcel parcel) {
        return CREATOR.createFromParcel(parcel);
    }

    public static int windowSize(int i17) {
        int i18 = sCursorWindowSize;
        if (i17 > 0) {
            sCursorWindowSize = i17;
        }
        return i18;
    }

    public boolean allocRow() {
        acquireReference();
        try {
            return nativeAllocRow(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void clear() {
        acquireReference();
        try {
            this.mStartPos = 0;
            nativeClear(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void copyStringToBuffer(int i17, int i18, android.database.CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            throw new java.lang.IllegalArgumentException("CharArrayBuffer should not be null");
        }
        acquireReference();
        try {
            nativeCopyStringToBuffer(this.mWindowPtr, i17 - this.mStartPos, i18, charArrayBuffer);
        } finally {
            releaseReference();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finalize() {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public void freeLastRow() {
        acquireReference();
        try {
            nativeFreeLastRow(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public byte[] getBlob(int i17, int i18) {
        acquireReference();
        try {
            return nativeGetBlob(this.mWindowPtr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public double getDouble(int i17, int i18) {
        acquireReference();
        try {
            return nativeGetDouble(this.mWindowPtr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public float getFloat(int i17, int i18) {
        return (float) getDouble(i17, i18);
    }

    public int getInt(int i17, int i18) {
        return (int) getLong(i17, i18);
    }

    public long getLong(int i17, int i18) {
        acquireReference();
        try {
            return nativeGetLong(this.mWindowPtr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public int getNumRows() {
        acquireReference();
        try {
            return nativeGetNumRows(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public short getShort(int i17, int i18) {
        return (short) getLong(i17, i18);
    }

    public int getStartPosition() {
        return this.mStartPos;
    }

    public java.lang.String getString(int i17, int i18) {
        acquireReference();
        try {
            return nativeGetString(this.mWindowPtr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public int getType(int i17, int i18) {
        acquireReference();
        try {
            return nativeGetType(this.mWindowPtr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    @java.lang.Deprecated
    public boolean isBlob(int i17, int i18) {
        int type = getType(i17, i18);
        return type == 4 || type == 0;
    }

    @java.lang.Deprecated
    public boolean isFloat(int i17, int i18) {
        return getType(i17, i18) == 2;
    }

    @java.lang.Deprecated
    public boolean isLong(int i17, int i18) {
        return getType(i17, i18) == 1;
    }

    @java.lang.Deprecated
    public boolean isNull(int i17, int i18) {
        return getType(i17, i18) == 0;
    }

    @java.lang.Deprecated
    public boolean isString(int i17, int i18) {
        int type = getType(i17, i18);
        return type == 3 || type == 0;
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose();
    }

    public boolean putBlob(byte[] bArr, int i17, int i18) {
        acquireReference();
        try {
            return nativePutBlob(this.mWindowPtr, bArr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public boolean putDouble(double d17, int i17, int i18) {
        acquireReference();
        try {
            return nativePutDouble(this.mWindowPtr, d17, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public boolean putLong(long j17, int i17, int i18) {
        acquireReference();
        try {
            return nativePutLong(this.mWindowPtr, j17, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public boolean putNull(int i17, int i18) {
        acquireReference();
        try {
            return nativePutNull(this.mWindowPtr, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public boolean putString(java.lang.String str, int i17, int i18) {
        acquireReference();
        try {
            return nativePutString(this.mWindowPtr, str, i17 - this.mStartPos, i18);
        } finally {
            releaseReference();
        }
    }

    public boolean setNumColumns(int i17) {
        acquireReference();
        try {
            return nativeSetNumColumns(this.mWindowPtr, i17);
        } finally {
            releaseReference();
        }
    }

    public void setStartPosition(int i17) {
        this.mStartPos = i17;
    }

    public java.lang.String toString() {
        return getName() + " {" + java.lang.Long.toHexString(this.mWindowPtr) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public CursorWindow(java.lang.String str) {
        this.mStartPos = 0;
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.mName = str;
        long nativeCreate = nativeCreate(str, sCursorWindowSize);
        this.mWindowPtr = nativeCreate;
        if (nativeCreate != 0) {
            return;
        }
        throw new com.tencent.wcdb.CursorWindowAllocationException("Cursor window allocation of " + (sCursorWindowSize / 1024) + " kb failed. ");
    }

    @java.lang.Deprecated
    public CursorWindow(boolean z17) {
        this((java.lang.String) null);
    }

    private CursorWindow(android.os.Parcel parcel) {
        throw new java.lang.UnsupportedOperationException();
    }
}
