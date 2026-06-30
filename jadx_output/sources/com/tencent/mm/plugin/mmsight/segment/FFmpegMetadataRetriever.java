package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes12.dex */
public class FFmpegMetadataRetriever {
    public static final java.lang.String METADATA_CHAPTER_COUNT = "chapter_count";
    public static final java.lang.String METADATA_KEY_ALBUM = "album";
    public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = "album_artist";
    public static final java.lang.String METADATA_KEY_ARTIST = "artist";
    public static final java.lang.String METADATA_KEY_AUDIO_CODEC = "audio_codec";
    public static final java.lang.String METADATA_KEY_CHAPTER_END_TIME = "chapter_end_time";
    public static final java.lang.String METADATA_KEY_CHAPTER_START_TIME = "chapter_start_time";
    public static final java.lang.String METADATA_KEY_COMMENT = "comment";
    public static final java.lang.String METADATA_KEY_COMPOSER = "composer";
    public static final java.lang.String METADATA_KEY_COPYRIGHT = "copyright";
    public static final java.lang.String METADATA_KEY_CREATION_TIME = "creation_time";
    public static final java.lang.String METADATA_KEY_DATE = "date";
    public static final java.lang.String METADATA_KEY_DISC = "disc";
    public static final java.lang.String METADATA_KEY_DURATION = "duration";
    public static final java.lang.String METADATA_KEY_ENCODED_BY = "encoded_by";
    public static final java.lang.String METADATA_KEY_ENCODER = "encoder";
    public static final java.lang.String METADATA_KEY_FILENAME = "filename";
    public static final java.lang.String METADATA_KEY_FILESIZE = "filesize";
    public static final java.lang.String METADATA_KEY_FRAMERATE = "framerate";
    public static final java.lang.String METADATA_KEY_GENRE = "genre";
    public static final java.lang.String METADATA_KEY_ICY_METADATA = "icy_metadata";
    public static final java.lang.String METADATA_KEY_LANGUAGE = "language";
    public static final java.lang.String METADATA_KEY_PERFORMER = "performer";
    public static final java.lang.String METADATA_KEY_PUBLISHER = "publisher";
    public static final java.lang.String METADATA_KEY_SERVICE_NAME = "service_name";
    public static final java.lang.String METADATA_KEY_SERVICE_PROVIDER = "service_provider";
    public static final java.lang.String METADATA_KEY_TITLE = "title";
    public static final java.lang.String METADATA_KEY_TRACK = "track";
    public static final java.lang.String METADATA_KEY_VARIANT_BITRATE = "bitrate";
    public static final java.lang.String METADATA_KEY_VIDEO_CODEC = "video_codec";
    public static final java.lang.String METADATA_KEY_VIDEO_HEIGHT = "video_height";
    public static final java.lang.String METADATA_KEY_VIDEO_ROTATION = "rotate";
    public static final java.lang.String METADATA_KEY_VIDEO_WIDTH = "video_width";
    public static final int OPTION_CLOSEST = 3;
    public static final int OPTION_CLOSEST_SYNC = 2;
    public static final int OPTION_NEXT_SYNC = 1;
    public static final int OPTION_PREVIOUS_SYNC = 0;
    private static final java.lang.String TAG = "FFmpegMetadataRetriever";
    private byte _hellAccFlag_;
    private long mNativeContext;
    private android.graphics.Bitmap reuse;

    static {
        native_init();
    }

    public FFmpegMetadataRetriever() {
        native_setup();
    }

    private native byte[] _getFrameAtTime(long j17, int i17);

    private native byte[] _getScaledFrameAtTime(long j17, int i17, int i18, int i19);

