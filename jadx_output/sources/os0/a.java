package os0;

/* loaded from: classes14.dex */
public abstract class a {
    public android.graphics.Point A;
    public android.graphics.Point B;

    /* renamed from: a, reason: collision with root package name */
    public int f347992a;

    /* renamed from: b, reason: collision with root package name */
    public int f347993b;

    /* renamed from: c, reason: collision with root package name */
    public int f347994c;

    /* renamed from: d, reason: collision with root package name */
    public int f347995d;

    /* renamed from: e, reason: collision with root package name */
    public int f347996e;

    /* renamed from: f, reason: collision with root package name */
    public int f347997f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.FloatBuffer f347998g;

    /* renamed from: h, reason: collision with root package name */
    public final java.nio.FloatBuffer f347999h;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f348000i;

    /* renamed from: j, reason: collision with root package name */
    public is0.a f348001j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer f348002k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f348003l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f348004m;

    /* renamed from: n, reason: collision with root package name */
    public int f348005n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f348006o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f348007p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Rect f348008q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f348009r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f348010s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.q f348011t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f348012u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f348013v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f348014w;

    /* renamed from: x, reason: collision with root package name */
    public int f348015x;

    /* renamed from: y, reason: collision with root package name */
    public int f348016y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f348017z;

    public a(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f347992a = i17;
        this.f347993b = i18;
        this.f347994c = i19;
        this.f347995d = i27;
        this.f347996e = i28;
        this.f347997f = i29;
        rs0.g gVar = rs0.i.f399296a;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.f347998g = asFloatBuffer;
        rs0.g gVar2 = rs0.i.f399296a;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.f347999h = asFloatBuffer2;
        this.f348003l = new float[16];
        this.f348012u = true;
        this.f348015x = -1;
        this.f348016y = -1;
        this.f348017z = new java.util.concurrent.LinkedBlockingQueue();
        this.A = new android.graphics.Point(0, this.f347993b);
        this.B = new android.graphics.Point(this.f347992a, 0);
        int i37 = this.f347996e;
        if (i37 == 2) {
            this.f348000i = is0.b.b(true, 3L);
            this.f348001j = is0.b.f294391a.a(3L);
        } else if (i37 == 3) {
            h();
        }
    }

    public void f() {
        java.nio.IntBuffer asIntBuffer;
        if (!this.f348013v || !this.f348014w) {
            int i17 = this.f347996e;
            if (i17 == 3) {
                if (this.f348002k == null) {
                    h();
                }
                java.nio.ByteBuffer byteBuffer = this.f348002k;
                if (byteBuffer != null) {
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    android.opengl.GLES20.glReadPixels(0, 0, this.f347994c, this.f347995d, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f348002k);
                    android.opengl.GLES20.glFinish();
                    yz5.l lVar = this.f348009r;
                    if (lVar != null) {
                        java.nio.ByteBuffer byteBuffer2 = this.f348002k;
                        asIntBuffer = byteBuffer2 != null ? byteBuffer2.asIntBuffer() : null;
                        kotlin.jvm.internal.o.d(asIntBuffer);
                        lVar.invoke(asIntBuffer);
                    }
                }
            } else if (i17 == 2) {
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
            }
            android.opengl.GLES20.glUseProgram(0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        this.f348014w = false;
        if (this.f348017z.size() < 2 && this.f348015x > 0 && this.f348016y > 0) {
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f348017z;
            if (linkedBlockingQueue.size() < 2) {
                if (this.f348012u) {
                    int size = 2 - linkedBlockingQueue.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        linkedBlockingQueue.add(java.nio.ByteBuffer.allocateDirect(this.f348015x * this.f348016y * 4).order(java.nio.ByteOrder.nativeOrder()));
                    }
                } else {
                    int size2 = 2 - linkedBlockingQueue.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        linkedBlockingQueue.add(java.nio.ByteBuffer.allocate(this.f348015x * this.f348016y * 4).order(java.nio.ByteOrder.nativeOrder()));
                    }
                }
            }
        }
        if (this.f348017z.size() < 2 || this.f348015x < 0 || this.f348016y < 0) {
            this.f348013v = false;
            return;
        }
        is0.a aVar = this.f348001j;
        if (aVar != null) {
            android.opengl.GLES20.glBindFramebuffer(36160, aVar.f294387e);
        }
        java.nio.ByteBuffer order = this.f348017z.size() > 0 ? (java.nio.ByteBuffer) this.f348017z.take() : java.nio.ByteBuffer.allocate(this.f348015x * this.f348016y * 4).order(java.nio.ByteOrder.nativeOrder());
        if (order != null) {
            order.position(0);
        }
        android.opengl.GLES20.glReadPixels(0, 0, this.f348015x, this.f348016y, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, order);
        android.opengl.GLES20.glFinish();
        yz5.l lVar2 = this.f348010s;
        if (lVar2 != null) {
            kotlin.jvm.internal.o.d(order);
            lVar2.invoke(order);
        }
        yz5.q qVar = this.f348011t;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(order);
            qVar.invoke(order, java.lang.Integer.valueOf(this.f348015x), java.lang.Integer.valueOf(this.f348016y));
        }
        yz5.l lVar3 = this.f348009r;
        if (lVar3 != null) {
            asIntBuffer = order != null ? order.asIntBuffer() : null;
            kotlin.jvm.internal.o.d(asIntBuffer);
            lVar3.invoke(asIntBuffer);
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        this.f348013v = false;
        if (this.f348017z.size() < 2) {
            this.f348017z.add(order);
        }
    }

