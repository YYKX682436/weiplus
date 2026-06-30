package ne0;

@j95.b
/* loaded from: classes7.dex */
public final class n extends i95.w implements oe0.r {

    /* renamed from: d, reason: collision with root package name */
    public pg4.e f336499d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f336500e = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f336501f = new java.util.HashMap();

    public void Ai(java.lang.String key, java.lang.String appId, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] sendEvent key:" + key + ",appId:" + appId);
        cl0.g gVar = new cl0.g();
        gVar.h("appId", appId);
        gVar.h(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, value);
        pg4.e eVar = this.f336499d;
        if (eVar != null) {
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            eVar.G1(key, gVar2);
        }
    }

    public synchronized void Bi(java.lang.String appId, java.lang.String str, android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] biz start ".concat(appId));
        if (this.f336499d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] new biz");
            pg4.e eVar = new pg4.e();
            this.f336499d = eVar;
            eVar.X0();
        }
        pg4.e eVar2 = this.f336499d;
        if (eVar2 != null) {
            eVar2.J1(viewGroup);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] start reference:" + this.f336500e.incrementAndGet());
        if (str != null) {
            Ai("start", appId, str);
        }
    }

    public synchronized void Di(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] biz stop ".concat(appId));
        pg4.e eVar = this.f336499d;
        if (eVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "removeFrameSetView");
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = eVar.A;
            if (magicSclViewContainer != null) {
                magicSclViewContainer.f();
            }
            eVar.A = null;
        }
        Ai("stop", appId, "");
        if (this.f336500e.decrementAndGet() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] stop reference < 0");
            this.f336500e.set(0);
            wi();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        wi();
    }

    public synchronized void wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingFeatureService", "[gameload] forceStop");
        pg4.e eVar = this.f336499d;
        if (eVar != null) {
            hq0.e0 e0Var = eVar.f354237z;
            if (e0Var != null) {
                eVar.F1(e0Var.f282984e);
            }
            eVar.f354237z = null;
        }
        pg4.e eVar2 = this.f336499d;
        if (eVar2 != null) {
            eVar2.destroy();
        }
        synchronized (this.f336501f) {
            this.f336501f.clear();
        }
        this.f336499d = null;
    }
}
