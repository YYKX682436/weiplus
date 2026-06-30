package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class g1 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f180896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.e1 f180897e;

    public g1(java.util.List list, com.tencent.mm.plugin.wallet_core.utils.e1 e1Var) {
        this.f180896d = list;
        this.f180897e = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f180896d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.utils.i1.a(com.tencent.mm.plugin.wallet_core.utils.i1.f180905a, (com.tencent.mm.storage.f9) it.next(), this.f180897e);
        }
    }
}
