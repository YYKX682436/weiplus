package com.tencent.mm.view;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f213586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f213587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ym5.s3 s3Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        super(0);
        this.f213586d = s3Var;
        this.f213587e = refreshLoadMoreLayout;
    }

    public static final int a(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, ym5.s3 s3Var) {
        int[] iArr = new int[2];
        android.view.View view = refreshLoadMoreLayout.f213435x;
        if (view == null) {
            return 0;
        }
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        boolean z17 = s3Var.f463525j;
        android.graphics.Rect rect = new android.graphics.Rect();
        return refreshLoadMoreLayout.getGlobalVisibleRect(rect) ? rect.bottom - i17 : (int) (refreshLoadMoreLayout.getTranslationY() - (-refreshLoadMoreLayout.A));
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.widget.TextView textView;
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFinishRefresh2] reason=");
        ym5.s3 s3Var = this.f213586d;
        sb6.append(s3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f213587e;
        refreshLoadMoreLayout.setRefreshing(false);
        ym5.m4 m4Var = new ym5.m4(refreshLoadMoreLayout, s3Var);
        int i17 = s3Var.f463523h;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (i17 <= 0) {
            boolean z17 = true;
            s3Var.f463524i = a(refreshLoadMoreLayout, s3Var) > 0;
            java.lang.CharSequence charSequence = s3Var.f463518c;
            if (charSequence != null && charSequence.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                refreshLoadMoreLayout.isHasTopMore = false;
                android.view.View view = refreshLoadMoreLayout.refreshHeader;
                if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lr6)) != null) {
                    java.lang.CharSequence charSequence2 = s3Var.f463518c;
                    if (charSequence2 != null) {
                        textView.setVisibility(0);
                        textView.setText(charSequence2);
                        f0Var = f0Var2;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        textView.setText(com.tencent.mm.R.string.huw);
                    }
                }
                android.view.View view2 = refreshLoadMoreLayout.refreshHeader;
                if (view2 != null && (findViewById = view2.findViewById(com.tencent.mm.R.id.m6l)) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout", "noRefreshMore", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout", "noRefreshMore", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        } else if (s3Var.f463522g) {
            refreshLoadMoreLayout.s(new ym5.l4(m4Var, refreshLoadMoreLayout, s3Var));
        } else {
            m4Var.invoke();
            ym5.q3 actionCallback2 = refreshLoadMoreLayout.getActionCallback();
            if (actionCallback2 != null) {
                actionCallback2.e(s3Var);
            }
            ym5.q3 reportCallback2 = refreshLoadMoreLayout.getReportCallback();
            if (reportCallback2 != null) {
                reportCallback2.e(s3Var);
            }
        }
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
        return f0Var2;
    }
}
