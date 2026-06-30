package h63;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lh63/u;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "mmOnActivityResult", "", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class u extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.GameLive.EnterFinderLiveTask";

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        android.view.Display defaultDisplay;
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest)) {
            com.tencent.mars.xlog.Log.w(this.TAG, "handleRequest#EnterFinderTask, request is not EnterFinderRequest");
            return;
        }
        java.lang.String str = this.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRequest appid ");
        com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = (com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest) appBrandProxyUIProcessTask$ProcessRequest;
        sb6.append(gameLiveAppbrandProcessService$EnterFinderLiveRequest.getAppid());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int action = gameLiveAppbrandProcessService$EnterFinderLiveRequest.getAction();
        h63.v[] vVarArr = h63.v.f279284d;
        if (action == 0) {
            if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                com.tencent.mars.xlog.Log.i(this.TAG, "try to startGame,but isAnchorLiving,finishProcess with error");
                finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(1));
                return;
            } else {
                if (((p60.u) i95.n0.c(p60.u.class)).f352202f) {
                    com.tencent.mars.xlog.Log.i(this.TAG, "try to startGame, but in crash state, decide to recover");
                    ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Zi(getActivityContext(), new h63.s(this, appBrandProxyUIProcessTask$ProcessRequest));
                    return;
                }
                com.tencent.mars.xlog.Log.i(this.TAG, "startGame");
                h63.g1 g1Var = (h63.g1) i95.n0.c(h63.g1.class);
                com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
                kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
                g1Var.Ui(activityContext, gameLiveAppbrandProcessService$EnterFinderLiveRequest.getAppid(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getVersionType(), true, gameLiveAppbrandProcessService$EnterFinderLiveRequest.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getReportInfo(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getEntranceType(), gameLiveAppbrandProcessService$EnterFinderLiveRequest.getEntranceId());
                finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
                return;
            }
        }
        h63.v[] vVarArr2 = h63.v.f279284d;
        java.lang.Integer num = null;
        if (action == 1) {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            com.tencent.mm.ui.MMActivity activityContext2 = getActivityContext();
            kotlin.jvm.internal.o.f(activityContext2, "getActivityContext(...)");
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Intent intent = new android.content.Intent();
            android.view.WindowManager windowManager = activityContext2.getWindowManager();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                num = java.lang.Integer.valueOf(defaultDisplay.getRotation());
            }
            if (num != null && num.intValue() == 1) {
                intent.putExtra("LANDSCAPE_TYPE", 1);
            } else if (num != null && num.intValue() == 3) {
                intent.putExtra("LANDSCAPE_TYPE", 2);
            } else {
                intent.putExtra("LANDSCAPE_TYPE", 0);
            }
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enterFinderLiveCountDownUI");
            intent.setClass(activityContext2, (java.lang.Class) ((jz5.n) jz2.x0.f302779z).getValue());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityContext2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveCountDownUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityContext2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityContext2, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveCountDownUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
            return;
        }
        h63.v[] vVarArr3 = h63.v.f279284d;
        if (action == 2) {
            s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
            com.tencent.mm.ui.MMActivity activityContext3 = getActivityContext();
            kotlin.jvm.internal.o.f(activityContext3, "getActivityContext(...)");
            ((com.tencent.mm.feature.finder.live.v4) w0Var2).getClass();
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && (finderObject = c1Var.f328846n) != null) {
                qe2.a.f(finderObject, (mm2.n0) efVar.i(mm2.n0.class));
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub.I2((c61.ub) c17, activityContext3, new so2.h1(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384)), null, 0, 0, 28, null);
            }
            finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
            return;
        }
        h63.v[] vVarArr4 = h63.v.f279284d;
        if (action == 3) {
            getActivityContext().registerMMOnFragmentActivityResult(this);
            s40.w0 w0Var3 = (s40.w0) i95.n0.c(s40.w0.class);
            com.tencent.mm.ui.MMActivity activityContext4 = getActivityContext();
            kotlin.jvm.internal.o.f(activityContext4, "getActivityContext(...)");
            h63.t tVar = new h63.t(this);
            ((com.tencent.mm.feature.finder.live.v4) w0Var3).getClass();
            dk2.ef.f233372a.l0(activityContext4, null, tVar);
            return;
        }
        h63.v[] vVarArr5 = h63.v.f279284d;
        if (action == 4) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ui(getActivityContext(), true, gameLiveAppbrandProcessService$EnterFinderLiveRequest.getParam() == 1);
            ((p60.u) i95.n0.c(p60.u.class)).Ni();
            finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
        } else {
            h63.v[] vVarArr6 = h63.v.f279284d;
            if (action == 5) {
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ui(getActivityContext(), false, false);
                finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        super.mmOnActivityResult(i17, i18, intent);
        finishProcess(new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult(0));
    }
}
