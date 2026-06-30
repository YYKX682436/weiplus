package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class TileOverlayOptions {
    public static final int MAX_DATA_LEVEL = 20;
    public static final int MAX_VISIBLE_LEVEL = 22;
    public static final int MIN_DATA_LEVEL = 3;
    private volatile java.lang.String mDiskCacheDir;
    private int mMaxMemoryCacheSize;
    private com.tencent.tencentmap.mapsdk.maps.model.TileProvider mTileProvider;
    private volatile java.lang.String mVersionInfo;
    private int mZIndex = 1;
    private int mMinDataLevel = 3;
    private int mMaxDataLevel = 18;
    private int mMinVisibleLevel = 3;
    private int mMaxVisibleLevel = 18;
    private boolean mDisplayHD = true;
    private boolean mReuseTile = false;
    private int mLevelOffset = 1;

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions betterQuality(boolean z17) {
        displayHD(z17);
        if (!z17) {
            levelOffset(0);
        }
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions dataLevelRange(int i17, int i18) {
        if (i17 >= 3 && i17 <= java.lang.Math.max(i18, 20)) {
            this.mMinDataLevel = i17;
        }
        if (i18 <= 20 && i18 >= java.lang.Math.max(3, i17)) {
            this.mMaxDataLevel = i18;
        }
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions diskCacheDir(java.lang.String str) {
        this.mDiskCacheDir = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions displayHD(boolean z17) {
        this.mDisplayHD = z17;
        return this;
    }

    public final java.lang.String getDiskCacheDir() {
        return this.mDiskCacheDir;
    }

    public final int getLevelOffset() {
        return this.mLevelOffset;
    }

    public final int getMaxDataLevel() {
        return this.mMaxDataLevel;
    }

    public final int getMaxMemoryCacheSize(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        int i17 = this.mMaxMemoryCacheSize;
        return i17 == 0 ? tencentMapContext.getScreenPixels() * 4 : i17;
    }

    public final int getMaxVisibleLevel() {
        return this.mMaxVisibleLevel;
    }

    public final int getMinDataLevel() {
        return this.mMinDataLevel;
    }

    public final int getMinVisibleLevel() {
        return this.mMinVisibleLevel;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileProvider getTileProvider() {
        return this.mTileProvider;
    }

    public final java.lang.String getVersionInfo() {
        return this.mVersionInfo;
    }

    public final int getZIndex() {
        return this.mZIndex;
    }

    public final boolean isBetterQuality() {
        return isDisplayHD();
    }

    public final boolean isDisplayHD() {
        return this.mDisplayHD;
    }

    public final boolean isReuseTile() {
        return this.mReuseTile;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions levelOffset(int i17) {
        if (i17 < -2) {
            i17 = -2;
        }
        if (i17 > 2) {
            i17 = 2;
        }
        this.mLevelOffset = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions maxMemoryCacheSize(int i17) {
        this.mMaxMemoryCacheSize = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions reuseTile(boolean z17) {
        this.mReuseTile = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileProvider(com.tencent.tencentmap.mapsdk.maps.model.TileProvider tileProvider) {
        this.mTileProvider = tileProvider;
        return this;
    }

    public final java.lang.String toString() {
        return "TileOverlayOptions{mTileProvider=" + this.mTileProvider + ", mDiskCacheDir='" + this.mDiskCacheDir + "', mVersionInfo='" + this.mVersionInfo + "', mZIndex=" + this.mZIndex + ", mMinDataLevel=" + this.mMinDataLevel + ", mMaxDataLevel=" + this.mMaxDataLevel + ", mDisplayHD=" + this.mDisplayHD + ", mReuseTile=" + this.mReuseTile + ", mMaxMemoryCacheSize=" + this.mMaxMemoryCacheSize + ", mLevelOffset=" + this.mLevelOffset + '}';
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions versionInfo(java.lang.String str) {
        this.mVersionInfo = str;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions visibleLevelRange(int i17, int i18) {
        if (i17 >= 3 && i17 <= java.lang.Math.max(i18, 22)) {
            this.mMinVisibleLevel = i17;
        }
        if (i18 <= 22 && i18 >= java.lang.Math.max(3, i17)) {
            this.mMaxVisibleLevel = i18;
        }
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions zIndex(int i17) {
        this.mZIndex = i17;
        return this;
    }
}
