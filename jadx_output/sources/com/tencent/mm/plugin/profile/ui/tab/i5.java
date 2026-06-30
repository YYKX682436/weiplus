package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f154363e;

    public i5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo, com.tencent.mm.storage.z3 z3Var) {
        this.f154362d = contactWidgetTabBizInfo;
        this.f154363e = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154362d.f154220y;
        if (m0Var == null || (s4Var = m0Var.f154464s) == null) {
            return;
        }
        s4Var.f154555f = this.f154363e;
        s4Var.x("");
        m0Var.f154464s.w();
        m0Var.f154464s.A();
    }
}
