package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.p f139925e;

    public o(com.tencent.mm.plugin.game.luggage.page.p pVar, boolean z17) {
        this.f139925e = pVar;
        this.f139924d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f139924d;
        com.tencent.mm.plugin.game.luggage.page.p pVar = this.f139925e;
        if (z17) {
            pVar.f139927a.K.setVisibility(0);
        } else {
            pVar.f139927a.K.setVisibility(8);
        }
    }
}
