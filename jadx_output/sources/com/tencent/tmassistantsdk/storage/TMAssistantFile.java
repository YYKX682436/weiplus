package com.tencent.tmassistantsdk.storage;

/* loaded from: classes13.dex */
public class TMAssistantFile {
    protected static final int DataBufferMaxLen = 16384;
    protected static final java.lang.String TAG = "TMAssistantFile";
    protected long mFileDataLen;
    protected java.lang.String mFinalFileName;
    protected java.lang.String mTempFileName;
    protected java.io.OutputStream mFileOutputStream = null;
    protected byte[] mWriteDataBuffer = null;
    protected int mDataBufferDataLen = 0;

    public TMAssistantFile(java.lang.String str, java.lang.String str2) {
        this.mFileDataLen = 0L;
        this.mTempFileName = str;
        this.mFinalFileName = str2;
        this.mFileDataLen = length();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mFileDataLen = " + this.mFileDataLen);
    }

    public static java.lang.String getSaveFilePath(java.lang.String str) {
        java.lang.String savePathRootDir;
        if (str == null || (savePathRootDir = getSavePathRootDir()) == null) {
            return null;
        }
        return savePathRootDir + "/" + str;
    }

    public static java.lang.String getSavePathRootDir() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir() + "/TMAssistantSDK/Download";
    }

    public static boolean isSDCardExistAndCanWrite() {
        return "mounted".equals(android.os.Environment.getExternalStorageState()) && android.os.Environment.getExternalStorageDirectory().canWrite();
    }

    private boolean moveFileFromTmpToSavaPath(java.lang.String str, java.lang.String str2) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "moveFileFromTmpToSavaPath, tmpFilePath = " + str + ", saveFilePath = " + str2);
        boolean z17 = false;
        if (str != null && str2 != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 M = r6Var.M();
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (M.a() && m17.a()) {
                    try {
                        z17 = m17.f213266a.t(m17.f213267b, M.f213266a, M.f213267b);
                    } catch (java.io.IOException unused) {
                    }
                }
                if (z17) {
                    com.tencent.tmassistantsdk.util.GlobalUtil.updateFilePathAuthorized(str2);
                }
                return z17;
            }
        }
        com.tencent.tmassistantsdk.util.TMLog.w(TAG, "moveFileFromTmpToSavaPath failed ");
        return false;
    }

    private boolean writeData(java.io.OutputStream outputStream, byte[] bArr, int i17, int i18, long j17) {
        if (outputStream == null || bArr == null) {
            return false;
        }
        if (j17 != this.mFileDataLen) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "writeData0 failed,filelen:" + this.mFileDataLen + ",offset:" + j17 + ",filename:" + this.mTempFileName);
            return false;
        }
        if (i18 >= 16384) {
            try {
                int i19 = this.mDataBufferDataLen;
                if (i19 > 0) {
                    outputStream.write(this.mWriteDataBuffer, 0, i19);
                    this.mDataBufferDataLen = 0;
                }
                outputStream.write(bArr, i17, i18);
                this.mFileDataLen += i18;
                return true;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, "writeData1 failed " + e17.getMessage());
                return false;
            }
        }
        int i27 = this.mDataBufferDataLen;
        if (i27 + i18 > 16384 && i27 > 0) {
            try {
                outputStream.write(this.mWriteDataBuffer, 0, i27);
                this.mDataBufferDataLen = 0;
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, "writeData2 failed " + e18.getMessage());
                return false;
            }
        }
        java.lang.System.arraycopy(bArr, i17, this.mWriteDataBuffer, this.mDataBufferDataLen, i18);
        this.mDataBufferDataLen += i18;
        this.mFileDataLen += i18;
        return true;
    }

    public synchronized void close() {
        flush();
        try {
            java.io.OutputStream outputStream = this.mFileOutputStream;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        this.mFileOutputStream = null;
        this.mWriteDataBuffer = null;
        this.mFileDataLen = 0L;
    }

    public void deleteTempFile() {
        java.lang.String tmpFilePath = getTmpFilePath(this.mTempFileName);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "deleteFile 1 tmpFilePathString: " + tmpFilePath);
        if (android.text.TextUtils.isEmpty(tmpFilePath)) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(tmpFilePath);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "deleteFile 2 file: " + r6Var);
        if (!r6Var.m()) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "deleteFile 3");
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "deleteFile result:" + r6Var.l() + ",filename:" + tmpFilePath);
    }

    public void ensureFilePath(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "fileFullPath is null or the filename.size is zero.");
            throw new java.security.InvalidParameterException("fileFullPath is null or the filename.size is zero.");
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            boolean z17 = true;
            if (str.length() != 1) {
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                }
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                    z17 = !m18.a() ? false : m18.f213266a.r(m18.f213267b);
                }
                if (z17) {
                    return;
                }
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "Failed to create directory. dir: ".concat(str));
                throw new java.io.IOException("Failed to create directory. dir: ".concat(str));
            }
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "fileFullPath is not a valid full path. fileName: ".concat(str));
        throw new java.security.InvalidParameterException("fileFullPath is not a valid full path. fileName: ".concat(str));
    }

    public synchronized boolean flush() {
        int i17;
        java.io.OutputStream outputStream = this.mFileOutputStream;
        if (outputStream != null && (i17 = this.mDataBufferDataLen) > 0) {
            try {
                outputStream.write(this.mWriteDataBuffer, 0, i17);
                this.mDataBufferDataLen = 0;
                return true;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, "flush failed " + e17);
            }
        }
        return false;
    }

    public java.lang.String getTmpFilePath(java.lang.String str) {
        java.lang.String savePathRootDir;
        if (str == null || (savePathRootDir = getSavePathRootDir()) == null) {
            return null;
        }
        return savePathRootDir + "/.tmp/" + str + ".tmp";
    }

    public long length() {
        java.lang.String saveFilePath = getSaveFilePath(this.mFinalFileName);
        if (saveFilePath == null) {
            return 0L;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(saveFilePath));
        if (r6Var.m()) {
            this.mFileDataLen = r6Var.C();
        } else {
            java.lang.String tmpFilePath = getTmpFilePath(this.mTempFileName);
            if (tmpFilePath != null) {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(tmpFilePath));
                if (r6Var2.m()) {
                    com.tencent.tmassistantsdk.util.TMLog.i(TAG, tmpFilePath.concat(" exists"));
                    this.mFileDataLen = r6Var2.C();
                } else {
                    this.mFileDataLen = 0L;
                }
            }
        }
        return this.mFileDataLen;
    }

    public void moveFileToSavaPath() {
        moveFileFromTmpToSavaPath(getTmpFilePath(this.mTempFileName), getSaveFilePath(this.mFinalFileName));
    }

    public synchronized boolean write(byte[] bArr, int i17, int i18, long j17, boolean z17) {
        if (this.mFileOutputStream == null) {
            java.lang.String tmpFilePath = getTmpFilePath(this.mTempFileName);
            if (tmpFilePath == null) {
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, "write failed tmpFilePathString is null");
                return false;
            }
            try {
                ensureFilePath(tmpFilePath);
                this.mFileOutputStream = com.tencent.mm.vfs.w6.K(tmpFilePath, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, "write failed" + e17.getMessage());
                return false;
            }
        }
        if (this.mWriteDataBuffer == null) {
            this.mWriteDataBuffer = new byte[16384];
            this.mDataBufferDataLen = 0;
        }
        boolean writeData = writeData(this.mFileOutputStream, bArr, i17, i18, j17);
        if (!writeData) {
            return writeData;
        }
        if (!z17 || !flush()) {
            return true;
        }
        return moveFileFromTmpToSavaPath(getTmpFilePath(this.mTempFileName), getSaveFilePath(this.mFinalFileName));
    }
}
