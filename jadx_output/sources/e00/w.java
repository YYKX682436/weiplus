package e00;

/* loaded from: classes9.dex */
public final class w implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.y f245826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.p10 f245827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f245828c;

    public w(e00.y yVar, bw5.p10 p10Var, long j17) {
        this.f245826a = yVar;
        this.f245827b = p10Var;
        this.f245828c = j17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("RequestNativeCardJumpInfoTask", "get jumpInfo: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        bw5.x7 x7Var = null;
        bw5.q10 q10Var = fVar instanceof bw5.q10 ? (bw5.q10) fVar : null;
        e00.y yVar = this.f245826a;
        yz5.l lVar = yVar.f245833d;
        if (lVar != null) {
            if (q10Var != null) {
                x7Var = q10Var.f31896e[2] ? q10Var.f31895d : new bw5.x7();
            }
            lVar.invoke(x7Var);
        }
        e00.g.f245772a.f(yVar.f245832c, this.f245827b, java.lang.System.currentTimeMillis() - this.f245828c, i17 == 0 && i18 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
