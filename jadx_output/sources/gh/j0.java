package gh;

/* loaded from: classes7.dex */
public final class j0 implements gh.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f271833a;

    public j0(com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        this.f271833a = magicBrushView;
    }

    @Override // gh.t
    public void a(java.lang.Object surface, boolean z17) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f271833a;
        ah.i.b("MagicBrushView", "onSurfaceDestroyed %s, %d, %d", surface, java.lang.Integer.valueOf(magicBrushView.getWidth()), java.lang.Integer.valueOf(magicBrushView.getHeight()));
        magicBrushView.getSurfaceListener().d(new gh.f0(surface));
        try {
            if (surface instanceof android.view.Surface) {
                com.tencent.magicbrush.MagicBrush magicBrush = magicBrushView.f48658n;
                if (magicBrush == null) {
                    kotlin.jvm.internal.o.o("magicbrush");
                    throw null;
                }
                magicBrush.l(magicBrushView.getVirtualElementId(), (android.view.Surface) surface, z17);
            } else {
                if (!(surface instanceof android.graphics.SurfaceTexture)) {
                    java.lang.String format = java.lang.String.format("SurfaceType invalid. [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{surface}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    throw new java.lang.RuntimeException(format);
                }
                com.tencent.magicbrush.MagicBrush magicBrush2 = magicBrushView.f48658n;
                if (magicBrush2 == null) {
                    kotlin.jvm.internal.o.o("magicbrush");
                    throw null;
                }
                magicBrush2.k(magicBrushView.getVirtualElementId(), (android.graphics.SurfaceTexture) surface, true);
            }
        } finally {
            magicBrushView.getSurfaceListener().d(new gh.g0(surface));
        }
    }

    @Override // gh.t
    public void b(java.lang.Object surface, int i17, int i18, boolean z17, boolean z18) {
        gh.e0 e0Var = gh.e0.f271816d;
        kotlin.jvm.internal.o.g(surface, "surface");
        ah.i.b("MagicBrushView", "onSurfaceAvailable %s, %d, %d", surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f271833a;
        magicBrushView.getSurfaceListener().d(new gh.c0(surface, i17, i18));
        try {
            if (surface instanceof android.view.Surface) {
                com.tencent.magicbrush.MagicBrush magicBrush = magicBrushView.f48658n;
                if (magicBrush == null) {
                    kotlin.jvm.internal.o.o("magicbrush");
                    throw null;
                }
                magicBrush.i(magicBrushView.getCanvasId(), magicBrushView.getVirtualElementId(), (android.view.Surface) surface, i17, i18, z18);
            } else {
                if (!(surface instanceof android.graphics.SurfaceTexture)) {
                    java.lang.String format = java.lang.String.format("SurfaceType invalid. [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{surface}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    throw new java.lang.RuntimeException(format);
                }
                com.tencent.magicbrush.MagicBrush magicBrush2 = magicBrushView.f48658n;
                if (magicBrush2 == null) {
                    kotlin.jvm.internal.o.o("magicbrush");
                    throw null;
                }
                magicBrush2.h(magicBrushView.getCanvasId(), magicBrushView.getVirtualElementId(), (android.graphics.SurfaceTexture) surface, i17, i18, z17);
            }
        } finally {
            magicBrushView.getSurfaceListener().d(new gh.d0(surface, i17, i18));
            magicBrushView.getClass();
            magicBrushView.getPreparedListeners().d(e0Var);
            magicBrushView.getPreparedListeners().b();
        }
    }

    @Override // gh.t
    public void c(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        ah.i.b("MagicBrushView", "onSurfaceSizeChanged %s, %d, %d", surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f271833a;
        magicBrushView.getSurfaceListener().d(new gh.h0(surface, i17, i18));
        try {
            if (surface instanceof android.view.Surface) {
                com.tencent.magicbrush.MagicBrush magicBrush = magicBrushView.f48658n;
                if (magicBrush == null) {
                    kotlin.jvm.internal.o.o("magicbrush");
                    throw null;
                }
                magicBrush.j(magicBrushView.getVirtualElementId(), (android.view.Surface) surface, i17, i18);
            } else {
                if (!(surface instanceof android.graphics.SurfaceTexture)) {
                    java.lang.String format = java.lang.String.format("SurfaceType invalid. [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{surface}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    throw new java.lang.RuntimeException(format);
                }
                com.tencent.magicbrush.MagicBrush magicBrush2 = magicBrushView.f48658n;
                if (magicBrush2 == null) {
                    kotlin.jvm.internal.o.o("magicbrush");
                    throw null;
                }
                int virtualElementId = magicBrushView.getVirtualElementId();
                android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) surface;
                ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowChanged ", new java.lang.Object[0]);
                if (magicBrush2.f48578b.enable_window_refactor) {
                    magicBrush2.j(virtualElementId, null, i17, i18);
                } else {
                    if (virtualElementId < 0) {
                        throw new java.lang.IllegalArgumentException("windowId < 0");
                    }
                    magicBrush2.o(new yg.u(magicBrush2, surfaceTexture, virtualElementId, i17, i18));
                }
            }
        } finally {
            magicBrushView.getSurfaceListener().d(new gh.i0(surface, i17, i18));
        }
    }
}
