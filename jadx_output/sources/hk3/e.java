package hk3;

/* loaded from: classes8.dex */
public final class e implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        r45.du5 du5Var;
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
            com.tencent.mars.xlog.Log.i("MultiTaskMsgSyncHandler", "[onReceive] msgList.size = " + linkedList2.size());
            java.util.Iterator it6 = linkedList2.iterator();
            boolean z18 = false;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                r45.j4 j4Var = ((r45.w3) it6.next()).f388826d;
                if (j4Var.f377560g == 10002) {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d((j4Var == null || (du5Var = j4Var.f377561h) == null) ? null : du5Var.f372756d, "sysmsg", null);
                    java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                    if (kotlin.jvm.internal.o.b("starcmd", str) && kotlin.jvm.internal.o.b("sync", (java.lang.String) d17.get(".sysmsg.cmd"))) {
                        z18 = true;
                    }
                    com.tencent.mars.xlog.Log.i("MultiTaskMsgSyncHandler", "processMsg: type：%s", str);
                }
            }
            if (z18) {
                int i17 = com.tencent.mm.plugin.multitask.l0.f150465z0;
                com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
                j75.f Ai = k0Var != null ? ((com.tencent.mm.plugin.multitask.j1) k0Var).Ai() : null;
                if (Ai != null) {
                    Ai.B3(new ik3.f());
                }
                com.tencent.mars.xlog.Log.i("MultiTaskMsgSyncHandler", "doSync");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MultiTaskMsgSyncHandler", e17, "", new java.lang.Object[0]);
        }
    }
}
