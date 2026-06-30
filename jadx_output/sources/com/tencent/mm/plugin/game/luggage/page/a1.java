package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.c1 f139869d;

    public a1(com.tencent.mm.plugin.game.luggage.page.c1 c1Var) {
        this.f139869d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.c1 c1Var = this.f139869d;
        uw4.n nVar = c1Var.f182180p;
        if (nVar != null) {
            java.lang.String title = nVar.getTitle();
            if (com.tencent.mm.sdk.platformtools.t8.K0(title)) {
                return;
            }
            c1Var.I(title, 0);
        }
    }
}
