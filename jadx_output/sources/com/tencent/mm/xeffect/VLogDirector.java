package com.tencent.mm.xeffect;

/* loaded from: classes10.dex */
public class VLogDirector {

    /* renamed from: a, reason: collision with root package name */
    public long f214797a;

    /* renamed from: b, reason: collision with root package name */
    public long f214798b;

    /* renamed from: c, reason: collision with root package name */
    public int f214799c;

    /* renamed from: d, reason: collision with root package name */
    public int f214800d;

    /* renamed from: e, reason: collision with root package name */
    public long f214801e = 0;

    static {
        tq5.k.a("xlabeffect");
        tq5.k.a("pag");
    }

    private static native int nAddInputTexture(long j17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, long j18, long j19, long j27, boolean z17, boolean z18);

    private static native void nDestroy(long j17);

    private static native long nInit();

    private static native int nRender(long j17, int i17, int i18, int i19, long j18);

    private static native void nSetEffectManager(long j17, long j18);

    private static native int nSetOutputTexCropRet(long j17, int i17, int i18, int i19, int i27);

    private static native int nSetRenderArea(long j17, int i17, int i18, int i19, int i27);

    public final void a() {
        if (java.lang.Thread.currentThread().getId() != this.f214798b) {
            com.tencent.mm.xeffect.XEffectLog.f214803a.e("VLogDirector", "Thread error", new java.lang.Object[0]);
        }
    }

    public void b() {
        a();
        long j17 = this.f214797a;
        if (j17 != 0) {
            nDestroy(j17);
            this.f214797a = 0L;
            this.f214801e = 0L;
        }
    }

    public void c() {
        this.f214798b = java.lang.Thread.currentThread().getId();
        boolean z17 = tq5.k.f421272a;
        if (tq5.k.f421272a) {
            this.f214797a = nInit();
        } else {
            this.f214797a = 0L;
        }
    }

    public void d(java.util.List list, int i17, long j17) {
        a();
        if (this.f214797a != 0) {
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                tq5.f fVar = (tq5.f) it.next();
                if (fVar == null) {
                    com.tencent.mm.xeffect.XEffectLog.f214803a.e("VLogDirector", "input is null", new java.lang.Object[0]);
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mm.xeffect.LayoutInfo layoutInfo = fVar.f421264i;
                    layoutInfo.nUpdate(layoutInfo.f214792a, layoutInfo.f214793b, layoutInfo.f214794c, layoutInfo.f214795d, 0.0f, layoutInfo.f214796e);
                    com.tencent.mm.xeffect.LayoutInfo layoutInfo2 = fVar.f421265j;
                    layoutInfo2.nUpdate(layoutInfo2.f214792a, layoutInfo2.f214793b, layoutInfo2.f214794c, layoutInfo2.f214795d, 0.0f, layoutInfo2.f214796e);
                    com.tencent.mm.xeffect.InputAnimation inputAnimation = fVar.f421266k;
                    inputAnimation.nUpdate(inputAnimation.f214789a, inputAnimation.f214790b, inputAnimation.f214791c, 0);
                    long j18 = this.f214797a;
                    int i18 = fVar.f421256a;
                    int i19 = fVar.f421257b;
                    int i27 = fVar.f421258c;
                    int i28 = fVar.f421259d;
                    android.graphics.Rect rect = fVar.f421263h;
                    int i29 = rect.left;
                    int i37 = rect.top;
                    int i38 = rect.right;
                    int i39 = rect.bottom;
                    android.graphics.Rect rect2 = fVar.f421262g;
                    nAddInputTexture(j18, i18, i19, i27, i28, i29, i37, i38, i39, rect2.left, rect2.top, rect2.right, rect2.bottom, fVar.f421264i.f214792a, fVar.f421265j.f214792a, fVar.f421266k.f214789a, fVar.f421260e, fVar.f421261f);
                }
            }
            if (this.f214799c <= 0 || this.f214800d <= 0) {
                int[] iArr = new int[2];
                android.opengl.GLES20.glBindTexture(3553, i17);
                android.opengl.GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr, 0);
                android.opengl.GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr, 1);
                this.f214799c = iArr[0];
                this.f214800d = iArr[1];
            }
            com.tencent.mm.xeffect.XEffectLog.f214803a.d("VLogDirector", "render output size, width:%d, height:%d", java.lang.Integer.valueOf(this.f214799c), java.lang.Integer.valueOf(this.f214800d));
            nRender(this.f214797a, i17, this.f214799c, this.f214800d, j17);
        }
    }

    public void e(com.tencent.mm.xeffect.effect.EffectManager effectManager) {
        if (effectManager != null) {
            long j17 = effectManager.f214805a;
            if (j17 == 0 || j17 == this.f214801e) {
                return;
            }
            nSetEffectManager(this.f214797a, j17);
            this.f214801e = j17;
        }
    }

    public void f(int i17, int i18, int i19, int i27) {
        a();
        long j17 = this.f214797a;
        if (j17 != 0) {
            nSetOutputTexCropRet(j17, i17, i18, i19, i27);
        }
    }

    public void g(int i17, int i18, int i19, int i27) {
        a();
        long j17 = this.f214797a;
        if (j17 != 0) {
            nSetRenderArea(j17, i17, i18, i19, i27);
        }
    }
}
