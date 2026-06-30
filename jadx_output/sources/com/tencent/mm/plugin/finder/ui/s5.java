package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        super(2);
        this.f129793d = finderFansListUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(view, "view");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129793d;
            finderFansListUI.B = com.tencent.mm.plugin.finder.ui.c6.a(finderFansListUI.f128568v.getItem(intValue), finderFansListUI, new com.tencent.mm.plugin.finder.ui.r5(finderFansListUI));
        }
        return jz5.f0.f302826a;
    }
}
