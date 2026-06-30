package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class vt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.du f136268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(com.tencent.mm.plugin.finder.viewmodel.component.du duVar) {
        super(0);
        this.f136268d = duVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.du duVar = this.f136268d;
        java.lang.String str = (java.lang.String) ((jz5.n) duVar.f134169i).getValue();
        com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI activity = com.tencent.mm.plugin.finder.viewmodel.component.du.O6(duVar);
        kotlin.jvm.internal.o.g(activity, "activity");
        return new com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader(str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
    }
}
