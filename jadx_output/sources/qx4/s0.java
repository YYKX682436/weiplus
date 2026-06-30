package qx4;

/* loaded from: classes8.dex */
public final class s0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qx4.z0 f367446a;

    public s0(qx4.z0 z0Var) {
        this.f367446a = z0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        long c17 = c01.id.c();
        qx4.z0 z0Var = this.f367446a;
        long j17 = c17 - z0Var.f367478c;
        qx4.m0 b17 = qx4.l0.f367422a.b(z0Var.f367477b);
        if (b17 != null && (atomicBoolean = b17.f367431g) != null) {
            atomicBoolean.set(true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preload completed cost:" + j17);
    }
}
