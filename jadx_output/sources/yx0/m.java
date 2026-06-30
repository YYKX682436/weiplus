package yx0;

/* loaded from: classes5.dex */
public final class m implements com.tencent.maas.camstudio.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f467444a;

    public m(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(weakReference, "weakReference");
        this.f467444a = weakReference;
    }

    public void a(com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams) {
        yx0.b8 b8Var = (yx0.b8) this.f467444a.get();
        if (b8Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBeginRequestAIGCFunc: params: ");
            sb6.append(mJAIGCParams != null ? java.lang.Integer.valueOf(mJAIGCParams.getRequestID()) : null);
            sb6.append(", ");
            sb6.append(mJAIGCParams != null ? mJAIGCParams.getImageFilePath() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", sb6.toString());
            if (mJAIGCParams == null) {
                return;
            }
            b8Var.f467195v = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.e(b8Var, mJAIGCParams, this, null), 3, null);
            b8Var.f467196w = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.g(b8Var, null), 3, null);
            kotlinx.coroutines.r2 r2Var = b8Var.f467195v;
            if (r2Var != null) {
                r2Var.p(new yx0.i(b8Var));
            }
        }
    }
}