    public void g() {
        float[] fArr = this.f348003l;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        yz5.l lVar = this.f348004m;
        if (lVar != null) {
            lVar.invoke(fArr);
        }
        android.opengl.Matrix.rotateM(this.f348003l, 0, this.f348005n, 0.0f, 0.0f, -1.0f);
        if (this.f348006o || this.f347996e == 3) {
            int i17 = this.f348005n;
            if (i17 == 90 || i17 == 270) {
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            }
        } else {
            android.opengl.Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
        }
        if (this.f348007p) {
            android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        }
        if (this.f347997f == 5) {
            i(this.f347994c / this.f347995d, this.f347992a / this.f347993b);
        }
        m();
        v();
    }

    public final void h() {
        int i17;
        int i18 = this.f347994c;
        if (i18 <= 0 || (i17 = this.f347995d) <= 0 || this.f348002k != null) {
            return;
        }
        this.f348002k = java.nio.ByteBuffer.allocateDirect(i18 * i17 * 4).order(java.nio.ByteOrder.nativeOrder());
    }

    public final void i(float f17, float f18) {
        float f19;
        float f27;
        float f28;
        float f29;
        if (f18 > f17) {
            float f37 = f18 / f17;
            f28 = -f37;
            f29 = f37;
            f19 = -1.0f;
            f27 = 1.0f;
        } else {
            float f38 = (-f17) / f18;
            f19 = f38;
            f27 = -f38;
            f28 = -1.0f;
            f29 = 1.0f;
        }
        android.opengl.Matrix.orthoM(this.f348003l, 0, f19, f27, f28, f29, 1.0f, -1.0f);
    }

    public void j(boolean z17) {
        this.f348007p = z17;
    }

