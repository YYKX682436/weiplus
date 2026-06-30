package vp4;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f439084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f439086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(vp4.b0 b0Var, java.lang.String str, kotlinx.coroutines.q qVar) {
        super(2);
        this.f439084d = b0Var;
        this.f439085e = str;
        this.f439086f = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String msg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl >> code: " + intValue + ", msg: " + msg);
        vp4.b0 b0Var = this.f439084d;
        kotlinx.coroutines.q qVar = b0Var.f439013m;
        if (qVar == null || !((kotlinx.coroutines.r) qVar).n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoForegroundRemuxChain", "when finish the job is cancel");
            b0Var.f439013m = null;
        } else {
            kotlinx.coroutines.q qVar2 = this.f439086f;
            if (intValue == 0) {
                vp4.s sVar = vp4.s.f439074a;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = b0Var.f439004d;
                kotlin.jvm.internal.o.d(recordConfigProvider);
                ct0.b bVar = b0Var.f439003c;
                java.lang.String outPath = this.f439085e;
                kotlin.jvm.internal.o.f(outPath, "$outPath");
                st3.r encode = b0Var.f439002b;
                kotlin.jvm.internal.o.g(encode, "encode");
                boolean z17 = recordConfigProvider.f155687y;
                java.lang.String thumbPath = recordConfigProvider.C;
                kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
                int i17 = recordConfigProvider.f155676n.f71204t;
                java.lang.String inputVideoPath = recordConfigProvider.A;
                kotlin.jvm.internal.o.f(inputVideoPath, "inputVideoPath");
                boolean b17 = vp4.s.b(sVar, z17, thumbPath, i17, inputVideoPath, outPath, recordConfigProvider.f155688z, bVar != null ? bVar.f222206c : false, encode.f412582j, bVar, false, 512, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl >> dealAfterRemuxSuccess result: " + b17);
                if (!b17) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.r) qVar2).resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.f345164d, 1012, "save thumb error", null, 8, null)));
                    b0Var.f439013m = null;
                }
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            nu3.m mVar = nu3.m.f340229a;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setMuxEndTimeStamp >> " + elapsedRealtime);
            nu3.m.f340230b.Q = elapsedRealtime;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar2).resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(intValue == 0 ? og3.h.f345165e : og3.h.f345164d, intValue, msg, null, 8, null)));
            b0Var.f439013m = null;
        }
        return jz5.f0.f302826a;
    }
}
