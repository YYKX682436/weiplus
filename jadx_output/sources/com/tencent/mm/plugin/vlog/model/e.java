package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class e implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f175579a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.xeffect.effect.EffectManager f175580b;

    /* renamed from: c, reason: collision with root package name */
    public final uq5.a f175581c;

    /* renamed from: d, reason: collision with root package name */
    public int f175582d;

    /* renamed from: e, reason: collision with root package name */
    public int f175583e;

    /* renamed from: f, reason: collision with root package name */
    public int f175584f;

    public e(yz5.l blendBitmapProvider, com.tencent.mm.xeffect.effect.EffectManager effectManager) {
        kotlin.jvm.internal.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.f175579a = blendBitmapProvider;
        this.f175580b = effectManager;
        uq5.y g17 = effectManager != null ? effectManager.g(uq5.k.BlendEffect) : null;
        this.f175581c = g17 instanceof uq5.a ? (uq5.a) g17 : null;
    }

    @Override // wm5.f
    public void a(long j17) {
        tq5.f fVar;
        com.tencent.mm.xeffect.effect.EffectManager effectManager;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f175579a.invoke(java.lang.Long.valueOf(j17));
        boolean z17 = false;
        if (bitmap != null) {
            this.f175583e = bitmap.getWidth();
            this.f175584f = bitmap.getHeight();
            if (this.f175582d == 0) {
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenTextures(1, iArr, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr[0]);
                android.opengl.GLES20.glBindTexture(3553, 0);
                this.f175582d = iArr[0];
            }
            android.opengl.GLES20.glBindTexture(3553, this.f175582d);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
            android.opengl.GLES20.glBindTexture(3553, 0);
            fVar = new tq5.f(this.f175582d, this.f175583e, this.f175584f, false, 0);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            uq5.a aVar = this.f175581c;
            if (aVar != null && aVar.f430267a == 0) {
                z17 = true;
            }
            if (z17 && (effectManager = this.f175580b) != null) {
                effectManager.c(aVar);
            }
            if (aVar != null) {
                int i17 = fVar.f421256a;
                int i18 = fVar.f421257b;
                int i19 = fVar.f421258c;
                uq5.x xVar = aVar.f430231d;
                xVar.getClass();
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setEffectTexture$renderlib_release(xVar.f430266a.f430269c, i17, i18, i19);
            }
            if (aVar != null) {
                uq5.x xVar2 = aVar.f430231d;
                xVar2.getClass();
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.nSetEffectIsPreMultiplied(xVar2.f430266a.f430269c, true);
            }
        }
    }

    @Override // wm5.f
    public void b() {
        int i17 = this.f175582d;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
            this.f175582d = 0;
        }
    }
}
