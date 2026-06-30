package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class y9 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207264d;

    public y9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f207264d = selectContactUI;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            return 0;
        }
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207264d;
        if (hVar == null || hVar.field_retCode != 0) {
            if (hVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SelectContactUI", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                int i18 = hVar.field_retCode;
                int i19 = com.tencent.mm.ui.contact.SelectContactUI.f206536m2;
                selectContactUI.L7(i18, "cdn ret error", "");
                return 0;
            }
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                return 0;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectContactUI", "start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            int i27 = com.tencent.mm.ui.contact.SelectContactUI.f206536m2;
            selectContactUI.L7(0, "cdn start error", "");
            return 0;
        }
        com.tencent.mm.ui.contact.oa oaVar = (com.tencent.mm.ui.contact.oa) selectContactUI.f206547j2.get(str);
        if (oaVar == null || !oaVar.f207068b) {
            selectContactUI.J1 = hVar;
            selectContactUI.G1 = false;
        } else {
            selectContactUI.N1 = hVar;
            selectContactUI.K1 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] result:%s", str, java.lang.Integer.valueOf(i17), gVar, hVar, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(oaVar.f207067a)));
        selectContactUI.K7();
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f587f;
        if (a18 > j17) {
            a17.f582a.f60372s = a18 - j17;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
