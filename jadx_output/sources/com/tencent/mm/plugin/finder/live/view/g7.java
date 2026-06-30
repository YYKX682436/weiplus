package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.plugin.finder.live.view.k7 k7Var) {
        super(1);
        this.f116326d = k7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 noticeInfo = (r45.h32) obj;
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        com.tencent.mm.plugin.finder.live.view.k7 k7Var = this.f116326d;
        yz5.l lVar = k7Var.P;
        if (lVar != null) {
            lVar.invoke(noticeInfo);
        }
        k7Var.s(true);
        bm2.x5 x5Var = k7Var.Q;
        if (x5Var != null) {
            java.util.LinkedList linkedList = x5Var.f22432f;
            if (linkedList != null) {
                linkedList.clear();
            }
            x5Var.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
