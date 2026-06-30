package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class t6 extends i95.w implements com.tencent.mm.plugin.magicbrush.j4 {
    public synchronized void wi(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MagicBrushPreloadFeatureService", "try to preload MB 2.0 env for ".concat(scene));
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.magicbrush.s6(scene));
    }
}
