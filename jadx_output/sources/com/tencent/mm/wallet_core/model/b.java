package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.e f213855a;

    public b(com.tencent.mm.wallet_core.model.e eVar) {
        this.f213855a = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.wallet_core.model.e eVar = this.f213855a;
        eVar.f213884b = false;
        java.util.ArrayList arrayList = (java.util.ArrayList) eVar.f213883a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                eVar.f213887e.setValue((r45.js5) fVar.f70618d);
                return null;
            }
            com.tencent.mm.wallet_core.model.d dVar = (com.tencent.mm.wallet_core.model.d) arrayList.get(size);
            dVar.b((r45.js5) fVar.f70618d, fVar.f70616b, fVar.f70615a);
            arrayList.remove(dVar);
        }
    }
}
