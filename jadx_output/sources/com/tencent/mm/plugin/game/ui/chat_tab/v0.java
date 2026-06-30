package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class v0 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 f141322a;

    public v0(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2) {
        this.f141322a = gameTabWidget2;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.a(this.f141322a);
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.a(this.f141322a);
    }
}
