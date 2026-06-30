package tn0;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un0.h f420717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f420718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f420719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(un0.h hVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.g0 g0Var, tn0.w0 w0Var) {
        super(1);
        this.f420717d = hVar;
        this.f420718e = h0Var;
        this.f420719f = g0Var;
        this.f420720g = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        is0.c cVar = (is0.c) obj;
        if (un0.s.f429418b != null) {
            un0.h hVar = this.f420717d;
            boolean booleanValue = ((java.lang.Boolean) hVar.f429364m.invoke()).booleanValue();
            kotlin.jvm.internal.h0 h0Var = this.f420718e;
            tn0.w0 w0Var = this.f420720g;
            if (booleanValue) {
                android.graphics.Bitmap bitmap = hVar.f429356e;
                long j17 = hVar.f429357f;
                if (bitmap != null) {
                    java.lang.Object obj2 = h0Var.f310123d;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    boolean b17 = kotlin.jvm.internal.o.b(obj2, bool);
                    kotlin.jvm.internal.g0 g0Var = this.f420719f;
                    if (!b17 || g0Var.f310121d != j17) {
                        w0Var.N0(bitmap, 1);
                        w0Var.d0(true);
                        h0Var.f310123d = bool;
                        g0Var.f310121d = j17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#startScreenCastPreview set isLastFramePause true");
                    }
                }
            } else {
                java.lang.Object obj3 = h0Var.f310123d;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                if (!kotlin.jvm.internal.o.b(obj3, bool2)) {
                    w0Var.d0(false);
                    h0Var.f310123d = bool2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#startScreenCastPreview set isLastFramePause false");
                }
                if (cVar != null) {
                    android.opengl.EGLContext eGLContext = w0Var.f420772s.getEGLContext();
                    if (eGLContext != null) {
                        int i17 = cVar.f294395e;
                        int i18 = cVar.f294400m;
                        int i19 = cVar.f294401n;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j18 = w0Var.I1;
                        if (currentTimeMillis >= j18) {
                            if (currentTimeMillis - j18 < 33) {
                                w0Var.I1 = j18 + 33;
                            } else {
                                w0Var.I1 = currentTimeMillis + 16;
                            }
                            w0Var.s0(eGLContext, i17, i18, i19, 0L, false);
                        }
                    } else {
                        if (w0Var.f420777x) {
                            hn0.g gVar = fn0.g.f264196b;
                            if (gVar != null) {
                                ((vd2.l5) gVar).wi("startScreenCastPreview_1", false);
                            }
                            w0Var.f420777x = false;
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "#startScreenCastPreview glContext is null!");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "#startScreenCastPreview glTextureObject is null!");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "#startScreenCastPreview runningRecorder->isScreenCastRunning == false");
        }
        return jz5.f0.f302826a;
    }
}
