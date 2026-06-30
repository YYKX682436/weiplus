package u22;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.r f424005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u22.r rVar) {
        super(0);
        this.f424005d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processRecommend: ");
        u22.r rVar = this.f424005d;
        sb6.append(rVar.f424024l.size());
        sb6.append(", ");
        sb6.append(rVar.f424020h);
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = rVar.f424024l;
        int i17 = 0;
        if (linkedList2.size() > 0) {
            linkedList.add(u22.r.f424007q);
            linkedList.addAll(linkedList2);
            for (r45.p64 p64Var : rVar.f424025m) {
                java.util.Iterator it = linkedList2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((r45.p64) it.next()).f382792d, p64Var.f382792d)) {
                        break;
                    }
                    i18++;
                }
                if (i18 < 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", "processRecommend: append");
                    linkedList.add(p64Var);
                }
            }
            if (rVar.f424020h || rVar.f424017e) {
                linkedList.add(u22.r.f424008r);
            } else {
                linkedList.add(u22.r.f424009s);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (java.lang.Object obj : linkedList) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new t85.d((r45.p64) obj, i17, 1));
            i17 = i19;
        }
        u22.k kVar = (u22.k) rVar.f424014b;
        kVar.getClass();
        pm0.v.L("StickerPanelCallbackWrapper_onRecommend", true, new u22.j(kVar, arrayList));
        return jz5.f0.f302826a;
    }
}
