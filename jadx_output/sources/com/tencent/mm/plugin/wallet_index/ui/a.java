package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f181133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.b f181134b;

    public a(com.tencent.mm.plugin.wallet_index.ui.b bVar, boolean z17) {
        this.f181134b = bVar;
        this.f181133a = z17;
    }

    public void a(nt4.f fVar, mt4.d dVar) {
        if (fVar.c() || dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GoogleWallet", "Failed to query inventory: " + fVar);
            return;
        }
        com.tencent.mm.plugin.wallet_index.ui.b bVar = this.f181134b;
        com.tencent.mm.plugin.wallet_index.ui.c cVar = bVar.f181136a;
        cVar.f181145f = dVar;
        com.tencent.mm.plugin.wallet_index.ui.e eVar = cVar.f181142c;
        java.util.Map map = dVar.f331301a;
        java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.HashMap) map).keySet());
        java.util.ArrayList arrayList2 = (java.util.ArrayList) eVar.f181162k;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(((java.util.HashMap) map).values());
        if (arrayList3.size() <= 0) {
            nt4.f a17 = !this.f181133a ? nt4.f.a(5) : nt4.f.a(0);
            com.tencent.mm.plugin.wallet_index.ui.f fVar2 = bVar.f181136a.f181143d;
            if (fVar2 != null) {
                fVar2.a(a17, null);
                return;
            }
            return;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            mt4.e eVar2 = (mt4.e) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleWallet", "do NetSceneVerifyPurchase. productId:" + eVar2.f331304c + ",billNo:" + eVar2.f331305d);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(bVar.f181136a.f181142c.a(eVar2, true));
        }
    }
}
