package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class yh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f136580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        super(1);
        this.f136580d = aiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) obj;
        com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar = this.f136580d;
        gx2.q qVar = aiVar.f133777d;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(qVar, false, 1, null);
        }
        if (vASActivity != null) {
            vASActivity.setVasFinishInterceptor(new com.tencent.mm.plugin.finder.viewmodel.component.xh(aiVar));
        }
        return jz5.f0.f302826a;
    }
}
