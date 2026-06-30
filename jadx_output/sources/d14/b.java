package d14;

/* loaded from: classes11.dex */
public class b implements dn.k {
    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "getCdnAuthInfo, mediaId = %s", str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        r45.pw3 pw3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback, id: %s, ret: %s, sceneResult: %s", str, java.lang.Integer.valueOf(i17), hVar);
        wu5.c cVar = null;
        if (hVar != null) {
            try {
                if (hVar.field_retCode == 0) {
                    r45.pw3 pw3Var2 = (r45.pw3) ((java.util.concurrent.ConcurrentHashMap) d14.f.f225737n).get(str);
                    if (pw3Var2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback, info is null??");
                    } else {
                        pw3Var2.f383431m = 1;
                        byte[] N = com.tencent.mm.vfs.w6.N(pw3Var2.f383426e, 0, -1);
                        if (pw3Var2.f383427f) {
                            r45.uy uyVar = new r45.uy();
                            uyVar.parseFrom(N);
                            r45.uy uyVar2 = com.tencent.mm.sdk.platformtools.t8.K0(pw3Var2.f383429h) ^ true ? uyVar : null;
                            if (uyVar2 != null) {
                                java.util.LinkedList linkedList = uyVar2.f387732d;
                                if (linkedList != null) {
                                    ku5.u0 u0Var = ku5.t0.f312615d;
                                    a14.d dVar = new a14.d(pw3Var2, linkedList);
                                    ku5.t0 t0Var = (ku5.t0) u0Var;
                                    t0Var.getClass();
                                    cVar = t0Var.k(dVar, 0L);
                                }
                                if (cVar == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.HistoryRecordUnPackMsgLogic", "unPackMsg magList is null");
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.HistoryRecordUnPackMsgLogic", "unPackMsg chatHistoryMsgList is null");
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback， msg size:%s", java.lang.Integer.valueOf(uyVar.f387732d.size()));
                        } else {
                            java.lang.String str2 = new java.lang.String(N);
                            long j17 = pw3Var2.f383425d;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wcf://selectrecord/");
                            sg3.r.aj();
                            sb6.append(j17);
                            java.lang.String sb7 = sb6.toString();
                            if (com.tencent.mm.vfs.w6.j(sb7)) {
                                com.tencent.mm.vfs.w6.h(sb7);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback, msgId:%s filePath:%s xml:%s result:%s delResult:%s", java.lang.Long.valueOf(pw3Var2.f383425d), pw3Var2.f383426e, com.tencent.mm.sdk.platformtools.t8.G1(str2), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.d(pw3Var2.f383426e, sb7, false)), java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(pw3Var2.f383426e)));
                            d14.a aVar = (d14.a) ((java.util.concurrent.ConcurrentHashMap) d14.f.f225738o).get(java.lang.Long.valueOf(pw3Var2.f383425d));
                            if (aVar != null) {
                                ((d14.f) aVar).g(pw3Var2.f383425d, str2);
                            }
                        }
                    }
                    return 0;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "callback %s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        if (hVar != null && hVar.field_retCode != 0 && (pw3Var = (r45.pw3) ((java.util.concurrent.ConcurrentHashMap) d14.f.f225737n).get(str)) != null) {
            pw3Var.f383431m = 2;
            d14.a aVar2 = (d14.a) ((java.util.concurrent.ConcurrentHashMap) d14.f.f225738o).get(java.lang.Long.valueOf(pw3Var.f383425d));
            if (aVar2 != null) {
                ((d14.f) aVar2).g(pw3Var.f383425d, null);
            }
        }
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn process: %f", java.lang.Double.valueOf(gVar.field_finishedLength / gVar.field_toltalLength));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
