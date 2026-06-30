package com.tencent.tav.extractor.wrapper;

/* loaded from: classes16.dex */
public class ExtractorWrapper {
    private long duration;
    private long lastUpdateTime;
    private int preferRotation;
    private java.lang.String videoPath;
    private com.tencent.tav.coremedia.CGSize videoSize;

    public ExtractorWrapper(java.lang.String str) {
        this.videoPath = str;
    }

    private boolean exit() {
        return !android.text.TextUtils.isEmpty(this.videoPath) && new java.io.File(this.videoPath).exists();
    }

    private void loadWith(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        this.duration = assetExtractor.getDuration();
        this.videoSize = assetExtractor.getSize();
        this.preferRotation = assetExtractor.getPreferRotation();
        this.lastUpdateTime = new java.io.File(this.videoPath).lastModified();
    }

    private boolean needReload() {
        return this.lastUpdateTime != new java.io.File(this.videoPath).lastModified();
    }

    public void checkAndLoad(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        if (exit() && needReload()) {
            loadWith(assetExtractor);
        }
    }

    public long getDuration() {
        return this.duration;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public java.lang.String getVideoPath() {
        return this.videoPath;
    }

    public com.tencent.tav.coremedia.CGSize getVideoSize() {
        return this.videoSize;
    }
}
