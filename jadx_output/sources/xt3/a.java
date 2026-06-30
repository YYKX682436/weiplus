package xt3;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457157d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457158e;

    public a(long j17, java.util.List feedbackList) {
        kotlin.jvm.internal.o.g(feedbackList, "feedbackList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oh4();
        lVar.f70665b = new r45.ph4();
        lVar.f70666c = "/cgi-bin/spr-bin/mmsprreportrecommendedmusicfeedback";
        lVar.f70667d = 3822;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457157d = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMSPRReportRecommendedMusicFeedbackRequest");
        r45.oh4 oh4Var = (r45.oh4) fVar;
        oh4Var.f382269d = j17;
        oh4Var.f382270e.addAll(feedbackList);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStoryAudioReport", "LogStory: report music " + j17 + ' ' + feedbackList.size());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f457158e = callback;
        return dispatch(dispatcher, this.f457157d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3822;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStoryAudioReport", "onGYNetEnd " + i17 + ", " + i18 + ", " + i19 + ", " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f457158e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
