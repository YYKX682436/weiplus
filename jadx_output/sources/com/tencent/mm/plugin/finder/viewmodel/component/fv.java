package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f134436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(1);
        this.f134436d = finderProfileDrawerUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) obj;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = this.f134436d;
        finderProfileDrawerUIC.f133627o = true;
        gx2.q qVar = finderProfileDrawerUIC.f133621f;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(qVar, false, 1, null);
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = vASActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) vASActivity : null;
        if (finderProfileUI != null) {
            finderProfileUI.f109513u = new com.tencent.mm.plugin.finder.viewmodel.component.ev(finderProfileDrawerUIC);
        }
        return jz5.f0.f302826a;
    }
}
