package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class g2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        super(false);
        this.f148385d = mallIndexUIv2;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "click settings btn");
        j45.l.h(this.f148385d.getContext(), "mall", ".ui.MallFunctionSettingsUI");
    }
}
