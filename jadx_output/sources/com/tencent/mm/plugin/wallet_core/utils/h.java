package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.m f180898a;

    public h(com.tencent.mm.plugin.wallet_core.utils.m mVar) {
        this.f180898a = mVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.wallet_core.utils.m mVar = this.f180898a;
        mVar.f180927d = linkedList;
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            if (bankcard.v0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", "ignore balance!!");
            } else {
                mVar.f180927d.add(bankcard.field_bankcardType);
            }
        }
        if (mVar.f180927d.size() <= 0) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", "need fetch bank logo, %s", java.lang.Integer.valueOf(mVar.f180927d.size()));
        km5.b b17 = km5.u.b();
        ss4.f fVar = new ss4.f(mVar.f180927d);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1650, new com.tencent.mm.plugin.wallet_core.utils.g(this, b17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(fVar);
        b17.b();
        return null;
    }
}
