package o22;

/* loaded from: classes10.dex */
public abstract class i {
    public static void a(android.content.Context context) {
        try {
            int i17 = com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI.f98637g;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI.class);
            intent.putExtra("sticker_url", (java.lang.String) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture", "startStickerPreview", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture", "startStickerPreview", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TakeEmojiCapture", e17, "start sticker preview failed", new java.lang.Object[0]);
        }
    }

    public static void b(android.content.Context context, int i17, java.lang.String str) {
        d(context, null, 1111, i17, null, str);
    }

    public static void c(android.content.Context context, int i17, java.lang.String str, java.lang.String str2) {
        d(context, str, 1111, com.tencent.mm.sdk.platformtools.t8.K0(str) ? 2 : 1, null, str2);
    }

    public static void d(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        boolean z17;
        boolean z18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        ((t22.v) ((o22.g) i95.n0.c(o22.g.class))).getClass();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EMOJI_STICKER_ENABLE_INT, 0);
        boolean z27 = r17 == 1 || r17 != 2;
        ((t22.v) ((o22.g) i95.n0.c(o22.g.class))).getClass();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_sticker_recommend_count, 9);
        if (i18 == 1 || i18 == 6) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 2, java.lang.Long.valueOf(currentTimeMillis), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i18), "", 0, 0, 0, "", 0, java.lang.Integer.valueOf(Ni));
        } else if (i18 == 2) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 1, java.lang.Long.valueOf(currentTimeMillis), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i18), "", 0, java.lang.Long.valueOf(currentTimeMillis2 - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_PANEL_FROM_TIPS_TIME_LONG, currentTimeMillis2)), 0, "", 0, java.lang.Integer.valueOf(Ni));
        }
        try {
            int i19 = com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.f98605u;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.class);
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            intent.putExtra("key_video_params", d11.s.fj().cj());
            intent.putExtra("key_enter_time", currentTimeMillis);
            intent.putExtra("enter_scene", i18);
            intent.putExtra("key_capture_max_duration", ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmoticonCameraCaptureMaxDuration", 5));
            if (z19) {
                intent.putExtra("key_imitated_md5", str);
            }
            intent.putExtra("sticker_enable", z27);
            if (str2 != null) {
                intent.putExtra("lens_id", str2);
            }
            intent.putExtra(dm.i4.COL_USERNAME, str3);
            o22.g gVar = (o22.g) i95.n0.c(o22.g.class);
            o22.h hVar = new o22.h(context, intent, i17);
            t22.v vVar = (t22.v) gVar;
            vVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            f11.j.b().getClass();
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(57);
            boolean g17 = iq.b.g(context);
            java.lang.String str4 = vVar.f415110d;
            if (g17 || iq.b.C(context) || iq.b.v(context) || iq.b.c(context, true)) {
                com.tencent.mars.xlog.Log.i(str4, "camera check false");
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17) {
                gr.v vVar2 = gr.v.f274696a;
                vVar2.a(false);
                if (vVar2.b().getBoolean("capture_full", false)) {
                    com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                    aVar.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.bpx);
                    aVar.f211729s = of5.b.a(context).getString(com.tencent.mm.R.string.bpw);
                    aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.bpv);
                    aVar.E = new t22.u(context);
                    aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.bpu);
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                    j0Var.e(aVar);
                    com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                    if (d0Var != null) {
                        d0Var.a(j0Var.f211837r);
                    }
                    j0Var.show();
                    com.tencent.mars.xlog.Log.i(str4, "over size check false");
                    z18 = false;
                } else {
                    z18 = true;
                }
                if (z18) {
                    if (i18 != 2) {
                        hVar.a(true);
                        return;
                    }
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_OPENED_BOOLEAN;
                    java.lang.Object m17 = c17.m(u3Var, null);
                    if (m17 != null && (m17 instanceof java.lang.Boolean) && ((java.lang.Boolean) m17).booleanValue()) {
                        hVar.a(true);
                        return;
                    }
                    if (!f11.j.b().f258563a) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(933L, 2L);
                    }
                    android.content.res.Resources resources = context.getResources();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.emoji_capture_first_open_notice));
                    arrayList.add(resources);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/model/PluginEmojiCapture", "firstOpenCheck", "(Landroid/content/Context;Lcom/tencent/mm/plugin/emojicapture/api/IPluginEmojiCapture$CheckCallback;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/emojicapture/model/PluginEmojiCapture", "firstOpenCheck", "(Landroid/content/Context;Lcom/tencent/mm/plugin/emojicapture/api/IPluginEmojiCapture$CheckCallback;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                    com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
                    aVar2.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.bpt);
                    aVar2.f211727q = decodeResource;
                    aVar2.D = false;
                    aVar2.T = 0;
                    aVar2.f211729s = of5.b.a(context).getString(com.tencent.mm.R.string.bps);
                    aVar2.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.bpq);
                    aVar2.H = new t22.t(hVar);
                    com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                    j0Var2.e(aVar2);
                    com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
                    if (d0Var2 != null) {
                        d0Var2.a(j0Var2.f211837r);
                    }
                    j0Var2.show();
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    com.tencent.mars.xlog.Log.i(str4, "first open check false");
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TakeEmojiCapture", e17, "takeEmojiCapture failed", new java.lang.Object[0]);
        }
    }
}
