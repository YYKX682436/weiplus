package j40;

@j95.b
/* loaded from: classes4.dex */
public final class r extends i95.w implements v94.l {
    public java.lang.String wi(byte[] bArr) {
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                try {
                    r45.kv2 kv2Var = new r45.kv2();
                    kv2Var.parseFrom(bArr);
                    return ot0.q.u(com.tencent.mm.plugin.finder.assist.n7.f102406a.h(kv2Var), null, null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("SnsFinderBackPreviewService", "makeFinderShareAppMsgContent error: " + e17.getMessage());
                    return null;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsFinderBackPreviewService", "makeFinderShareAppMsgContent: finderShareObjectBuffer is empty");
        return null;
    }
}
