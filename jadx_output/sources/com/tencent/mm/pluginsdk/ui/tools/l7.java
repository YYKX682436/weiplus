package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes10.dex */
public abstract class l7 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f191766a;

    public static void a(java.lang.String str, android.content.Context context, zb0.a0 a0Var) {
        if (a0Var == null) {
            a0Var = new com.tencent.mm.pluginsdk.ui.tools.k7(context);
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(context, str, a0Var);
    }

    public static java.lang.String b(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        if (f191766a == null) {
            f191766a = context.getSharedPreferences("system_config_prefs", 0).getString("camera_file_path", null);
        }
        if (!com.tencent.mm.vfs.w6.j(f191766a)) {
            f191766a = com.tencent.mm.ui.tools.i1.b(context, intent, str);
        }
        q75.c.f(f191766a, context);
        return f191766a;
    }

    public static void c(android.app.Activity activity, int i17, int i18, int i19, int i27, boolean z17, android.content.Intent intent) {
        d(activity, i17, i18, i19, i27, z17, intent, true);
    }

    public static void d(android.app.Activity activity, int i17, int i18, int i19, int i27, boolean z17, android.content.Intent intent, boolean z18) {
        android.os.Bundle extras;
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("query_media_type", i27);
        intent2.putExtra("show_header_view", z17);
        if (z18) {
            intent2.addFlags(67108864);
        }
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent2, i17);
    }

    public static void e(android.app.Activity activity, int i17, int i18, int i19, android.content.Intent intent) {
        f(activity, i17, i18, i19, intent, true);
    }

    public static void f(android.app.Activity activity, int i17, int i18, int i19, android.content.Intent intent, boolean z17) {
        android.os.Bundle extras;
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("need_to_clear_top", z17);
        if (z17) {
            intent2.addFlags(67108864);
        }
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent2, i17);
    }

    public static void g(androidx.fragment.app.Fragment fragment, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", java.lang.Integer.valueOf(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(true, 0, 1, 1, 0, 2000, 706, 4L, "MicroMsg.TakePhotoUtil")));
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent2.putExtra("GalleryUI_FromUser", str);
            intent2.putExtra("GalleryUI_ToUser", str2);
        }
        intent2.putExtra("max_select_count", i18);
        intent2.putExtra("query_source_type", i19);
        intent2.putExtra("query_media_type", i27);
        boolean z17 = x51.o1.f452042a;
        intent2.putExtra("show_header_view", false);
        intent2.addFlags(67108864);
        intent2.putExtra("animation_push_up_in", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "selectPicFromMMGallery: requestCode:%s", java.lang.Integer.valueOf(i17));
        if (i17 == -1) {
            j45.l.j(fragment.getContext(), "gallery", ".ui.AlbumPreviewUI", intent2, null);
        } else {
            j45.l.p(fragment, "gallery", ".ui.AlbumPreviewUI", intent2, i17);
        }
    }

    public static boolean h(android.app.Activity activity, int i17, android.content.Intent intent) {
        e(activity, i17, 1, 0, intent);
        return true;
    }

    public static void i(android.app.Activity activity, java.lang.String str, int i17, int i18, int i19, int i27, boolean z17) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            r6Var.l();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("output", com.tencent.mm.sdk.platformtools.i1.b(activity, r6Var));
        intent.putExtra("android.intent.extra.videoQuality", i27);
        intent.putExtra("android.intent.extras.CAMERA_FACING", z17 ? 1 : 0);
        if (i18 > 0) {
            intent.putExtra("android.intent.extra.durationLimit", i18);
        }
        if (i19 > 0) {
            intent.putExtra("android.intent.extra.sizeLimit", i19);
        }
        intent.setAction("android.media.action.VIDEO_CAPTURE");
        intent.addCategory("android.intent.category.DEFAULT");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "selectVideoFromSys", "(Landroid/app/Activity;Ljava/lang/String;IIIIZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static boolean j(android.content.Context context, int i17, android.content.Intent intent, int i18, int i19) {
        k(context, i17, intent, i18, "", i19, "");
        return true;
    }

    public static boolean k(android.content.Context context, int i17, android.content.Intent intent, int i18, java.lang.String str, int i19, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", java.lang.Integer.valueOf(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(true, 0, 1, 1, 0, 2000, 707, 4L, "MicroMsg.TakePhotoUtil")));
        com.tencent.mm.plugin.mmsight.SightParams sightParams = intent != null ? (com.tencent.mm.plugin.mmsight.SightParams) intent.getParcelableExtra("KEY_SIGHT_PARAMS") : null;
        if (sightParams == null) {
            sightParams = new com.tencent.mm.plugin.mmsight.SightParams(i18, i19);
        }
        sightParams.f148827q = str2;
        intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
        if (i18 == 1) {
            java.lang.String a17 = t21.c3.a(str);
            sightParams.a(a17, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, a17, true), ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a17, true), q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
        }
        intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
        j45.l.n(context, "mmsight", ".ui.SightCaptureUI", intent, i17);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477876e0, -1);
        }
        return true;
    }

    public static boolean l(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = false;
        if (!iq.b.g(activity) && !iq.b.v(activity) && !iq.b.e(activity)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", java.lang.Integer.valueOf(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(true, 0, 1, 1, 0, 2000, 707, 4L, "MicroMsg.TakePhotoUtil")));
            f191766a = com.tencent.mm.vfs.w6.i(str + str2, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("takePhotoFromSys(), filePath = ");
            sb6.append(f191766a);
            com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", sb6.toString());
            java.lang.String str3 = f191766a;
            android.content.SharedPreferences.Editor edit = activity.getSharedPreferences("system_config_prefs", 0).edit();
            edit.putString("camera_file_path", str3);
            edit.commit();
            android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                try {
                    r6Var.J();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TakePhotoUtil", e17, "", new java.lang.Object[0]);
                }
            }
            if (r6Var.m()) {
                android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(activity, new com.tencent.mm.vfs.r6(f191766a));
                intent.addFlags(2);
                intent.putExtra("output", b17);
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takePhotoFromSys", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "takePhotoFromSys()");
                    z17 = true;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + e18.getMessage());
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. ".concat(str));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str, str2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
