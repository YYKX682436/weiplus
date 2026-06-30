package i53;

/* loaded from: classes8.dex */
public final class j4 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q33.d f288621a;

    public j4(q33.d dVar) {
        this.f288621a = dVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        if (i17 == 0 && i18 == 0 && oVar != null) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.videougc.ReportLocalWxagVideoResponse");
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniGameVideoProcessor", "gamelog.report , manage video , reportlocalwxagvideo reso RET = " + ((q33.e) fVar).f359943d);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MiniGameVideoProcessor", "gamelog.report , manage video , reportlocalwxagvideo, doReportCgi failed errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + "  op = " + this.f288621a.f359941d);
    }
}
