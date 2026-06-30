package h63;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.u f279277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest f279278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h63.u uVar, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        super(1);
        this.f279277d = uVar;
        this.f279278e = appBrandProxyUIProcessTask$ProcessRequest;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.ui.MMActivity activityContext;
        java.lang.String str2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        h63.u uVar = this.f279277d;
        if (booleanValue) {
            str2 = uVar.TAG;
            com.tencent.mars.xlog.Log.i(str2, "recover success");
        } else {
            str = uVar.TAG;
            com.tencent.mars.xlog.Log.i(str, "recover failed, start game again");
            h63.g1 g1Var = (h63.g1) i95.n0.c(h63.g1.class);
            activityContext = uVar.getActivityContext();
            kotlin.jvm.internal.o.f(activityContext, "access$getActivityContext(...)");
            com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = (com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest) this.f279278e;
            g1Var.Ui(activityContext, gameLiveAppbrandProcessService$EnterFinderLiveRequest.getAppid(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getVersionType(), true, gameLiveAppbrandProcessService$EnterFinderLiveRequest.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getReportInfo(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getEntranceType(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getEntranceId());
        }
        uVar.finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
        return jz5.f0.f302826a;
    }
}
