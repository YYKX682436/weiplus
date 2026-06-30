package lx;

/* loaded from: classes4.dex */
public final class j5 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321821b;

    public j5(lx.m5 m5Var, yz5.l lVar) {
        this.f321820a = m5Var;
        this.f321821b = lVar;
    }

    @Override // q80.f0
    public void fail() {
        lx.m5.a(this.f321820a);
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: start fail");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321821b.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Failed to start LiteApp")))));
    }

    @Override // q80.f0
    public void success() {
        lx.m5.a(this.f321820a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: start success");
    }
}