    private native void _setDataSource(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    private void _setDataSourceVFS(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        _setDataSource(kk.w.a(str, false), strArr, strArr2);
    }

    private android.graphics.Bitmap getBitmapFromPixels(byte[] bArr, int i17, int i18) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (i17 == -1) {
            i17 = getVideoWidth();
        }
        if (i18 == -1) {
            i18 = getVideoHeight();
        }
        if (i17 <= 0 || i18 <= 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.CHINA, "Can not get bitmap width and height [%d, %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        android.graphics.Bitmap bitmap = this.reuse;
        if (bitmap == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getBitmapFromPixels", "([BII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getBitmapFromPixels", "([BII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        }
        bitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
        return bitmap;
    }

    private native void native_finalize();

    private final native java.util.HashMap<java.lang.String, java.lang.String> native_getMetadata(boolean z17, boolean z18, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    private static native void native_init();

    private native void native_setup();

    public native java.lang.String extractMetadata(java.lang.String str);

    public native java.lang.String extractMetadataFromChapter(java.lang.String str, int i17);

    public void finalize() {
        try {
            try {
                native_finalize();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e(TAG, "do nothing");
            }
        } finally {
            super.finalize();
        }
    }

    public android.graphics.Bitmap getFrameAtTime(long j17, int i17) {
        if (i17 >= 0 && i17 <= 3) {
            byte[] _getFrameAtTime = _getFrameAtTime(j17, i17);
            if (_getFrameAtTime != null) {
                return getBitmapFromPixels(_getFrameAtTime, -1, -1);
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("Unsupported option: " + i17);
    }

    public com.tencent.mm.plugin.mmsight.segment.d getMetadata() {
        com.tencent.mm.plugin.mmsight.segment.d dVar = new com.tencent.mm.plugin.mmsight.segment.d(this);
        if (native_getMetadata(false, false, null) == null) {
            return null;
        }
        return dVar;
    }

    public android.graphics.Bitmap getScaledFrameAtTime(long j17, int i17, int i18, int i19) {
        if (i17 >= 0 && i17 <= 3) {
            byte[] _getScaledFrameAtTime = _getScaledFrameAtTime(j17, i17, i18, i19);
            if (_getScaledFrameAtTime != null) {
                return getBitmapFromPixels(_getScaledFrameAtTime, i18, i19);
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("Unsupported option: " + i17);
    }

    public byte[] getScaledFrameAtTimeUndecoded(long j17, int i17, int i18) {
        return _getScaledFrameAtTime(j17, 2, i17, i18);
    }

    public int getVideoHeight() {
        java.lang.String extractMetadata;
        try {
            java.lang.String extractMetadata2 = extractMetadata(METADATA_KEY_VIDEO_ROTATION);
            if (!"90".equals(extractMetadata2) && !"270".equals(extractMetadata2)) {
                extractMetadata = extractMetadata(METADATA_KEY_VIDEO_HEIGHT);
                return java.lang.Integer.valueOf(extractMetadata).intValue();
            }
            extractMetadata = extractMetadata(METADATA_KEY_VIDEO_WIDTH);
            return java.lang.Integer.valueOf(extractMetadata).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "can not get video height %s", e17.getMessage());
            return 0;
        }
    }

    public int getVideoRotation() {
        try {
            return java.lang.Integer.valueOf(extractMetadata(METADATA_KEY_VIDEO_ROTATION)).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "can not get video rotation. %s", e17.getMessage());
            return 0;
        }
    }

    public int getVideoWidth() {
        java.lang.String extractMetadata;
        try {
            java.lang.String extractMetadata2 = extractMetadata(METADATA_KEY_VIDEO_ROTATION);
            if (!"90".equals(extractMetadata2) && !"270".equals(extractMetadata2)) {
                extractMetadata = extractMetadata(METADATA_KEY_VIDEO_WIDTH);
                return java.lang.Integer.valueOf(extractMetadata).intValue();
            }
            extractMetadata = extractMetadata(METADATA_KEY_VIDEO_HEIGHT);
            return java.lang.Integer.valueOf(extractMetadata).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "can not get video width %s", e17.getMessage());
            return 0;
        }
    }

    public native void release();

    public void reuseBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        android.graphics.Bitmap bitmap2 = this.reuse;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.reuse = bitmap;
    }

    public native void setDataSource(java.io.FileDescriptor fileDescriptor, long j17, long j18);

    public void setDataSource(java.lang.String str) {
        _setDataSourceVFS(str, null, null);
    }

    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] strArr = new java.lang.String[map.size()];
        java.lang.String[] strArr2 = new java.lang.String[map.size()];
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            strArr[i17] = entry.getKey();
            strArr2[i17] = entry.getValue();
            i17++;
        }
        _setDataSourceVFS(str, strArr, strArr2);
    }

    public android.graphics.Bitmap getFrameAtTime(long j17) {
        byte[] _getFrameAtTime = _getFrameAtTime(j17, 2);
        if (_getFrameAtTime != null) {
            return getBitmapFromPixels(_getFrameAtTime, -1, -1);
        }
        return null;
    }

    public android.graphics.Bitmap getScaledFrameAtTime(long j17, int i17, int i18) {
        byte[] _getScaledFrameAtTime = _getScaledFrameAtTime(j17, 0, i17, i18);
        if (_getScaledFrameAtTime != null) {
            return getBitmapFromPixels(_getScaledFrameAtTime, i17, i18);
        }
        return null;
    }

    public android.graphics.Bitmap getFrameAtTime() {
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(2);
        aVar.c(-1L);
        yj0.a.d(this, aVar.b(), "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getFrameAtTime", "()Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
        zj0.c.f473285a.set(aVar);
        android.graphics.Bitmap frameAtTime = getFrameAtTime(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
        yj0.a.e(this, frameAtTime, "com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever", "getFrameAtTime", "()Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
        return frameAtTime;
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor) {
        setDataSource(fileDescriptor, 0L, 576460752303423487L);
    }

    public void setDataSource(android.content.Context context, android.net.Uri uri) {
        if (uri != null) {
            java.lang.String scheme = uri.getScheme();
            if (scheme != null && !scheme.equals("file")) {
                android.content.res.AssetFileDescriptor assetFileDescriptor = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                        if (openAssetFileDescriptor != null) {
                            java.io.FileDescriptor fileDescriptor = openAssetFileDescriptor.getFileDescriptor();
                            if (fileDescriptor.valid()) {
                                if (openAssetFileDescriptor.getDeclaredLength() < 0) {
                                    setDataSource(fileDescriptor);
                                } else {
                                    setDataSource(fileDescriptor, openAssetFileDescriptor.getStartOffset(), openAssetFileDescriptor.getDeclaredLength());
                                }
                                try {
                                    openAssetFileDescriptor.close();
                                    return;
                                } catch (java.io.IOException unused) {
                                    return;
                                }
                            }
                            throw new java.lang.IllegalArgumentException();
                        }
                        throw new java.lang.IllegalArgumentException();
                    } catch (java.io.FileNotFoundException unused2) {
                        throw new java.lang.IllegalArgumentException();
                    }
                } catch (java.lang.SecurityException unused3) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    setDataSource(uri.toString());
                    return;
                } catch (java.lang.Throwable th6) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    throw th6;
                }
            }
            setDataSource(uri.getPath());
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
