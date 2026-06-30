package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class u extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew f169421e;

    public u(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew) {
        this.f169421e = fullCardAdTimeLineItemNew;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$1");
        p84.e eVar = this.f169421e.f169316w.f425173h;
        if (eVar != null) {
            eVar.c(0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$1");
    }
}
