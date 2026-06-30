package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f141339d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 f141340e;

    public y0(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2) {
        this.f141340e = gameTabWidget2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String stringExtra;
        java.lang.String str;
        java.lang.Object tag;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) view.getTag();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            stringExtra = this.f141340e.f141186d.getIntent().getStringExtra("game_tab_key");
            str = tabItem.f141156d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameTabWidget2", "selectTab err:%s", e17.getMessage());
        }
        if (str.equals(stringExtra)) {
            if (currentTimeMillis - this.f141339d < 300) {
                ((sd.u0) com.tencent.mm.plugin.webview.luggage.u1.b().getLast()).f406655i.c(new com.tencent.mm.plugin.game.ui.chat_tab.w0(this));
            }
            this.f141339d = currentTimeMillis;
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget2", "currentTabKey:%s, nextTabKey:%s", stringExtra, tabItem.f141156d);
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2 = this.f141340e;
        if (gameTabWidget2.f141188f && !gameTabWidget2.f141189g) {
            int intExtra = gameTabWidget2.f141186d.getIntent().getIntExtra("game_tab_type", -1);
            long longExtra = this.f141340e.f141186d.getIntent().getLongExtra("turn_page_time", 0L);
            if (tabItem.f141166q != intExtra && java.lang.System.currentTimeMillis() - longExtra < 500) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget2", "switch interval > %d", 500L);
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (tabItem.f141166q != intExtra) {
                this.f141340e.f141190h = false;
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.game.ui.chat_tab.x0 x0Var = new com.tencent.mm.plugin.game.ui.chat_tab.x0(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(x0Var, 500L, false);
            }
            com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = (com.tencent.mm.plugin.game.ui.chat_tab.c1) ((java.util.HashMap) this.f141340e.f141187e.f141258h).get(tabItem.f141156d);
            if (c1Var != null && (tag = c1Var.f141250d.getTag()) != null && (tag instanceof java.lang.Integer)) {
                i17 = ((java.lang.Integer) tag).intValue();
            }
            tabItem.B = i17;
            android.app.Activity activity = this.f141340e.f141186d;
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.d(activity, null, tabItem, null, null, activity.getIntent(), false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f141340e.f141186d.getIntent().getStringExtra("game_red_dot_tab_key"))) {
                com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var2 = (com.tencent.mm.plugin.game.ui.chat_tab.c1) ((java.util.HashMap) this.f141340e.f141187e.f141258h).get(tabItem.f141156d);
                if (c1Var2 != null) {
                    c1Var2.f141249c.setVisibility(8);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget2", "tab switch disable");
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
