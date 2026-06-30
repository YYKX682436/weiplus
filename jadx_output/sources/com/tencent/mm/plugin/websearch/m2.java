package com.tencent.mm.plugin.websearch;

/* loaded from: classes8.dex */
public final class m2 extends ou4.n implements com.tencent.pigeon.websearch.WebSearchHostApi {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f181569g = "MicroMsg.hitest.WebSearchFlutterPlugin";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.pigeon.websearch.WebSearchFlutterApi f181570h;

    public final void b(tg0.q1 q1Var) {
        com.tencent.mars.xlog.Log.i(this.f181569g, "setCallback");
        for (ou4.c0 c0Var : vg0.n.f436463a.a(q1Var)) {
            this.f348995d.put(c0Var.b(), c0Var);
        }
    }

    @Override // com.tencent.pigeon.websearch.WebSearchHostApi
    public java.util.Map callApi(java.lang.String apiName, java.util.Map map) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        ou4.c0 c0Var = (ou4.c0) this.f348995d.get(apiName);
        java.lang.String str = this.f181569g;
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w(str, "callApi: no handler for apiName=".concat(apiName));
            return kz5.c1.k(new jz5.l("error", "NOT_FOUND"), new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "No handler for apiName: ".concat(apiName)));
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        ou4.m mVar = new ou4.m(h0Var, h0Var2, h0Var3);
        if (map == null) {
            map = null;
        }
        try {
            c0Var.a(map, mVar);
            java.lang.Object obj = h0Var2.f310123d;
            if (obj == null) {
                java.util.Map map2 = (java.util.Map) h0Var.f310123d;
                return map2 == null ? kz5.q0.f314001d : map2;
            }
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("error", obj);
            java.lang.String str2 = (java.lang.String) h0Var3.f310123d;
            lVarArr[1] = new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str2 != null ? str2 : "");
            return kz5.c1.k(lVarArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "callApi: handler error, apiName=".concat(apiName), e17);
            jz5.l[] lVarArr2 = new jz5.l[2];
            lVarArr2[0] = new jz5.l("error", "HANDLER_ERROR");
            java.lang.String message = e17.getMessage();
            lVarArr2[1] = new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, message != null ? message : "");
            return kz5.c1.k(lVarArr2);
        }
    }
}
