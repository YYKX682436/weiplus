package qx4;

/* loaded from: classes8.dex */
public final class p0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qx4.z0 f367436a;

    public p0(qx4.z0 z0Var) {
        this.f367436a = z0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "load wxjs cost:" + (c01.id.c() - this.f367436a.f367478c));
    }
}
