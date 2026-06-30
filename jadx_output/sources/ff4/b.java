package ff4;

/* loaded from: classes4.dex */
public final class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ke6 f261661d;

    /* renamed from: e, reason: collision with root package name */
    public final gf4.a f261662e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f261663f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f261664g;

    public b(java.lang.String clientId, r45.ke6 commentDetail, java.lang.String str, gf4.a aVar) {
        kotlin.jvm.internal.o.g(clientId, "clientId");
        kotlin.jvm.internal.o.g(commentDetail, "commentDetail");
        this.f261661d = commentDetail;
        this.f261662e = aVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.me6();
        lVar.f70665b = new r45.ne6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmstorycomment";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f261663f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentRequest");
        r45.me6 me6Var = (r45.me6) fVar;
        me6Var.f380426d = clientId;
        me6Var.f380427e = commentDetail;
        mf4.d dVar = mf4.d.f326160a;
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
        me6Var.f380429g = (int) storyPreviewReportStruct.f60919e;
        me6Var.f380430h = (int) storyPreviewReportStruct.f60920f;
        me6Var.f380431i = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryComment", "ClientId " + me6Var.f380426d + " PreviewEnterScene " + me6Var.f380429g + " sessionID: " + me6Var.f380431i + ' ');
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f261664g = callback;
        return dispatch(dispatcher, this.f261663f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStoryComment", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        r45.ke6 ke6Var = this.f261661d;
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = ke6Var.f378635m;
            if (str2 == null || str2.length() == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(994L, 6L, 1L);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(994L, 5L, 1L);
            }
        } else {
            java.lang.String str3 = ke6Var.f378635m;
            if (str3 == null || str3.length() == 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(994L, 8L, 1L);
                if (i18 == 4) {
                    g0Var.C(994L, 10L, 1L);
                }
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.C(994L, 7L, 1L);
                if (i18 == 4) {
                    g0Var2.C(994L, 9L, 1L);
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f261664g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }
}
