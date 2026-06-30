package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass4 f211106d;

    public v5(com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass4 anonymousClass4) {
        this.f211106d = anonymousClass4;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.d9.b().p().w(68377, "");
        com.tencent.mm.ui.base.preference.h0 h0Var = com.tencent.mm.ui.FindMoreFriendsUI.this.f196656w;
        if (h0Var != null) {
            h0Var.notifyDataSetChanged();
        }
    }
}
