package rq1;

/* loaded from: classes12.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final rq1.h0 f398749d = new rq1.h0();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.box.HotWordSearchUtilNative.loadNativeLib();
        z17 = com.tencent.mm.plugin.box.HotWordSearchUtilNative.isLibraryLoaded;
        if (z17) {
            com.tencent.mm.plugin.box.HotWordSearchUtilNative hotWordSearchUtilNative = com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE;
            hotWordSearchUtilNative.createNativeObject();
            if (hotWordSearchUtilNative.validateBinaryWordLib() == hotWordSearchUtilNative.getSUCCESS()) {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] LoadTask:checked binarywordlib");
                return;
            }
            int generateBinaryWordLib = hotWordSearchUtilNative.generateBinaryWordLib();
            if (generateBinaryWordLib == hotWordSearchUtilNative.getSUCCESS()) {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:success");
                return;
            }
            if (generateBinaryWordLib == hotWordSearchUtilNative.getFILE_READ_ERR()) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:file read error");
                return;
            }
            if (generateBinaryWordLib == hotWordSearchUtilNative.getFILE_PATH_EMPTY()) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:file path empty");
                return;
            }
            if (generateBinaryWordLib == hotWordSearchUtilNative.getNATIVE_OBJECT_NOT_EXIST()) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:native object not exist");
            } else if (generateBinaryWordLib == hotWordSearchUtilNative.getSOURCE_FILE_NOT_EXIST()) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:source file not exist");
            } else {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "[HotWordSearchUtilNative] generateBinaryWordLib:unknown error");
            }
        }
    }
}
