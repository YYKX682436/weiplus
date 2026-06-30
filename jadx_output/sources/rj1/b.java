package rj1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg f396164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f396165e;

    public b(com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg appBrandOnGetTipsMsg, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f396164d = appBrandOnGetTipsMsg;
        this.f396165e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo;
        com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg appBrandOnGetTipsMsg = this.f396164d;
        boolean z17 = appBrandOnGetTipsMsg.f89230g;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f396165e;
        if (!z17) {
            rj1.c cVar = new rj1.c();
            com.tencent.mm.plugin.appbrand.service.c0 C0 = o6Var.C0();
            kotlin.jvm.internal.o.f(C0, "getService(...)");
            cVar.x(C0, appBrandOnGetTipsMsg.f89229f);
            return;
        }
        if (o6Var.C0().getAppState() == u81.b.FOREGROUND) {
            rj1.c cVar2 = new rj1.c();
            com.tencent.mm.plugin.appbrand.service.c0 C02 = o6Var.C0();
            kotlin.jvm.internal.o.f(C02, "getService(...)");
            cVar2.x(C02, appBrandOnGetTipsMsg.f89229f);
            return;
        }
        java.util.ArrayList arrayList = appBrandOnGetTipsMsg.f89229f;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null || (tipsMsgInfo = (com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo) kz5.n0.X(arrayList)) == null) {
            return;
        }
        rj1.m.c(tipsMsgInfo);
    }
}
