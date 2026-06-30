package zw1;

/* loaded from: classes9.dex */
public class b2 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476586a;

    public b2(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476586a = collectMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476586a;
        intent.setClass(collectMainUI.getContext(), com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI.class);
        intent.putExtra("key_currency_unit", collectMainUI.N);
        collectMainUI.startActivityForResult(intent, 4096);
    }
}
