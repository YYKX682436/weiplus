package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        super(2);
        this.f129861d = finderFansListUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129861d;
        if (!finderFansListUI.f128568v.getItem(intValue).getBoolean(3)) {
            r45.q21 item = finderFansListUI.f128568v.getItem(intValue);
            rl5.r rVar = finderFansListUI.f128571y;
            if (rVar == null) {
                kotlin.jvm.internal.o.o("popupMenu");
                throw null;
            }
            rVar.a();
            rl5.r rVar2 = finderFansListUI.f128571y;
            if (rVar2 == null) {
                kotlin.jvm.internal.o.o("popupMenu");
                throw null;
            }
            rVar2.h(view, new com.tencent.mm.plugin.finder.ui.x5(finderFansListUI), new com.tencent.mm.plugin.finder.ui.z5(item, finderFansListUI), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        }
        return jz5.f0.f302826a;
    }
}
