package nn0;

/* loaded from: classes14.dex */
public class b implements nn0.a {
    public static final float[] T = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] U = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public qn0.e I;

    /* renamed from: J, reason: collision with root package name */
    public qn0.c f338529J;
    public final qn0.d K;
    public os0.e L;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f338531b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.FloatBuffer f338532c;

    /* renamed from: h, reason: collision with root package name */
    public int f338537h;

    /* renamed from: i, reason: collision with root package name */
    public int f338538i;

    /* renamed from: j, reason: collision with root package name */
    public int f338539j;

    /* renamed from: k, reason: collision with root package name */
    public int f338540k;

    /* renamed from: l, reason: collision with root package name */
    public int f338541l;

    /* renamed from: m, reason: collision with root package name */
    public int f338542m;

    /* renamed from: n, reason: collision with root package name */
    public int f338543n;

    /* renamed from: o, reason: collision with root package name */
    public int f338544o;

    /* renamed from: w, reason: collision with root package name */
    public boolean f338552w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f338553x;

    /* renamed from: y, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f338554y;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338530a = "CustomGLRenderImp_" + hashCode();

    /* renamed from: d, reason: collision with root package name */
    public final int f338533d = 30;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f338534e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f338535f = new android.util.SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public int f338536g = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f338545p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f338546q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f338547r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f338548s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f338549t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f338550u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f338551v = -1;

    /* renamed from: z, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f338555z = null;
    public javax.microedition.khronos.egl.EGLContext A = null;
    public javax.microedition.khronos.egl.EGLSurface B = null;
    public javax.microedition.khronos.egl.EGLContext C = null;
    public android.opengl.EGLDisplay D = null;
    public android.opengl.EGLContext E = null;
    public android.opengl.EGLSurface F = null;
    public java.lang.ref.WeakReference G = null;
    public android.opengl.EGLContext H = null;
    public final float[] M = {-1.0f, -1.0f, -1.0f, -1.0f};
    public float[] N = null;
    public int O = 0;
    public boolean P = false;
    public final int[] Q = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
    public ps0.a R = null;
    public final float[] S = {-1.0f, -1.0f, -1.0f, -1.0f};

    public b() {
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f338531b = asFloatBuffer;
        asFloatBuffer.put(T).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f338532c = asFloatBuffer2;
        asFloatBuffer2.put(U).position(0);
        this.K = new qn0.d();
    }

    public final void a() {
        if ((n(this.M) || this.f338541l == -1) && this.O <= 0 && (this.f338542m == -1 || n(this.S))) {
            android.opengl.GLES20.glDisable(3042);
        } else {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 0);
        }
    }

    public final boolean b(java.lang.String str) {
        boolean z17 = this.f338553x;
        java.lang.String str2 = this.f338530a;
        boolean z18 = false;
        if (!z17 && this.f338554y != null) {
            while (true) {
                int eglGetError = this.f338554y.eglGetError();
                if (eglGetError == 12288) {
                    break;
                }
                com.tencent.mars.xlog.Log.e(str2, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
                z18 = true;
            }
        } else {
            while (true) {
                int eglGetError2 = android.opengl.EGL14.eglGetError();
                if (eglGetError2 == 12288) {
                    break;
                }
                com.tencent.mars.xlog.Log.e(str2, str + ": EGL14 error: 0x" + java.lang.Integer.toHexString(eglGetError2));
                z18 = true;
            }
        }
        return z18;
    }

    public final int c(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.e(this.f338530a, str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
        return glGetError;
    }

    public int d(java.lang.String str, int i17) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        java.lang.String str2 = "Could not compile shader " + i17 + ":";
        java.lang.String str3 = this.f338530a;
        com.tencent.mars.xlog.Log.e(str3, str2);
        com.tencent.mars.xlog.Log.e(str3, " " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean e() {
        int d17;
        int d18 = d("uniform mat4 u_MVPMatrix;\n                            attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = u_MVPMatrix * position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", 35633);
        if (d18 == 0 || (d17 = d("varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\nuniform highp float rect[4];\nuniform highp float rect2[4];\nuniform highp float revertAlphaRect[36];\nuniform int revertCount;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n     if (textureCoordinate.x>rect[0] && textureCoordinate.x<rect[1] && textureCoordinate.y>rect[2] && textureCoordinate.y<rect[3]) gl_FragColor.a = 0.0;\n     if ((rect2[0]>=0.0 && rect2[1]>=0.0 && rect2[2]>=0.0 && rect2[3]>=0.0) && (textureCoordinate.x<rect2[0] || textureCoordinate.x>rect2[1] || textureCoordinate.y<rect2[2] || textureCoordinate.y>rect2[3])) gl_FragColor.a = 0.0;\n     if (revertCount > 0 && revertCount <= 9) {\n         gl_FragColor.a = 0.0;\n         for (int i = 0; i < revertCount; i++) {\n             if (textureCoordinate.x >= revertAlphaRect[i*4] && textureCoordinate.x <= revertAlphaRect[i*4+1] && textureCoordinate.y >= revertAlphaRect[i*4+2] && textureCoordinate.y <= revertAlphaRect[i*4+3]) {\n                 gl_FragColor.a = 1.0;\n                 break;\n             }\n         }\n     }}", 35632)) == 0) {
            return false;
        }
        this.f338536g = android.opengl.GLES20.glCreateProgram();
        if (c("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f338536g, d18);
        if (c("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f338536g, d17);
        if (c("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f338536g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f338536g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            java.lang.String str = this.f338530a;
            com.tencent.mars.xlog.Log.e(str, "Could not link program: ");
            com.tencent.mars.xlog.Log.e(str, android.opengl.GLES20.glGetProgramInfoLog(this.f338536g));
            android.opengl.GLES20.glDeleteProgram(this.f338536g);
            this.f338536g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f338536g);
        this.f338537h = android.opengl.GLES20.glGetAttribLocation(this.f338536g, "position");
        this.f338538i = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "inputImageTexture");
        this.f338540k = android.opengl.GLES20.glGetAttribLocation(this.f338536g, "inputTextureCoordinate");
        this.f338539j = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "u_MVPMatrix");
        this.f338541l = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "rect");
        this.f338542m = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "rect2");
        this.f338543n = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "revertCount");
        this.f338544o = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "revertAlphaRect");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f338537h);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f338540k);
        if (this.f338537h == -1 || this.f338538i == -1 || this.f338540k == -1 || c("AdjustResidueFilter") != 0) {
            throw new java.lang.RuntimeException("Shaders create failed");
        }
        return true;
    }

    public boolean f() {
        int d17;
        int d18 = d("uniform mat4 u_MVPMatrix;\n                            \n                                                     attribute vec4 position;\n                             attribute vec4 inputTextureCoordinate;\n               \n                                                     varying vec2 textureCoordinate;\n                      \n                                                     // The entry point for our vertex shader.\n            void main()\n                                          {\n                                                        textureCoordinate = inputTextureCoordinate.xy;\n       gl_Position = u_MVPMatrix * position;\n            }\n                                                    ", 35633);
        if (d18 == 0 || (d17 = d("varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", 35632)) == 0) {
            return false;
        }
        this.f338536g = android.opengl.GLES20.glCreateProgram();
        if (c("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f338536g, d18);
        if (c("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f338536g, d17);
        if (c("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f338536g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f338536g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            java.lang.String str = this.f338530a;
            com.tencent.mars.xlog.Log.e(str, "Could not link program: ");
            com.tencent.mars.xlog.Log.e(str, android.opengl.GLES20.glGetProgramInfoLog(this.f338536g));
            android.opengl.GLES20.glDeleteProgram(this.f338536g);
            this.f338536g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f338536g);
        this.f338537h = android.opengl.GLES20.glGetAttribLocation(this.f338536g, "position");
        this.f338538i = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "inputImageTexture");
        this.f338540k = android.opengl.GLES20.glGetAttribLocation(this.f338536g, "inputTextureCoordinate");
        this.f338539j = android.opengl.GLES20.glGetUniformLocation(this.f338536g, "u_MVPMatrix");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f338537h);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f338540k);
        if (this.f338537h == -1 || this.f338538i == -1 || this.f338540k == -1 || this.f338539j == -1 || c("AdjustResidueFilter") != 0) {
            throw new java.lang.RuntimeException("Shaders create failed");
        }
        return true;
    }

    public void g() {
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f338555z;
        if (eGLDisplay != null) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.f338554y;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.B;
            if (eGLSurface2 != null) {
                this.f338554y.eglDestroySurface(this.f338555z, eGLSurface2);
            }
            javax.microedition.khronos.egl.EGLContext eGLContext = this.A;
            if (eGLContext != null) {
                this.f338554y.eglDestroyContext(this.f338555z, eGLContext);
            }
            this.f338554y.eglTerminate(this.f338555z);
            this.B = null;
            this.f338555z = null;
        }
    }

    public void h() {
        android.opengl.EGLDisplay eGLDisplay = this.D;
        if (eGLDisplay != null) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            java.lang.ref.WeakReference weakReference = this.G;
            if (weakReference != null) {
                android.view.Surface surface = (android.view.Surface) weakReference.get();
                if (!(surface != null && surface.isValid())) {
                    com.tencent.mars.xlog.Log.i(this.f338530a, "surface is invalid");
                }
            }
            android.opengl.EGLSurface eGLSurface2 = this.F;
            if (eGLSurface2 != null) {
                android.opengl.EGL14.eglDestroySurface(this.D, eGLSurface2);
            }
            android.opengl.EGLContext eGLContext = this.E;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.D, eGLContext);
            }
            android.opengl.EGL14.eglTerminate(this.D);
            this.F = null;
            this.G = null;
            this.D = null;
        }
    }

    public void i(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i(this.f338530a, "eglSetupSurface: egl14");
        if (surface == null) {
            throw new java.lang.RuntimeException("eglSetupSurface: surface cannot be null");
        }
        if (this.D == null) {
            throw new java.lang.RuntimeException("eglSetupSurface: mEGLDisplay14 cannot be null");
        }
        if (this.F != null) {
            p();
            android.opengl.EGL14.eglDestroySurface(this.D, this.F);
            this.F = null;
            this.G = null;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.D, this.Q, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new java.lang.RuntimeException("eglSetupSurface: unable to find RGB888+recordable ES2 EGL config");
        }
        this.F = android.opengl.EGL14.eglCreateWindowSurface(this.D, eGLConfigArr[0], surface, new int[]{12344}, 0);
        if (this.P) {
            this.G = new java.lang.ref.WeakReference(surface);
        }
        if (this.F == null || b("eglSetupSurface14")) {
            h();
            throw new java.lang.RuntimeException("eglSetupSurface: create failed");
        }
    }

    public android.util.Size j() {
        boolean eglQuerySurface;
        boolean eglQuerySurface2;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        if (this.f338553x) {
            eglQuerySurface = android.opengl.EGL14.eglQuerySurface(this.D, this.F, 12375, iArr, 0);
            eglQuerySurface2 = android.opengl.EGL14.eglQuerySurface(this.D, this.F, 12374, iArr2, 0);
        } else {
            eglQuerySurface = this.f338554y.eglQuerySurface(this.f338555z, this.B, 12375, iArr);
            eglQuerySurface2 = this.f338554y.eglQuerySurface(this.f338555z, this.B, 12374, iArr2);
        }
        return (eglQuerySurface && eglQuerySurface2) ? new android.util.Size(iArr[0], iArr2[0]) : new android.util.Size(0, 0);
    }

    public void k() {
        com.tencent.mars.xlog.Log.i(this.f338530a, "initGLComponentWithoutSurface: egl14");
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.D = eglGetDisplay;
        if (this.f338555z == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("initGLComponentWithoutSurface: unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.D = null;
            throw new java.lang.RuntimeException("initGLComponentWithoutSurface: unable to initialize EGL14");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.D, this.Q, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new java.lang.RuntimeException("initGLComponentWithoutSurface: unable to find RGB888+recordable ES2 EGL config");
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.D, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.E = eglCreateContext;
        if (eglCreateContext == null || b("eglCreateContext14")) {
            h();
            throw new java.lang.RuntimeException("initGLComponentWithoutSurface: eglcontext14 create failed");
        }
        this.f338552w = true;
        this.f338553x = true;
        p();
    }

    public void l(java.lang.Object obj, android.view.Surface surface) {
        int i17;
        java.lang.String str;
        int hashCode = obj != null ? obj.hashCode() : 0;
        android.util.SparseArray sparseArray = this.f338534e;
        java.lang.Integer num = (java.lang.Integer) sparseArray.get(hashCode);
        int intValue = num != null ? num.intValue() : 0;
        int i18 = 0;
        while (true) {
            int size = sparseArray.size();
            i17 = this.f338533d;
            str = this.f338530a;
            if (i18 >= size) {
                break;
            }
            int keyAt = sparseArray.keyAt(i18);
            if (((java.lang.Integer) sparseArray.valueAt(i18)).intValue() >= i17) {
                com.tencent.mars.xlog.Log.i(str, "error report");
                android.util.SparseArray sparseArray2 = this.f338535f;
                if (sparseArray2.get(keyAt) == null || !((java.lang.Boolean) sparseArray2.get(keyAt)).booleanValue()) {
                    fn0.g gVar = fn0.g.f264195a;
                    java.lang.String msg = "over code: " + keyAt;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (fn0.g.f264196b != null) {
                        pm0.z.b(xy2.b.f458155b, "eglContextCreateFail", false, null, null, false, false, new vd2.k5(msg), 60, null);
                    }
                    sparseArray2.put(keyAt, java.lang.Boolean.TRUE);
                }
            }
            i18++;
        }
        if (intValue >= i17) {
            com.tencent.mars.xlog.Log.i(str, "initGlComponent fail, EGL_CONTEXT_CREATE_REMAINING_TIME: " + intValue);
            return;
        }
        int i19 = intValue + 1;
        sparseArray.put(hashCode, java.lang.Integer.valueOf(i19));
        if (obj instanceof android.opengl.EGLContext) {
            this.f338553x = true;
            com.tencent.mars.xlog.Log.i(str, "init use android.opengl.EGLContext: " + obj + " remaining create time: " + i19);
            android.opengl.EGLContext eGLContext = (android.opengl.EGLContext) obj;
            com.tencent.mars.xlog.Log.i(str, "init egl14");
            android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            this.D = eglGetDisplay;
            if (this.f338555z == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                throw new java.lang.RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.D = null;
                throw new java.lang.RuntimeException("unable to initialize EGL14");
            }
            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
            if (!android.opengl.EGL14.eglChooseConfig(this.D, new int[]{12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.D, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344}, 0);
            this.E = eglCreateContext;
            if (eglCreateContext == null || b("eglCreateContext14")) {
                h();
                throw new java.lang.RuntimeException("eglcontext14 create failed");
            }
            this.F = android.opengl.EGL14.eglCreateWindowSurface(this.D, eGLConfigArr[0], surface, new int[]{12344}, 0);
            if (this.P) {
                this.G = new java.lang.ref.WeakReference(surface);
            }
            if (this.F == null || b("eglCreateWindowSurface14")) {
                h();
                throw new java.lang.RuntimeException("eglsurface14 create failed");
            }
            this.H = eGLContext;
            this.f338552w = true;
            return;
        }
        if (!(obj instanceof javax.microedition.khronos.egl.EGLContext)) {
            com.tencent.mars.xlog.Log.i(str, "not support eglContext");
            this.f338552w = false;
            return;
        }
        this.f338553x = false;
        com.tencent.mars.xlog.Log.i(str, "init use javax.microedition.khronos.egl.EGLContext: " + obj + " remaining create time: " + i19);
        javax.microedition.khronos.egl.EGLContext eGLContext2 = (javax.microedition.khronos.egl.EGLContext) obj;
        com.tencent.mars.xlog.Log.i(str, "init egl");
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f338554y = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay2 = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f338555z = eglGetDisplay2;
        javax.microedition.khronos.egl.EGL10 egl102 = this.f338554y;
        if (eglGetDisplay2 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        if (!egl102.eglInitialize(eglGetDisplay2, new int[2])) {
            this.f338555z = null;
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr2 = new javax.microedition.khronos.egl.EGLConfig[1];
        if (!this.f338554y.eglChooseConfig(this.f338555z, new int[]{12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, eGLConfigArr2, 1, new int[1])) {
            throw new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        javax.microedition.khronos.egl.EGLContext eglCreateContext2 = this.f338554y.eglCreateContext(this.f338555z, eGLConfigArr2[0], eGLContext2, new int[]{12440, 2, 12344});
        this.A = eglCreateContext2;
        if (eglCreateContext2 == null || b("eglCreateContext")) {
            g();
            throw new java.lang.RuntimeException("eglcontext create failed");
        }
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f338554y.eglCreateWindowSurface(this.f338555z, eGLConfigArr2[0], surface, new int[]{12344});
        this.B = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null || b("eglCreateWindowSurface")) {
            g();
            throw new java.lang.RuntimeException("eglsurface create failed");
        }
        this.C = eGLContext2;
        this.f338552w = true;
    }

    public void m(android.content.Context context) {
        if (this.I == null) {
            this.I = new qn0.e();
        }
        if (this.f338529J == null) {
            this.f338529J = new qn0.c(context);
        }
        qn0.e eVar = this.I;
        eVar.getClass();
        float[] fArr = new float[8103];
        float[] fArr2 = new float[5402];
        short[] sArr = new short[16206];
        float f17 = 72;
        double d17 = 6.283185307179586d / f17;
        float f18 = 36;
        double d18 = 3.141592653589793d / f18;
        double d19 = 1.0f / f17;
        double d27 = 1.0f / f18;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 36; i17 <= i27; i27 = 36) {
            int i28 = 0;
            for (int i29 = 72; i28 <= i29; i29 = 72) {
                double d28 = i28;
                double d29 = d17;
                fArr2[i18 + 0] = (float) (d28 * d19);
                double d37 = d19;
                double d38 = i17;
                fArr2[i18 + 1] = (float) (d38 * d27);
                double d39 = d38 * d18;
                double d47 = (d28 * d29) - 3.141592653589793d;
                fArr[i19 + 0] = ((float) (java.lang.Math.sin(d39) * java.lang.Math.cos(d47))) * 10.0f;
                fArr[i19 + 1] = ((float) java.lang.Math.cos(d39)) * 10.0f;
                fArr[i19 + 2] = ((float) (java.lang.Math.sin(d39) * java.lang.Math.sin(d47))) * 10.0f;
                i18 += 2;
                i19 += 3;
                i28++;
                i17 = i17;
                eVar = eVar;
                d17 = d29;
                d19 = d37;
                d27 = d27;
            }
            i17++;
            d17 = d17;
        }
        qn0.e eVar2 = eVar;
        int i37 = 0;
        for (int i38 = 0; i38 < 36; i38++) {
            for (int i39 = 0; i39 < 72; i39++) {
                int i47 = (i38 * 73) + i39;
                short s17 = (short) i47;
                sArr[i37 + 0] = s17;
                int i48 = ((i38 + 1) * 73) + i39;
                sArr[i37 + 1] = (short) i48;
                short s18 = (short) (i48 + 1);
                sArr[i37 + 2] = s18;
                sArr[i37 + 3] = s18;
                sArr[i37 + 4] = (short) (i47 + 1);
                sArr[i37 + 5] = s17;
                i37 += 6;
            }
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(32412);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(21608);
        allocateDirect2.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        java.nio.ByteBuffer allocateDirect3 = java.nio.ByteBuffer.allocateDirect(32412);
        allocateDirect3.order(java.nio.ByteOrder.nativeOrder());
        java.nio.ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.position(0);
        android.util.SparseArray sparseArray = eVar2.f364930b;
        sparseArray.put(0, asShortBuffer);
        sparseArray.put(1, asShortBuffer);
        int[] iArr = eVar2.f364929a;
        iArr[0] = i37;
        iArr[1] = i37;
        android.util.SparseArray sparseArray2 = eVar2.f364931c;
        sparseArray2.put(0, asFloatBuffer2);
        sparseArray2.put(1, asFloatBuffer2);
        android.util.SparseArray sparseArray3 = eVar2.f364932d;
        sparseArray3.put(0, asFloatBuffer);
        sparseArray3.put(1, asFloatBuffer);
        qn0.c cVar = this.f338529J;
        cVar.f364902m = 0.0f;
        cVar.f364903n = 0.0f;
        android.opengl.Matrix.setIdentityM(cVar.f364895f, 0);
        android.opengl.Matrix.setIdentityM(cVar.f364892c, 0);
        android.opengl.Matrix.setLookAtM(cVar.f364893d, 0, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        cVar.f364908s = 0.0f;
        cVar.f364909t = 0.0f;
        qn0.c cVar2 = this.f338529J;
        if (cVar2.f364900k) {
            return;
        }
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        if (defaultSensor == null) {
            com.tencent.mars.xlog.Log.e("CustomVrRender.RotationControl", "registerSensor but sensorGravity is null!");
            return;
        }
        qn0.b bVar = new qn0.b(cVar2);
        cVar2.f364901l = bVar;
        com.tencent.mars.xlog.Log.i("CustomVrRender.RotationControl", "registerSensor success:" + sensorManager.registerListener(bVar, defaultSensor, 1));
        cVar2.f364900k = true;
    }

    public final boolean n(float[] fArr) {
        return fArr[0] == -1.0f && fArr[1] == -1.0f && fArr[2] == -1.0f && fArr[3] == -1.0f;
    }

    public void o() {
        javax.microedition.khronos.egl.EGL10 egl10;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay;
        if (!this.f338553x && (egl10 = this.f338554y) != null && (eGLDisplay = this.f338555z) != null) {
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.B;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
                if (b("makeCurrent")) {
                    throw new java.lang.RuntimeException("makeCurrent error");
                }
                return;
            }
        }
        android.opengl.EGLDisplay eGLDisplay2 = this.D;
        if (eGLDisplay2 != null) {
            android.opengl.EGLSurface eGLSurface2 = this.F;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.E) && b("makeCurrent14")) {
                throw new java.lang.RuntimeException("makeCurrent14 error");
            }
        }
    }

    public void p() {
        javax.microedition.khronos.egl.EGL10 egl10;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay;
        if (!this.f338553x && (egl10 = this.f338554y) != null && (eGLDisplay = this.f338555z) != null) {
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
                if (b("makeCurrentnoSurface")) {
                    throw new java.lang.RuntimeException("makeCurrentnoSurface error");
                }
                return;
            }
        }
        android.opengl.EGLDisplay eGLDisplay2 = this.D;
        if (eGLDisplay2 != null) {
            android.opengl.EGLSurface eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.E) && b("makeCurrentnoSurface14")) {
                throw new java.lang.RuntimeException("makeCurrentnoSurface14 error");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114 A[LOOP:1: B:69:0x010f->B:71:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(boolean r26, com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture r27, int r28, int r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.b.q(boolean, com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture, int, int, int, int, int, int):void");
    }

    public void r(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture, int i17, int i18, int i19) {
        qn0.c cVar = this.f338529J;
        if (cVar == null || this.I == null) {
            return;
        }
        if ((i17 == this.f338546q && i18 == this.f338547r && i19 == this.f338551v) ? false : true) {
            this.f338546q = i17;
            this.f338547r = i18;
            if (i17 > i18) {
                cVar.f364906q = i17;
                cVar.f364907r = i18;
                float min = java.lang.Math.min(java.lang.Math.max(35.0f, 20.0f), 65.0f);
                float tan = (float) java.lang.Math.tan((min / 180.0f) * 3.1415927f);
                float f17 = (i17 / i18) * tan;
                android.opengl.Matrix.frustumM(cVar.f364894e, 0, -f17, f17, -tan, tan, 1.0f, 500.0f);
                cVar.f364898i = (((float) java.lang.Math.atan(f17)) / 3.1415927f) * 180.0f;
                cVar.f364899j = min;
            } else {
                cVar.f364906q = i17;
                cVar.f364907r = i18;
                float min2 = java.lang.Math.min(java.lang.Math.max(35.0f, 20.0f), 65.0f);
                float tan2 = (float) java.lang.Math.tan((min2 / 180.0f) * 3.1415927f);
                float f18 = (i18 / i17) * tan2;
                android.opengl.Matrix.frustumM(cVar.f364894e, 0, -tan2, tan2, -f18, f18, 1.0f, 500.0f);
                cVar.f364898i = min2;
                cVar.f364899j = (((float) java.lang.Math.atan(f18)) / 3.1415927f) * 180.0f;
            }
        }
        android.util.Size j17 = j();
        android.opengl.GLES20.glViewport(0, 0, j17.getWidth(), j17.getHeight());
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        java.nio.FloatBuffer floatBuffer = (java.nio.FloatBuffer) this.I.f364932d.get(0);
        java.nio.FloatBuffer floatBuffer2 = (java.nio.FloatBuffer) this.I.f364931c.get(0);
        if (floatBuffer2 == null || floatBuffer == null) {
            return;
        }
        floatBuffer.position(0);
        floatBuffer2.position(0);
        qn0.c cVar2 = this.f338529J;
        float min3 = java.lang.Math.min(cVar2.f364903n, 90.0f - cVar2.f364908s);
        cVar2.f364903n = min3;
        float max = java.lang.Math.max(min3, (-90.0f) - cVar2.f364908s);
        cVar2.f364903n = max;
        float f19 = (-cVar2.f364908s) + (-max);
        float f27 = (-cVar2.f364909t) + (-cVar2.f364902m);
        android.opengl.Matrix.setLookAtM(cVar2.f364893d, 0, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        android.opengl.Matrix.rotateM(cVar2.f364893d, 0, f19, 0.0f, 0.0f, 1.0f);
        android.opengl.Matrix.rotateM(cVar2.f364893d, 0, f27, 0.0f, 1.0f, 0.0f);
        float tan3 = (float) java.lang.Math.tan((java.lang.Math.min(java.lang.Math.max(cVar2.f364899j * cVar2.f364904o, 20.0f), 65.0f) / 180.0f) * 3.1415927f);
        float f28 = (cVar2.f364906q / cVar2.f364907r) * tan3;
        android.opengl.Matrix.frustumM(cVar2.f364894e, 0, -f28, f28, -tan3, tan3, 1.0f, 500.0f);
        android.opengl.Matrix.multiplyMM(cVar2.f364891b, 0, cVar2.f364893d, 0, cVar2.f364892c, 0);
        android.opengl.Matrix.multiplyMM(cVar2.f364890a, 0, cVar2.f364894e, 0, cVar2.f364891b, 0);
        float[] fArr = cVar2.f364890a;
        if (fArr == null) {
            return;
        }
        android.opengl.GLES20.glUseProgram(this.f338536g);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f338537h);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f338540k);
        android.opengl.GLES20.glVertexAttribPointer(this.f338537h, 3, 5126, false, 0, (java.nio.Buffer) floatBuffer);
        android.opengl.GLES20.glVertexAttribPointer(this.f338540k, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glUniformMatrix4fv(this.f338539j, 1, false, fArr, 0);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, tXLiteAVTexture.textureId);
        android.opengl.GLES20.glUniform1i(this.f338538i, 0);
        if (((java.nio.ShortBuffer) this.I.f364930b.get(0)) != null) {
            ((java.nio.ShortBuffer) this.I.f364930b.get(0)).position(0);
            qn0.e eVar = this.I;
            eVar.getClass();
            android.opengl.GLES20.glDrawElements(4, eVar.f364929a[0], 5123, (java.nio.ShortBuffer) this.I.f364930b.get(0));
        } else {
            qn0.e eVar2 = this.I;
            eVar2.getClass();
            android.opengl.GLES20.glDrawArrays(4, 0, eVar2.f364929a[0]);
        }
        android.opengl.GLES20.glDisableVertexAttribArray(this.f338537h);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f338540k);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public void s(android.graphics.RectF rectF) {
        if (rectF != null) {
            float f17 = rectF.left;
            float[] fArr = this.M;
            fArr[0] = f17;
            fArr[1] = rectF.right;
            fArr[2] = rectF.top;
            fArr[3] = rectF.bottom;
        }
    }

    public void t(android.graphics.RectF rectF) {
        boolean isEmpty = rectF.isEmpty();
        float[] fArr = this.S;
        if (isEmpty) {
            fArr[0] = -1.0f;
            fArr[1] = -1.0f;
            fArr[2] = -1.0f;
            fArr[3] = -1.0f;
            return;
        }
        fArr[0] = rectF.left;
        fArr[1] = rectF.right;
        fArr[2] = rectF.top;
        fArr[3] = rectF.bottom;
    }

    public void u(android.graphics.RectF[] rectFArr) {
        int i17;
        if (rectFArr == null || rectFArr.length == 0) {
            this.O = 0;
            this.N = null;
        } else {
            this.O = rectFArr.length;
            this.N = new float[36];
            for (int i18 = 0; i18 < rectFArr.length; i18++) {
                int i19 = i18 * 4;
                float[] fArr = this.N;
                if (i19 < fArr.length && (i17 = i19 + 3) < fArr.length) {
                    android.graphics.RectF rectF = rectFArr[i18];
                    fArr[i19] = rectF.left;
                    fArr[i19 + 1] = rectF.right;
                    fArr[i19 + 2] = rectF.top;
                    fArr[i17] = rectF.bottom;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(this.f338530a, "setRevertAlphaRect mRevertAlphaRect = " + this.N + " mRevertAlphaRectLength = " + this.O);
    }

    public void v(boolean z17) {
        qn0.c cVar = this.f338529J;
        if (cVar != null) {
            cVar.f364896g = z17;
            return;
        }
        qn0.d dVar = this.K;
        if (dVar != null) {
            dVar.f364910a = z17;
        }
    }

    public boolean w(java.lang.Object obj) {
        javax.microedition.khronos.egl.EGLContext eGLContext;
        android.opengl.EGLContext eGLContext2;
        if ((obj instanceof android.opengl.EGLContext) && (eGLContext2 = this.H) != null) {
            return !eGLContext2.equals(obj);
        }
        if (!(obj instanceof javax.microedition.khronos.egl.EGLContext) || (eGLContext = this.C) == null) {
            return true;
        }
        return !eGLContext.equals(obj);
    }

    public boolean x() {
        android.opengl.EGLDisplay eGLDisplay;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay2;
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        if (this.f338553x) {
            android.opengl.EGLSurface eGLSurface2 = this.F;
            if (eGLSurface2 == null || (eGLDisplay = this.D) == null) {
                return false;
            }
            return android.opengl.EGL14.eglSwapBuffers(eGLDisplay, eGLSurface2);
        }
        javax.microedition.khronos.egl.EGL10 egl10 = this.f338554y;
        if (egl10 == null || (eGLDisplay2 = this.f338555z) == null || (eGLSurface = this.B) == null) {
            return false;
        }
        return egl10.eglSwapBuffers(eGLDisplay2, eGLSurface);
    }

    public void y() {
        java.lang.String str = "uninitGlComponent mIsEGL14 = " + this.f338553x + " mEGL = " + this.f338554y;
        java.lang.String str2 = this.f338530a;
        com.tencent.mars.xlog.Log.i(str2, str);
        this.f338534e.clear();
        this.f338535f.clear();
        ps0.a aVar = this.R;
        if (aVar != null) {
            ((go0.w1) aVar).b();
            this.R = null;
        }
        os0.e eVar = this.L;
        if (eVar != null) {
            eVar.n();
            this.R = null;
        }
        if (this.f338553x || this.f338554y == null) {
            try {
                p();
                int i17 = this.f338536g;
                if (i17 != 0) {
                    android.opengl.GLES20.glDeleteProgram(i17);
                    this.f338536g = 0;
                }
                h();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e(str2, "uninitGlComponent14 error");
            }
        } else {
            try {
                p();
                int i18 = this.f338536g;
                if (i18 != 0) {
                    android.opengl.GLES20.glDeleteProgram(i18);
                    this.f338536g = 0;
                }
                g();
                this.f338554y = null;
            } catch (java.lang.Exception unused2) {
                com.tencent.mars.xlog.Log.e(str2, "uninitGlComponent error");
            }
        }
        this.C = null;
        this.H = null;
        this.f338552w = false;
        com.tencent.mars.xlog.Log.i(str2, "uninitGLComponet isEGL14:" + this.f338553x);
    }

    public void z(android.content.Context context) {
        qn0.c cVar = this.f338529J;
        if (cVar == null || !cVar.f364900k) {
            return;
        }
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        android.hardware.SensorEventListener sensorEventListener = cVar.f364901l;
        if (sensorEventListener != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        cVar.f364900k = false;
    }
}
