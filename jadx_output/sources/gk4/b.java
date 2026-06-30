package gk4;

/* loaded from: classes10.dex */
public interface b {
    static void a(gk4.b bVar, float f17, int i17, java.lang.Object obj) {
        uq5.j jVar;
        uq5.j jVar2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGradientBlurEffect");
        }
        if ((i17 & 1) != 0) {
            f17 = -1.0f;
        }
        gk4.h0 h0Var = (gk4.h0) bVar;
        if (h0Var.f272568m == null) {
            h0Var.f272568m = new com.tencent.mm.xeffect.effect.EffectManager();
        }
        com.tencent.mm.xeffect.effect.EffectManager effectManager = h0Var.f272568m;
        if (effectManager != null) {
            effectManager.f();
        }
        com.tencent.mm.xeffect.effect.EffectManager effectManager2 = h0Var.f272568m;
        java.lang.Long l17 = null;
        uq5.y g17 = effectManager2 != null ? effectManager2.g(uq5.k.GradientBlurEffect) : null;
        kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.GradientBlurEffect");
        uq5.m mVar = (uq5.m) g17;
        h0Var.f272578w = mVar;
        mVar.d(20.0f);
        uq5.m mVar2 = h0Var.f272578w;
        if (mVar2 != null) {
            mVar2.b(0L, h0Var.A);
        }
        uq5.m mVar3 = h0Var.f272578w;
        if (mVar3 != null) {
            long j17 = mVar3.f430269c;
            if (j17 != 0) {
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.nSetGradientBlurEffectCenterCropBlur(j17, false);
            }
        }
        com.tencent.mm.xeffect.effect.EffectManager effectManager3 = h0Var.f272568m;
        if (effectManager3 != null) {
            effectManager3.c(h0Var.f272578w);
        }
        h0Var.C = f17;
        h0Var.B = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setGradientBlurEffect, timeRange:[");
        uq5.m mVar4 = h0Var.f272578w;
        sb6.append((mVar4 == null || (jVar2 = mVar4.f430268b) == null) ? null : java.lang.Long.valueOf(jVar2.f430239a));
        sb6.append(", ");
        uq5.m mVar5 = h0Var.f272578w;
        if (mVar5 != null && (jVar = mVar5.f430268b) != null) {
            l17 = java.lang.Long.valueOf(jVar.f430240b);
        }
        sb6.append(l17);
        sb6.append(", contentOffsetPercent:");
        sb6.append(f17);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(h0Var.f272556a, sb6.toString());
    }
}
