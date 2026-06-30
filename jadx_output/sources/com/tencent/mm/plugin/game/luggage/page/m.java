package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class m implements vz.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.u f139921a;

    public m(com.tencent.mm.plugin.game.luggage.page.u uVar) {
        this.f139921a = uVar;
    }

    @Override // vz.w1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.GameWebActionBar", str);
        this.f139921a.E.p(!(r2 instanceof com.tencent.mm.plugin.game.luggage.page.a));
    }

    @Override // vz.w1
    public void onDismiss() {
        this.f139921a.E.p(!(r0 instanceof com.tencent.mm.plugin.game.luggage.page.a));
    }
}
