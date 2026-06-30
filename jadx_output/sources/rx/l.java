package rx;

@j95.b
/* loaded from: classes12.dex */
public class l extends i95.w implements sx.e0 {
    public boolean Ai(dn.m mVar) {
        com.tencent.mm.modelcdntran.h2 fj6 = com.tencent.mm.modelcdntran.s1.fj();
        fj6.getClass();
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
            return false;
        }
        if (mVar.field_fileId == null) {
            mVar.field_fileId = "";
        }
        if (mVar.field_aesKey == null) {
            mVar.field_aesKey = "";
        }
        mVar.f241786e = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "CdnTransportService cdn thread run %s", mVar.field_mediaId);
        ((java.util.LinkedList) fj6.f70993q).add(mVar.field_mediaId);
        ((java.util.HashMap) fj6.f70994r).put(mVar.field_mediaId, mVar);
        fj6.j(false);
        return true;
    }

    public boolean Bi(dn.m mVar) {
        return com.tencent.mm.modelcdntran.s1.fj().d(mVar);
    }

    public boolean Di(java.lang.String str) {
        com.tencent.mm.modelcdntran.h2 fj6 = com.tencent.mm.modelcdntran.s1.fj();
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) fj6.f70995s).remove(str);
        if (mVar != null) {
            int i17 = mVar.field_fileType;
            if (i17 == 30001 || i17 == 30003 || i17 == 30007 || i17 == 31000) {
                com.tencent.mm.modelcdntran.s1.cj().w(str);
            } else if (mVar.F) {
                com.tencent.mm.modelcdntran.s1.cj().v(str);
            } else {
                com.tencent.mm.modelcdntran.s1.cj().getClass();
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(str);
            }
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mVar.field_fileType);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            fVar.d(10769, -10002, valueOf, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.field_startTime));
        }
        ((java.util.HashMap) fj6.f70994r).remove(str);
        ((java.util.HashMap) fj6.f70996t).remove(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, 0);
        return true;
    }

    public boolean Ni(java.lang.String str) {
        com.tencent.mm.modelcdntran.h2 fj6 = com.tencent.mm.modelcdntran.s1.fj();
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) fj6.f70995s).remove(str);
        if (mVar != null) {
            com.tencent.mm.modelcdntran.s1.cj().getClass();
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(str);
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mVar.field_fileType);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            fVar.d(10769, -10003, valueOf, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.field_startTime));
        }
        ((java.util.HashMap) fj6.f70994r).remove(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, 0);
        return true;
    }

    public boolean Ri(int i17) {
        return com.tencent.mm.modelcdntran.s1.fj().k(i17);
    }

    public boolean wi(dn.m mVar) {
        com.tencent.mm.modelcdntran.h2 fj6 = com.tencent.mm.modelcdntran.s1.fj();
        fj6.getClass();
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
            return false;
        }
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
        if (cdnManager != null && cdnManager.taskExist(mVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "addRecvTask task exist %s", mVar.field_mediaId);
            return false;
        }
        if (mVar.field_fileId == null) {
            mVar.field_fileId = "";
        }
        if (mVar.field_aesKey == null) {
            mVar.field_aesKey = "";
        }
        mVar.f241786e = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "addRecvTask id:%s appType:%s fileType:%s", mVar.field_mediaId, java.lang.Integer.valueOf(mVar.field_appType), java.lang.Integer.valueOf(mVar.field_appType));
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.modelcdntran.b2(fj6, -1, mVar), "MicroMsg.Cdn.ThreadName");
        return true;
    }
}
