package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.l0 f154342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.profile.ui.tab.l0 l0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154342d = l0Var;
        this.f154343e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.tab.h0(this.f154342d, this.f154343e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.profile.ui.tab.h0 h0Var = (com.tencent.mm.plugin.profile.ui.tab.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17 = this.f154343e;
        com.tencent.mm.plugin.profile.ui.tab.l0 l0Var = this.f154342d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "start decrypt");
            vd2.i5 f17 = l0Var.f();
            if (f17 != null) {
                r45.j32 j32Var = l0Var.f154396j;
                kotlin.jvm.internal.o.d(j32Var);
                java.util.LinkedList list = j32Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getNotice_info(...)");
                ((c61.i8) f17).wi(list, new com.tencent.mm.plugin.profile.ui.tab.g0(l0Var, z17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "decrypt exception: " + e17.getMessage());
            if (z17) {
                android.view.View e18 = l0Var.e();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(e18, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(e18, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                l0Var.g();
            } else {
                android.view.View e19 = l0Var.e();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e19, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(e19, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
