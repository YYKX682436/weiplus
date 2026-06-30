package zw1;

/* loaded from: classes15.dex */
public class c2 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476594a;

    public c2(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476594a = collectMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476594a;
        collectMainUI.V = false;
        collectMainUI.o7();
        collectMainUI.G.setText(collectMainUI.Z);
        collectMainUI.q7();
    }
}
