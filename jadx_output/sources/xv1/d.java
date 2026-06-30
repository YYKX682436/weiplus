package xv1;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f457391a = new com.tencent.mm.sdk.platformtools.r2(3);

    public static wv1.a a(com.tencent.mm.plugin.choosemsgfile.logic.ui.c cVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        wv1.a aVar = null;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "getImagePath() msg is null !");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;
        }
        java.util.List e17 = e(str3);
        java.lang.String lowerCase = str2.toLowerCase();
        lowerCase.getClass();
        char c17 = 65535;
        switch (lowerCase.hashCode()) {
            case 96673:
                if (lowerCase.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)) {
                    c17 = 0;
                    break;
                }
                break;
            case 3143036:
                if (lowerCase.equals("file")) {
                    c17 = 1;
                    break;
                }
                break;
            case 100313435:
                if (lowerCase.equals("image")) {
                    c17 = 2;
                    break;
                }
                break;
            case 112202875:
                if (lowerCase.equals("video")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                wv1.a g17 = g(cVar, f9Var, str, e17);
                if (g17 != null) {
                    return g17;
                }
                wv1.h hVar = (f9Var.isVideo() || f9Var.Y2()) ? new wv1.h(cVar, f9Var) : null;
                if (hVar != null) {
                    return hVar;
                }
                if (f9Var.o2()) {
                    aVar = new wv1.b(cVar, f9Var);
                } else if (f9Var.J2()) {
                    aVar = new wv1.g(cVar, f9Var);
                }
                return aVar;
            case 1:
                return g(cVar, f9Var, str, e17);
            case 2:
                if (f9Var.o2()) {
                    return new wv1.b(cVar, f9Var);
                }
                if (f9Var.J2()) {
                    return new wv1.g(cVar, f9Var);
                }
                return null;
            case 3:
                if (f9Var.isVideo() || f9Var.Y2()) {
                    return new wv1.h(cVar, f9Var);
                }
                return null;
            default:
                return null;
        }
    }

    public static void b(int i17, int i18, android.content.Intent intent, lo.j jVar) {
        if (i17 == lo.a.f319942a) {
            if (i18 == -1) {
                if (intent == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "data is null");
                    if (jVar != null) {
                        jVar.a(1, "data is null", null);
                        return;
                    }
                    return;
                }
                java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("FILEPATHS");
                if (parcelableArrayListExtra != null) {
                    if (jVar != null) {
                        jVar.a(-1, "", parcelableArrayListExtra);
                        return;
                    }
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "msgFiles is null");
                    if (jVar != null) {
                        jVar.a(1, "msgFiles is null", null);
                        return;
                    }
                    return;
                }
            }
            if (i18 == 0) {
                if (jVar != null) {
                    jVar.a(0, "", null);
                }
            } else {
                if (i18 != 1) {
                    return;
                }
                if (intent == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "data is null");
                    if (jVar != null) {
                        jVar.a(1, "data is null", null);
                        return;
                    }
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("ERRMSG");
                if (jVar != null) {
                    jVar.a(1, stringExtra, null);
                }
            }
        }
    }

    public static void c(android.content.Context context, long j17, java.lang.String str) {
        if (!gm0.j1.u().l()) {
            db5.t7.k(context, null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", j17);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("msg_talker", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/util/MsgFileUtils", "enterFileProfile", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/choosemsgfile/logic/util/MsgFileUtils", "enterFileProfile", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void d(android.content.Context context, android.view.View view, wv1.a aVar) {
        int i17;
        int i18;
        android.content.Intent intent = new android.content.Intent();
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "[enterGallery] item == null");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = aVar.f449930b;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "[enterGallery] msg == null");
            return;
        }
        int i19 = context.getResources().getConfiguration().orientation;
        int[] iArr = new int[2];
        if (view != null) {
            i17 = view.getWidth();
            i18 = view.getHeight();
            view.getLocationInWindow(iArr);
        } else {
            i17 = 0;
            i18 = 0;
        }
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.putExtra("img_gallery_msg_id", f9Var.getMsgId()).putExtra("img_gallery_msg_svr_id", f9Var.I0()).putExtra("img_gallery_talker", f9Var.Q0()).putExtra("img_gallery_chatroom_name", f9Var.Q0()).putExtra("img_gallery_orientation", i19).putExtra("show_enter_grid", false).putExtra("img_gallery_enter_from_scene", 1);
        if (view != null) {
            intent.putExtra("img_gallery_width", i17).putExtra("img_gallery_height", i18).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
        } else {
            intent.putExtra("img_gallery_back_from_grid", true);
        }
        j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
        ((android.app.Activity) context).overridePendingTransition(0, 0);
    }

    public static java.util.List e(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return arrayList;
        }
        try {
            cl0.e eVar = new cl0.e(str);
            for (int i17 = 0; i17 < eVar.length(); i17++) {
                java.lang.String optString = eVar.optString(i17, "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    arrayList.add(optString);
                }
            }
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgFileUtils", e17, "", new java.lang.Object[0]);
        }
        return arrayList;
    }

    public static java.lang.String f(java.lang.String str) {
        if (!com.tencent.mm.storage.z3.R4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null) {
                return n17.P0();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "%s, contact is null", str);
            return "";
        }
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n18 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n18.P0())) {
            return n18.P0();
        }
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            return z07.field_displayname;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileUtils", "%s chatRoomMember is null", str);
        return "";
    }

    public static wv1.a g(com.tencent.mm.plugin.choosemsgfile.logic.ui.c cVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.util.List list) {
        java.lang.String j17;
        ot0.q v17;
        if (!f9Var.k2() || (j17 = f9Var.j()) == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        if (!((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
            return null;
        }
        wv1.f fVar = new wv1.f(cVar, f9Var, str);
        if (list != null && list.size() != 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (fVar.d().endsWith((java.lang.String) it.next())) {
                }
            }
            return null;
        }
        return fVar;
    }

    public static void h(android.content.Context context, int i17) {
        java.lang.String format = java.lang.String.format(context.getString(com.tencent.mm.R.string.b78), java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(format);
        u1Var.a(false);
        u1Var.l(new xv1.c());
        u1Var.q(false);
    }
}
