package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class u5 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f211069d;

    public u5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        this.f211069d = findMoreFriendsUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f211069d;
        findMoreFriendsUI.y1();
        com.tencent.mm.ui.base.preference.h0 h0Var = findMoreFriendsUI.f196656w;
        if (h0Var != null) {
            h0Var.notifyDataSetChanged();
        }
    }
}
