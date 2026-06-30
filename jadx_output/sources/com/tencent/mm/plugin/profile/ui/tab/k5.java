package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f154382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154383e;

    public k5(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154382d = z3Var;
        this.f154383e = contactWidgetTabBizInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.z3 z3Var = this.f154382d;
        if ((z3Var != null ? z3Var.d1() : null) != null) {
            ((c01.k7) c01.n8.a()).e(z3Var.d1());
        }
        c01.p8 a17 = c01.n8.a();
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154383e;
        ((c01.k7) a17).b(d17, 5, new com.tencent.mm.plugin.profile.ui.tab.j5(contactWidgetTabBizInfo));
        contactWidgetTabBizInfo.c().d();
    }
}
