package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.l0 f154323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.profile.ui.tab.l0 l0Var, boolean z17) {
        super(2);
        this.f154323d = l0Var;
        this.f154324e = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = (java.util.List) obj2;
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "decrypt result: " + booleanValue);
        com.tencent.mm.plugin.profile.ui.tab.l0 l0Var = this.f154323d;
        if (!kotlinx.coroutines.z0.h(l0Var.f154400n)) {
            com.tencent.mars.xlog.Log.w("ContactBizHeaderLiveNoticeLogicV2", "decrypt callback: coroutine cancelled, skip UI update");
        } else if (!booleanValue || list == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "decrypt failed");
            if (this.f154324e) {
                com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "decrypt failed, but show nextLiveNotice");
                android.view.View e17 = l0Var.e();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(e17, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                l0Var.g();
            } else {
                android.view.View e18 = l0Var.e();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e18, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(e18, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            r45.j32 j32Var = l0Var.f154396j;
            kotlin.jvm.internal.o.d(j32Var);
            java.util.LinkedList list2 = j32Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getNotice_info(...)");
            int i17 = 0;
            for (java.lang.Object obj3 : list2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.h32 h32Var = (r45.h32) obj3;
                if (i17 < list.size()) {
                    h32Var.set(4, (java.lang.String) list.get(i17));
                    com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "  notice[" + i17 + "]: noticeId=" + h32Var.getString(4));
                }
                i17 = i18;
            }
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "show live notify view with liveNoticeList");
            android.view.View e19 = l0Var.e();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(e19, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(e19, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = l0Var.f154389c;
            if (view.getTag(com.tencent.mm.R.id.f483392ak0) == null) {
                view.setTag(com.tencent.mm.R.id.f483392ak0, java.lang.Boolean.TRUE);
                java.lang.String UserName = l0Var.f154388b.f389233d.f383065d;
                kotlin.jvm.internal.o.f(UserName, "UserName");
                gr3.e.d(UserName, 1701, l0Var.f154390d, l0Var.f154387a.getIntent(), l0Var.f154391e.g() != sr3.a.f411829e ? 5 : 0, 0, 0, null, null, null, 0, 0, 4064, null);
            }
            l0Var.g();
        }
        return jz5.f0.f302826a;
    }
}
