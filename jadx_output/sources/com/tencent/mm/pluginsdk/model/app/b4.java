package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class b4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.c4 f188819d;

    public b4(com.tencent.mm.pluginsdk.model.app.c4 c4Var) {
        this.f188819d = c4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent webviewReportTmplTransferEvent;
        int i18;
        com.tencent.mm.pluginsdk.model.app.c4 c4Var = this.f188819d;
        java.lang.String str2 = c4Var.f188844v;
        if (i17 == -21005) {
            java.lang.String str3 = c4Var.f188844v;
            return 0;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(c4Var.f188831f.Q0(), c4Var.f188831f.getMsgId());
        if (i17 != 0) {
            Li.r1(5);
            bu.a.e(Li.getMsgId(), bu.a.b(i17));
            jx3.f.INSTANCE.idkeyStat(111L, 34L, 1L, true);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
            c4Var.f188843u = android.os.SystemClock.elapsedRealtime() - c4Var.f188840r;
            c4Var.H(i17);
            c4Var.f188830e.onSceneEnd(3, i17, "", c4Var);
            return 0;
        }
        if (hVar != null) {
            int i19 = hVar.field_retCode;
            if (i19 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendAppMsg", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", java.lang.Integer.valueOf(i19), hVar.field_arg, hVar.field_transInfo, "", "", "", "", "", "", "", hVar.f241767b);
                Li.r1(5);
                bu.a.e(Li.getMsgId(), bu.a.a(hVar.field_retCode));
                jx3.f.INSTANCE.idkeyStat(111L, 34L, 1L, true);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
                c4Var.f188843u = android.os.SystemClock.elapsedRealtime() - c4Var.f188840r;
                c4Var.H(hVar.field_retCode);
                c4Var.f188830e.onSceneEnd(3, hVar.field_retCode, "", c4Var);
            } else {
                if (c4Var.f188848z > 0 && hVar.field_fileLength > 0 && Li.getType() != 738197553) {
                    iz5.a.g("SendAppMsgThumbTooBig " + c4Var.f188848z + "," + hVar.field_fileLength + "," + hVar.field_fileId, c4Var.f188848z * 2 > hVar.field_fileLength);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", java.lang.Integer.valueOf(hVar.field_UploadHitCacheType), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(hVar.field_exist_whencheck), com.tencent.mm.sdk.platformtools.t8.G1(hVar.field_aesKey), hVar.field_filemd5);
                if (Li.getType() == 738197553) {
                    com.tencent.mm.pluginsdk.model.app.k0.y(Li.getMsgId(), Li.Q0(), "", hVar, false);
                }
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 != null && ((i18 = v17.f348666i) == 33 || i18 == 36 || i18 == 44)) {
                    java.lang.String z07 = Li.z0();
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    java.lang.String D2 = m11.b1.Di().D2(Li, z07, true);
                    zz.b Zi = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D2, v17.f348666i, null, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsg", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", D2, java.lang.Integer.valueOf(Zi.f477691a), java.lang.Boolean.valueOf(Zi.f477692b), java.lang.Boolean.valueOf(Zi.f477693c), java.lang.Boolean.valueOf(Zi.f477694d), java.lang.Long.valueOf(Zi.f477695e));
                }
                c4Var.f188843u = android.os.SystemClock.elapsedRealtime() - c4Var.f188840r;
                c4Var.f188841s = android.os.SystemClock.elapsedRealtime();
                c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.e4(c4Var.f188833h, c4Var.f188832g, false, hVar, new com.tencent.mm.pluginsdk.model.app.a4(this), c4Var.f188834i, null, c4Var.f188836n, c4Var.f188837o));
            }
        }
        if (str == null || !str.equals(c4Var.f188844v) || (webviewReportTmplTransferEvent = c4Var.f188846x) == null || webviewReportTmplTransferEvent.f54991g.f7867a == -1) {
            return 0;
        }
        webviewReportTmplTransferEvent.e();
        c4Var.f188846x = null;
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
