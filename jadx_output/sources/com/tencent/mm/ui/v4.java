package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f211103d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f211105f;

    public v4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, android.view.View view) {
        this.f211105f = findMoreFriendsUI;
        this.f211104e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f211105f;
        if (findMoreFriendsUI.getView() == null) {
            return;
        }
        int a17 = com.tencent.mm.ui.bl.a(findMoreFriendsUI.getContext());
        int i17 = com.tencent.mm.ui.bl.i(findMoreFriendsUI.getContext(), -1);
        if (i17 <= 0) {
            if (this.f211103d < 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight again!");
                findMoreFriendsUI.getView().post(this);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight finally!");
            }
            this.f211103d++;
        } else {
            java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
            int K0 = findMoreFriendsUI.K0();
            int height = this.f211104e.getHeight();
            if (K0 != findMoreFriendsUI.getView().getPaddingTop()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] now:%s old:%s", java.lang.Integer.valueOf(K0), java.lang.Integer.valueOf(findMoreFriendsUI.getView().getPaddingTop()));
                if (com.tencent.mm.ui.a4.f197117a.h(findMoreFriendsUI.thisActivity())) {
                    findMoreFriendsUI.getView().setPadding(0, K0, 0, 0);
                } else {
                    findMoreFriendsUI.getView().setPadding(0, K0, 0, height);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] has try more once! it's right! statusHeight:%s actionBarHeight:%s tabBarHeight:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(height));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] tryCount:%s statusHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(this.f211103d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
    }
}
