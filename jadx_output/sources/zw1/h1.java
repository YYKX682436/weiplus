package zw1;

/* loaded from: classes8.dex */
public class h1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uk4 f476649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.uk4 uk4Var) {
        super(false);
        this.f476650e = collectMainUI;
        this.f476649d = uk4Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI2;
        r45.uk4 uk4Var = this.f476649d;
        int i17 = uk4Var.f387431d;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI3 = this.f476650e;
        if (i17 == 1) {
            if (uk4Var.f387433f.equals("wxpay://f2f/f2fdetail")) {
                android.content.Intent intent = new android.content.Intent(collectMainUI3.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.collect.ui.CollectBillUI.class);
                intent.putExtra("key_from_scene", 0);
                collectMainUI3.startActivityForResult(intent, 4097);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(13944, 1);
                g0Var.d(14526, 1, 1, uk4Var.f387432e, "", "", "", 2);
                if (uk4Var.f387437m == 1) {
                    collectMainUI2 = collectMainUI3;
                    g0Var.d(14526, 3, 1, uk4Var.f387432e, "", "", "", 2);
                } else {
                    collectMainUI2 = collectMainUI3;
                }
                collectMainUI = collectMainUI2;
            }
            collectMainUI = collectMainUI3;
        } else if (i17 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387433f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "empty bottom h5 url");
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.V(collectMainUI3.getContext(), uk4Var.f387433f, false);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(14526, 1, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 2);
            if (uk4Var.f387437m == 1) {
                collectMainUI2 = collectMainUI3;
                g0Var2.d(14526, 3, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 2);
                collectMainUI = collectMainUI2;
            }
            collectMainUI = collectMainUI3;
        } else if (i17 == 3) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = uk4Var.f387434g;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = uk4Var.f387435h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1072;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            collectMainUI = collectMainUI3;
            g0Var3.d(14526, 1, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 2);
            if (uk4Var.f387437m == 1) {
                g0Var3.d(14526, 3, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 2);
            }
        } else {
            collectMainUI = collectMainUI3;
            android.content.Intent intent2 = new android.content.Intent(collectMainUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.collect.ui.CollectBillUI.class);
            intent2.putExtra("key_from_scene", 0);
            collectMainUI.startActivityForResult(intent2, 4097);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 1);
        }
        collectMainUI.C1.setVisibility(4);
        collectMainUI.D1.setVisibility(8);
    }
}
