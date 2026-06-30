package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f186993d = kVar;
        this.f186994e = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong result = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String u17 = pm0.v.u(result.f68405d);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo callback localFeedId: ".concat(u17));
        nw4.g gVar = this.f186993d.f340863d;
        nw4.y2 y2Var = this.f186994e;
        java.lang.String str = y2Var.f341013c;
        java.lang.String str2 = y2Var.f341019i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("localFeedId", u17);
        gVar.e(str, str2, hashMap);
        return jz5.f0.f302826a;
    }
}
