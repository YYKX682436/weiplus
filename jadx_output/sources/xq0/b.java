package xq0;

/* loaded from: classes7.dex */
public class b extends mc3.f {

    /* renamed from: w, reason: collision with root package name */
    public yq0.a f456020w;

    /* renamed from: x, reason: collision with root package name */
    public xq0.d f456021x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xq0.c bizConfig) {
        super(bizConfig);
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        this.f456021x = bizConfig.f456022j;
    }

    public final void K0(xq0.d viewDelegate) {
        kotlin.jvm.internal.o.g(viewDelegate, "viewDelegate");
        if (this.f325635q != null) {
            xq0.d dVar = this.f456021x;
            boolean z17 = false;
            if (dVar != null && dVar.isValid()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.w(this.f325640v, "bindViewDelegate failed: current viewDelegate is still valid, modification is not supported when biz is running");
                return;
            }
        }
        this.f456021x = viewDelegate;
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(this.f325640v, "on canvas view created, canvasId: " + i17);
        yq0.a aVar = this.f456020w;
        if (aVar != null) {
            java.util.HashMap hashMap = aVar.f464419c;
            if (((java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17))) != null) {
                com.tencent.mars.xlog.Log.w("MagicSimpleCanvasReporter", "mark render start, but has marked, canvasId: " + i17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                i95.m c17 = i95.n0.c(je3.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                je3.i.La((je3.i) c17, aVar.f464418b, aVar.f464417a, java.lang.String.valueOf(i17), com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.Start, 0L, null, null, 96, null);
            }
        }
        xq0.d dVar = this.f456021x;
        if (dVar != null) {
            zq0.a aVar2 = (zq0.a) dVar;
            if (aVar2.f474976d != null) {
                return;
            }
            aVar2.addView(view, -1, -1);
            aVar2.f474976d = view;
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        android.view.View view2;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(this.f325640v, "on canvas view layout, canvasId: " + i17);
        xq0.d dVar = this.f456021x;
        if (dVar == null || (view2 = ((zq0.a) dVar).f474976d) == null) {
            return;
        }
        view2.layout(i18, i19, i27 + i18, i28 + i19);
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        zq0.a aVar;
        android.view.View view2;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(this.f325640v, "on canvas view destroy, canvasId: " + i17);
        xq0.d dVar = this.f456021x;
        if (dVar == null || (view2 = (aVar = (zq0.a) dVar).f474976d) == null) {
            return;
        }
        aVar.removeView(view2);
        aVar.f474976d = null;
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        java.lang.Long l17;
        com.tencent.mars.xlog.Log.i(this.f325640v, "on canvas view first frame rendered, canvasId: " + i17);
        yq0.a aVar = this.f456020w;
        if (aVar != null && (l17 = (java.lang.Long) aVar.f464419c.get(java.lang.Integer.valueOf(i17))) != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
            com.tencent.mars.xlog.Log.i("MagicSimpleCanvasReporter", "mark render finish, canvasId: " + i17 + ", renderTime: " + currentTimeMillis);
            i95.m c17 = i95.n0.c(je3.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            je3.i.La((je3.i) c17, aVar.f464418b, aVar.f464417a, java.lang.String.valueOf(i17), com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.FirstFrameFromStart, currentTimeMillis, null, null, 96, null);
        }
        xq0.d dVar = this.f456021x;
        if (dVar != null) {
            dVar.c(i17, z17);
        }
    }

    @Override // mc3.f
    public void destroy() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i(this.f325640v, "destroy, bizName: " + this.f325626e);
            if (!this.f325628g || this.f325631m) {
                jc3.j0 j0Var = this.f325635q;
                if (j0Var != null) {
                    synchronized (j0Var) {
                        ((rc3.w0) j0Var).destroy();
                        this.f325636r = false;
                        ((com.tencent.mm.plugin.magicbrush.i6) ((com.tencent.mm.plugin.magicbrush.g4) i95.n0.c(com.tencent.mm.plugin.magicbrush.g4.class))).Di(((rc3.w0) j0Var).f394087e, com.tencent.mm.plugin.magicbrush.z4.f148219d);
                        this.f325635q = null;
                        this.f325629h = null;
                        this.f325637s.clear();
                        this.f325638t.clear();
                        bf3.p pVar = this.f325633o;
                        if (pVar != null) {
                            pVar.b();
                            android.widget.FrameLayout frameLayout = this.f325634p;
                            if (frameLayout != null) {
                                pVar.c(frameLayout);
                            }
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i(this.f325640v, "isBizActive destroy return");
            }
        }
        this.f456020w = null;
    }

    @Override // jc3.h0
    public void v9(int i17) {
        xq0.d dVar = this.f456021x;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // jc3.h0
    public void zf(int i17) {
    }
}
