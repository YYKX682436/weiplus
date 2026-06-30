package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class m30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135119d;

    public m30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135119d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135119d;
        f50Var.V6();
        r45.lk2 lk2Var = f50Var.f134339e;
        int integer = lk2Var != null ? lk2Var.getInteger(12) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_LIVE_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var2 = f50Var.f134339e;
        int integer2 = lk2Var2 != null ? lk2Var2.getInteger(29) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_MEMBER_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var3 = f50Var.f134339e;
        int integer3 = lk2Var3 != null ? lk2Var3.getInteger(33) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_COURSE_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var4 = f50Var.f134339e;
        int integer4 = lk2Var4 != null ? lk2Var4.getInteger(35) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_COLLECTION_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var5 = f50Var.f134339e;
        int integer5 = lk2Var5 != null ? lk2Var5.getInteger(36) : com.tencent.mm.plugin.finder.viewmodel.component.f50.f134336z1;
        android.content.Intent intent = new android.content.Intent();
        r45.lk2 lk2Var6 = f50Var.f134339e;
        if (lk2Var6 == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lk2Var6.getCustom(37)) == null) {
            finderJumpInfo = com.tencent.mm.plugin.finder.viewmodel.component.f50.f134335y1;
        }
        if (finderJumpInfo != null) {
            intent.putExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT", finderJumpInfo.toByteArray());
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nk(f50Var.getActivity(), intent, integer2, integer, integer3, integer4, integer5);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterPurchasedContentEntry");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, f50Var.getActivity(), 8L, 2L, false, 0, 0, null, 120, null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c18).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 11L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
