package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class MarkerTextStyle {
    private final com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition[] candidatePositions;
    private final int color;
    private final int effect;
    private final float fontSize;
    private final int haloColor;
    private final float haloSize;
    private final boolean hideWhenAvoidFailed;
    private final float iconSpace;

    /* loaded from: classes13.dex */
    public static class Builder {
        private com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition[] candidatePositions = {com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition.BOTTOM, com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition.LEFT, com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition.RIGHT, com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition.TOP};
        private int color = -13421773;
        private float fontSize = 12.0f;
        private float haloSize = 1.0f;
        private int haloColor = -1;
        private float iconSpace = 2.0f;
        private int effect = 0;
        private boolean hideWhenAvoidFailed = true;

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle build() {
            return new com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle(this);
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder candidatePositions(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition... markerTextPositionArr) {
            if (markerTextPositionArr != null) {
                this.candidatePositions = markerTextPositionArr;
            }
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder color(int i17) {
            this.color = i17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder effect(int i17) {
            this.effect = i17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder fontSize(float f17) {
            this.fontSize = f17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder haloColor(int i17) {
            this.haloColor = i17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder haloSize(float f17) {
            this.haloSize = java.lang.Math.min(java.lang.Math.max(f17, 0.0f), 3.0f);
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder hideWhenAvoidFailed(boolean z17) {
            this.hideWhenAvoidFailed = z17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder iconSpace(float f17) {
            this.iconSpace = f17;
            return this;
        }
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition[] getCandidatePositions() {
        return this.candidatePositions;
    }

    public int getColor() {
        return this.color;
    }

    public int getEffect() {
        return this.effect;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public int getHaloColor() {
        return this.haloColor;
    }

    public float getHaloSize() {
        return this.haloSize;
    }

    public float getIconSpace() {
        return this.iconSpace;
    }

    public boolean isHideWhenAvoidFailed() {
        return this.hideWhenAvoidFailed;
    }

    private MarkerTextStyle(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder builder) {
        this.candidatePositions = builder.candidatePositions;
        this.color = builder.color;
        this.fontSize = builder.fontSize;
        this.haloSize = builder.haloSize;
        this.haloColor = builder.haloColor;
        this.iconSpace = builder.iconSpace;
        this.effect = builder.effect;
        this.hideWhenAvoidFailed = builder.hideWhenAvoidFailed;
    }
}
