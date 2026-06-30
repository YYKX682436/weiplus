package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class GeneralTranslateAnimator extends com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator {
    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener> mAnimatorEndListeners;
    private final com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel mAnimatorModel;
    private double[] mDistances;
    private com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection mEarthMercatorProjection;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng[] mLatLngs;
    private com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController mRotateAnimationController;
    private double mSumDistance;

    /* loaded from: classes13.dex */
    public static class Builder {
        private final com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel animatorModel;
        private final long duration;
        private final com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngs;
        private boolean rotateEnabled = false;
        private float initRotate = 0.0f;
        private com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType modelType = com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType.MARKER_OVERLAY;

        public Builder(com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel iAnimatorModel, long j17, com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr) {
            this.animatorModel = iAnimatorModel;
            this.duration = j17;
            this.latLngs = latLngArr;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator build() {
            return new com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator(this);
        }

        public com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.Builder initRotate(float f17) {
            this.initRotate = f17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.Builder modelType(com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType modelType) {
            this.modelType = modelType;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.Builder rotateEnabled(boolean z17) {
            this.rotateEnabled = z17;
            return this;
        }
    }

    /* loaded from: classes13.dex */
    public enum ModelType {
        MARKER_OVERLAY,
        MODEL_OVERLAY
    }

    public GeneralTranslateAnimator(com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.Builder builder) {
        super(builder.animatorModel, builder.duration);
        this.mAnimatorModel = builder.animatorModel;
        if (builder.latLngs == null || builder.latLngs.length <= 0 || builder.duration < 0) {
            return;
        }
        this.mLatLngs = builder.latLngs;
        this.mAnimatorEndListeners = new java.util.ArrayList();
        this.mEarthMercatorProjection = new com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mDistances = new double[this.mLatLngs.length - 1];
        int i17 = 0;
        while (true) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = this.mLatLngs;
            if (i17 >= latLngArr.length - 1) {
                break;
            }
            int i18 = i17 + 1;
            this.mDistances[i17] = this.mEarthMercatorProjection.distanceBetween(latLngArr[i17], latLngArr[i18]);
            this.mSumDistance += this.mDistances[i17];
            i17 = i18;
        }
        for (int i19 = 0; i19 < this.mLatLngs.length - 1; i19++) {
            arrayList.add(createSegmentAnimator(i19));
        }
        getAnimatorSet().playSequentially(arrayList);
        this.mRotateAnimationController = new com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController(builder.animatorModel, builder.duration, builder.modelType, builder.rotateEnabled, builder.initRotate, this.mLatLngs, this.mDistances, this.mSumDistance, this.mEarthMercatorProjection);
    }

    public void addAnimatorEndListener(com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener iAnimatorEndListener) {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener> list = this.mAnimatorEndListeners;
        if (list == null || list.contains(iAnimatorEndListener) || iAnimatorEndListener == null) {
            return;
        }
        this.mAnimatorEndListeners.add(iAnimatorEndListener);
        addAnimationListener();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator
    public void cancelAnimation() {
        super.cancelAnimation();
        if (this.mRotateAnimationController == null) {
            return;
        }
        synchronized (this) {
            this.mRotateAnimationController.cancelAnimation();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator
    public android.animation.ValueAnimator createSegmentAnimator(final int i17) {
        final com.tencent.tencentmap.mapsdk.maps.model.transform.Point point = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i17]);
        final com.tencent.tencentmap.mapsdk.maps.model.transform.Point point2 = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i17 + 1]);
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration((long) ((getDuration() * this.mDistances[i17]) / this.mSumDistance));
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setFloatValues((float) this.mDistances[i17]);
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                if (point.equals(point2)) {
                    return;
                }
                double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator2.getAnimatedValue()));
                double d17 = point.f215371x;
                double d18 = d17 + (((point2.f215371x - d17) * parseDouble) / com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.this.mDistances[i17]);
                double d19 = point.f215372y;
                double d27 = d19 + (((point2.f215372y - d19) * parseDouble) / com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.this.mDistances[i17]);
                if (com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.this.mAnimatorModel == null) {
                    return;
                }
                com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.this.mAnimatorModel.setPosition(com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.this.mEarthMercatorProjection.toLatLng(new com.tencent.tencentmap.mapsdk.maps.model.transform.Point(d18, d27)));
            }
        });
        return valueAnimator;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator
    public void endAnimation() {
        super.endAnimation();
        if (this.mRotateAnimationController == null) {
            return;
        }
        synchronized (this) {
            this.mRotateAnimationController.endAnimation();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator
    public void innerAnimationEnd() {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener> list = this.mAnimatorEndListeners;
        if (list == null) {
            return;
        }
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimatorEnd();
        }
    }

    public void removeAnimatorEndListener(com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener iAnimatorEndListener) {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener> list = this.mAnimatorEndListeners;
        if (list == null) {
            return;
        }
        list.remove(iAnimatorEndListener);
        removeAnimationListener();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator
    public void startAnimation() {
        super.startAnimation();
        if (this.mRotateAnimationController == null) {
            return;
        }
        synchronized (this) {
            this.mRotateAnimationController.startAnimation();
        }
    }
}
