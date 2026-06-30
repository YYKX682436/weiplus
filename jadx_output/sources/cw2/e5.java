package cw2;

/* loaded from: classes10.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f223674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f223675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout, android.os.Bundle bundle) {
        super(1);
        this.f223674d = finderRecordPluginLayout;
        this.f223675e = bundle;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ct0.b capture = (ct0.b) obj;
        kotlin.jvm.internal.o.g(capture, "capture");
        com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout = this.f223674d;
        hw2.e0 e0Var = finderRecordPluginLayout.D;
        java.lang.String path = capture.f222204a;
        hw2.t tVar = finderRecordPluginLayout.f130630p;
        boolean z17 = tVar.f285563h ? tVar.f285564i : tVar.f285565m;
        e0Var.getClass();
        kotlin.jvm.internal.o.g(path, "path");
        java.util.ArrayList arrayList = e0Var.f285525d;
        arrayList.add(path);
        e0Var.f285526e.add(java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderSubVideoFilePlugin", "current video size:" + arrayList.size() + " add path:" + path + ", " + z17);
        boolean z18 = finderRecordPluginLayout.f130631q.f295231f;
        yt3.r3 r3Var = finderRecordPluginLayout.f130626i;
        boolean z19 = false;
        if (z18) {
            r3Var.f465628f.setTag(com.tencent.mm.R.id.e5x, java.lang.Boolean.TRUE);
            nu3.i.c(nu3.i.f340218a, "KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0, 2, null);
            android.os.Bundle bundle = this.f223675e;
            if (bundle == null || !bundle.getBoolean("PARAM_1_BOOLEAN")) {
                r3Var.m(false);
                r3Var.reset();
                at0.n nVar = finderRecordPluginLayout.f130640z;
                if (nVar != null) {
                    nVar.e();
                }
                finderRecordPluginLayout.f130632r.setVisibility(0);
                finderRecordPluginLayout.f130633s.setVisibility(0);
                tVar.setVisibility(4);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderRecordPluginLayout", "sub record finish");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1371L, 191L, 1L, false);
                ju3.d0.k(finderRecordPluginLayout, ju3.c0.f301891o, null, 2, null);
            }
        } else {
            r3Var.f465628f.setTag(com.tencent.mm.R.id.e5x, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.finder.report.i5 i5Var = com.tencent.mm.plugin.finder.report.i5.f125077a;
            com.tencent.mm.plugin.finder.report.i5.a(i5Var, 211L, 0L, 2, null);
            at0.n nVar2 = finderRecordPluginLayout.f130640z;
            if (nVar2 != null && nVar2.f13598f) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 214L, 0L, 2, null);
            } else {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 213L, 0L, 2, null);
            }
            if (tVar.f285563h ? tVar.f285564i : tVar.f285565m) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 215L, 0L, 2, null);
            }
            long j17 = capture.f222208e;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1371L, 218L, j17, false);
            if (j17 < 5000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 220L, 0L, 2, null);
            } else if (j17 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 221L, 0L, 2, null);
            } else if (j17 < 15000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 222L, 0L, 2, null);
            } else if (j17 < 20000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 223L, 0L, 2, null);
            } else if (j17 < 30000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 224L, 0L, 2, null);
            } else if (j17 < 40000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 225L, 0L, 2, null);
            } else if (j17 < 50000) {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 226L, 0L, 2, null);
            } else {
                com.tencent.mm.plugin.finder.report.i5.a(i5Var, 227L, 0L, 2, null);
            }
            ju3.d0.k(finderRecordPluginLayout, ju3.c0.f301891o, null, 2, null);
            nu3.i iVar = nu3.i.f340218a;
            at0.n nVar3 = finderRecordPluginLayout.f130640z;
            iVar.n("KEY_MEDIA_SOURCE_INT", java.lang.Integer.valueOf(nVar3 != null && nVar3.f13598f ? 2 : 1));
            rs0.p pVar = rs0.p.f399310a;
            java.lang.String str = capture.f222204a;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = finderRecordPluginLayout.B;
            pVar.a(str, recordConfigProvider != null ? recordConfigProvider.f155672g : 1, recordConfigProvider != null ? recordConfigProvider.f155671f : -1);
            java.lang.String str2 = capture.f222204a;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = finderRecordPluginLayout.B;
            di3.x.g(str2, recordConfigProvider2 != null ? recordConfigProvider2.f155672g : 1, recordConfigProvider2 != null ? recordConfigProvider2.F : -1);
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct = nu3.i.f340221d;
            storyDoPublishStruct.f60875j = capture.f222208e - capture.f222207d;
            at0.n nVar4 = finderRecordPluginLayout.f130640z;
            if (nVar4 != null && nVar4.f13598f) {
                z19 = true;
            }
            storyDoPublishStruct.f60876k = z19 ? 2L : 1L;
        }
        return jz5.f0.f302826a;
    }
}