    public final java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f347994c);
        sb6.append(',');
        sb6.append(this.f347995d);
        return sb6.toString();
    }

    public final java.lang.String l() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f347992a);
        sb6.append(',');
        sb6.append(this.f347993b);
        return sb6.toString();
    }

    public void m() {
        float f17;
        float f18;
        float f19;
        if (this.f347997f == 2) {
            int i17 = this.f348005n;
            boolean z17 = i17 == 90 || i17 == 270;
            android.graphics.Point point = this.B;
            int i18 = point.x;
            android.graphics.Point point2 = this.A;
            int i19 = i18 - point2.x;
            int i27 = point2.y - point.y;
            int i28 = z17 ? i27 : i19;
            if (!z17) {
                i19 = i27;
            }
            int i29 = this.f347994c;
            float f27 = i28;
            float f28 = i29 / f27;
            int i37 = this.f347995d;
            float f29 = i19;
            float f37 = i37 / f29;
            float f38 = 0.0f;
            if (f28 < f37) {
                f19 = 0.0f;
                f38 = f27 - (i29 / f37);
            } else {
                f19 = f28 > f37 ? f29 - (i37 / f28) : 0.0f;
            }
            this.f348015x = i28 - ((int) f38);
            this.f348016y = i19 - ((int) f19);
        }
        java.nio.FloatBuffer floatBuffer = this.f347998g;
        floatBuffer.position(0);
        floatBuffer.put(qs0.b.f366208a.a(this.f347997f, this.f347992a, this.f347993b, this.A, this.B, this.f348005n, this.f347994c, this.f347995d, this.f348008q));
        floatBuffer.position(0);
        java.nio.FloatBuffer floatBuffer2 = this.f347999h;
        floatBuffer2.position(0);
        int i38 = this.f347997f;
        android.graphics.Point textureValidLTPoint = this.A;
        android.graphics.Point textureValidRBPoint = this.B;
        int i39 = this.f348005n;
        int i47 = this.f347994c;
        int i48 = this.f347995d;
        kotlin.jvm.internal.o.g(textureValidLTPoint, "textureValidLTPoint");
        kotlin.jvm.internal.o.g(textureValidRBPoint, "textureValidRBPoint");
        float[] copyOf = java.util.Arrays.copyOf(rs0.i.f399298c, 8);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        float f39 = -1.0f;
        float f47 = 1.0f;
        if (i38 == 6) {
            boolean z18 = i39 == 90 || i39 == 270;
            int i49 = textureValidRBPoint.x - textureValidLTPoint.x;
            int i57 = textureValidLTPoint.y - textureValidRBPoint.y;
            int i58 = z18 ? i57 : i49;
            if (!z18) {
                i49 = i57;
            }
            float f48 = i47;
            float f49 = i58;
            float f57 = f48 / f49;
            float f58 = i48;
            float f59 = i49;
            float f66 = f58 / f59;
            if (f57 > f66) {
                float f67 = (((f57 - f66) * f49) * 1.0f) / f48;
                f18 = 1.0f - f67;
                f17 = f67 - 1.0f;
            } else {
                float f68 = (((f66 - f57) * f59) * 1.0f) / f58;
                f17 = -1.0f;
                f39 = f68 - 1.0f;
                f18 = 1.0f;
                f47 = 1.0f - f68;
            }
        } else {
            f17 = -1.0f;
            f18 = 1.0f;
        }
        copyOf[0] = f39;
        copyOf[1] = f17;
        copyOf[2] = f47;
        copyOf[3] = f17;
        copyOf[4] = f39;
        copyOf[5] = f18;
        copyOf[6] = f47;
        copyOf[7] = f18;
        floatBuffer2.put(copyOf);
        floatBuffer2.position(0);
    }

    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GLTextureRenderProc", hashCode() + " release renderOutputTexture:" + this.f348000i + ", renderOutputTextureFbo:" + this.f348001j + ", drawWidth:" + this.f347994c + ", drawHeight:" + this.f347995d);
        is0.c cVar = this.f348000i;
        if (cVar != null) {
            cVar.close();
        }
        is0.a aVar = this.f348001j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public void o() {
        g();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        p();
        f();
    }

    public abstract void p();

    public void q(byte[] frame) {
        kotlin.jvm.internal.o.g(frame, "frame");
    }

    public void r(int i17) {
    }

    public void s(int i17) {
        this.f348005n = i17;
    }

    public final void t(int i17, int i18) {
        if (i17 != this.f348015x || i18 != this.f348016y) {
            this.f348017z.clear();
        }
        this.f348015x = i17;
        this.f348016y = i18;
    }

    public void u(int i17, int i18) {
        if (this.f347994c != i17 || this.f347995d != i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GLTextureRenderProc", "updateDrawViewSize: current width=" + this.f347994c + ", height=" + this.f347995d + ". new width=" + i17 + ", height=" + i18);
        }
        this.f347995d = i18;
        this.f347994c = i17;
        t(i17, i18);
        if (this.f347996e == 3) {
            h();
        }
    }

    public final void v() {
        if (this.f347996e == 2) {
            if (this.f348000i == null) {
                this.f348000i = is0.b.b(true, 3L);
                this.f348001j = is0.b.f294391a.a(3L);
            }
            rs0.i.f399296a.c(this.f348001j, this.f348000i, this.f347994c, this.f347995d);
        }
        android.opengl.GLES20.glViewport(0, 0, this.f347994c, this.f347995d);
        if (this.f348013v) {
            if (this.f348000i == null) {
                this.f348000i = is0.b.b(true, 3L);
                this.f348001j = is0.b.f294391a.a(3L);
            }
            rs0.i.f399296a.c(this.f348001j, this.f348000i, this.f348015x, this.f348016y);
            android.opengl.GLES20.glViewport(0, 0, this.f348015x, this.f348016y);
            int i17 = this.f348005n;
            if (i17 == 90 || i17 == 270) {
                android.opengl.Matrix.scaleM(this.f348003l, 0, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(this.f348003l, 0, 1.0f, -1.0f, 1.0f);
            }
            this.f348014w = true;
        }
    }

    public void w(int i17, int i18) {
        this.f347992a = i17;
        this.f347993b = i18;
        android.graphics.Point point = this.A;
        point.x = 0;
        point.y = i18;
        android.graphics.Point point2 = this.B;
        point2.x = i17;
        point2.y = 0;
    }
}
