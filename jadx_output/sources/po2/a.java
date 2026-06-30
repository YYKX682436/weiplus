package po2;

/* loaded from: classes3.dex */
public final class a implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    if (trVar.f386720e == 1) {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.parseFrom(trVar.f386721f.f192156a);
                        linkedList2.add(w3Var);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("BypMsgFinderLiveShopSyncHandler", "[onReceive] msgList.size = " + linkedList2.size());
            qo2.e Zj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Zj();
            Zj.getClass();
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new qo2.d(linkedList2, Zj, null), 2, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("BypMsgFinderLiveShopSyncHandler", e17, "", new java.lang.Object[0]);
        }
    }
}
