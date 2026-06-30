package w71;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w71.s f443435a;

    public q(w71.s sVar) {
        this.f443435a = sVar;
    }

    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBeforeDoScene, query: ");
        w71.s sVar = this.f443435a;
        sb6.append(sVar.f443440a.b());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", sb6.toString());
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new w71.p(sVar, java.lang.System.currentTimeMillis(), null), 2, null);
    }
}
