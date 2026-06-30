package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class VectorHeatOverlayOptions extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private int[] mColors;
    private float mGap;
    private com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] mNodes;
    private double[] mStartPoints;
    private int mType = 0;
    private float mSize = 2000.0f;
    private float mOpacity = 1.0f;
    private boolean mVisibility = true;
    private int mMinZoom = 3;
    private int mMaxZoom = 22;
    private double mMinIntensity = 0.0d;
    private double mMaxIntensity = 2000.0d;
    private double mMaxHeight = 2000.0d;
    private double mMinHeight = 0.0d;
    private boolean mDraw3D = false;
    private boolean mRangeFlag = false;
    private int mAnimateDuration = 5000;
    private boolean mAnimate = false;

    /* loaded from: classes6.dex */
    public enum VectorHeatOverlayType {
        HoneyComb,
        Square
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions animate(boolean z17) {
        this.mAnimate = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions colors(int[] iArr) {
        this.mColors = iArr;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions draw3D(boolean z17) {
        this.mDraw3D = z17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions gap(float f17) {
        this.mGap = f17;
        return this;
    }

    public final int getAnimateTime() {
        return this.mAnimateDuration;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final float getGap() {
        return this.mGap;
    }

    public final double getMaxHeight() {
        return this.mMaxHeight;
    }

    public final double getMaxIntensity() {
        return this.mMaxIntensity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return this.mMaxZoom;
    }

    public final double getMinHeight() {
        return this.mMinHeight;
    }

    public final double getMinIntensity() {
        return this.mMinIntensity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return this.mMinZoom;
    }

    public final com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] getNodes() {
        return this.mNodes;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return this.mOpacity;
    }

    public final boolean getRangeFlag() {
        return this.mRangeFlag;
    }

    public final float getSize() {
        return this.mSize;
    }

    public final double[] getStartPoints() {
        return this.mStartPoints;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions.VectorHeatOverlayType getType() {
        return com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions.VectorHeatOverlayType.values()[this.mType];
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions heightRange(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.mMinHeight = 0.0d;
            this.mMaxHeight = 2000.0d;
        } else {
            this.mMaxHeight = d18;
            this.mMinHeight = d17;
        }
        return this;
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    public final boolean isDraw3D() {
        return this.mDraw3D;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return this.mVisibility;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions nodes(com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] weightedLatLngArr) {
        this.mNodes = weightedLatLngArr;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions setAnimateTime(int i17) {
        this.mAnimateDuration = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions showRange(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.mMinIntensity = 0.0d;
            this.mMaxIntensity = 2000.0d;
            this.mRangeFlag = false;
        } else {
            this.mMaxIntensity = d18;
            this.mMinIntensity = d17;
            this.mRangeFlag = true;
        }
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions size(float f17) {
        this.mSize = f17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions startPoints(double[] dArr) {
        this.mStartPoints = dArr;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider
    public final java.lang.String toString() {
        return "VectorHeatOverlayOptions{mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + ", mClickEnabled=" + this.mClickEnabled + ", onVectorOverlayLoadlistener=" + this.onVectorOverlayLoadlistener + ", onVectorOverlayClickListener=" + this.onVectorOverlayClickListener + ", mType=" + this.mType + ", mNodes=" + java.util.Arrays.toString(this.mNodes) + ", mSize=" + this.mSize + ", mGap=" + this.mGap + ", mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mColors=" + java.util.Arrays.toString(this.mColors) + ", mStartPoints=" + java.util.Arrays.toString(this.mStartPoints) + ", mMinIntensity=" + this.mMinIntensity + ", mMaxIntensity=" + this.mMaxIntensity + ", mMaxHeight=" + this.mMaxHeight + ", mMinHeight=" + this.mMinHeight + ", mDraw3D=" + this.mDraw3D + ", mRangeFlag=" + this.mRangeFlag + ", mAnimateDuration=" + this.mAnimateDuration + ", mAnimate=" + this.mAnimate + '}';
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions type(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions.VectorHeatOverlayType vectorHeatOverlayType) {
        this.mType = vectorHeatOverlayType.ordinal();
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions maxZoom(int i17) {
        this.mMaxZoom = i17;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions minZoom(int i17) {
        this.mMinZoom = i17;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions opacity(float f17) {
        this.mOpacity = f17;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions visibility(boolean z17) {
        this.mVisibility = z17;
        return this;
    }
}
