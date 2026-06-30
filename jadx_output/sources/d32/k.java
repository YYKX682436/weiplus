package d32;

/* loaded from: classes10.dex */
public final class k implements android.opengl.GLSurfaceView.Renderer {
    public int A;
    public is0.c B;
    public is0.c C;
    public final java.nio.FloatBuffer D;
    public final java.nio.FloatBuffer E;
    public final java.nio.FloatBuffer F;
    public final float[] G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.nio.ByteBuffer f226161J;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f226162a;

    /* renamed from: b, reason: collision with root package name */
    public final t85.j f226163b;

    /* renamed from: c, reason: collision with root package name */
    public int f226164c;

    /* renamed from: d, reason: collision with root package name */
    public int f226165d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f226166e;

    /* renamed from: f, reason: collision with root package name */
    public is0.c f226167f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f226168g;

    /* renamed from: h, reason: collision with root package name */
    public is0.c f226169h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f226170i;

    /* renamed from: j, reason: collision with root package name */
    public int f226171j;

    /* renamed from: k, reason: collision with root package name */
    public int f226172k;

    /* renamed from: l, reason: collision with root package name */
    public int f226173l;

    /* renamed from: m, reason: collision with root package name */
    public int f226174m;

    /* renamed from: n, reason: collision with root package name */
    public int f226175n;

    /* renamed from: o, reason: collision with root package name */
    public int f226176o;

    /* renamed from: p, reason: collision with root package name */
    public int f226177p;

    /* renamed from: q, reason: collision with root package name */
    public int f226178q;

    /* renamed from: r, reason: collision with root package name */
    public int f226179r;

    /* renamed from: s, reason: collision with root package name */
    public int f226180s;

    /* renamed from: t, reason: collision with root package name */
    public int f226181t;

    /* renamed from: u, reason: collision with root package name */
    public int f226182u;

    /* renamed from: v, reason: collision with root package name */
    public int f226183v;

    /* renamed from: w, reason: collision with root package name */
    public int f226184w;

    /* renamed from: x, reason: collision with root package name */
    public int f226185x;

    /* renamed from: y, reason: collision with root package name */
    public int f226186y;

    /* renamed from: z, reason: collision with root package name */
    public p05.l4 f226187z;

    public k(boolean z17, t85.j jVar) {
        this.f226162a = z17;
        this.f226163b = jVar;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.D = asFloatBuffer;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.E = asFloatBuffer2;
        this.F = java.nio.ByteBuffer.allocateDirect(8).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.G = new float[16];
        this.I = true;
        this.f226161J = java.nio.ByteBuffer.allocate(this.f226164c * this.f226165d * 4);
    }

