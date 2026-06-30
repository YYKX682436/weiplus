package com.tencent.mm.view;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f213520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, int i17) {
        super(0);
        this.f213520d = refreshLoadMoreLayout;
        this.f213521e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.view.View findViewById2;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f213520d;
        android.view.View refreshHeader = refreshLoadMoreLayout.getRefreshHeader();
        if (refreshHeader != null && (findViewById2 = refreshHeader.findViewById(com.tencent.mm.R.id.m6l)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader2 = refreshLoadMoreLayout.getRefreshHeader();
        if (refreshHeader2 != null && (findViewById = refreshHeader2.findViewById(com.tencent.mm.R.id.lr6)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader3 = refreshLoadMoreLayout.getRefreshHeader();
        if (refreshHeader3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(refreshHeader3, arrayList3.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(refreshHeader3, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ym5.s3 s3Var = new ym5.s3(-1);
        s3Var.f463523h = this.f213521e;
        refreshLoadMoreLayout.Q = false;
        com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = refreshLoadMoreLayout.getStickTopLoadingLayout();
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.f213443f = false;
            stickTopLoadingLayout.b();
            ym5.q3 q3Var = stickTopLoadingLayout.actionCallback;
            if (q3Var != null) {
                q3Var.e(s3Var);
            }
        }
        ym5.q3 actionCallback = refreshLoadMoreLayout.getActionCallback();
        if (actionCallback != null) {
            actionCallback.e(s3Var);
        }
        ym5.q3 reportCallback = refreshLoadMoreLayout.getReportCallback();
        if (reportCallback != null) {
            reportCallback.e(s3Var);
        }
        return jz5.f0.f302826a;
    }
}
