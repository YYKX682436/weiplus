package com.tencent.mm.plugin.sight.base;

/* loaded from: classes10.dex */
public class SightVideoJNI {
    public static final int MMSIGHT_YUV420P = 2;
    public static final int MMSIGHT_YUV420SP = 1;
    private static final java.lang.Object MMSightLock = new java.lang.Object();
    private static final java.lang.String TAG = "MicroMsg.SightVideoJNI";
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_SURFACE = 0;

    /* loaded from: classes5.dex */
    public static class VideoTSRange {
        public double beginTs;
        public long dataOffset;
        public long dataSize;
        public double endTs;
    }

    static {
        mq1.w0.wi();
    }

    @java.lang.Deprecated
    public static native void NV21ToYUV420XXAndScaleRotate(byte[] bArr, byte[] bArr2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, boolean z17, boolean z18);

    public static void addReportArrayMetadata(java.lang.String str, int[] iArr, int i17, int i18) {
        if (i17 != 1 && i17 != 2) {
            com.tencent.mars.xlog.Log.i(TAG, "ABA: array method aba switch is closed");
            return;
        }
        byte[] bArr = {1, 0, 0, 0};
        if (iArr != null) {
            bArr[2] = (byte) iArr[3];
        }
        bArr[3] = 68;
        java.lang.String str2 = "wxmmca" + ((iArr == null || iArr[3] <= 0) ? (iArr == null || iArr[4] <= 0) ? "br00" : "br22" : "br11") + ((iArr == null || iArr[35] <= 0) ? "dr0" : "dr1") + ((iArr == null || iArr[20] != 1) ? (iArr == null || iArr[20] != 2) ? "0" : "2" : "1") + "00";
        com.tencent.mars.xlog.Log.i(TAG, "ABA: array method add the metadata filename: [%s] cprt [%s]", str, str2);
        tagMP4CprtChpl(str, str2, bArr, true);
        optimizeMP4VFS(str);
    }

    public static void addReportMetadata(java.lang.String str, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams, int i17, int i18) {
        if (i17 != 1 && i17 != 2) {
            com.tencent.mars.xlog.Log.i(TAG, "ABA: aba switch is closed");
            return;
        }
        byte[] bArr = {1, 0, 0, 0};
        if (aBAPrams != null) {
            bArr[2] = (byte) aBAPrams.bitrateAdaptiveUP;
        }
        bArr[3] = 68;
        java.lang.String str2 = "wxmmca" + ((aBAPrams == null || aBAPrams.bitrateAdaptiveUP <= 0) ? (aBAPrams == null || aBAPrams.bitrateAdaptiveDown <= 0) ? "br00" : "br22" : "br11") + ((aBAPrams == null || aBAPrams.skipVideoCompress <= 0) ? "dr0" : "dr1") + ((aBAPrams == null || aBAPrams.isEnableHEVC != 1) ? (aBAPrams == null || aBAPrams.isEnableHEVC != 2) ? "0" : "2" : "1") + "00";
        com.tencent.mars.xlog.Log.i(TAG, "ABA: add the metadata filename: [%s] cprt [%s]", str, str2);
        tagMP4CprtChpl(str, str2, bArr, true);
        optimizeMP4VFS(str);
    }

    @java.lang.Deprecated
    public static native void blendYuvFrame(byte[] bArr, byte[] bArr2, int i17, int i18);

    public static void checkAIGCMetaData(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        lp0.b.h0("media").J();
        java.lang.String str3 = lp0.b.h0("media").u() + java.io.File.separator + java.lang.System.currentTimeMillis() + "_remove_metadata_temp";
        com.tencent.mm.vfs.w6.e(str3);
        boolean checkAIGCMetaData = checkAIGCMetaData(com.tencent.mm.vfs.w6.i(str, false), com.tencent.mm.vfs.w6.i(str2, false), com.tencent.mm.vfs.w6.i(str3, true));
        com.tencent.mars.xlog.Log.i(TAG, "checkAIGCMetaData, result:%s, input:%s, output:%s", java.lang.Boolean.valueOf(checkAIGCMetaData), str2, str3);
        if (checkAIGCMetaData) {
            com.tencent.mm.vfs.w6.w(str3, str2);
        }
        com.tencent.mm.vfs.w6.h(str3);
    }

