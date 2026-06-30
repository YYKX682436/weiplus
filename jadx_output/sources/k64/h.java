package k64;

/* loaded from: classes.dex */
public abstract class h {
    public static final void a(r45.mr5 request, int i17, java.lang.String cgiUrl, yz5.l cgiCallback, r45.js5 js5Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        kotlin.jvm.internal.o.g(cgiCallback, "cgiCallback");
        com.tencent.mars.xlog.Log.i("CgiRequestHelper", "requestCgi() called with: request = " + request + ", funcId = " + i17 + ' ' + z17);
        try {
            yz5.l cVar = z17 ? new k64.c(new java.lang.ref.WeakReference(cgiCallback)) : new k64.d(cgiCallback);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = request;
            lVar.f70665b = js5Var;
            lVar.f70666c = cgiUrl;
            lVar.f70667d = i17;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            k64.g gVar = new k64.g(i17, a17);
            gVar.doScene(gm0.j1.d().f70764d, new k64.e(gVar, cVar, a17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("CgiRequestHelper", "requestCgi error: request = " + request + ", funcId = " + i17 + ' ' + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper");
    }
}
