package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class nb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.same_net_verify.c f186392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.tencent.wechat.aff.same_net_verify.c cVar, nw4.k kVar, nw4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f186392d = cVar;
        this.f186393e = kVar;
        this.f186394f = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.nb(this.f186392d, this.f186393e, this.f186394f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.nb nbVar = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.nb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.wechat.aff.same_net_verify.c cVar = this.f186392d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mars.xlog.Log.i("SameNetVerifyTAG", "myCallback begin");
            boolean z17 = cVar.f217489d;
            boolean[] zArr = cVar.f217495m;
            nw4.y2 y2Var = this.f186394f;
            nw4.k kVar = this.f186393e;
            if (z17) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String str = zArr[2] ? cVar.f217490e : "";
                kotlin.jvm.internal.o.f(str, "getResp(...)");
                linkedHashMap.put("resp", str);
                kVar.f340863d.e(y2Var.f341013c, "sameNetVerify:ok", linkedHashMap);
            } else {
                nw4.g gVar = kVar.f340863d;
                java.lang.String str2 = y2Var.f341013c;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sameNetVerify:fail ");
                sb6.append(zArr[3] ? cVar.f217491f : "");
                gVar.e(str2, sb6.toString(), null);
            }
            com.tencent.mars.xlog.Log.i("SameNetVerifyTAG", "myCallback end");
            com.tencent.wechat.aff.same_net_verify.b.f217486b.a();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            com.tencent.wechat.aff.same_net_verify.b.f217486b.a();
            throw th6;
        }
    }
}
