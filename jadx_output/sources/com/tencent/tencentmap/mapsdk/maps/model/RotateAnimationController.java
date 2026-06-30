package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class RotateAnimationController {
    private com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel mAnimatorModel;
    private double[] mDistances;
    private long mDuration;
    private com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection mEarthMercatorProjection;
    private com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.a mIValueAnimatorStrategy;
    private final float mInitRotate;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng[] mLatLngs;
    private com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType mModelType;
    private android.animation.AnimatorSet mRotateAnimatorSet;
    private final boolean mRotateEnabled;
    private double mSumDistance;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f215368a;

        static {
            int[] iArr = new int[com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType.values().length];
            f215368a = iArr;
            try {
                iArr[com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType.MODEL_OVERLAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface a {
        android.animation.ValueAnimator a(float f17, float f18);

        double[] a();
    }

    public RotateAnimationController(com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel iAnimatorModel, long j17, com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.ModelType modelType, boolean z17, float f17, com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr, double[] dArr, double d17, com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection sphericalMercatorProjection) {
        this.mRotateEnabled = z17;
        this.mInitRotate = f17;
        if (z17) {
            this.mAnimatorModel = iAnimatorModel;
            this.mDuration = j17;
            this.mModelType = modelType;
            this.mRotateAnimatorSet = new android.animation.AnimatorSet();
            this.mLatLngs = latLngArr;
            this.mDistances = dArr;
            this.mSumDistance = d17;
            this.mEarthMercatorProjection = sphericalMercatorProjection;
            initValueAnimatorStrategy();
            initRotateAnimation();
        }
    }

    private double calculateAngle(double d17, double d18, double d19, double d27) {
        double sqrt = ((d17 * d19) + (d18 * d27)) / (java.lang.Math.sqrt((d17 * d17) + (d18 * d18)) * java.lang.Math.sqrt((d19 * d19) + (d27 * d27)));
        if (java.lang.Double.isNaN(sqrt)) {
            return 0.0d;
        }
        if (sqrt < -1.0d) {
            sqrt = -1.0d;
        }
        if (sqrt > 1.0d) {
            sqrt = 1.0d;
        }
        double acos = (java.lang.Math.acos(sqrt) * 180.0d) / 3.141592653589793d;
        if ((d17 * d27) - (d18 * d19) > 0.0d) {
            acos = -acos;
        }
        return (float) acos;
    }

    private long calculateDelay(int i17, int i18) {
        double d17 = 0.0d;
        while (i17 < i18) {
            d17 += this.mDistances[i17];
            i17++;
        }
        return (long) ((this.mDuration * d17) / this.mSumDistance);
    }

    private android.animation.ValueAnimator createRotateAnimator(float f17, float f18, long j17, long j18) {
        com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.a aVar = this.mIValueAnimatorStrategy;
        float f19 = this.mInitRotate;
        android.animation.ValueAnimator a17 = aVar.a(f17 + f19, f18 + f19);
        a17.setDuration(j17);
        a17.setStartDelay(j18);
        a17.setInterpolator(new android.view.animation.LinearInterpolator());
        a17.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
                if (com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.this.mAnimatorModel == null) {
                    return;
                }
                com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.this.mAnimatorModel.setRotation((float) parseDouble);
            }
        });
        return a17;
    }

    private void initRotateAnimation() {
        int i17;
        long j17;
        float f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float f18 = 0.0f;
        int i18 = 0;
        int i19 = 1;
        int i27 = 0;
        long j18 = 0;
        while (true) {
            java.lang.Object[] objArr = this.mLatLngs;
            if (i19 >= objArr.length) {
                this.mRotateAnimatorSet.playSequentially(arrayList);
                return;
            }
            if (objArr[i27].equals(objArr[i19])) {
                i17 = i19;
            } else {
                com.tencent.tencentmap.mapsdk.maps.model.transform.Point point = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i18]);
                com.tencent.tencentmap.mapsdk.maps.model.transform.Point point2 = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i27]);
                com.tencent.tencentmap.mapsdk.maps.model.transform.Point point3 = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i19]);
                double d17 = point2.f215371x;
                double d18 = d17 - point.f215371x;
                float f19 = f18;
                double d19 = point.f215372y;
                int i28 = i18;
                double d27 = point2.f215372y;
                int i29 = i19;
                int i37 = i27;
                float calculateAngle = (float) calculateAngle(d18, d19 - d27, point3.f215371x - d17, d27 - point3.f215372y);
                if (arrayList.size() == 0) {
                    com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel iAnimatorModel = this.mAnimatorModel;
                    if (iAnimatorModel == null) {
                        return;
                    }
                    float rotation = iAnimatorModel.getRotation();
                    double[] a17 = this.mIValueAnimatorStrategy.a();
                    i17 = i29;
                    calculateAngle = ((float) calculateAngle(a17[0], a17[1], point3.f215371x - point2.f215371x, point2.f215372y - point3.f215372y)) - rotation;
                    f17 = rotation;
                    j17 = 0;
                } else {
                    i17 = i29;
                    long abs = (long) ((this.mDuration * (((java.lang.Math.abs(calculateAngle) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.mSumDistance);
                    j18 = calculateDelay(i28, i37) - (abs / 2);
                    j17 = abs;
                    f17 = f19;
                }
                float f27 = f17 + calculateAngle;
                arrayList.add(createRotateAnimator(f17, f27, j17, j18));
                f18 = f27;
                i18 = i37;
                i27 = i17;
            }
            i19 = i17 + 1;
        }
    }

    private void initValueAnimatorStrategy() {
        this.mIValueAnimatorStrategy = new com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.a() { // from class: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.1
            @Override // com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.a
            public final android.animation.ValueAnimator a(float f17, float f18) {
                if (com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.AnonymousClass3.f215368a[com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.this.mModelType.ordinal()] != 1) {
                    return android.animation.ValueAnimator.ofFloat(f17, f18);
                }
                return android.animation.ValueAnimator.ofFloat(f17 * (-1.0f), f18 * (-1.0f));
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.a
            public final double[] a() {
                double[] dArr = {0.0d, 1.0d};
                int[] iArr = com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.AnonymousClass3.f215368a;
                com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.this.mModelType.ordinal();
                return dArr;
            }
        };
    }

    public void cancelAnimation() {
        if (this.mRotateEnabled) {
            this.mRotateAnimatorSet.cancel();
        }
    }

    public void endAnimation() {
        if (this.mRotateEnabled) {
            this.mRotateAnimatorSet.end();
        }
    }

    public void startAnimation() {
        if (this.mRotateEnabled && !this.mRotateAnimatorSet.isRunning()) {
            this.mRotateAnimatorSet.start();
        }
    }
}
