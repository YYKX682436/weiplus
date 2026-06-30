package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.l0 f177643e;

    public h0(com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var, java.lang.String str) {
        this.f177643e = l0Var;
        this.f177642d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f177643e.f177687p.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.wallet.balance.ui.lqt.d7) ((com.tencent.mm.plugin.wallet.balance.model.lqt.k0) it.next())).a(true, this.f177642d);
        }
    }
}
