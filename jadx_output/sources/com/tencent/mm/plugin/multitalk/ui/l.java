package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f150291d;

    public l(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.f150291d = multiTalkMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        if ((Ri.f150188z1 ? false : com.tencent.mm.plugin.multitalk.model.o2.g(Ri.f150165h)) && com.tencent.mm.plugin.multitalk.model.e3.wi().b() && !com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m && !com.tencent.mm.plugin.multitalk.model.e3.wi().c()) {
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f150291d;
            if (multiTalkMainUI.f150239r) {
                multiTalkMainUI.f150242u.O6(java.lang.Boolean.TRUE);
            } else {
                multiTalkMainUI.f150229e.u(true);
            }
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().W();
        com.tencent.mm.plugin.multitalk.model.e3.Ri().T();
    }
}
