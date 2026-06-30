package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameInfoViewForeign f141876d;

    public y3(com.tencent.mm.plugin.game.ui.GameInfoViewForeign gameInfoViewForeign) {
        this.f141876d = gameInfoViewForeign;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        java.lang.String str = null;
        com.tencent.mm.plugin.game.ui.GameInfoViewForeign gameInfoViewForeign = this.f141876d;
        if (tag == null || !(view.getTag() instanceof java.lang.String)) {
            android.content.Intent intent = new android.content.Intent();
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_message_center_v2, 1) == 1) {
                intent.setClass(gameInfoViewForeign.f140871d, com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class);
            } else {
                intent.setClass(gameInfoViewForeign.f140871d, com.tencent.mm.plugin.game.ui.GameMessageUI.class);
            }
            intent.putExtra("game_report_from_scene", 1001);
            android.content.Context context = gameInfoViewForeign.f140871d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        } else {
            i17 = r53.f.v(gameInfoViewForeign.f140871d, (java.lang.String) view.getTag(), "game_center_msgcenter", null);
        }
        int i18 = i17;
        java.lang.String valueOf = java.lang.String.valueOf(5);
        if (valueOf != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("function_type", "resource");
                jSONObject.put("function_value", valueOf);
            } catch (org.json.JSONException unused) {
            }
            str = nj0.a.d(jSONObject.toString());
        }
        com.tencent.mm.game.report.l.d(gameInfoViewForeign.f140871d, 10, 1001, gameInfoViewForeign.f140875h, i18, 0, null, gameInfoViewForeign.f140873f, 0, null, null, str);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
