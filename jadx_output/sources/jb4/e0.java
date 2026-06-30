package jb4;

/* loaded from: classes14.dex */
public class e0 implements jb4.n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f298786a;

    /* renamed from: b, reason: collision with root package name */
    public int f298787b;

    /* renamed from: c, reason: collision with root package name */
    public int f298788c;

    /* renamed from: d, reason: collision with root package name */
    public int f298789d;

    /* renamed from: e, reason: collision with root package name */
    public int f298790e;

    /* renamed from: g, reason: collision with root package name */
    public int f298792g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.FloatBuffer f298793h;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.FloatBuffer f298794i;

    /* renamed from: j, reason: collision with root package name */
    public int f298795j;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f298791f = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public float f298796k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f298797l = 90.0f;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f298798m = new float[16];

    /* renamed from: n, reason: collision with root package name */
    public final float[] f298799n = new float[16];

    /* renamed from: o, reason: collision with root package name */
    public float f298800o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f298801p = 20.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f298802q = 0.0f;

    public e0(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        this.f298786a = context;
        java.lang.String str5 = "SphereImageView.SphereRender";
        java.lang.String str6 = com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT;
        java.lang.String str7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 50;
            float f17 = 50;
            double d17 = 6.283185307179586d / f17;
            double d18 = 1.0f / f17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i18 = 0;
            while (i18 < i17) {
                int i19 = 0;
                while (i19 < i17) {
                    str = str6;
                    str2 = str7;
                    double d19 = i18;
                    int i27 = i18;
                    float f18 = (float) (d19 * d18);
                    long j17 = currentTimeMillis;
                    double d27 = i19;
                    java.lang.String str8 = str5;
                    float f19 = (float) (d27 * d18);
                    double d28 = i27 + 1;
                    float f27 = (float) (d28 * d18);
                    int i28 = i19 + 1;
                    double d29 = i28;
                    str4 = str8;
                    float f28 = (float) (d29 * d18);
                    try {
                        arrayList2.add(java.lang.Float.valueOf(f19));
                        arrayList2.add(java.lang.Float.valueOf(f18));
                        arrayList2.add(java.lang.Float.valueOf(f19));
                        arrayList2.add(java.lang.Float.valueOf(f27));
                        arrayList2.add(java.lang.Float.valueOf(f28));
                        arrayList2.add(java.lang.Float.valueOf(f27));
                        arrayList2.add(java.lang.Float.valueOf(f28));
                        arrayList2.add(java.lang.Float.valueOf(f27));
                        arrayList2.add(java.lang.Float.valueOf(f28));
                        arrayList2.add(java.lang.Float.valueOf(f18));
                        arrayList2.add(java.lang.Float.valueOf(f19));
                        arrayList2.add(java.lang.Float.valueOf(f18));
                        double d37 = (d19 * d17) / 2.0d;
                        double d38 = d27 * d17;
                        double d39 = d18;
                        float sin = (float) (java.lang.Math.sin(d37) * java.lang.Math.cos(d38));
                        float sin2 = (float) (java.lang.Math.sin(d37) * java.lang.Math.sin(d38));
                        float cos = (float) java.lang.Math.cos(d37);
                        double d47 = (d28 * d17) / 2.0d;
                        float sin3 = (float) (java.lang.Math.sin(d47) * java.lang.Math.cos(d38));
                        float sin4 = (float) (java.lang.Math.sin(d47) * java.lang.Math.sin(d38));
                        float cos2 = (float) java.lang.Math.cos(d47);
                        double d48 = d29 * d17;
                        double d49 = d17;
                        float sin5 = (float) (java.lang.Math.sin(d47) * java.lang.Math.cos(d48));
                        java.util.ArrayList arrayList3 = arrayList2;
                        float sin6 = (float) (java.lang.Math.sin(d47) * java.lang.Math.sin(d48));
                        float cos3 = (float) java.lang.Math.cos(d47);
                        float sin7 = (float) (java.lang.Math.sin(d37) * java.lang.Math.cos(d48));
                        float sin8 = (float) (java.lang.Math.sin(d48) * java.lang.Math.sin(d37));
                        float cos4 = (float) java.lang.Math.cos(d37);
                        arrayList.add(java.lang.Float.valueOf(sin));
                        arrayList.add(java.lang.Float.valueOf(cos));
                        arrayList.add(java.lang.Float.valueOf(sin2));
                        arrayList.add(java.lang.Float.valueOf(sin3));
                        arrayList.add(java.lang.Float.valueOf(cos2));
                        arrayList.add(java.lang.Float.valueOf(sin4));
                        arrayList.add(java.lang.Float.valueOf(sin5));
                        arrayList.add(java.lang.Float.valueOf(cos3));
                        arrayList.add(java.lang.Float.valueOf(sin6));
                        arrayList.add(java.lang.Float.valueOf(sin5));
                        arrayList.add(java.lang.Float.valueOf(cos3));
                        arrayList.add(java.lang.Float.valueOf(sin6));
                        arrayList.add(java.lang.Float.valueOf(sin7));
                        arrayList.add(java.lang.Float.valueOf(cos4));
                        arrayList.add(java.lang.Float.valueOf(sin8));
                        arrayList.add(java.lang.Float.valueOf(sin));
                        arrayList.add(java.lang.Float.valueOf(cos));
                        arrayList.add(java.lang.Float.valueOf(sin2));
                        str6 = str;
                        arrayList2 = arrayList3;
                        str7 = str2;
                        i18 = i27;
                        currentTimeMillis = j17;
                        str5 = str4;
                        i19 = i28;
                        d18 = d39;
                        d17 = d49;
                        i17 = 50;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = str4;
                        com.tencent.mars.xlog.Log.e(str3, "init, exp:" + th.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                    }
                }
                i18++;
                currentTimeMillis = currentTimeMillis;
                i17 = 50;
            }
            str4 = str5;
            str = str6;
            str2 = str7;
            long j18 = currentTimeMillis;
            java.util.ArrayList arrayList4 = arrayList2;
            int size = arrayList.size() / 3;
            try {
                this.f298792g = size;
                int i29 = size * 2;
                float[] fArr = new float[i29];
                for (int i37 = 0; i37 < i29; i37++) {
                    fArr[i37] = ((java.lang.Float) arrayList4.get(i37)).floatValue();
                }
                java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(i29 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                this.f298794i = asFloatBuffer;
                asFloatBuffer.put(fArr);
                this.f298794i.position(0);
                int i38 = this.f298792g * 3;
                float[] fArr2 = new float[i38];
                for (int i39 = 0; i39 < i38; i39++) {
                    fArr2[i39] = ((java.lang.Float) arrayList.get(i39)).floatValue();
                }
                java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(i38 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                this.f298793h = asFloatBuffer2;
                asFloatBuffer2.put(fArr2);
                this.f298793h.position(0);
                str3 = str4;
                try {
                    com.tencent.mars.xlog.Log.i(str3, "init, timeCost=" + (java.lang.System.currentTimeMillis() - j18));
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    com.tencent.mars.xlog.Log.e(str3, "init, exp:" + th.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                str3 = str4;
                com.tencent.mars.xlog.Log.e(str3, "init, exp:" + th.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            str = com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT;
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender";
            str3 = "SphereImageView.SphereRender";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            android.opengl.Matrix.rotateM(this.f298798m, 0, -this.f298796k, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.rotateM(this.f298798m, 0, -this.f298797l, 0.0f, 1.0f, 0.0f);
            android.opengl.Matrix.rotateM(this.f298798m, 0, -0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            android.opengl.GLES20.glClear(16640);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, this.f298795j);
            int i17 = this.f298789d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getfinalMVPMatrix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            android.opengl.Matrix.multiplyMM(this.f298799n, 0, this.f298791f, 0, this.f298798m, 0);
            android.opengl.Matrix.setIdentityM(this.f298798m, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getfinalMVPMatrix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            android.opengl.GLES20.glUniformMatrix4fv(i17, 1, false, this.f298799n, 0);
            android.opengl.GLES20.glDrawArrays(4, 0, this.f298792g);
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
    }

    public void b(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        long currentTimeMillis;
        float[] fArr = this.f298791f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "onSurfaceChanged, w=" + i17 + ", h=" + i18 + "， textureID=" + this.f298795j + ", near=" + this.f298800o + ", far=" + this.f298801p + ", z=" + this.f298802q);
            currentTimeMillis = java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SphereImageView.SphereRender", "onSurfaceChanged, exp=" + th6.toString());
        }
        if (i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            return;
        }
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        android.opengl.GLES20.glEnable(2884);
        float f17 = i17 / i18;
        android.opengl.Matrix.frustumM(this.f298791f, 0, -f17, f17, -1.0f, 1.0f, this.f298800o, this.f298801p);
        android.opengl.Matrix.setIdentityM(this.f298798m, 0);
        android.opengl.Matrix.setIdentityM(this.f298799n, 0);
        android.opengl.Matrix.translateM(fArr, 0, 0.0f, 0.0f, this.f298802q);
        android.opengl.Matrix.scaleM(fArr, 0, 4.0f, 4.0f, 4.0f);
        int a17 = jb4.f0.a(this.f298786a);
        this.f298787b = a17;
        android.opengl.GLES20.glUseProgram(a17);
        this.f298788c = android.opengl.GLES20.glGetAttribLocation(this.f298787b, "aPosition");
        this.f298789d = android.opengl.GLES20.glGetUniformLocation(this.f298787b, "uProjectMatrix");
        this.f298790e = android.opengl.GLES20.glGetAttribLocation(this.f298787b, "aTextureCoord");
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "aPosition:" + this.f298788c);
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "uProjectMatrix:" + this.f298789d);
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "aTextureCoord:" + this.f298790e);
        android.opengl.GLES20.glVertexAttribPointer(this.f298788c, 3, 5126, false, 0, (java.nio.Buffer) this.f298793h);
        android.opengl.GLES20.glVertexAttribPointer(this.f298790e, 2, 5126, false, 0, (java.nio.Buffer) this.f298794i);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f298788c);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f298790e);
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "onSurfaceChanged, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
    }
}
