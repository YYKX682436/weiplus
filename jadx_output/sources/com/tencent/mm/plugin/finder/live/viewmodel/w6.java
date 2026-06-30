package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class w6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117516a;

    public w6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f117516a = b8Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
            java.util.LinkedList list = ((r45.hv1) fVar.f70618d).getList(4);
            kotlin.jvm.internal.o.f(list, "getGame_category_list(...)");
            b3Var.e(list);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "CgiFinderLiveGetUserGameConfig game list size: " + ((r45.hv1) fVar.f70618d).getList(1) + ", showSearchLayout:" + (((r45.hv1) fVar.f70618d).getInteger(3) == 1));
            java.util.LinkedList list2 = ((r45.hv1) fVar.f70618d).getList(4);
            if (list2 == null || list2.isEmpty()) {
                mm2.s1 s1Var = (mm2.s1) dk2.ef.f233372a.i(mm2.s1.class);
                if (s1Var != null) {
                    kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) s1Var.f329388h;
                    java.util.LinkedList linkedList = (java.util.LinkedList) h3Var.getValue();
                    if (linkedList != null) {
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        linkedList2.addAll(linkedList);
                        pm0.v.d0(linkedList2, mm2.r1.f329372d);
                        h3Var.k(linkedList2);
                    }
                }
            } else {
                com.tencent.mm.plugin.finder.assist.x2.f102673b = 18L;
                com.tencent.mm.plugin.finder.assist.x2.f102672a.b(1);
                mm2.s1 s1Var2 = (mm2.s1) dk2.ef.f233372a.i(mm2.s1.class);
                kotlinx.coroutines.flow.j2 j2Var = s1Var2 != null ? s1Var2.f329395r : null;
                if (j2Var != null) {
                    ((kotlinx.coroutines.flow.h3) j2Var).k(fVar.f70618d);
                }
                com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117516a;
                com.tencent.mm.plugin.finder.assist.FinderGameEventListener finderGameEventListener = new com.tencent.mm.plugin.finder.assist.FinderGameEventListener(new java.lang.ref.WeakReference(b8Var.getContext()));
                b8Var.f116950u = finderGameEventListener;
                finderGameEventListener.alive();
            }
        }
        return jz5.f0.f302826a;
    }
}
