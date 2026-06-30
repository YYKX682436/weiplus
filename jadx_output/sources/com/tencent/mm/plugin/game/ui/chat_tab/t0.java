package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 f141313e;

    public t0(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2, java.lang.String str) {
        this.f141313e = gameTabWidget2;
        this.f141312d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f141312d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f141313e.f141193n).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view != null && (view.getTag() instanceof com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) && str.equals(((com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) view.getTag()).f141156d)) {
                view.performClick();
                return;
            }
        }
    }
}
