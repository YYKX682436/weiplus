package xw;

/* loaded from: classes4.dex */
public final class f implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.tr trVar = (r45.tr) it.next();
                if (trVar.f386720e == 1) {
                    r45.w3 w3Var = new r45.w3();
                    w3Var.parseFrom(trVar.f386721f.f192156a);
                    r45.j4 j4Var = w3Var.f388826d;
                    if (j4Var.f377560g == 10002) {
                        com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(j4Var, false, false, false);
                        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BizMergeNotification", "null msg content");
                        } else {
                            kotlin.jvm.internal.o.d(g17);
                            int L = r26.n0.L(g17, "<appmsg", 0, false, 6, null);
                            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                            if (L != -1) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BizMergeNotification", "msgContent start with <appmsg");
                                java.lang.String substring = g17.substring(L);
                                kotlin.jvm.internal.o.f(substring, "substring(...)");
                                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(substring, "appmsg", null);
                                h0Var.f310123d = d17;
                                if (d17 == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.BizMergeNotification", "XmlParser values is null, msgContent %s", g17);
                                } else if (kotlin.jvm.internal.o.b((java.lang.String) d17.get(".appmsg.title"), "bizMergeMsgNotifyV2")) {
                                    yq1.n.a("BrandServiceWorkerThread", new xw.e(h0Var, p0Var), 0L);
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BizMergeNotification", "msgContent start with <appmsg, subType is not MM_DATA_SYSCMD_NEWXML_SUBTYPE_BIZ_MERGE_NOTIFY");
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.BizMergeNotification", "msgContent not start with <appmsg");
                            }
                        }
                    }
                }
            }
        }
    }
}
