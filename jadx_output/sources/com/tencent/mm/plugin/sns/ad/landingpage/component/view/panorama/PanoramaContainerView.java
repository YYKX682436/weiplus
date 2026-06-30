package com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/component/view/panorama/PanoramaContainerView;", "Landroid/widget/FrameLayout;", "Landroid/hardware/SensorEventListener;", "", "imageWidth", "Ljz5/f0;", "setImageCenterToViewport", "Landroid/graphics/Bitmap;", "bmp", "setImageBitmap", "", "q", "Z", "getShouldResponseTouchEvent", "()Z", "setShouldResponseTouchEvent", "(Z)V", "shouldResponseTouchEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class PanoramaContainerView extends android.widget.FrameLayout implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f163034d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f163035e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.HorizontalScrollView f163036f;

    /* renamed from: g, reason: collision with root package name */
    public int f163037g;

    /* renamed from: h, reason: collision with root package name */
    public int f163038h;

    /* renamed from: i, reason: collision with root package name */
    public final android.hardware.SensorManager f163039i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163040m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f163041n;

    /* renamed from: o, reason: collision with root package name */
    public float[] f163042o;

    /* renamed from: p, reason: collision with root package name */
    public int f163043p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean shouldResponseTouchEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PanoramaContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final /* synthetic */ void a(com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        panoramaContainerView.setImageCenterToViewport(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    private final void setImageCenterToViewport(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.HorizontalScrollView horizontalScrollView = this.f163036f;
        if (horizontalScrollView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        int i18 = this.f163038h;
        if (i17 > i18) {
            int i19 = (i17 - i18) / 2;
            this.f163043p = i19;
            horizontalScrollView.scrollBy(i19, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    public final void b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoadingProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.ProgressBar progressBar = this.f163035e;
        if (progressBar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        if (z17) {
            progressBar.setVisibility(0);
        } else {
            progressBar.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    public final boolean getShouldResponseTouchEvent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        boolean z17 = this.shouldResponseTouchEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        return z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        com.tencent.mars.xlog.Log.i("SnsAd.PanoramaView", "the onAccuracyChanged is called, accuracy is " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        super.onFinishInflate();
        this.f163036f = (android.widget.HorizontalScrollView) findViewById(com.tencent.mm.R.id.n5c);
        this.f163034d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.n5a);
        this.f163035e = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.n5b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        boolean onInterceptTouchEvent = this.shouldResponseTouchEvent ? super.onInterceptTouchEvent(motionEvent) : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        return onInterceptTouchEvent;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.HorizontalScrollView horizontalScrollView = this.f163036f;
        if (horizontalScrollView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        if ((sensorEvent != null ? sensorEvent.sensor : null) != null) {
            if ((sensorEvent != null ? sensorEvent.values : null) != null) {
                if (sensorEvent.sensor.getType() == 1) {
                    this.f163041n = sensorEvent.values;
                }
                if (sensorEvent.sensor.getType() == 2) {
                    this.f163042o = sensorEvent.values;
                }
                float[] fArr2 = this.f163041n;
                if (fArr2 != null && (fArr = this.f163042o) != null) {
                    float[] fArr3 = new float[9];
                    if (android.hardware.SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
                        float[] fArr4 = new float[3];
                        android.hardware.SensorManager.getOrientation(fArr3, fArr4);
                        float f17 = fArr4[2];
                        if (this.f163043p != 0) {
                            horizontalScrollView.scrollBy((int) java.lang.Math.rint((this.f163043p * (java.lang.Float.min(java.lang.Math.abs(f17), 10.0f) * java.lang.Math.signum(f17))) / 10.0f), 0);
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    public final void setImageBitmap(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.ImageView imageView = this.f163034d;
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        int i17 = this.f163037g;
        jz5.f0 f0Var = null;
        if (bitmap == null) {
            imageView.setImageBitmap(null);
        } else {
            imageView.setImageBitmap(bitmap);
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            f0Var2.f310116d = bitmap.getWidth();
            if (i17 > 0 && bitmap.getHeight() > 0 && bitmap.getHeight() != i17) {
                int ceil = (int) java.lang.Math.ceil(((bitmap.getWidth() * i17) * 1.0f) / bitmap.getHeight());
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i17;
                    layoutParams.width = ceil;
                    imageView.requestLayout();
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(ceil, i17));
                }
                f0Var2.f310116d = ceil;
            }
            imageView.addOnLayoutChangeListener(new j54.a(f0Var2, imageView, this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    public final void setShouldResponseTouchEvent(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        this.shouldResponseTouchEvent = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanoramaContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.shouldResponseTouchEvent = true;
        java.lang.Object systemService = context.getSystemService("sensor");
        this.f163039i = systemService instanceof android.hardware.SensorManager ? (android.hardware.SensorManager) systemService : null;
    }
}
