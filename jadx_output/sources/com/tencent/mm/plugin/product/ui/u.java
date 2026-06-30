package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RcptRecentAddrEvent f153356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.w f153357e;

    public u(com.tencent.mm.plugin.product.ui.w wVar, com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent) {
        this.f153357e = wVar;
        this.f153356d = rcptRecentAddrEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent = this.f153356d;
        int i17 = rcptRecentAddrEvent.f54644h.f7253a;
        boolean z17 = rcptRecentAddrEvent.f54644h.f7254b;
        int i18 = rcptRecentAddrEvent.f54644h.f7253a;
        com.tencent.mm.plugin.product.ui.w wVar = this.f153357e;
        if (i18 == 0) {
            wq3.j jVar = wVar.f153367g;
            jVar.getClass();
            r45.d5 d5Var = new r45.d5();
            am.lp lpVar = rcptRecentAddrEvent.f54644h;
            java.lang.String str = lpVar.f7257e;
            d5Var.f372122h = str;
            d5Var.f372123i = lpVar.f7256d;
            d5Var.f372124m = lpVar.f7258f;
            d5Var.f372119e = lpVar.f7259g;
            d5Var.f372120f = lpVar.f7260h;
            d5Var.f372118d = lpVar.f7261i;
            d5Var.f372121g = lpVar.f7263k;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(d5Var.f372123i)) {
                jVar.f448556i = d5Var;
            }
        }
        wVar.f153365e = false;
    }
}
