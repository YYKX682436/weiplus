package com.tencent.wcdb.repair;

/* loaded from: classes12.dex */
public class RepairKit implements com.tencent.wcdb.support.CancellationSignal.OnCancelListener {
    public static final int FLAG_ALL_TABLES = 2;
    public static final int FLAG_CHECK_TABLE_COLUMNS = 4;
    public static final int FLAG_NO_CREATE_TABLES = 1;
    private static final int INTEGRITY_DATA = 2;
    private static final int INTEGRITY_HEADER = 1;
    private static final int INTEGRITY_KDF_SALT = 4;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_IGNORE = 2;
    public static final int RESULT_OK = 0;
    private static final java.lang.String TAG = "WCDB.RepairKit";
    private com.tencent.wcdb.repair.RepairKit.Callback mCallback;
    private com.tencent.wcdb.repair.RepairKit.RepairCursor mCurrentCursor;
    private int mIntegrityFlags;
    private com.tencent.wcdb.repair.RepairKit.LeafInfo mLeafInfo;
    private com.tencent.wcdb.repair.RepairKit.MasterInfo mMasterInfo;
    private long mNativePtr;

    /* loaded from: classes12.dex */
    public interface Callback {
        int onProgress(java.lang.String str, int i17, android.database.Cursor cursor);
    }

    /* loaded from: classes12.dex */
    public static class LeafInfo {
        long mLeafPtr;

        private LeafInfo(long j17) {
            this.mLeafPtr = j17;
        }

