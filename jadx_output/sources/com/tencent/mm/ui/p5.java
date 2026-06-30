package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.s5 f209494d;

    public p5(com.tencent.mm.ui.s5 s5Var) {
        this.f209494d = s5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.s5 s5Var = this.f209494d;
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = s5Var.f209775j;
        findMoreFriendsUI.E = false;
        s5Var.f209775j.r1((com.tencent.mm.ui.GameIconViewTipPreference) findMoreFriendsUI.f196656w.h("more_tab_game_recommend"), 8, 8, 8, false, 8, 8, 8, s5Var.f209766a);
    }
}
