package e00;

/* loaded from: classes9.dex */
public final class t implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.v f245817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.ye0 f245818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f245819c;

    public t(e00.v vVar, bw5.ye0 ye0Var, long j17) {
        this.f245817a = vVar;
        this.f245818b = ye0Var;
        this.f245819c = j17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("RequestBulkBuyCardTask", "get jumpInfo:  errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        bw5.x7 x7Var = null;
        bw5.ze0 ze0Var = fVar instanceof bw5.ze0 ? (bw5.ze0) fVar : null;
        e00.v vVar = this.f245817a;
        yz5.l lVar = vVar.f245824d;
        if (lVar != null) {
            if (ze0Var != null) {
                x7Var = ze0Var.f35956e[2] ? ze0Var.f35955d : new bw5.x7();
            }
            lVar.invoke(x7Var);
        }
        e00.g.f245772a.c(vVar.f245823c, this.f245818b, java.lang.System.currentTimeMillis() - this.f245819c, i18 == 0 && i17 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
