package um5;

/* loaded from: classes10.dex */
public abstract class w {

    /* renamed from: c, reason: collision with root package name */
    public int f429194c;

    /* renamed from: d, reason: collision with root package name */
    public int f429195d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f429196e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.tav.decoder.RenderContext f429197f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f429198g;

    /* renamed from: h, reason: collision with root package name */
    public um5.y f429199h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.tav.coremedia.TextureInfo f429200i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f429201j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f429202k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Handler f429203l;

    /* renamed from: m, reason: collision with root package name */
    public android.os.HandlerThread f429204m;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f429206o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f429207p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f429208q;

    /* renamed from: s, reason: collision with root package name */
    public long f429210s;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.xeffect.VLogDirector f429192a = new com.tencent.mm.xeffect.VLogDirector();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.xeffect.effect.EffectManager f429193b = new com.tencent.mm.xeffect.effect.EffectManager();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f429205n = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final um5.x f429209r = new um5.x();

    public abstract java.util.List a(long j17);

    public void b() {
        xm5.b.e(c(), "destroyEGL", new java.lang.Object[0]);
        this.f429202k = true;
        synchronized (this.f429205n) {
            this.f429205n.clear();
        }
        this.f429201j = false;
        android.os.Handler handler = this.f429203l;
        android.os.HandlerThread handlerThread = this.f429204m;
        this.f429204m = null;
        this.f429203l = null;
        if (handler != null) {
            handler.post(new um5.q(this, handlerThread));
        }
    }

    public abstract java.lang.String c();

    public void d() {
        xm5.b.c(c(), "initEGL", new java.lang.Object[0]);
        this.f429202k = false;
        um5.x xVar = this.f429209r;
        xVar.getClass();
        xVar.f429214c = java.lang.System.currentTimeMillis();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("EffectRenderView_EGLRenderThread");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f429203l = handler;
        this.f429204m = handlerThread;
        handler.post(new um5.r(this));
    }

    public final void e(android.view.Surface surface, int i17, int i18) {
        this.f429198g = surface;
        j(i17, i18);
        d();
    }

    public final void f(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f429203l != null) {
            android.os.HandlerThread handlerThread = this.f429204m;
            boolean z17 = false;
            if (handlerThread != null && handlerThread.isAlive()) {
                z17 = true;
            }
            if (z17 && !this.f429202k && this.f429201j) {
                android.os.Handler handler = this.f429203l;
                if (handler != null) {
                    handler.post(new um5.u(callback));
                    return;
                }
                return;
            }
        }
        synchronized (this.f429205n) {
            this.f429205n.add(callback);
        }
    }

    public final void g() {
        xm5.b.c(c(), "release", new java.lang.Object[0]);
        this.f429193b.k();
        this.f429193b = new com.tencent.mm.xeffect.effect.EffectManager();
    }

    public void h(long j17) {
        int i17;
        com.tencent.tav.coremedia.TextureInfo textureInfo;
        um5.x xVar = this.f429209r;
        xVar.getClass();
        xVar.f429216e = java.lang.System.currentTimeMillis();
        int i18 = this.f429194c;
        if (i18 <= 0 || (i17 = this.f429195d) <= 0) {
            xm5.b.f(c(), "render with size error " + this.f429194c + ", " + this.f429195d, new java.lang.Object[0]);
            this.f429209r.f429219h = true;
            return;
        }
        android.opengl.GLES20.glViewport(0, 0, i18, i17);
        this.f429192a.g(0, 0, this.f429194c, this.f429195d);
        com.tencent.mm.xeffect.VLogDirector vLogDirector = this.f429192a;
        int i19 = this.f429194c;
        int i27 = this.f429195d;
        vLogDirector.f214799c = i19;
        vLogDirector.f214800d = i27;
        vLogDirector.g(0, 0, i19, i27);
        if (this.f429196e || this.f429200i == null) {
            com.tencent.tav.coremedia.TextureInfo textureInfo2 = this.f429200i;
            if (textureInfo2 != null) {
                textureInfo2.release();
            }
            com.tencent.tav.coremedia.TextureInfo newTextureInfo = com.tencent.tavkit.ciimage.CIContext.newTextureInfo(this.f429194c, this.f429195d);
            this.f429200i = newTextureInfo;
            if (newTextureInfo != null) {
                android.opengl.GLES20.glBindTexture(3553, newTextureInfo.textureID);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, newTextureInfo.width, newTextureInfo.height, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
            }
            this.f429196e = false;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo3 = this.f429200i;
        int i28 = textureInfo3 != null ? textureInfo3.textureID : 0;
        if (i28 <= 0) {
            this.f429209r.f429221j = true;
            return;
        }
        java.util.List a17 = a(j17);
        if (a17.isEmpty()) {
            this.f429209r.f429220i = true;
            return;
        }
        this.f429192a.d(a17, i28, j17);
        if (this.f429206o) {
            try {
                android.graphics.Bitmap saveBitmap = com.tencent.tavkit.ciimage.TAVGLUtils.saveBitmap(this.f429200i);
                yz5.l lVar = this.f429207p;
                if (lVar != null) {
                    lVar.invoke(saveBitmap);
                }
            } catch (java.lang.OutOfMemoryError e17) {
                xm5.b.b(c(), "saveBitmap error: " + e17, new java.lang.Object[0]);
                yz5.l lVar2 = this.f429207p;
                if (lVar2 != null) {
                    lVar2.invoke(null);
                }
            }
            this.f429206o = false;
            this.f429207p = null;
        } else {
            um5.y yVar = this.f429199h;
            if (yVar != null && (textureInfo = this.f429200i) != null && textureInfo.textureID > 0) {
                android.opengl.GLES20.glUseProgram(yVar.f429224c);
                com.tencent.tav.decoder.RenderContext.checkEglError("glUseProgram");
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(textureInfo.textureType, textureInfo.textureID);
                android.opengl.GLES20.glUniform1i(yVar.f429227f, 0);
                yVar.f429223b.position(0);
                android.opengl.GLES20.glVertexAttribPointer(yVar.f429225d, 2, 5126, false, 0, (java.nio.Buffer) yVar.f429223b);
                android.opengl.GLES20.glEnableVertexAttribArray(yVar.f429225d);
                yVar.f429222a.position(0);
                android.opengl.GLES20.glVertexAttribPointer(yVar.f429226e, 2, 5126, false, 0, (java.nio.Buffer) yVar.f429222a);
                android.opengl.GLES20.glEnableVertexAttribArray(yVar.f429226e);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
                android.opengl.GLES20.glBindTexture(textureInfo.textureType, 0);
                android.opengl.GLES20.glDisableVertexAttribArray(yVar.f429225d);
                android.opengl.GLES20.glDisableVertexAttribArray(yVar.f429226e);
            }
            com.tencent.tav.decoder.RenderContext renderContext = this.f429197f;
            if (renderContext != null) {
                renderContext.swapBuffers();
            }
        }
        yz5.l lVar3 = this.f429208q;
        if (lVar3 != null) {
            lVar3.invoke(java.lang.Long.valueOf(j17));
        }
        this.f429210s = j17;
        um5.x xVar2 = this.f429209r;
        xVar2.f429218g++;
        xVar2.f429217f += java.lang.System.currentTimeMillis() - xVar2.f429216e;
    }

    public final void i(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f429206o = true;
        this.f429207p = callback;
        f(new um5.s(this));
    }

    public final void j(int i17, int i18) {
        if (i17 != this.f429194c || i18 != this.f429195d) {
            this.f429196e = true;
        }
        this.f429194c = i17;
        this.f429195d = i18;
    }
}
