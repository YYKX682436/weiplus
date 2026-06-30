package hi3;

/* loaded from: classes10.dex */
public class c implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: x, reason: collision with root package name */
    public static final float[] f281511x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y, reason: collision with root package name */
    public static float[] f281512y = {-1.0f, -0.5f, 1.0f, -0.5f, -1.0f, 0.5f, 1.0f, 0.5f};

    /* renamed from: z, reason: collision with root package name */
    public static final float[] f281513z = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f281521h;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.ByteBuffer f281522i;

    /* renamed from: j, reason: collision with root package name */
    public int f281523j;

    /* renamed from: k, reason: collision with root package name */
    public int f281524k;

    /* renamed from: l, reason: collision with root package name */
    public int f281525l;

    /* renamed from: m, reason: collision with root package name */
    public int f281526m;

    /* renamed from: n, reason: collision with root package name */
    public int f281527n;

    /* renamed from: o, reason: collision with root package name */
    public int f281528o;

    /* renamed from: p, reason: collision with root package name */
    public int f281529p;

    /* renamed from: q, reason: collision with root package name */
    public int f281530q;

    /* renamed from: r, reason: collision with root package name */
    public java.nio.FloatBuffer f281531r;

    /* renamed from: s, reason: collision with root package name */
    public java.nio.FloatBuffer f281532s;

    /* renamed from: a, reason: collision with root package name */
    public int f281514a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f281515b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f281516c = false;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f281517d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f281518e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f281519f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f281520g = 0;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f281533t = new float[16];

    /* renamed from: u, reason: collision with root package name */
    public boolean f281534u = false;

    /* renamed from: v, reason: collision with root package name */
    public float[] f281535v = f281511x;

    /* renamed from: w, reason: collision with root package name */
    public boolean f281536w = false;

    public c() {
        android.graphics.Point j17 = ai3.d.j();
        float f17 = (j17.x / j17.y) / 2.0f;
        float f18 = -f17;
        f281512y = new float[]{-1.0f, f18, 1.0f, f18, -1.0f, f17, 1.0f, f17};
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0009, B:8:0x000d, B:12:0x0015, B:14:0x0021, B:16:0x0045, B:17:0x004e, B:19:0x0052, B:20:0x004a, B:21:0x005c, B:23:0x0060, B:25:0x0064), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(byte[] r3, int r4, int r5, int r6, boolean r7) {
        /*
            r2 = this;
            int r0 = r2.f281519f     // Catch: java.lang.Exception -> L7a
            r1 = 0
            if (r0 != r5) goto L14
            int r0 = r2.f281518e     // Catch: java.lang.Exception -> L7a
            if (r0 != r4) goto L14
            int r0 = r2.f281520g     // Catch: java.lang.Exception -> L7a
            if (r0 != r6) goto L14
            boolean r0 = r2.f281536w     // Catch: java.lang.Exception -> L7a
            if (r0 == r7) goto L12
            goto L14
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = 1
        L15:
            r2.f281517d = r3     // Catch: java.lang.Exception -> L7a
            r2.f281518e = r4     // Catch: java.lang.Exception -> L7a
            r2.f281519f = r5     // Catch: java.lang.Exception -> L7a
            r2.f281520g = r6     // Catch: java.lang.Exception -> L7a
            r2.f281536w = r7     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L5c
            int r6 = r5 * r4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r6)     // Catch: java.lang.Exception -> L7a
            r2.f281521h = r0     // Catch: java.lang.Exception -> L7a
            int r6 = r6 / 2
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)     // Catch: java.lang.Exception -> L7a
            r2.f281522i = r6     // Catch: java.lang.Exception -> L7a
            java.nio.ByteBuffer r6 = r2.f281521h     // Catch: java.lang.Exception -> L7a
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Exception -> L7a
            r6.order(r0)     // Catch: java.lang.Exception -> L7a
            java.nio.ByteBuffer r6 = r2.f281522i     // Catch: java.lang.Exception -> L7a
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Exception -> L7a
            r6.order(r0)     // Catch: java.lang.Exception -> L7a
            if (r7 != 0) goto L4a
            float[] r6 = hi3.c.f281511x     // Catch: java.lang.Exception -> L7a
            r2.f281535v = r6     // Catch: java.lang.Exception -> L7a
            goto L4e
        L4a:
            float[] r6 = hi3.c.f281512y     // Catch: java.lang.Exception -> L7a
            r2.f281535v = r6     // Catch: java.lang.Exception -> L7a
        L4e:
            float[] r6 = r2.f281535v     // Catch: java.lang.Exception -> L7a
            if (r6 == 0) goto L5c
            java.nio.FloatBuffer r7 = r2.f281531r     // Catch: java.lang.Exception -> L7a
            r7.put(r6)     // Catch: java.lang.Exception -> L7a
            java.nio.FloatBuffer r6 = r2.f281531r     // Catch: java.lang.Exception -> L7a
            r6.position(r1)     // Catch: java.lang.Exception -> L7a
        L5c:
            java.nio.ByteBuffer r6 = r2.f281521h     // Catch: java.lang.Exception -> L7a
            if (r6 == 0) goto L8b
            java.nio.ByteBuffer r7 = r2.f281522i     // Catch: java.lang.Exception -> L7a
            if (r7 == 0) goto L8b
            int r4 = r4 * r5
            r6.put(r3, r1, r4)     // Catch: java.lang.Exception -> L7a
            java.nio.ByteBuffer r5 = r2.f281521h     // Catch: java.lang.Exception -> L7a
            r5.position(r1)     // Catch: java.lang.Exception -> L7a
            java.nio.ByteBuffer r5 = r2.f281522i     // Catch: java.lang.Exception -> L7a
            int r6 = r4 / 2
            r5.put(r3, r4, r6)     // Catch: java.lang.Exception -> L7a
            java.nio.ByteBuffer r3 = r2.f281522i     // Catch: java.lang.Exception -> L7a
            r3.position(r1)     // Catch: java.lang.Exception -> L7a
            goto L8b
        L7a:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "MicroMsg.MMSightCameraGLRenderer"
            java.lang.String r5 = "setDrawFrame error: %s"
            com.tencent.mars.xlog.Log.e(r4, r5, r3)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hi3.c.a(byte[], int, int, int, boolean):void");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        this.f281516c = true;
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        if (this.f281534u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLRenderer", "clearFrameRequest");
            this.f281534u = false;
            this.f281516c = false;
            this.f281517d = null;
            this.f281518e = -1;
            this.f281519f = -1;
            return;
        }
        int i17 = this.f281525l;
        if (i17 != 0 && this.f281523j != -1 && this.f281524k != -1 && this.f281518e > 0 && this.f281519f > 0 && this.f281517d != null) {
            android.opengl.GLES20.glUseProgram(i17);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, this.f281523j);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6409, this.f281518e, this.f281519f, 0, 6409, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f281521h);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f281528o, 0);
            android.opengl.GLES20.glActiveTexture(33985);
            android.opengl.GLES20.glBindTexture(3553, this.f281524k);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6410, this.f281518e / 2, this.f281519f / 2, 0, 6410, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f281522i);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f281529p, 1);
            float[] fArr = this.f281533t;
            android.opengl.Matrix.setIdentityM(fArr, 0);
            android.opengl.Matrix.setRotateM(this.f281533t, 0, this.f281520g, 0.0f, 0.0f, -1.0f);
            android.opengl.GLES20.glUniformMatrix4fv(this.f281530q, 1, false, fArr, 0);
            this.f281531r.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f281527n, 2, 5126, false, 0, (java.nio.Buffer) this.f281531r);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f281527n);
            this.f281532s.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f281526m, 2, 5126, false, 0, (java.nio.Buffer) this.f281532s);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f281526m);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f281527n);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f281526m);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
        this.f281516c = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this);
        if (i17 == this.f281514a && i18 == this.f281515b) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        this.f281514a = i17;
        this.f281515b = i18;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", this);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glDisable(2929);
        int c17 = com.tencent.mm.plugin.api.recordView.e.c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f281525l = c17;
        if (c17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
        }
        this.f281527n = android.opengl.GLES20.glGetAttribLocation(this.f281525l, "a_position");
        this.f281526m = android.opengl.GLES20.glGetAttribLocation(this.f281525l, "a_texCoord");
        this.f281528o = android.opengl.GLES20.glGetUniformLocation(this.f281525l, "y_texture");
        this.f281529p = android.opengl.GLES20.glGetUniformLocation(this.f281525l, "uv_texture");
        this.f281530q = android.opengl.GLES20.glGetUniformLocation(this.f281525l, "uMatrix");
        this.f281523j = com.tencent.mm.plugin.api.recordView.e.a();
        this.f281524k = com.tencent.mm.plugin.api.recordView.e.a();
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(this.f281535v.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f281531r = asFloatBuffer;
        asFloatBuffer.put(this.f281535v);
        this.f281531r.position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f281532s = asFloatBuffer2;
        asFloatBuffer2.put(f281513z);
        this.f281532s.position(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", java.lang.Integer.valueOf(this.f281523j), java.lang.Integer.valueOf(this.f281524k), this);
    }
}
