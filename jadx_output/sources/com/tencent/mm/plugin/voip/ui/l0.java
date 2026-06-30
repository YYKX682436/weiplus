package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI f176968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI) {
        super(0);
        this.f176968d = repairerVoipQoSUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI = this.f176968d;
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$paramsAdapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.voip.ui.y(new com.tencent.mm.plugin.voip.ui.k0(repairerVoipQoSUI));
            }
        };
        int i17 = com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI.m;
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, repairerVoipQoSUI.U6(), false);
    }
}
