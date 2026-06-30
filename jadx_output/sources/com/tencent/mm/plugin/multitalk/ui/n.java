package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f150292d;

    public n(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.f150292d = multiTalkMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f150292d;
        if (multiTalkMainUI.f150239r) {
            multiTalkMainUI.f150231g.c();
        } else {
            multiTalkMainUI.f150229e.k(false, false);
        }
    }
}
