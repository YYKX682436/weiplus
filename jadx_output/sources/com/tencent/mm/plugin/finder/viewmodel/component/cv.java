package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class cv extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f134039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(2);
        this.f134039d = finderProfileDrawerUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment;
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        gx2.q layout = (gx2.q) obj;
        gx2.r action = (gx2.r) obj2;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(action, "action");
        if (action == gx2.r.f277376e && (vASCommonFragment = this.f134039d.f133619d) != null && (vASActivity = vASCommonFragment.f211121p) != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q == 0) {
                ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q = 3;
            }
        }
        return jz5.f0.f302826a;
    }
}
