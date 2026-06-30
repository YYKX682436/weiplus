package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.l0 f177646d;

    public i0(com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var) {
        this.f177646d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f177646d.f177687p.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.wallet.balance.ui.lqt.d7) ((com.tencent.mm.plugin.wallet.balance.model.lqt.k0) it.next())).a(false, "");
        }
    }
}
