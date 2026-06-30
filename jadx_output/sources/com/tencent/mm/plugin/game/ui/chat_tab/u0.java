package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.AnonymousClass3 f141318e;

    public u0(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.AnonymousClass3 anonymousClass3, int i17) {
        this.f141318e = anonymousClass3;
        this.f141317d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.AnonymousClass3 anonymousClass3 = this.f141318e;
        int i17 = this.f141317d;
        if (i17 == 0) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.setVisibility(8);
        } else if (i17 == 1) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.setVisibility(0);
        }
    }
}