    public final void a(boolean z17) {
        is0.c cVar = this.B;
        if (cVar == null || this.C == null) {
            return;
        }
        int i17 = this.A;
        int i18 = cVar != null ? cVar.f294395e : 0;
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, 640, 640, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i18, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glViewport(0, 0, 640, 640);
        is0.c cVar2 = this.f226167f;
        java.nio.FloatBuffer floatBuffer = this.E;
        java.nio.FloatBuffer floatBuffer2 = this.D;
        if (cVar2 != null) {
            android.opengl.GLES20.glUseProgram(this.f226183v);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(36197, cVar2.f294395e);
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f226186y, 0);
            floatBuffer2.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f226184w, 2, 5126, false, 0, (java.nio.Buffer) this.D);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f226184w);
            floatBuffer.position(0);
            floatBuffer.put(d32.c.f226139d);
            floatBuffer.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f226185x, 2, 5126, false, 0, (java.nio.Buffer) this.E);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f226185x);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f226184w);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f226185x);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindTexture(36197, 0);
            android.opengl.GLES20.glFinish();
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glViewport(0, 0, 640, 640);
        p05.l4 l4Var = this.f226187z;
        if (l4Var != null) {
            is0.c cVar3 = this.B;
            rh0.d0.b(l4Var, cVar3 != null ? cVar3.f294395e : 0, false, 0, false, 14, null);
        }
        if (this.I) {
            this.I = false;
            p05.l4 l4Var2 = this.f226187z;
            if (l4Var2 != null) {
                is0.c cVar4 = this.B;
                rh0.d0.b(l4Var2, cVar4 != null ? cVar4.f294395e : 0, false, 0, false, 14, null);
            }
        }
        is0.c cVar5 = this.C;
        if (cVar5 != null) {
            is0.c.b(cVar5, 640, 640, 0, null, 0, 0, 60, null);
        }
        p05.l4 l4Var3 = this.f226187z;
        if (l4Var3 != null) {
            is0.c cVar6 = this.B;
            int i19 = cVar6 != null ? cVar6.f294395e : 0;
            is0.c cVar7 = this.C;
            rh0.d0.c(l4Var3, i19, cVar7 != null ? cVar7.f294395e : 0, 0L, 0, false, false, false, 124, null);
        }
        is0.c cVar8 = this.C;
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glViewport(0, 0, this.f226164c, this.f226165d);
        if (cVar8 == null) {
            return;
        }
        android.opengl.GLES20.glViewport(0, 0, this.f226164c, this.f226165d);
        android.opengl.GLES20.glUseProgram(this.f226171j);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, cVar8.f294395e);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.f226175n, 0);
        android.opengl.GLES20.glUniform1i(this.f226174m, 2);
        android.opengl.GLES20.glUniform1i(this.f226180s, 1);
        android.opengl.GLES20.glUniform1i(this.f226182u, this.f226162a ? 1 : 0);
        if (this.f226166e != null) {
            android.opengl.GLES20.glActiveTexture(33985);
            is0.c cVar9 = this.f226169h;
            if (cVar9 != null) {
                android.graphics.Bitmap bitmap = this.f226166e;
                kotlin.jvm.internal.o.d(bitmap);
                is0.c.c(cVar9, bitmap, 0, 0, 6, null);
            }
            android.opengl.GLES20.glUniform1i(this.f226176o, 1);
        } else {
            android.opengl.GLES20.glUniform1i(this.f226176o, 1);
        }
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f226172k, 2, 5126, false, 0, (java.nio.Buffer) this.D);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f226172k);
        floatBuffer.position(0);
        floatBuffer.put(d32.c.f226138c);
        floatBuffer.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f226173l, 2, 5126, false, 0, (java.nio.Buffer) this.E);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f226173l);
        float f17 = this.f226164c;
        java.nio.FloatBuffer floatBuffer3 = this.F;
        floatBuffer3.put(f17);
        floatBuffer3.put(this.f226165d);
        floatBuffer3.position(0);
        android.opengl.GLES20.glUniform2fv(this.f226177p, 1, floatBuffer3);
        android.opengl.GLES20.glUniform1f(this.f226178q, java.lang.Math.max(this.f226164c, this.f226165d) * 0.06666667f);
        float[] fArr = this.G;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        android.opengl.GLES20.glUniformMatrix4fv(this.f226181t, 1, false, fArr, 0);
        if (this.f226166e != null) {
            android.opengl.GLES20.glUniform1i(this.f226179r, 1);
        } else {
            android.opengl.GLES20.glUniform1i(this.f226179r, 0);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f226172k);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f226173l);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glFinish();
        this.f226161J.position(0);
        int i27 = this.f226164c;
        android.opengl.GLES20.glReadPixels(0, 0, i27, i27, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f226161J);
        android.opengl.GLES20.glUseProgram(0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            android.opengl.GLES20.glClear(16640);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.graphics.SurfaceTexture surfaceTexture = this.f226168g;
            if (surfaceTexture == null) {
                kotlin.jvm.internal.o.o("videoDecodeSurfaceTexture");
                throw null;
            }
            surfaceTexture.updateTexImage();
            a(this.f226170i);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureMixRenderer", "draw frame used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCaptureMixRenderer", e17, "EmojiCaptureMixRenderer draw frame failed", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markMixFrameDrawFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 27L, 1L);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureMixRenderer", "onSurfaceChanged, width:" + i17 + ", height:" + i18);
        this.f226164c = i17;
        this.f226165d = i18;
        this.f226161J = java.nio.ByteBuffer.allocate(i17 * i18 * 4);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureMixRenderer", "onSurfaceCreated");
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glDisable(2929);
    }
}
