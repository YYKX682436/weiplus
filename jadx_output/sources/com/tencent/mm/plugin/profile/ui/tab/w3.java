package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes3.dex */
public final class w3 implements com.tencent.wechat.iam.biz.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154683a;

    public w3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154683a = s4Var;
    }

    @Override // com.tencent.wechat.iam.biz.k0
    public final void complete(boolean z17) {
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154683a;
        java.lang.Object value = ((jz5.n) s4Var.f154546a0).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$11", "complete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$11", "complete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value2 = ((jz5.n) s4Var.Y).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        android.view.View view2 = (android.view.View) value2;
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$11", "complete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$11", "complete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value3 = ((jz5.n) s4Var.f154550c0).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        android.view.View view3 = (android.view.View) value3;
        int i19 = z17 ? 8 : 0;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$11", "complete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$11", "complete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
