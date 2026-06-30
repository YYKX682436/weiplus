package zw1;

/* loaded from: classes15.dex */
public class p1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.o90 o90Var) {
        super(false);
        this.f476755e = collectMainUI;
        this.f476754d = o90Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476755e;
        collectMainUI.f96394h = 3;
        com.tencent.mm.plugin.collect.ui.CollectMainUI.X6(collectMainUI, this.f476754d.f382044e);
    }
}
