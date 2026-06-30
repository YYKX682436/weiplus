package ui1;

/* loaded from: classes7.dex */
public class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.networking.c0 f428057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.t f428059c;

    public j(ui1.t tVar, com.tencent.mm.plugin.appbrand.networking.c0 c0Var, java.lang.String str) {
        this.f428059c = tVar;
        this.f428057a = c0Var;
        this.f428058b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.h24 h24Var = (r45.h24) obj;
        try {
            ui1.t tVar = this.f428059c;
            com.tencent.mm.plugin.appbrand.networking.c0 c0Var = this.f428057a;
            tVar.getClass();
            ui1.t.a(tVar, c0Var, h24Var);
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth appId = %s, e = %s", this.f428058b, e17);
            km5.u.b().a(e17);
            return null;
        }
    }
}
