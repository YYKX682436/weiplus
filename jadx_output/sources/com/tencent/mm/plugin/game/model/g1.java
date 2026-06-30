package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f140318d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f140319e;

    public g1(android.content.Context context) {
        this.f140319e = context;
    }

    public static int a(android.content.Context context, com.tencent.mm.plugin.game.model.e1 e1Var, com.tencent.mm.plugin.game.model.r0 r0Var, java.lang.String str, int i17) {
        int i18 = r0Var.f140429d;
        int i19 = 3;
        if (i18 == 1) {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.r(context, str)) {
                com.tencent.mm.plugin.game.model.f.j(context, str);
            } else {
                i19 = b(context, str, i17);
            }
        } else {
            if (i18 != 2) {
                if (i18 == 3) {
                    return b(context, str, i17);
                }
                if (i18 == 4) {
                    if (e1Var != null) {
                        e1Var.field_isRead = true;
                        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().update(e1Var, new java.lang.String[0]);
                    }
                    android.content.Intent intent = new android.content.Intent();
                    if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_message_center_v2, 1) == 1) {
                        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI");
                    } else {
                        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.GameMessageUI");
                    }
                    intent.putExtra("game_report_from_scene", i17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/model/GameMessageClickListener", "dealMsgJumpMsgCenter", "(Landroid/content/Context;Lcom/tencent/mm/plugin/game/model/GameMessage;I)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "dealMsgJumpMsgCenter", "(Landroid/content/Context;Lcom/tencent/mm/plugin/game/model/GameMessage;I)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return 6;
                }
                if (i18 == 5) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.jump_url)) {
                        return 0;
                    }
                    if (r53.f.c(context, r0Var.jump_url)) {
                        return 30;
                    }
                    r53.f.s(context, r0Var, "", "", null);
                    return 7;
                }
                if (i18 != 7) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageClickListener", "unknown msg jump type = " + r0Var.f140429d);
                    return 0;
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_can_select_video_and_pic", true);
                intent2.putExtra("key_send_raw_image", false);
                intent2.putExtra("max_select_count", 9);
                intent2.putExtra("query_source_type", 15);
                intent2.putExtra("query_media_type", 2);
                intent2.putExtra("show_header_view", false);
                intent2.addFlags(67108864);
                intent2.putExtra("game_haowan_ignore_video_preview", true);
                intent2.putExtra("game_haowan_force_select", true);
                intent2.putExtra("game_straight_to_publish", true);
                intent2.putExtra("game_media_default_type", 1);
                j45.l.j(context, "game", ".media.GamePublishGalleryUI", intent2, null);
                return 0;
            }
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.r(context, str)) {
                com.tencent.mm.plugin.game.model.f.j(context, str);
            } else {
                i19 = 0;
            }
        }
        return i19;
    }

    public static int b(android.content.Context context, java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("game_app_id", str);
        bundle.putInt("game_report_from_scene", i17);
        return r53.f.o(context, str, null, bundle, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.game.model.f1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageClickListener", "v.getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.f1 f1Var = (com.tencent.mm.plugin.game.model.f1) view.getTag();
        com.tencent.mm.plugin.game.model.e1 e1Var = f1Var.f140309a;
        if (e1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageClickListener", "message is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = f1Var.f140310b;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageClickListener", "jumpId is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.r0 r0Var = (com.tencent.mm.plugin.game.model.r0) e1Var.f140282g2.get(str);
        if (r0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageClickListener", "jumpInfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.e1 e1Var2 = f1Var.f140309a;
        int a17 = a(this.f140319e, e1Var2, r0Var, e1Var2.field_appId, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
        if (a17 != 0) {
            com.tencent.mm.game.report.l.d(this.f140319e, 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, f1Var.f140311c, a17, 0, e1Var2.field_appId, this.f140318d, e1Var2.S2, e1Var2.field_gameMsgId, e1Var2.T2, com.tencent.mm.game.report.l.a(null, null, e1Var2.U2, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public g1(android.content.Context context, int i17) {
        this.f140319e = context;
        this.f140318d = i17;
    }
}
