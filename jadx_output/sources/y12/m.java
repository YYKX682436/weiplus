package y12;

/* loaded from: classes12.dex */
public abstract class m {
    public static void a(android.content.Context context, r45.kj0 kj0Var, boolean z17) {
        if (kj0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "banner is null. do nothing");
            return;
        }
        int i17 = kj0Var.f378731i;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "MM_EMOTION_BANNER_SET_NULL do nothing");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f378729g), kj0Var.f378727e, 0, 0);
            return;
        }
        if (i17 == 1) {
            if (z17) {
                b(context, kj0Var, true, 15, 8);
            } else {
                b(context, kj0Var, true, 3, 5);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f378729g), kj0Var.f378727e, 0, 4);
            return;
        }
        if (i17 == 2) {
            java.lang.String str = kj0Var.f378728f;
            java.lang.String str2 = kj0Var.f378727e;
            if (com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, context);
            } else {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f378729g), kj0Var.f378727e, 0, 3);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                f(context, kj0Var.f378729g, kj0Var.f378727e, kj0Var.f378733n, kj0Var.f378732m, kj0Var.f378730h, 10001);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f378729g), kj0Var.f378727e, 0, 1);
                return;
            }
            if (i17 != 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "Unkown type do nothing. SetType:%d", java.lang.Integer.valueOf(i17));
                return;
            }
            if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", kj0Var.f378737r.f379515d);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, kj0Var.f378737r.f379516e);
            bundle.putString("query", "SetKey=" + kj0Var.f378736q);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, true, new y12.l());
            return;
        }
        int i18 = kj0Var.f378729g;
        java.lang.String str3 = kj0Var.f378727e;
        java.lang.String str4 = kj0Var.f378733n;
        java.lang.String str5 = kj0Var.f378732m;
        java.lang.String str6 = kj0Var.f378730h;
        if (com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(context, com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI.class);
            intent2.putExtra("topic_id", i18);
            intent2.putExtra("topic_name", str3);
            intent2.putExtra("topic_ad_url", str6);
            intent2.putExtra("topic_icon_url", str5);
            intent2.putExtra("topic_desc", str4);
            if (z17) {
                intent2.putExtra("extra_scence", 15);
            } else {
                intent2.putExtra("extra_scence", 3);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startEmotionList", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startEmotionList", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13223, 1, java.lang.Integer.valueOf(kj0Var.f378729g), kj0Var.f378727e, 0, 2);
    }

    public static void b(android.content.Context context, r45.kj0 kj0Var, boolean z17, int i17, int i18) {
        r45.qj0 qj0Var = new r45.qj0();
        java.lang.String str = kj0Var.f378734o;
        qj0Var.f384032d = str;
        qj0Var.f384034f = kj0Var.f378727e;
        qj0Var.f384035g = kj0Var.f378733n;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        d22.d0 d0Var = new d22.d0(str, qj0Var, null);
        d0Var.f364198g = i18;
        d0Var.f364155a = i17;
        d0Var.f364203l = true;
        d22.u.f225876a.a(context, d0Var);
    }

    public static void c(android.content.Context context, r45.zj0 zj0Var, boolean z17, int i17, int i18, int i19, java.lang.String str, int i27, com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct, boolean z18) {
        d(context, zj0Var, z17, i17, i18, i19, str, i27, emoticonStoreActionStruct, z18, "");
    }

    public static void d(android.content.Context context, r45.zj0 zj0Var, boolean z17, int i17, int i18, int i19, java.lang.String str, int i27, com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct, boolean z18, java.lang.String str2) {
        if (zj0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiUINavigatorMgr", "get detail intent failed. summary is null.");
            return;
        }
        j12.i iVar = new j12.i(zj0Var);
        if (emoticonStoreActionStruct != null) {
            iVar.f297176k = emoticonStoreActionStruct.f56082p;
        }
        java.lang.String str3 = zj0Var.f392128d;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        d22.d0 d0Var = new d22.d0(str3, null, iVar);
        d0Var.f364198g = i27;
        d0Var.f364155a = i17;
        d0Var.f364203l = z18;
        if (str2 == null) {
            str2 = "";
        }
        d0Var.f364157c = str2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            kotlin.jvm.internal.o.g(str, "<set-?>");
            d0Var.f364199h = str;
        }
        if (emoticonStoreActionStruct != null) {
            java.lang.String m17 = emoticonStoreActionStruct.m();
            kotlin.jvm.internal.o.g(m17, "<set-?>");
            d0Var.f364204m = m17;
        }
        d22.u.f225876a.a(context, d0Var);
    }

    public static void e(android.content.Context context, r45.zj0 zj0Var, boolean z17, int i17, int i18, int i19, java.lang.String str, int i27, boolean z18) {
        c(context, zj0Var, z17, i17, i18, i19, str, i27, null, z18);
    }

    public static void f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI.class);
        intent.putExtra("set_id", i17);
        intent.putExtra("set_title", str);
        intent.putExtra("set_desc", str2);
        intent.putExtra("set_iconURL", str3);
        intent.putExtra("headurl", str4);
        intent.putExtra("entrance_scene", i18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
