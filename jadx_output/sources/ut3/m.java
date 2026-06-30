package ut3;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ut3.m f431182a = new ut3.m();

    public final android.content.Intent a(android.app.Activity activity, java.lang.String str, int i17) {
        java.lang.Boolean bool;
        if (i17 == 0) {
            if (iq.b.g(activity) || iq.b.C(activity) || iq.b.v(activity)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "startStoryCapture, voip or multitalk running");
                bool = java.lang.Boolean.FALSE;
            } else {
                if (activity instanceof android.app.Activity) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    if (!j35.u.a(activity, "android.permission.CAMERA", 16, "", "")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "not get enough permission checkCamera");
                        bool = java.lang.Boolean.FALSE;
                    }
                }
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "startStoryCapture %s", com.tencent.mm.sdk.platformtools.z3.b(true));
                bool = java.lang.Boolean.TRUE;
            }
            if (!bool.booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "not get enough permission");
                return null;
            }
        }
        try {
            return new android.content.Intent(activity, java.lang.Class.forName(str));
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoCaptureJumper", e17, "buildIntent failed!", new java.lang.Object[0]);
            return null;
        }
    }

    public final void b(android.content.Context context, int i17, int i18) {
        if (i17 == -1 || i18 == -1) {
            return;
        }
        ((android.app.Activity) context).overridePendingTransition(i17, -1);
    }

    public boolean c(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent a17 = a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", 0);
        if (a17 == null) {
            return false;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a17.putExtra("KEY_PARAMS_TO_WHERE", 0);
        a17.putExtra("KEY_PARAMS_EXIT_ANIM", i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(a17);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToCaptureViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        b(context, i18, i19);
        return true;
    }

    public boolean d(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i27) {
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent a17 = a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", 0);
        if (a17 == null) {
            return false;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a17.putExtra("KEY_PARAMS_TO_WHERE", 0);
        a17.putExtra("KEY_PARAMS_EXIT_ANIM", i19);
        a17.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(a17);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToCaptureViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        b(context, i18, i19);
        return true;
    }

    public boolean e(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i27, int i28) {
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent a17 = a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", i28);
        if (a17 == null) {
            return false;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a17.putExtra("KEY_PARAMS_EXIT_ANIM", i19);
        a17.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", i27);
        a17.putExtra("KEY_PARAMS_TO_WHERE", i28);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(a17);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToCaptureViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        b(context, i18, i19);
        return true;
    }

    public boolean f(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i27, int i28) {
        return g(context, i17, i18, i19, recordConfigProvider, i27, i28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean g(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i27, int i28, ut3.l lVar) {
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent a17 = a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", i27);
        if (a17 == null) {
            return false;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a17.putExtra("KEY_PARAMS_TO_WHERE", i27);
        a17.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", i28);
        a17.putExtra("KEY_PARAMS_EXIT_ANIM", i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        boolean z17 = context instanceof android.app.Activity;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCaptureJumper", "startEditViewForResult, context is not an Activity");
        } else if (lVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(a17);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "startEditViewForResult", "(Landroid/content/Context;ILcom/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper$EditResultCallback;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } else if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) context).startActivityForResult(a17)).f197877a = new ut3.j(this, lVar, i17);
        } else if ((context instanceof q80.z) && z17) {
            ((q80.z) context).R1(new ut3.k(this, lVar));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(a17);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "startEditViewForResult", "(Landroid/content/Context;ILcom/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper$EditResultCallback;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            arrayList3.add(a17);
            java.util.Collections.reverse(arrayList3);
            yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "startEditViewForResult", "(Landroid/content/Context;ILcom/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper$EditResultCallback;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        b(context, i18, i19);
        return true;
    }

    public boolean h(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i27, int i28, boolean z17, r45.q23 q23Var, boolean z18, boolean z19) {
        return i(context, i17, i18, i19, recordConfigProvider, i27, i28, z17, q23Var, z18, z19, false, null, null, null);
    }

    public boolean i(android.content.Context context, int i17, int i18, int i19, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i27, int i28, boolean z17, r45.q23 q23Var, boolean z18, boolean z19, boolean z27, java.lang.String str, byte[] bArr, byte[] bArr2) {
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent a17 = a(activity, "com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI", i27);
        if (a17 == null) {
            return false;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a17.putExtra("KEY_PARAMS_TO_WHERE", i27);
        a17.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", i28);
        a17.putExtra("KEY_PARAMS_EXIT_ANIM", i19);
        a17.putExtra("KEY_FROM_SHOOT_COMPOSING", z17);
        a17.putExtra("KEY_VIDEO_SOURCE_FROM_ALBUM", z18);
        a17.putExtra("KEY_SHOOT_COMPOSING_ONLY_PREVIEW", z19);
        if (q23Var != null) {
            try {
                a17.putExtra("KEY_SHOOT_COMPOSING_TEMPLATE_INFO", q23Var.toByteArray());
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoCaptureJumper", "jumpToMJMovieComposingForResult, templateInfo.toByteArray() failed");
            }
        }
        a17.putExtra("KEY_FROM_COMPOSING_CREATION_REEDIT", z27);
        if (str != null) {
            a17.putExtra("KEY_COMPOSING_CREATION_REEDIT_PARAMS", str);
        }
        if (bArr != null) {
            a17.putExtra("KEY_COMPOSING_CREATION_REEDIT_LOCAL_CREATE_TPL_INFO", bArr);
        }
        if (bArr2 != null) {
            a17.putExtra("KEY_COMPOSING_CREATION_REEDIT_EFFECT_EDIT_INFO", bArr2);
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = recordConfigProvider;
        objArr[1] = java.lang.Boolean.valueOf(str != null);
        objArr[2] = java.lang.Boolean.valueOf(bArr != null);
        objArr[3] = java.lang.Boolean.valueOf(bArr2 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "jumpToMJMovieComposingForResult: configProvider=%s, hasReeditParams=%b, hasLocalCreateTemplateInfo=%b, hasEffectEditInfo=%b", objArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(a17);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToMJMovieComposingForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;IIZLcom/tencent/mm/protocal/protobuf/FinderVideoTemplateInfo;ZZZLjava/lang/String;[B[B)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        b(context, i18, i19);
        return true;
    }
}