    private static native boolean checkAIGCMetaData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    @java.lang.Deprecated
    public static native void cropCameraData(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    @java.lang.Deprecated
    public static native void cropCameraDataLongEdge(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    @java.lang.Deprecated
    public static native void cropCameraDataLongEdgeCenterCrop(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    public static native int drawFrame(int i17, android.graphics.Bitmap bitmap, int i18, android.graphics.Bitmap bitmap2, boolean z17, boolean z18);

    public static native int drawScaledFrame(int i17, android.graphics.Bitmap bitmap, int i18, int i19);

    public static native int drawSurfaceColor(android.view.Surface surface, int i17);

    public static native int drawSurfaceFrame(int i17, android.view.Surface surface, int i18, android.graphics.Bitmap bitmap, boolean z17);

    public static native int drawSurfaceThumb(android.view.Surface surface, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2);

    public static native void finishVideoEncode(int i17);

    public static native int freeAll();

    public static native int freeObj(int i17);

    public static native byte[] getAACADTSHeaderData(int i17, long j17, int i18, int i19, int i27);

    @java.lang.Deprecated
    public static native int getHeight(int i17);

    private static native byte[] getMP4Chpl(java.lang.String str);

    private static native byte[] getMP4Cprt(java.lang.String str);

    public static java.lang.String getMP4CprtH(java.lang.String str) {
        byte[] mP4Cprt;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (mP4Cprt = getMP4Cprt(kk.w.a(str, false))) != null && mP4Cprt.length > 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= mP4Cprt.length) {
                    i17 = 0;
                    break;
                }
                if (mP4Cprt[i17] == -57) {
                    break;
                }
                i17++;
            }
            com.tencent.mars.xlog.Log.i(TAG, "tagMP4Cprt, index: %s", java.lang.Integer.valueOf(i17));
            int i18 = i17 + 1;
            if (i18 < mP4Cprt.length) {
                try {
                    int length = mP4Cprt.length - i18;
                    byte[] bArr = new byte[length];
                    java.lang.System.arraycopy(mP4Cprt, i18, bArr, 0, length);
                    return new java.lang.String(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return null;
    }

    private static native byte[] getMP4RecordInfo(java.lang.String str);

    public static java.lang.String getMp4RecordInfo(java.lang.String str) {
        byte[] mP4RecordInfo;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (mP4RecordInfo = getMP4RecordInfo(kk.w.a(str, false))) != null && mP4RecordInfo.length > 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= mP4RecordInfo.length) {
                    i17 = 0;
                    break;
                }
                if (mP4RecordInfo[i17] == -60) {
                    break;
                }
                i17++;
            }
            com.tencent.mars.xlog.Log.i(TAG, "getMp4RecordInfo, index: %s", java.lang.Integer.valueOf(i17));
            int i18 = i17 + 1;
            if (i18 < mP4RecordInfo.length) {
                try {
                    int length = mP4RecordInfo.length - i18;
                    byte[] bArr = new byte[length];
                    java.lang.System.arraycopy(mP4RecordInfo, i18, bArr, 0, length);
                    return new java.lang.String(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return null;
    }

    private static native int getMp4Rotate(java.lang.String str);

    public static int getMp4RotateVFS(java.lang.String str) {
        return getMp4Rotate(kk.w.a(str, false));
    }

    public static native java.lang.String getMuxerTempVideoPath(int i17);

    private static native java.lang.String getSimpleMp4Info(java.lang.String str, boolean z17);

    public static java.lang.String getSimpleMp4InfoVFS(java.lang.String str) {
        return getSimpleMp4Info(kk.w.a(str, false), d11.o.a());
    }

    public static native long[] getSoftEncodeDtsArray(int i17);

    public static native long[] getSoftEncodePtsArray(int i17);

    public static native double getVideoDuration(int i17);

    public static native int getVideoHeight(int i17);

    public static native java.lang.String getVideoInfo(int i17);

    public static native java.lang.String getVideoMetaData(java.lang.String str);

    public static native double getVideoPlayTime(int i17);

    public static native double getVideoRate(int i17);

    public static native double getVideoStartTime(int i17);

    public static native int getVideoWidth(int i17);

    @java.lang.Deprecated
    public static native int getWidth(int i17);

    public static native int handleThumb(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3);

    public static native int initDataBufferForCapture(int i17, int i18, boolean z17, int i19, float f17, int i27, int i28, int i29, float f18, int i37, int i38, boolean z18, boolean z19, boolean z27, java.lang.String str);

    public static native int initDataBufferForHardRemux(java.lang.String str, boolean z17, boolean z18, boolean z19);

    @java.lang.Deprecated
    public static native int initDataBufferForMMSight(int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37, int i38, int i39, float f18, int i47, int i48, boolean z17, boolean z18, int i49, boolean z19, java.lang.String str, boolean z27, boolean z28, boolean z29);

    @java.lang.Deprecated
    public static int initDataBufferForMMSightLock(int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37, int i38, int i39, float f18, int i47, int i48, boolean z17, boolean z18, int i49, boolean z19, boolean z27, boolean z28) {
        int initDataBufferForMMSight;
        synchronized (MMSightLock) {
            initDataBufferForMMSight = initDataBufferForMMSight(i17, i18, i19, i27, i28, f17, i29, i37, i38, i39, f18, i47, i48, z17, z18, i49, z19, com.tencent.mm.plugin.sight.base.c.b(), z28, true, z27);
        }
        return initDataBufferForMMSight;
    }

    public static native int initDataBufferForSoftRemux(int i17, int i18, int i19, float f17, boolean z17, int i27, int i28, int i29, float f18, int i37, int i38, boolean z18, int i39, int i47, int i48, boolean z19, java.lang.String str);

    @java.lang.Deprecated
    public static native void initScaleAndRoateBuffer(int i17);

    private static native boolean isH265Video(java.lang.String str);

    public static boolean isH265VideoVFS(java.lang.String str) {
        return isH265Video(kk.w.a(str, false));
    }

    private static native int isSightOk(java.lang.String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i17);

    public static int isSightOkVFS(java.lang.String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i17) {
        return isSightOk(kk.w.a(str, false), iArr, iArr2, iArr3, iArr4, iArr5, i17);
    }

    public static native byte[] loadAACData(int i17);

    @java.lang.Deprecated
    public static native void mirrorCameraData(byte[] bArr, int i17, int i18, boolean z17);

    public static native int muxVideo(int i17, java.lang.String str, int i18, float f17, boolean z17, int i19, int i27);

    @java.lang.Deprecated
    private static native int muxing(int i17, java.lang.String str, int i18, int i19, int i27, int i28, long j17, java.lang.String str2, float f17, int i29, int i37, int i38, int i39, int i47, float f18, int i48, int i49, byte[] bArr, int i57, boolean z17, boolean z18, boolean z19, boolean z27);

    @java.lang.Deprecated
    public static int muxingLock(int i17, java.lang.String str, int i18, int i19, float f17, int i27, int i28, boolean z17, boolean z18) {
        return muxingLock(i17, null, i18, 1024, 2, i19, 0L, str, f17, i27, i28, com.tencent.mm.plugin.sight.base.d.f162406a, 8, 2, 23.0f, 0, 0, null, 0, false, z17, false, false, z18);
    }

    public static native void nativeBufferCopy(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17, int i18, int i19);

    public static native java.lang.String nativeCalcAllVideoRangeTs(java.lang.String str, double d17, long j17);

    public static native com.tencent.mm.plugin.sight.base.SightVideoJNI.VideoTSRange nativeCalcVideoRangeForTime(java.lang.String str, double d17, double d18);

    private static native int openFile(java.lang.String str, int i17, int i18, boolean z17);

    public static int openFileVFS(java.lang.String str, int i17, int i18, boolean z17) {
        return openFile(kk.w.a(str, false), i17, i18, z17);
    }

    private static native boolean optimizeMP4(java.lang.String str, java.lang.String str2);

    public static boolean optimizeMP4VFS(java.lang.String str) {
        final java.lang.String a17 = kk.w.a(str, true);
        java.lang.String str2 = a17 + ".tmp";
        boolean optimizeMP4 = optimizeMP4(a17, str2);
        if (optimizeMP4) {
            com.tencent.mm.vfs.w6.w(str2, a17);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                if (!a17.contains("/" + com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName()) && !new java.io.File(new java.io.File(a17).getParent(), ".nomedia").exists()) {
                    ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sight.base.SightVideoJNI.1
                        @Override // java.lang.Runnable
                        public void run() {
                            q75.c.h(com.tencent.mm.sdk.platformtools.x2.f193071a, a17);
                        }
                    }, 800L);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e(TAG, "optimizeMP4VFS error");
            com.tencent.mm.vfs.w6.h(str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 147L, 1L);
        }
        return optimizeMP4;
    }

    @java.lang.Deprecated
    public static native void paddingYuvData16(byte[] bArr, byte[] bArr2, int i17, int i18, int i19);

    private static native java.lang.String readMetaData(java.lang.String str, java.lang.String str2);

    public static java.lang.String readMetaDataVFS(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str2 == null) {
            return null;
        }
        return readMetaData(kk.w.a(str, false), str2);
    }

    public static native void registerALL();

    public static native void releaseBigSightDataBuffer(int i17);

    @java.lang.Deprecated
    public static void releaseBigSightDataBufferLock(int i17) {
        synchronized (MMSightLock) {
            releaseBigSightDataBuffer(i17);
        }
    }

    @java.lang.Deprecated
    public static native int releaseRecorderBuffer();

    @java.lang.Deprecated
    public static void releaseRecorderBufferRef(java.lang.String str) {
        releaseRecorderBuffer();
    }

    @java.lang.Deprecated
    public static void releaseRecorderBufferRefLock(java.lang.String str) {
        synchronized (MMSightLock) {
            releaseRecorderBuffer();
        }
    }

    @java.lang.Deprecated
    public static native void releaseScaleAndRoateBuffer(int i17);

    public static void removeVideoMetadata(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        lp0.b.h0("media").J();
        java.lang.String str2 = lp0.b.h0("media").u() + java.io.File.separator + java.lang.System.currentTimeMillis() + "_remove_metadata_temp";
        com.tencent.mm.vfs.w6.e(str2);
        boolean removeVideoMetadata = removeVideoMetadata(com.tencent.mm.vfs.w6.i(str, false), com.tencent.mm.vfs.w6.i(str2, true), z17, z18);
        com.tencent.mars.xlog.Log.i(TAG, "removeVideoMetadata, removeCreationTime:%s, removeLocation:%s, result:%s, input:%s, output:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(removeVideoMetadata), str, str2);
        if (removeVideoMetadata) {
            com.tencent.mm.vfs.w6.w(str2, str);
        }
        com.tencent.mm.vfs.w6.h(str2);
    }

    private static native boolean removeVideoMetadata(java.lang.String str, java.lang.String str2, boolean z17, boolean z18);

    private static native int remuxing(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39, java.lang.String str3, boolean z18);

    public static int remuxingVFS(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39) {
        boolean d17 = com.tencent.mm.plugin.sight.base.c.d();
        int remuxing = remuxing(kk.w.a(str, false), kk.w.a(str2, true), i17, i18, i19, i27, i28, i29, f17, f18, bArr, i37, z17, i38, i39, com.tencent.mm.plugin.sight.base.c.b(), d17);
        if (d17) {
            com.tencent.mm.plugin.sight.base.c.e(82L, 1L);
            if (remuxing < 0) {
                com.tencent.mm.plugin.sight.base.c.e(81L, 1L);
            } else {
                com.tencent.mm.plugin.sight.base.c.e(80L, 1L);
            }
        } else {
            com.tencent.mm.plugin.sight.base.c.e(85L, 1L);
            if (remuxing < 0) {
                com.tencent.mm.plugin.sight.base.c.e(84L, 1L);
            } else {
                com.tencent.mm.plugin.sight.base.c.e(83L, 1L);
            }
        }
        return remuxing;
    }

    @java.lang.Deprecated
    public static void reportIDKey(long j17, long j18, long j19) {
        try {
            jx3.f.INSTANCE.idkeyStat(j17, j18, j19, false);
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "reportIDKey jni called error", new java.lang.Object[0]);
        }
    }

    public static native void rgbaToNV21(int[] iArr, byte[] bArr, int i17, int i18);

    public static native int seekStream(double d17, int i17);

    public static native int seekStreamWithFlag(double d17, int i17, int i18);

    public static native int setCropBorder(int i17, int i18, int i19, int i27, int i28);

    public static native void setEnableVCodecEncode(int i17);

    @java.lang.Deprecated
    public static native void setI420Format(int i17, boolean z17);

    @java.lang.Deprecated
    public static native void setRotateForBufId(int i17, int i18);

    public static native void setVideoFormatHeader(int i17, java.lang.String[] strArr, int[] iArr);

    private static native int shouldRemuxing(java.lang.String str, int i17, int i18, int i19, double d17, int i27);

    public static int shouldRemuxingVFS(java.lang.String str, int i17, int i18, int i19, double d17, int i27) {
        return shouldRemuxing(kk.w.a(str, false), i17, i18, i19, d17, i27);
    }

    public static void tagMP4CprtChpl(java.lang.String str, java.lang.String str2, byte[] bArr, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byte[] bytes = str2.getBytes();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bytes.length + 2);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.put(new byte[]{21, -57});
        allocateDirect.put(bytes);
        byte[] array = allocateDirect.array();
        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(2 + bArr.length);
        allocateDirect2.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect2.put(new byte[]{85, -60});
        allocateDirect2.put(bArr);
        byte[] array2 = allocateDirect2.array();
        tagMP4CprtChpl(kk.w.a(str, false), array, array.length, array2, array2.length, z17);
        com.tencent.mars.xlog.Log.i(TAG, "tagMP4CprtInfo used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private static native void tagMP4CprtChpl(java.lang.String str, byte[] bArr, int i17, byte[] bArr2, int i18, boolean z17);

    public static void tagMP4Dscp(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || bArr == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(2 + bArr.length);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.put(new byte[]{85, -60});
        allocateDirect.put(bArr);
        byte[] array = allocateDirect.array();
        tagMP4Dscp(kk.w.a(str, false), array, array.length);
        com.tencent.mars.xlog.Log.i(TAG, "tagMP4Dscp used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private static native void tagMP4Dscp(java.lang.String str, byte[] bArr, int i17);

    private static native void tagMP4RecordInfo(java.lang.String str, byte[] bArr, int i17);

    public static void tagMp4RecordInfo(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byte[] bytes = str2.getBytes();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(2 + bytes.length);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.put(new byte[]{85, -60});
        allocateDirect.put(bytes);
        byte[] array = allocateDirect.array();
        tagMP4RecordInfo(kk.w.a(str, false), array, array.length);
        com.tencent.mars.xlog.Log.i(TAG, "tagMP4RecordInfo used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private static native int tagRotateVideo(java.lang.String str, java.lang.String str2, int i17);

    public static int tagRotateVideoVFS(java.lang.String str, java.lang.String str2, int i17) {
        return tagRotateVideo(kk.w.a(str, false), kk.w.a(str2, true), i17);
    }

    @java.lang.Deprecated
    public static native int triggerEncode(int i17, int i18, boolean z17);

    public static native void writeAACData(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17);

    @java.lang.Deprecated
    public static void writeAACDataLock(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17) {
        synchronized (MMSightLock) {
            writeAACData(i17, byteBuffer, i18, j17);
        }
    }

    public static native void writeAACDataWithADTS(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17, int i19, int i27, int i28);

    @java.lang.Deprecated
    public static void writeAACDataWithADTSLock(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17, int i19, int i27, int i28) {
        synchronized (MMSightLock) {
            writeAACDataWithADTS(i17, byteBuffer, i18, j17, i19, i27, i28);
        }
    }

    public static native void writeDtsData(int i17, long j17);

    public static native void writeH264Data(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17);

    @java.lang.Deprecated
    public static void writeH264DataLock(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17) {
        synchronized (MMSightLock) {
            writeH264Data(i17, byteBuffer, i18, j17);
        }
    }

    private static native boolean writeMetaData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public static void writeMetaDataVFS(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        lp0.b.h0("media").J();
        java.lang.String str4 = lp0.b.h0("media").u() + java.io.File.separator + java.lang.System.currentTimeMillis() + "_write_metadata_temp";
        com.tencent.mm.vfs.w6.e(str4);
        boolean writeMetaData = writeMetaData(com.tencent.mm.vfs.w6.i(str, false), com.tencent.mm.vfs.w6.i(str4, true), str2, str3);
        com.tencent.mars.xlog.Log.i(TAG, "writeMetaDataVFS, result:%s, input:%s, output:%s", java.lang.Boolean.valueOf(writeMetaData), str, str4);
        if (writeMetaData && !com.tencent.mm.vfs.w6.x(str4, str, true)) {
            com.tencent.mars.xlog.Log.e(TAG, "writeMetaDataVFS overwrite error, temp:%s, dest:%s", str4, str);
        }
        com.tencent.mm.vfs.w6.h(str4);
    }

    public static native void writeRGBDataForMMSight(int i17, java.nio.Buffer buffer, int i18, int i19, boolean z17, boolean z18, int i27, int i28);

    @java.lang.Deprecated
    public static native void writeYuvDataForMMSight(int i17, byte[] bArr, int i18, int i19, int i27, boolean z17, boolean z18, int i28, int i29);

    public static native void writeYuvDataForMMSightEncode(int i17, java.nio.Buffer buffer, int i18, int i19);

    @java.lang.Deprecated
    public static native void writeYuvDataForMMSightWithBuffer(int i17, java.nio.Buffer buffer, int i18, int i19, boolean z17, boolean z18, int i27, int i28);

    @java.lang.Deprecated
    public static int muxingLock(int i17, java.lang.String str, int i18, int i19, int i27, int i28, long j17, java.lang.String str2, float f17, int i29, int i37, int i38, int i39, int i47, float f18, int i48, int i49, byte[] bArr, int i57, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        int muxing;
        synchronized (MMSightLock) {
            boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            muxing = muxing(i17, kk.w.a(str, false), i18, i19, i27, i28, j17, kk.w.a(str2, true), f17, i29, i37, i38, i39, i47, f18, i48, i49, bArr, i57, z17, z18, z28, com.tencent.mm.plugin.sight.base.c.g());
            com.tencent.mm.plugin.sight.base.c.f(muxing, elapsedRealtime);
        }
        return muxing;
    }

    public static java.lang.String getSimpleMp4InfoVFS(java.lang.String str, boolean z17) {
        boolean a17 = d11.o.a();
        if (str == null) {
            return null;
        }
        return getSimpleMp4Info(kk.w.a(str, false), a17);
    }

    @java.lang.Deprecated
    public static int initDataBufferForMMSightLock(int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37, int i38, int i39, float f18, int i47, int i48, boolean z17, boolean z18, int i49, boolean z19) {
        int initDataBufferForMMSight;
        synchronized (MMSightLock) {
            initDataBufferForMMSight = initDataBufferForMMSight(i17, i18, i19, i27, i28, f17, i29, i37, i38, i39, f18, i47, i48, z17, z18, i49, z19, com.tencent.mm.plugin.sight.base.c.b(), com.tencent.mm.plugin.sight.base.c.c(z18, false), true, false);
        }
        return initDataBufferForMMSight;
    }
}
