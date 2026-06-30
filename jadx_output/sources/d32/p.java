package d32;

/* loaded from: classes14.dex */
public abstract class p extends os0.a implements d32.r, d32.q {
    public final int C;
    public final int D;
    public final is0.c E;
    public s22.a F;
    public boolean G;
    public boolean H;
    public t85.j I;

    /* renamed from: J, reason: collision with root package name */
    public final os0.a f226190J;

    public p(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        int i37 = t22.o.f415103d;
        this.C = i37;
        this.D = i37;
        this.G = true;
        this.E = is0.b.b(true, -1L);
        this.f226190J = new d32.o(i37, i37, i19, i27, 1, 1);
    }

    @Override // d32.r
    public void a() {
        this.G = true;
    }

    @Override // d32.r
    public void b(boolean z17) {
        this.H = z17;
        x();
        s22.a aVar = this.F;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFilterProcess", "setRemoveBg: " + z17);
            p05.l4 l4Var = aVar.f402293e;
            if (l4Var != null) {
                l4Var.H(z17);
            }
        }
    }

    @Override // d32.r
    public void c(t85.j jVar) {
        this.I = jVar;
        x();
        s22.a aVar = this.F;
        if (aVar != null) {
            aVar.a(jVar);
        }
    }

    @Override // d32.q
    public is0.c d() {
        os0.a aVar = ((d32.a) this).K;
        if (aVar != null) {
            return aVar.f348000i;
        }
        return null;
    }

    @Override // d32.r
    public void e() {
        this.G = false;
        s22.a aVar = this.F;
        if (aVar != null) {
            aVar.b();
        }
        this.F = null;
    }

    @Override // os0.a
    public void n() {
        super.n();
        is0.c cVar = this.E;
        if (cVar != null) {
            cVar.close();
        }
        os0.a aVar = this.f226190J;
        if (aVar != null) {
            aVar.n();
        }
        s22.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.F = null;
    }

    @Override // os0.a
    public void p() {
        int i17;
        os0.a aVar = ((d32.a) this).K;
        if (aVar != null) {
            aVar.w(this.f347992a, this.f347993b);
        }
        if (aVar != null) {
            aVar.f348005n = this.f348005n;
        }
        if (aVar != null) {
            aVar.f348007p = this.f348007p;
        }
        if (aVar != null) {
            aVar.o();
            is0.c cVar = aVar.f348000i;
            i17 = cVar != null ? cVar.f294395e : -1;
        } else {
            i17 = 0;
        }
        x();
        s22.a aVar2 = this.F;
        if (aVar2 != null) {
            int i18 = this.C;
            aVar2.f402291c = i18;
            int i19 = this.D;
            aVar2.f402292d = i19;
            p05.l4 l4Var = aVar2.f402293e;
            if (l4Var != null) {
                l4Var.J(i18, i19);
            }
            aVar2.f402289a = i17;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiFilterProcess", e17, "filterProcess error", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkDrawFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 14L, 1L);
            }
            if (aVar2.f402295g) {
                p05.l4 l4Var2 = aVar2.f402293e;
                if (l4Var2 != null) {
                    rh0.d0.b(l4Var2, aVar2.f402289a, false, 0, false, 14, null);
                }
                int i27 = aVar2.f402290b;
                int i28 = aVar2.f402291c;
                int i29 = aVar2.f402292d;
                android.opengl.GLES20.glBindTexture(3553, i27);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i28, i29, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
                p05.l4 l4Var3 = aVar2.f402293e;
                if (l4Var3 != null) {
                    rh0.d0.c(l4Var3, aVar2.f402289a, aVar2.f402290b, 0L, 0, false, false, false, 124, null);
                }
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.os.SystemClock.elapsedRealtime();
            } else {
                android.opengl.GLES20.glBindFramebuffer(36160, aVar2.f402294f);
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, aVar2.f402289a, 0);
                int i37 = aVar2.f402290b;
                int i38 = aVar2.f402291c;
                int i39 = aVar2.f402292d;
                android.opengl.GLES20.glBindTexture(3553, i37);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i38, i39, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glBindTexture(3553, aVar2.f402290b);
                android.opengl.GLES20.glCopyTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, 0, 0, aVar2.f402291c, aVar2.f402292d, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
            }
        }
        is0.c cVar2 = this.E;
        int i47 = cVar2 != null ? cVar2.f294395e : 0;
        os0.a aVar3 = this.f226190J;
        if (aVar3 != null) {
            ((d32.o) aVar3).L = i47;
        }
        if (aVar3 != null) {
            aVar3.o();
        }
    }

    public final void x() {
        int i17;
        os0.a aVar = ((d32.a) this).K;
        if (aVar != null) {
            is0.c cVar = aVar.f348000i;
            i17 = cVar != null ? cVar.f294395e : -1;
        } else {
            i17 = 0;
        }
        if (this.F == null && this.G) {
            s22.a aVar2 = new s22.a();
            this.F = aVar2;
            is0.c cVar2 = this.E;
            int i18 = cVar2 != null ? cVar2.f294395e : 0;
            aVar2.f402289a = i17;
            aVar2.f402290b = i18;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFilterProcess", "initial %s, %d, " + aVar2.f402295g, aVar2, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                p05.l4 l4Var = new p05.l4(0, false, false, false, false, false, rh0.z.f395612f, null, false, 445, null);
                aVar2.f402293e = l4Var;
                l4Var.F.f62924d = 5;
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_smooth_weight, -1);
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_bright_weight, -1);
                int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bigger_weight, -1);
                int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bright_weight, -1);
                int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_face_thin_weight, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFilterProcess", "Face beauty config: skinSmooth: %d, skinBright: %d, eyeMorph: %d, eyeBright: %d, faceMorph: %d", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(Ni3), java.lang.Integer.valueOf(Ni4), java.lang.Integer.valueOf(Ni5));
                p05.l4 l4Var2 = aVar2.f402293e;
                if (l4Var2 != null) {
                    l4Var2.A(Ni, Ni3, Ni5, Ni2, Ni4);
                }
                p05.l4 l4Var3 = aVar2.f402293e;
                if (l4Var3 != null) {
                    l4Var3.C(true);
                }
                p05.l4 l4Var4 = aVar2.f402293e;
                if (l4Var4 != null) {
                    l4Var4.H(false);
                }
                p05.l4 l4Var5 = aVar2.f402293e;
                if (l4Var5 != null) {
                    l4Var5.r();
                }
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
                int i19 = iArr[0];
                if (i19 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
                    i19 = 0;
                }
                aVar2.f402294f = i19;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiFilterProcess", e17, "initial error", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkInitFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 13L, 1L);
            }
            s22.a aVar3 = this.F;
            if (aVar3 != null) {
                boolean z17 = this.H;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFilterProcess", "setRemoveBg: " + z17);
                p05.l4 l4Var6 = aVar3.f402293e;
                if (l4Var6 != null) {
                    l4Var6.H(z17);
                }
            }
            s22.a aVar4 = this.F;
            if (aVar4 != null) {
                aVar4.a(this.I);
            }
        }
    }
}
