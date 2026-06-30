package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI) {
        super(2);
        this.f129409d = finderBlackListUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI = this.f129409d;
        r45.q21 item = finderBlackListUI.f128516v.getItem(intValue);
        rl5.r rVar = finderBlackListUI.f128519y;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = finderBlackListUI.f128519y;
        if (rVar2 != null) {
            rVar2.h(view, new com.tencent.mm.plugin.finder.ui.n1(finderBlackListUI), new com.tencent.mm.plugin.finder.ui.o1(item, finderBlackListUI), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("popupMenu");
        throw null;
    }
}
