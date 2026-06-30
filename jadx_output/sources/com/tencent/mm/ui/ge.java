package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MainTabUI.TabsAdapter f208690e;

    public ge(com.tencent.mm.ui.MainTabUI.TabsAdapter tabsAdapter, int i17) {
        this.f208690e = tabsAdapter;
        this.f208689d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MainTabUI.TabsAdapter tabsAdapter = this.f208690e;
        com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
        mainTabUI.b(mainTabUI.f196926f, mainTabUI.f196925e);
        com.tencent.mm.ui.MainTabUI.this.c(this.f208689d);
    }
}
