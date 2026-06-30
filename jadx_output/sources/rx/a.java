package rx;

@j95.b
/* loaded from: classes12.dex */
public class a extends i95.w implements sx.a0, sx.y {
    public int Ai(java.lang.String str) {
        com.tencent.mm.modelcdntran.s1.cj().getClass();
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).calcFileCrc32(com.tencent.mm.vfs.w6.i(str, false));
    }

    public java.lang.String Bi(java.lang.String str) {
        return com.tencent.mm.modelcdntran.s1.cj().e(str);
    }

    public java.lang.String Di(java.lang.String str) {
        com.tencent.mm.modelcdntran.s1.cj().getClass();
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).calcMP4IdentifyMD5(com.tencent.mm.vfs.w6.i(str, false));
    }

    public int Ni(java.lang.String str, long j17, long j18, int i17) {
        com.tencent.mm.modelcdntran.s1.cj().getClass();
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(str, j17, j18, i17);
    }

    public void Ri(sx.z zVar) {
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        cj6.f71059w = zVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(zVar != null ? zVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "setMMPlayerDownloaderCallback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    public void Ui(dn.f fVar) {
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        cj6.f71060x = fVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(fVar != null ? fVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "mmPlayerPreloadCallback hash[%d] cdnTransCallback[%d]", objArr);
    }

    public void Vi(sx.z zVar) {
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        cj6.f71057u = zVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(zVar != null ? zVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "set tp player cdn callback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    public void Zi(dn.f fVar) {
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        cj6.f71044e = fVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(fVar != null ? fVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "set tp player cdn callback hash[%d] cdnTransCallback[%d]", objArr);
    }

    public int aj(java.lang.String str, dn.h hVar) {
        return com.tencent.mm.modelcdntran.s1.cj().x(str, hVar);
    }

    public boolean bj() {
        int i17;
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        synchronized (cj6.f71051o) {
            i17 = cj6.f71052p;
        }
        return i17 == 0;
    }

    public java.lang.String wi() {
        return com.tencent.mm.modelcdntran.s1.cj().d();
    }
}
