package yx0;

/* loaded from: classes5.dex */
public final class q implements com.tencent.maas.camstudio.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f467560a;

    public q(yx0.b8 corePlugin) {
        kotlin.jvm.internal.o.g(corePlugin, "corePlugin");
        this.f467560a = new java.lang.ref.WeakReference(corePlugin);
    }

    public void a(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        yx0.b8 b8Var;
        if (mJTime == null || mJTime2 == null || (b8Var = (yx0.b8) this.f467560a.get()) == null) {
            return;
        }
        if (b8Var.B1 == 1) {
            mJTime2 = b8Var.f467177d.getNormalMaxRecordingDuration();
        } else if (!mJTime2.isNumeric()) {
            mJTime2 = b8Var.V1;
        }
        yz5.p pVar = b8Var.U1;
        if (pVar != null) {
            pVar.invoke(mJTime, mJTime2);
        }
        boolean isNumeric = mJTime2.isNumeric();
        if (mJTime.isNumeric() && isNumeric) {
            double seconds = (mJTime.toSeconds() / mJTime2.toSeconds()) * 100;
            yz5.l lVar = b8Var.T1;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf((int) seconds));
            }
        }
        mJTime.toSeconds();
        mJTime2.toSeconds();
        if (isNumeric && b8Var.f467192s == yx0.v.f467705s && !b8Var.F1 && !mJTime.smallThan(mJTime2)) {
            b8Var.F1 = true;
            kotlinx.coroutines.y0 y0Var = b8Var.L;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new yx0.p(mJTime, mJTime2, b8Var, null), 2, null);
        }
    }
}
