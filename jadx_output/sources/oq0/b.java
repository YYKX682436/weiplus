package oq0;

/* loaded from: classes7.dex */
public final class b implements gq0.s {
    @Override // gq0.s
    public jz5.l a(iq0.d bizConfig, jc3.l0 preloadLifecycleListener) {
        jc3.r0 E0;
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        kotlin.jvm.internal.o.g(preloadLifecycleListener, "preloadLifecycleListener");
        if (!(bizConfig instanceof iq0.i)) {
            return new jz5.l(jc3.r0.f298979e, null);
        }
        iq0.i iVar = (iq0.i) bizConfig;
        xq0.b bVar = new xq0.b(new xq0.c(bizConfig.f293648a, null, iVar.f293652e, bizConfig.f293653f, (xq0.a) iVar.f293655h, bizConfig.f293654g, null, bizConfig.f293656i, false, null, 768, null));
        bVar.S(preloadLifecycleListener);
        jc3.s0 preloadStrategy = bizConfig.f293649b;
        long j17 = bizConfig.f293650c;
        kotlin.jvm.internal.o.g(preloadStrategy, "preloadStrategy");
        synchronized (bVar) {
            E0 = preloadStrategy == jc3.s0.f298984d ? bVar.E0(j17) : jc3.r0.f298982h;
        }
        return jc3.r0.f298978d == E0 ? new jz5.l(E0, bVar) : new jz5.l(E0, null);
    }

    @Override // gq0.s
    public jc3.i0 b(jc3.i0 biz, iq0.a bizConfig) {
        android.widget.FrameLayout F4;
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        if (!(biz instanceof xq0.b) || !(bizConfig instanceof iq0.h)) {
            return null;
        }
        iq0.h hVar = (iq0.h) bizConfig;
        xq0.a aVar = (xq0.a) hVar.f293638e;
        if (aVar != null) {
            xq0.b bVar = (xq0.b) biz;
            bVar.f325627f = aVar;
            bf3.p pVar = bVar.f325633o;
            if (pVar != null && (F4 = aVar.F4()) != null) {
                android.widget.FrameLayout frameLayout = bVar.f325634p;
                if (frameLayout != null) {
                    pVar.c(frameLayout);
                }
                bVar.f325634p = F4;
                pVar.a(F4);
            }
        }
        xq0.d dVar = hVar.f293665i;
        if (dVar != null) {
            ((xq0.b) biz).K0(dVar);
        }
        biz.S(bizConfig.f293635b);
        return biz;
    }

    @Override // gq0.s
    public jc3.i0 c(iq0.a bizConfig) {
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        if (!(bizConfig instanceof iq0.h)) {
            return null;
        }
        iq0.h hVar = (iq0.h) bizConfig;
        xq0.b bVar = new xq0.b(new xq0.c(bizConfig.f293634a, hVar.f293665i, hVar.f293636c, bizConfig.f293637d, (xq0.a) hVar.f293638e, bizConfig.f293639f, null, hVar.f293666j, bizConfig.f293640g, bizConfig.f293641h));
        bVar.S(bizConfig.f293635b);
        return bVar;
    }
}
