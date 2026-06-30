package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class j1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f141283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI f141284e;

    public j1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI, android.os.Bundle bundle) {
        this.f141284e = gameWebTabUI;
        this.f141283d = bundle;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString("game_tab_red_dot_msgid");
            str = bundle.getString("game_red_dot_tab_key");
            java.lang.String str2 = this.f141284e.f141198n;
            if (str2 != null && str2.equals(str)) {
                this.f141283d.putInt("type", 2);
                this.f141283d.putString("msgId", string);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, this.f141283d, com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.a.class, null);
                return;
            }
        } else {
            str = "";
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.i1(this, str));
        com.tencent.mm.ipcinvoker.d0.h(this);
    }
}
