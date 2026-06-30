package com.tencent.thumbplayer.tmediacodec.preload;

/* loaded from: classes14.dex */
public final class PreloadCodecManager {
    private static final java.lang.String TAG = "PreloadCodecManager";
    private boolean mIsPreloaded;

    private android.media.MediaFormat getPreloadMediaFormat(java.lang.String str) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy reusePolicy = com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().getReusePolicy();
        int i17 = reusePolicy.initWidth;
        int i18 = reusePolicy.initHeight;
        int max = java.lang.Math.max(0, com.tencent.thumbplayer.tmediacodec.util.TUtils.getCodecMaxInputSize(str, i17, i18));
        mediaFormat.setInteger("width", 1);
        mediaFormat.setInteger("height", 1);
        mediaFormat.setInteger("rotation-degrees", 0);
        mediaFormat.setInteger("max-input-size", java.lang.Math.max(max, 0));
        mediaFormat.setInteger("max-width", i17);
        mediaFormat.setInteger("max-height", i18);
        return mediaFormat;
    }

    private android.view.Surface getSurface() {
        return new com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface(1, 1).getSurface();
    }

    public static boolean isInvalidMimeType(java.lang.String str) {
        return android.text.TextUtils.equals(str, "video/avc") || android.text.TextUtils.equals(str, "video/hevc");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadCodecByMimeType(java.lang.String str) {
        android.view.Surface surface = getSurface();
        if (surface == null) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " failed...");
            return;
        }
        try {
            com.tencent.thumbplayer.tmediacodec.TMediaCodec createDecoderByType = com.tencent.thumbplayer.tmediacodec.TMediaCodec.createDecoderByType(str);
            createDecoderByType.configure(getPreloadMediaFormat(str), surface, (android.media.MediaCrypto) null, 0);
            createDecoderByType.start();
            createDecoderByType.stop();
            createDecoderByType.release();
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " surface:" + surface + " success");
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " exception...", th6);
        }
    }

    public final void preload(final java.util.Set<java.lang.String> set) {
        if (!this.mIsPreloaded) {
            com.tencent.thumbplayer.tmediacodec.util.ThreadManager.execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager.1
                @Override // java.lang.Runnable
                public void run() {
                    for (java.lang.String str : set) {
                        if (com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager.isInvalidMimeType(str)) {
                            com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager.this.preloadCodecByMimeType(str);
                        }
                    }
                }
            });
            return;
        }
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "preload codec return, for isPreload:" + this.mIsPreloaded + " apiLevel:" + android.os.Build.VERSION.SDK_INT);
    }
}
