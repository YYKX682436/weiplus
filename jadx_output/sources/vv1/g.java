package vv1;

/* loaded from: classes9.dex */
public class g implements lo.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv1.h f440413a;

    public g(vv1.h hVar) {
        this.f440413a = hVar;
    }

    public void a(int i17, java.lang.String str) {
        qb5.d dVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_File", "InitAttachInfoCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        vv1.h hVar = this.f440413a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_File", "init %s fail", hVar.f440405d);
            hVar.a();
            return;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        java.lang.String str2 = hVar.f440416o;
        long j17 = hVar.f440415n;
        java.lang.String Q0 = hVar.f440414m.Q0();
        ((qb5.g) oVar).getClass();
        com.tencent.mm.pluginsdk.model.app.d g17 = com.tencent.mm.pluginsdk.model.app.k0.g(str2, j17, Q0);
        ((qb5.g) ((lo.o) i95.n0.c(lo.o.class))).getClass();
        if (g17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = false, stack = ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
            g17.field_status = 101;
            g17.field_lastModifyTime = c01.id.e();
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(g17, new java.lang.String[0]);
        }
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        long j18 = hVar.f440415n;
        java.lang.String Q02 = hVar.f440414m.Q0();
        java.lang.String str3 = hVar.f440416o;
        vv1.f fVar = new vv1.f(this, g17);
        qb5.g gVar = (qb5.g) oVar2;
        gVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect() mediaId is null, return");
            dVar = null;
        } else {
            c01.d9.e().a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, new qb5.b(gVar, str3, fVar, j18, Q02));
            bt3.l0 l0Var = new bt3.l0(j18, Q02, str3, new qb5.c(gVar, fVar));
            c01.d9.e().g(l0Var);
            dVar = new qb5.d(gVar, l0Var);
        }
        hVar.f440417p = dVar;
    }
}