        public static com.tencent.wcdb.repair.RepairKit.LeafInfo load(java.lang.String str) {
            long nativeLoadLeaf = com.tencent.wcdb.repair.RepairKit.nativeLoadLeaf(str);
            if (nativeLoadLeaf != 0) {
                return new com.tencent.wcdb.repair.RepairKit.LeafInfo(nativeLoadLeaf);
            }
            throw new java.io.IOException("Cannot load leaf info.");
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.tencent.wcdb.repair.RepairKit.LeafInfo scan(com.tencent.wcdb.database.SQLiteDatabase r8, java.lang.String[] r9, com.tencent.wcdb.support.CancellationSignal r10) {
            /*
                r0 = 1
                long[] r1 = new long[r0]
                if (r10 == 0) goto Ld
                com.tencent.wcdb.repair.RepairKit$LeafInfo$1 r2 = new com.tencent.wcdb.repair.RepairKit$LeafInfo$1
                r2.<init>()
                r10.setOnCancelListener(r2)
            Ld:
                r2 = 0
                if (r9 == 0) goto L14
                int r3 = r9.length
                if (r3 != 0) goto L14
                r9 = r2
            L14:
                java.lang.String r3 = "scanLeaf"
                r4 = 0
                long r3 = r8.acquireNativeConnectionHandle(r3, r0, r4)
                if (r10 == 0) goto L27
                r10.throwIfCanceled()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                goto L27
            L22:
                r9 = move-exception
                r0 = r2
                goto L4f
            L25:
                r9 = move-exception
                goto L4a
            L27:
                if (r10 != 0) goto L2a
                r1 = r2
            L2a:
                long r0 = com.tencent.wcdb.repair.RepairKit.access$700(r3, r9, r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                r5 = 0
                int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r9 == 0) goto L42
                com.tencent.wcdb.repair.RepairKit$LeafInfo r9 = new com.tencent.wcdb.repair.RepairKit$LeafInfo     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                if (r10 == 0) goto L3e
                r10.setOnCancelListener(r2)
            L3e:
                r8.releaseNativeConnection(r3, r2)
                return r9
            L42:
                com.tencent.wcdb.database.SQLiteException r9 = new com.tencent.wcdb.database.SQLiteException     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                java.lang.String r0 = "Cannot scan leaf info."
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                throw r9     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            L4a:
                throw r9     // Catch: java.lang.Throwable -> L4b
            L4b:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L4f:
                if (r10 == 0) goto L54
                r10.setOnCancelListener(r2)
            L54:
                r8.releaseNativeConnection(r3, r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.repair.RepairKit.LeafInfo.scan(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String[], com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.repair.RepairKit$LeafInfo");
        }

        public void finalize() {
            release();
            super.finalize();
        }

        public void release() {
            long j17 = this.mLeafPtr;
            if (j17 == 0) {
                return;
            }
            com.tencent.wcdb.repair.RepairKit.nativeFreeLeaf(j17);
            this.mLeafPtr = 0L;
        }

        public void save(java.lang.String str) {
            long j17 = this.mLeafPtr;
            if (j17 != 0 && !com.tencent.wcdb.repair.RepairKit.nativeSaveLeaf(j17, str)) {
                throw new java.io.IOException("Cannot save leaf info.");
            }
        }
    }

    /* loaded from: classes12.dex */
    public static class MasterInfo {
        byte[] mKDFSalt;
        long mMasterPtr;

        private MasterInfo(long j17, byte[] bArr) {
            this.mMasterPtr = j17;
            this.mKDFSalt = bArr;
        }

        public static com.tencent.wcdb.repair.RepairKit.MasterInfo load(java.lang.String str, byte[] bArr, java.lang.String[] strArr) {
            if (str == null) {
                return make(strArr);
            }
            byte[] bArr2 = new byte[16];
            long nativeLoadMaster = com.tencent.wcdb.repair.RepairKit.nativeLoadMaster(str, bArr, strArr, bArr2);
            if (nativeLoadMaster != 0) {
                return new com.tencent.wcdb.repair.RepairKit.MasterInfo(nativeLoadMaster, bArr2);
            }
            throw new com.tencent.wcdb.database.SQLiteException("Cannot create MasterInfo.");
        }

        public static com.tencent.wcdb.repair.RepairKit.MasterInfo make(java.lang.String[] strArr) {
            long nativeMakeMaster = com.tencent.wcdb.repair.RepairKit.nativeMakeMaster(strArr);
            if (nativeMakeMaster != 0) {
                return new com.tencent.wcdb.repair.RepairKit.MasterInfo(nativeMakeMaster, null);
            }
            throw new com.tencent.wcdb.database.SQLiteException("Cannot create MasterInfo.");
        }

        public static boolean save(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, byte[] bArr) {
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("backupMaster", true, false);
            boolean nativeSaveMaster = com.tencent.wcdb.repair.RepairKit.nativeSaveMaster(acquireNativeConnectionHandle, str, bArr);
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
            return nativeSaveMaster;
        }

        public static boolean saveMaster(long j17, java.lang.String str, byte[] bArr) {
            return com.tencent.wcdb.repair.RepairKit.nativeSaveMaster(j17, str, bArr);
        }

        public void finalize() {
            release();
            super.finalize();
        }

        public void release() {
            long j17 = this.mMasterPtr;
            if (j17 == 0) {
                return;
            }
            com.tencent.wcdb.repair.RepairKit.nativeFreeMaster(j17);
            this.mMasterPtr = 0L;
        }
    }

    /* loaded from: classes12.dex */
    public static class RepairCursor extends com.tencent.wcdb.AbstractCursor {
        long mPtr;

        private RepairCursor() {
        }

        private static native byte[] nativeGetBlob(long j17, int i17);

        private static native int nativeGetColumnCount(long j17);

        private static native double nativeGetDouble(long j17, int i17);

        private static native long nativeGetLong(long j17, int i17);

        private static native java.lang.String nativeGetString(long j17, int i17);

        private static native int nativeGetType(long j17, int i17);

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public byte[] getBlob(int i17) {
            return nativeGetBlob(this.mPtr, i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getColumnCount() {
            return nativeGetColumnCount(this.mPtr);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public java.lang.String[] getColumnNames() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getCount() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public double getDouble(int i17) {
            return nativeGetDouble(this.mPtr, i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public float getFloat(int i17) {
            return (float) getDouble(i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getInt(int i17) {
            return (int) getLong(i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public long getLong(int i17) {
            return nativeGetLong(this.mPtr, i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public short getShort(int i17) {
            return (short) getLong(i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public java.lang.String getString(int i17) {
            return nativeGetString(this.mPtr, i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public int getType(int i17) {
            return nativeGetType(this.mPtr, i17);
        }

        @Override // com.tencent.wcdb.AbstractCursor, com.tencent.wcdb.Cursor, android.database.Cursor
        public boolean isNull(int i17) {
            return getType(i17) == 0;
        }
    }

    /* loaded from: classes12.dex */
    public static class Statistics {
        public final int damagedPages;
        public final int parsedPages;
        public final int totalPages;
        public final int validPages;

        public Statistics(int[] iArr) {
            this.totalPages = iArr[0];
            this.validPages = iArr[1];
            this.parsedPages = iArr[2];
            this.damagedPages = iArr[3];
        }
    }

    public RepairKit(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.repair.RepairKit.MasterInfo masterInfo) {
        this(str, bArr, sQLiteCipherSpec, masterInfo, null);
    }

    public static java.lang.String lastError() {
        return nativeLastError();
    }

    private static native void nativeCancel(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeCancelScanLeaf(long j17);

    private static native void nativeFini(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFreeLeaf(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFreeMaster(long j17);

    private static native int[] nativeGetStatistics(long j17);

    private static native long nativeInit(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    private static native int nativeIntegrityFlags(long j17);

    private static native java.lang.String nativeLastError();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeLoadLeaf(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeLoadMaster(java.lang.String str, byte[] bArr, java.lang.String[] strArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeMakeMaster(java.lang.String[] strArr);

    private native int nativeOutput(long j17, long j18, long j19, long j27, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeSaveLeaf(long j17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeSaveMaster(long j17, java.lang.String str, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeScanLeaf(long j17, java.lang.String[] strArr, long[] jArr);

    private int onProgress(java.lang.String str, int i17, long j17) {
        if (this.mCallback == null) {
            return 0;
        }
        if (this.mCurrentCursor == null) {
            this.mCurrentCursor = new com.tencent.wcdb.repair.RepairKit.RepairCursor();
        }
        com.tencent.wcdb.repair.RepairKit.RepairCursor repairCursor = this.mCurrentCursor;
        repairCursor.mPtr = j17;
        return this.mCallback.onProgress(str, i17, repairCursor);
    }

    public void finalize() {
        release();
        super.finalize();
    }

    public com.tencent.wcdb.repair.RepairKit.Callback getCallback() {
        return this.mCallback;
    }

    public com.tencent.wcdb.repair.RepairKit.Statistics getStatistics() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            return new com.tencent.wcdb.repair.RepairKit.Statistics(nativeGetStatistics(j17));
        }
        throw new java.lang.IllegalArgumentException();
    }

    public boolean isDataCorrupted() {
        return (this.mIntegrityFlags & 2) == 0;
    }

    public boolean isHeaderCorrupted() {
        return (this.mIntegrityFlags & 1) == 0;
    }

    public boolean isSaltCorrupted() {
        return (this.mIntegrityFlags & 4) == 0;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public void onCancel() {
        long j17 = this.mNativePtr;
        if (j17 == 0) {
            return;
        }
        nativeCancel(j17);
    }

    public int output(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17) {
        if (this.mNativePtr != 0) {
            com.tencent.wcdb.repair.RepairKit.MasterInfo masterInfo = this.mMasterInfo;
            long j17 = masterInfo == null ? 0L : masterInfo.mMasterPtr;
            com.tencent.wcdb.repair.RepairKit.LeafInfo leafInfo = this.mLeafInfo;
            long j18 = leafInfo == null ? 0L : leafInfo.mLeafPtr;
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("repair", false, false);
            int nativeOutput = nativeOutput(this.mNativePtr, acquireNativeConnectionHandle, j17, j18, i17);
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, null);
            this.mCurrentCursor = null;
            this.mIntegrityFlags = nativeIntegrityFlags(this.mNativePtr);
            return nativeOutput;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public void release() {
        com.tencent.wcdb.repair.RepairKit.LeafInfo leafInfo = this.mLeafInfo;
        if (leafInfo != null) {
            leafInfo.release();
            this.mLeafInfo = null;
        }
        com.tencent.wcdb.repair.RepairKit.MasterInfo masterInfo = this.mMasterInfo;
        if (masterInfo != null) {
            masterInfo.release();
            this.mMasterInfo = null;
        }
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeFini(j17);
            this.mNativePtr = 0L;
        }
    }

    public void setCallback(com.tencent.wcdb.repair.RepairKit.Callback callback) {
        this.mCallback = callback;
    }

    public RepairKit(java.lang.String str, byte[] bArr, com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec, com.tencent.wcdb.repair.RepairKit.MasterInfo masterInfo, com.tencent.wcdb.repair.RepairKit.LeafInfo leafInfo) {
        if (str != null) {
            long nativeInit = nativeInit(str, bArr, sQLiteCipherSpec, masterInfo == null ? null : masterInfo.mKDFSalt);
            this.mNativePtr = nativeInit;
            if (nativeInit != 0) {
                this.mIntegrityFlags = nativeIntegrityFlags(nativeInit);
                this.mMasterInfo = masterInfo;
                this.mLeafInfo = leafInfo;
                return;
            }
            throw new com.tencent.wcdb.database.SQLiteException("Failed initialize RepairKit.");
        }
        throw new java.lang.IllegalArgumentException();
    }

    public int output(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int output = output(sQLiteDatabase, i17);
        cancellationSignal.setOnCancelListener(null);
        return output;
    }
}
