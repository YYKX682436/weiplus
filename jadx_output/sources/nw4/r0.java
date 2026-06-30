package nw4;

/* loaded from: classes8.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f340953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340956g;

    public r0(nw4.n nVar, java.util.Map map, java.lang.String str, java.lang.String str2) {
        this.f340956g = nVar;
        this.f340953d = map;
        this.f340954e = str;
        this.f340955f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.util.Map map = this.f340953d;
            if (map != null && map.size() != 0) {
                for (java.lang.String str : this.f340953d.keySet()) {
                    com.tencent.xweb.d.g().b(com.tencent.mm.sdk.platformtools.t8.E(this.f340954e), str + "=" + ((java.lang.String) this.f340953d.get(str)));
                }
                com.tencent.xweb.d.g().b(com.tencent.mm.sdk.platformtools.t8.E(this.f340954e), "httponly");
                com.tencent.xweb.d.g().flush();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "cookies:%s", com.tencent.xweb.d.g().a(com.tencent.mm.sdk.platformtools.t8.E(this.f340954e)));
            }
            this.f340956g.f340887a.evaluateJavascript(java.lang.String.format("javascript:(function(){ window.getA8KeyUrl='%s'; })()", this.f340954e), null);
            this.f340956g.f340887a.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
            nw4.n nVar = this.f340956g;
            if (nVar.f340895i) {
                nVar.f340887a.evaluateJavascript(this.f340955f, null);
                this.f340956g.M = null;
                this.f340956g.N = 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetA8KeyUrl fail, ex = %s", e17.getMessage());
        }
    }
}
