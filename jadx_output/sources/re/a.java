package re;

/* loaded from: classes7.dex */
public abstract class a extends com.tencent.luggage.sdk.jsapi.component.a implements com.tencent.mm.plugin.appbrand.page.d7 {
    public a(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        super(bVar);
    }

    public void A() {
    }

    public final java.lang.String H() {
        com.tencent.mm.plugin.appbrand.jsapi.l F = F();
        if (F != null) {
            return F.getAppId();
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AbstractPageViewRenderer", new java.lang.Throwable(), "getAppId", new java.lang.Object[0]);
        return null;
    }

    public android.content.Context I() {
        android.content.Context context = ((com.tencent.luggage.sdk.jsapi.component.b) F()).getContext();
        return context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
    }

    public ze.n J() {
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) F();
        if (bVar == null) {
            return null;
        }
        return bVar.t3();
    }

    public boolean b() {
        return false;
    }

    public void c(xi1.g gVar) {
    }

    public void k() {
        for (java.lang.Object obj : E()) {
            if (obj instanceof ni1.c) {
                ((ni1.c) obj).c();
            }
        }
    }

    public void m() {
        for (java.lang.Object obj : E()) {
            if (obj instanceof ni1.c) {
                ((ni1.c) obj).onDestroy();
            }
        }
        synchronized (this.f47331e) {
            ((java.util.HashMap) this.f47331e).clear();
        }
        synchronized (this) {
            this.f47330d = null;
        }
    }

    public void n() {
        for (java.lang.Object obj : E()) {
            if (obj instanceof ni1.c) {
                ((ni1.c) obj).b();
            }
        }
    }

    public void u(java.util.Map map, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
    }

    public void v() {
    }
}
