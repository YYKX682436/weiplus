package xt2;

/* loaded from: classes3.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nt2 f456970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.r4 f456971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(xt2.b5 b5Var, r45.nt2 nt2Var, xt2.r4 r4Var) {
        super(3);
        this.f456969d = b5Var;
        this.f456970e = nt2Var;
        this.f456971f = r4Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        xt2.b5 b5Var = this.f456969d;
        if (booleanValue) {
            boolean z17 = intValue == 1;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = b5Var.f456638m;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("productReplaySwitchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(z17);
            android.view.View view = b5Var.f456641p;
            if (view == null) {
                kotlin.jvm.internal.o.o("optionParent");
                throw null;
            }
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = b5Var.f456643r;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("autoChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = b5Var.f456644s;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("manualChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            r45.nt2 nt2Var = this.f456970e;
            nt2Var.set(0, valueOf);
            nt2Var.set(1, java.lang.Integer.valueOf(intValue2));
        } else {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = b5Var.f456638m;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("productReplaySwitchBtn");
                throw null;
            }
            mMSwitchBtn2.setSwitchListener(null);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = b5Var.f456638m;
            if (mMSwitchBtn3 == null) {
                kotlin.jvm.internal.o.o("productReplaySwitchBtn");
                throw null;
            }
            mMSwitchBtn3.setCheck(!mMSwitchBtn3.f211363x);
            com.tencent.mm.ui.MMActivity mMActivity = b5Var.f456636h;
            db5.t7.g(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f491780e75));
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn4 = b5Var.f456638m;
            if (mMSwitchBtn4 == null) {
                kotlin.jvm.internal.o.o("productReplaySwitchBtn");
                throw null;
            }
            mMSwitchBtn4.postDelayed(new xt2.p4(b5Var, this.f456971f), 100L);
        }
        return jz5.f0.f302826a;
    }
}
