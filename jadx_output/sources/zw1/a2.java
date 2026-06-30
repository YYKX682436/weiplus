package zw1;

/* loaded from: classes15.dex */
public class a2 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476573a;

    public a2(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476573a = collectMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        int i17 = com.tencent.mm.plugin.collect.ui.CollectMainUI.f96385e2;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476573a;
        if (collectMainUI.f96411x0 == 8) {
            collectMainUI.c7(null, null);
            collectMainUI.e7(2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 5);
            return;
        }
        boolean z17 = collectMainUI.T1;
        if (!z17) {
            collectMainUI.d7();
        } else if (z17) {
            new ww1.h(collectMainUI.M1).l().h(new zw1.v1(collectMainUI));
        } else {
            collectMainUI.d7();
        }
    }
}
