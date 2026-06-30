package xt2;

/* loaded from: classes.dex */
public final class k6 implements com.tencent.mm.plugin.appbrand.widget.d0 {
    public static final java.lang.Object e(xt2.k6 k6Var, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        k6Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        try {
            cl0.g gVar = new cl0.g(str);
            gVar.r("isFirstReq", z17);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            str = gVar2;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("FinderProductAutoScrollWidget", "fetch data, append isFirstReq failed");
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(str), xt2.g6.class, new xt2.j6(nVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public int a() {
        return com.tencent.mm.R.id.r_1;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(onWidgetCreated, "onWidgetCreated");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new xt2.i6(this, data, context, onWidgetCreated, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        return new android.widget.RelativeLayout.LayoutParams(-1, -2);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("FinderProductAutoScrollWidget", "create widget with data ".concat(data));
        return new android.view.View(context);
    }
}
