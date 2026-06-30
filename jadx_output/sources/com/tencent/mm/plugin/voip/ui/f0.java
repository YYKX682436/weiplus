package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.m implements yz5.l {
    public f0(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI.class, "onAddParam", "onAddParam(Lcom/tencent/mm/plugin/voip/ui/QosParams;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.voip.ui.w p07 = (com.tencent.mm.plugin.voip.ui.w) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI = (com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI) this.receiver;
        repairerVoipQoSUI.getClass();
        repairerVoipQoSUI.U6().add(p07);
        ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) repairerVoipQoSUI.h).getValue()).notifyItemInserted(kz5.c0.h(repairerVoipQoSUI.U6()));
        return jz5.f0.f302826a;
    }
}
