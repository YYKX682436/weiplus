package t84;

/* loaded from: classes4.dex */
public class g implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public int f416451a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f416452b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer f416453c;

    public g(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer, android.content.Context context) {
        this.f416453c = gLViewContainer;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str2;
        float f17;
        android.graphics.Bitmap bitmap;
        java.lang.String str3 = "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        boolean z18 = false;
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(1, 771);
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer2 = this.f416453c;
        java.util.Iterator it6 = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer2).iterator();
        while (it6.hasNext()) {
            t84.a aVar = (t84.a) it6.next();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr = gLViewContainer2.f163583m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            if (aVar.f416439t != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            } else {
                if (aVar.f416428i == null || aVar.f416429j == null) {
                    str = str3;
                    gLViewContainer = gLViewContainer2;
                    it = it6;
                    z17 = z18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                } else {
                    boolean z19 = aVar.f416436q;
                    if (z19) {
                        if (z19 && (bitmap = aVar.f416426g) != null && aVar.f416432m == 0) {
                            aVar.f416432m = t84.i.b(bitmap);
                        }
                        t84.c cVar = (t84.c) aVar;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetMVPMatrix", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        float[] fArr2 = new float[16];
                        float[] fArr3 = cVar.L;
                        android.opengl.Matrix.setIdentityM(fArr3, 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNormalizedTransXY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        int i17 = cVar.f416420a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f18 = -(i17 - cVar.f416422c);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        gLViewContainer = gLViewContainer2;
                        float f19 = cVar.f416437r;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f27 = f18 / f19;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        it = it6;
                        int i18 = cVar.f416421b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f28 = i18 - cVar.f416423d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f29 = cVar.f416437r;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        cVar.f416444x = f27 + cVar.h(cVar.f416442v + cVar.I);
                        cVar.f416445y = (f28 / f29) - cVar.h(cVar.f416443w + cVar.f416441J);
                        if (cVar.H) {
                            float f37 = cVar.D;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f38 = cVar.I;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            str2 = "onGetMVPMatrix";
                            float f39 = cVar.f416442v;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f47 = -((f37 - ((f38 + f39) + (cVar.f416422c / 2.0f))) + cVar.f416442v);
                            float f48 = cVar.E;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f49 = cVar.f416441J;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            str = str3;
                            float f57 = cVar.f416443w;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f58 = (f48 - ((f49 + f57) + (cVar.f416423d / 2.0f))) + cVar.f416443w;
                            cVar.F = cVar.h(f47);
                            cVar.G = cVar.h(f58);
                            f17 = 0.0f;
                        } else {
                            str = str3;
                            str2 = "onGetMVPMatrix";
                            f17 = 0.0f;
                            cVar.F = 0.0f;
                            cVar.G = 0.0f;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNormalizedTransXY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        android.opengl.Matrix.translateM(fArr3, 0, cVar.f416444x, cVar.f416445y, f17);
                        android.opengl.Matrix.rotateM(cVar.L, 0, 0.0f, 1.0f, 0.0f, 0.0f);
                        android.opengl.Matrix.rotateM(cVar.L, 0, cVar.C, 0.0f, 1.0f, 0.0f);
                        android.opengl.Matrix.translateM(fArr3, 0, -cVar.F, -cVar.G, 0.0f);
                        android.opengl.Matrix.rotateM(cVar.L, 0, cVar.B, 0.0f, 0.0f, 1.0f);
                        z17 = false;
                        android.opengl.Matrix.translateM(fArr3, 0, cVar.F, cVar.G, 0.0f);
                        android.opengl.Matrix.scaleM(fArr3, 0, cVar.f416446z, cVar.A, 1.0f);
                        android.opengl.Matrix.multiplyMM(fArr2, 0, fArr, 0, cVar.L, 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        android.opengl.GLES20.glUseProgram(aVar.f416433n);
                        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(aVar.f416433n, "aPosition");
                        aVar.f416430k = glGetAttribLocation;
                        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                        android.opengl.GLES20.glVertexAttribPointer(aVar.f416430k, 3, 5126, false, 12, (java.nio.Buffer) aVar.f416428i);
                        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(aVar.f416433n, "aTextureCoord");
                        aVar.f416431l = glGetAttribLocation2;
                        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                        android.opengl.GLES20.glVertexAttribPointer(aVar.f416431l, 2, 5126, false, 8, (java.nio.Buffer) aVar.f416429j);
                        android.opengl.GLES20.glUniformMatrix4fv(android.opengl.GLES20.glGetUniformLocation(aVar.f416433n, "uMVPMatrix"), 1, false, fArr2, 0);
                        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(aVar.f416433n, "uAlpha");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        float f59 = cVar.K;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        android.opengl.GLES20.glUniform1f(glGetUniformLocation, f59);
                        android.opengl.GLES20.glActiveTexture(33984);
                        android.opengl.GLES20.glBindTexture(3553, aVar.f416432m);
                        android.opengl.GLES20.glDrawArrays(5, 0, 4);
                        android.opengl.GLES20.glDisableVertexAttribArray(aVar.f416430k);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    }
                }
                z18 = z17;
                gLViewContainer2 = gLViewContainer;
                it6 = it;
                str3 = str;
            }
            str = str3;
            gLViewContainer = gLViewContainer2;
            it = it6;
            z17 = z18;
            z18 = z17;
            gLViewContainer2 = gLViewContainer;
            it6 = it;
            str3 = str;
        }
        java.lang.String str4 = str3;
        if (this.f416451a == 0) {
            this.f416452b = java.lang.System.currentTimeMillis();
        }
        int i19 = this.f416451a + 1;
        this.f416451a = i19;
        if (i19 == 20) {
            com.tencent.mars.xlog.Log.i("GLViewContainer", "FrameRate=" + ((this.f416451a * 1000.0f) / ((float) (java.lang.System.currentTimeMillis() - this.f416452b))));
            this.f416452b = 0L;
            this.f416451a = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrawFrame", str4);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        com.tencent.mars.xlog.Log.i("GLViewContainer", "onSurfaceChanged, w=" + i17 + ", h=" + i18);
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        float f17 = ((float) i17) / ((float) i18);
        int i19 = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.f163576p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = this.f416453c;
        float[] fArr = gLViewContainer.f163584n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.Matrix.orthoM(fArr, 0, -f17, f17, -1.0f, 1.0f, -10.0f, 10.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr2 = gLViewContainer.f163585o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr3 = gLViewContainer.f163583m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr4 = gLViewContainer.f163584n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr5 = gLViewContainer.f163585o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        gLViewContainer.f163577d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        gLViewContainer.f163578e = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        gLViewContainer.g(i17, i18);
        if (i17 != 0 && i18 != 0) {
            java.util.Iterator it = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer).iterator();
            while (it.hasNext()) {
                ((t84.a) it.next()).e(i17, i18);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceCreated", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        com.tencent.mars.xlog.Log.i("GLViewContainer", "onSurfaceCreated");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLProgramLoader");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        int glCreateShader = android.opengl.GLES20.glCreateShader(35633);
        android.opengl.GLES20.glShaderSource(glCreateShader, "attribute vec4 aPosition;attribute vec2 aTextureCoord;uniform mat4 uMVPMatrix;varying vec2 vTextureCoord;void main(){gl_Position = uMVPMatrix * aPosition;\nvTextureCoord = aTextureCoord;\n}");
        android.opengl.GLES20.glCompileShader(glCreateShader);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        int glCreateShader2 = android.opengl.GLES20.glCreateShader(35632);
        android.opengl.GLES20.glShaderSource(glCreateShader2, "precision lowp float;varying vec2 vTextureCoord;uniform float uAlpha;uniform sampler2D uTexture;void main() {gl_FragColor = texture2D(uTexture, vTextureCoord);float alpha = uAlpha;gl_FragColor.a = gl_FragColor.a * alpha;gl_FragColor.r = gl_FragColor.r * alpha;gl_FragColor.g = gl_FragColor.g * alpha;gl_FragColor.b = gl_FragColor.b * alpha;}");
        android.opengl.GLES20.glCompileShader(glCreateShader2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        com.tencent.mars.xlog.Log.i("GLProgramLoader", "loadProgram, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", progrom=" + glCreateProgram);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLProgramLoader");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.f163576p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = this.f416453c;
        gLViewContainer.f163580g = glCreateProgram;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        java.util.HashMap hashMap = gLViewContainer.f163581h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        gLViewContainer.f163579f = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        java.util.Iterator it = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer).iterator();
        while (it.hasNext()) {
            t84.a aVar = (t84.a) it.next();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            int i18 = gLViewContainer.f163580g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            aVar.d(gLViewContainer, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceCreated", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
    }
}
