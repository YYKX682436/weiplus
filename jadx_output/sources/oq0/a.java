package oq0;

/* loaded from: classes7.dex */
public final class a implements gq0.s {
    @Override // gq0.s
    public jz5.l a(iq0.d bizConfig, jc3.l0 preloadLifecycleListener) {
        jc3.r0 r0Var;
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        kotlin.jvm.internal.o.g(preloadLifecycleListener, "preloadLifecycleListener");
        if (!(bizConfig instanceof iq0.f)) {
            return new jz5.l(jc3.r0.f298979e, null);
        }
        iq0.f fVar = (iq0.f) bizConfig;
        hq0.b0 b0Var = new hq0.b0(new iq0.g(bizConfig.f293648a, fVar.f293660j, fVar.f293661k, fVar.f293652e, bizConfig.f293653f, fVar.f293662l, bizConfig.f293654g, bizConfig.f293650c, null));
        jc3.s0 preloadStrategy = bizConfig.f293649b;
        long j17 = bizConfig.f293650c;
        kotlin.jvm.internal.o.g(preloadStrategy, "preloadStrategy");
        com.tencent.mars.xlog.Log.i(b0Var.f282971y, "preload preloadStrategy: " + preloadStrategy);
        if (preloadStrategy == jc3.s0.f298984d) {
            b0Var.R = j17;
            synchronized (b0Var) {
                if (b0Var.V) {
                    r0Var = jc3.r0.f298981g;
                } else {
                    b0Var.V = true;
                    com.tencent.mars.xlog.Log.i(b0Var.f282971y, "preload runtime");
                    b0Var.a2(true);
                    r0Var = jc3.r0.f298978d;
                }
            }
        } else {
            r0Var = jc3.r0.f298982h;
        }
        return jc3.r0.f298978d == r0Var ? new jz5.l(r0Var, b0Var) : new jz5.l(r0Var, null);
    }

    @Override // gq0.s
    public jc3.i0 b(jc3.i0 biz, iq0.a bizConfig) {
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        if ((biz instanceof hq0.b0) && (bizConfig instanceof iq0.g)) {
            return biz;
        }
        return null;
    }

    @Override // gq0.s
    public jc3.i0 c(iq0.a bizConfig) {
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        if (bizConfig instanceof iq0.g) {
            return new hq0.b0((iq0.g) bizConfig);
        }
        return null;
    }
}
