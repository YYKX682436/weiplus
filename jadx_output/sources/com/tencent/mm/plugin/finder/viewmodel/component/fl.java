package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fl extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f134411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        super(1);
        this.f134411d = finderHomeUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment it = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f134411d.f133573m.contains(java.lang.Integer.valueOf(it.f129265p)));
    }
}
