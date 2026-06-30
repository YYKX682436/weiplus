package ou4;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou4.n f348989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f348991f;

    public l(ou4.n nVar, java.lang.String str, java.util.Map map) {
        this.f348989d = nVar;
        this.f348990e = str;
        this.f348991f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = this.f348991f;
        if (!(map instanceof java.util.Map)) {
            map = null;
        }
        ou4.n nVar = this.f348989d;
        java.lang.String eventName = this.f348990e;
        ou4.k kVar = new ou4.k(nVar, eventName);
        com.tencent.mm.plugin.websearch.m2 m2Var = (com.tencent.mm.plugin.websearch.m2) nVar;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(eventName, "eventName");
        com.tencent.pigeon.websearch.WebSearchFlutterApi webSearchFlutterApi = m2Var.f181570h;
        if (webSearchFlutterApi != null) {
            webSearchFlutterApi.callEvent(eventName, map, kVar);
        }
    }
}
