package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.m implements yz5.p {
    public k0(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI.class, "onClickDelete", "onClickDelete(ILcom/tencent/mm/plugin/voip/ui/QosParams;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.voip.ui.w p17 = (com.tencent.mm.plugin.voip.ui.w) obj2;
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI = (com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI) this.receiver;
        repairerVoipQoSUI.getClass();
        if (intValue != -1) {
            repairerVoipQoSUI.U6().remove(p17);
            ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) repairerVoipQoSUI.h).getValue()).notifyItemRemoved(intValue);
        }
        return jz5.f0.f302826a;
    }
}
