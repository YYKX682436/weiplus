package tb5;

/* loaded from: classes12.dex */
public abstract class j0 implements jj.e {
    @Override // jj.e
    public final void a(java.lang.String sceneName, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        java.lang.Number valueOf;
        kotlin.jvm.internal.o.g(sceneName, "sceneName");
        if (iArr == null) {
            return;
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        int i19 = iArr[2];
        int i27 = iArr[3];
        int i28 = i18 + i19 + i27 + iArr[4];
        if (i28 == 0) {
            valueOf = java.lang.Float.valueOf(0.0f);
        } else {
            float f27 = i28;
            valueOf = java.lang.Double.valueOf(((i18 * 1.0f) / f27) + ((i19 * 14.0f) / f27) + ((i27 * 25.0f) / f27) + ((r4 * 60.0f) / f27));
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(valueOf);
        }
        e(sceneName, jArr, iArr, iArr2, f17, f18, f19, valueOf.floatValue());
    }

    @Override // jj.e
    public boolean b() {
        return false;
    }

    @Override // jj.e
    public int c() {
        return Integer.MAX_VALUE;
    }

    @Override // jj.e
    public int d() {
        return 0;
    }

    public abstract void e(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19, float f27);

    public final void f() {
        com.tencent.mm.feature.performance.q1 q1Var = (com.tencent.mm.feature.performance.q1) ((ob0.x2) i95.n0.c(ob0.x2.class));
        kj.m mVar = q1Var.f67633d;
        if (mVar != null && mVar.f308216d) {
            q1Var.f67633d.l(this, true);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        kj.m mVar2 = q1Var.f67633d;
        objArr[0] = mVar2 == null ? "null" : java.lang.Boolean.valueOf(mVar2.f308216d);
        com.tencent.mars.xlog.Log.w("FrameTraceService", "unregister failed, frameTrace=%s", objArr);
    }

    @Override // jj.e
    public java.lang.String getName() {
        return "";
    }
}
