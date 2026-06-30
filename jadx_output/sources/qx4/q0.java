package qx4;

/* loaded from: classes8.dex */
public final class q0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qx4.z0 f367438a;

    public q0(qx4.z0 z0Var) {
        this.f367438a = z0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "sys:init cost:" + (c01.id.c() - this.f367438a.f367478c));
    }
}
