package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class g6 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 implements android.hardware.SensorEventListener {
    public float[] A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public android.hardware.SensorManager f165208s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ProgressBar f165209t;

    /* renamed from: u, reason: collision with root package name */
    public android.hardware.Sensor f165210u;

    /* renamed from: v, reason: collision with root package name */
    public android.hardware.Sensor f165211v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f165212w;

    /* renamed from: x, reason: collision with root package name */
    public int f165213x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.HorizontalScrollView f165214y;

    /* renamed from: z, reason: collision with root package name */
    public float[] f165215z;

    public g6(android.content.Context context, ab4.w wVar, android.view.ViewGroup viewGroup) {
        super(context, wVar, viewGroup);
        this.B = true;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (t() >= ((int) (x().getHeight() * 0.1f))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSwapCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSwapCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            jSONObject.put("swipeCount", 0);
            if (!this.B) {
                java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(O().imgeUrl);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("urlMd5", a17);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("imgUrlInfo", jSONObject2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        this.f165208s.registerListener(this, this.f165210u, 1);
        this.f165208s.registerListener(this, this.f165211v, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        this.f165208s.unregisterListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    public final ab4.w O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        ab4.w wVar = (ab4.w) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        return wVar;
    }

    public void P(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return;
        }
        if (this.f165212w == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the imageView is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return;
        }
        if (bitmap.getHeight() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp.getHeight is 0!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return;
        }
        this.f165209t.setVisibility(8);
        this.f165212w.setImageBitmap(bitmap);
        this.f165212w.post(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f6(this));
        if (bitmap.getHeight() != 0) {
            int i17 = O().f2824n != 2.1474836E9f ? (int) O().f2824n : this.f165059q;
            this.f165212w.setLayoutParams(new android.widget.RelativeLayout.LayoutParams((bitmap.getWidth() * i17) / bitmap.getHeight(), i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        android.view.View view = this.f165056n;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        this.f165208s = sensorManager;
        this.f165210u = sensorManager.getDefaultSensor(1);
        this.f165211v = this.f165208s.getDefaultSensor(2);
        this.f165214y = (android.widget.HorizontalScrollView) view.findViewById(com.tencent.mm.R.id.f482559hr);
        this.f165212w = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482560hs);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.lc6);
        this.f165209t = progressBar;
        progressBar.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (!com.tencent.mm.vfs.w6.j(za4.t0.l("adId", O().imgeUrl))) {
            this.B = false;
        }
        java.lang.String str = O().imgeUrl;
        android.graphics.Bitmap h17 = za4.t0.h(str);
        if (h17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "loaded cached image with  " + str);
            P(h17);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            this.f165209t.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            za4.t0.c(str, false, O().f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e6(this, str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (sensorEvent.sensor.getType() == 1) {
            this.f165215z = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.A = sensorEvent.values;
        }
        float[] fArr2 = this.f165215z;
        if (fArr2 != null && (fArr = this.A) != null) {
            float[] fArr3 = new float[9];
            if (android.hardware.SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
                float[] fArr4 = new float[3];
                android.hardware.SensorManager.getOrientation(fArr3, fArr4);
                float f17 = fArr4[2];
                int i17 = this.f165213x;
                if (i17 != 0) {
                    if (f17 > 10.0f) {
                        f17 = 10.0f;
                    }
                    if (f17 < -10.0f) {
                        f17 = -10.0f;
                    }
                    this.f165214y.scrollBy((int) ((i17 * f17) / 10.0f), 0);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        return com.tencent.mm.R.layout.cp_;
    }
}
