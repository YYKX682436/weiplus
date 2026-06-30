package jf;

/* loaded from: classes7.dex */
public final class o implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        sj1.b bVar;
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        int i17 = sj1.l.f408371a;
        if (i17 != 1 && i17 != 3) {
            android.widget.Toast.makeText(context, "Not in Perfetto mod", 1).show();
            return;
        }
        if ((!sj1.l.f408372b || (bVar = (sj1.b) sj1.l.f408373c.get("")) == null) ? false : bVar.getF45816a()) {
            android.widget.Toast.makeText(context, "Stop Trace", 1).show();
            pageView.getRuntime().C0().getAsyncHandler().post(jf.k.f299337d);
            com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = pageView.getRuntime().C0().getF147808e();
            kotlin.jvm.internal.o.f(f147808e, "getJsRuntime(...)");
            com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
            pageView.a2().evaluateJavascript(";TraceGlobal.flushTrace();", jf.l.f299338a);
            f0Var.post(new jf.n(context));
            return;
        }
        android.widget.Toast.makeText(context, "Start Trace", 1).show();
        if (sj1.l.f408372b) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            sj1.b bVar2 = (sj1.b) sj1.l.f408373c.get("");
            if (bVar2 != null) {
                bVar2.i();
            }
            com.tencent.mars.xlog.Log.i("Luggage.LuggageTracer", "startTrace cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        return "Skyline Trace";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a();
    }
}
