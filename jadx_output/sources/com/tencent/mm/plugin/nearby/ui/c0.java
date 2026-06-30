package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes4.dex */
public class c0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152129a;

    public c0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152129a = nearbyFriendsUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152129a;
        if (booleanValue) {
            int i17 = com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.D;
            nearbyFriendsUI.U6();
            return;
        }
        android.view.View findViewById = nearbyFriendsUI.findViewById(com.tencent.mm.R.id.k5p);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$2", "onOp", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$2", "onOp", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nearbyFriendsUI.f152089f.setVisibility(8);
    }
}
