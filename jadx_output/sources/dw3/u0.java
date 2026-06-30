package dw3;

/* loaded from: classes10.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.u0 f244283a = new dw3.u0();

    public static final void a(dw3.u0 u0Var, int i17) {
        u0Var.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_unexp", kz5.c1.k(new jz5.l("view_id", "video_edit_miaojian_jump_tips"), new jz5.l("view_edit_miaojian_jump_tips_display_type", java.lang.Integer.valueOf(i17)), new jz5.l("post_session_id", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi())), 32337);
    }

    public static void g(dw3.u0 u0Var, android.content.Context context, java.util.List mediaPaths, java.util.List timeRangeList, java.lang.String str, int i17, dw3.l0 jumpSecondCutParams, yz5.l lVar, int i18, java.lang.Object obj) {
        int i19;
        java.lang.String scene = (i18 & 8) != 0 ? "moments" : str;
        if ((i18 & 16) != 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_phoneix_video_duration, 30);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Ni);
            i19 = Ni;
        } else {
            i19 = i17;
        }
        yz5.l lVar2 = (i18 & 64) != 0 ? null : lVar;
        u0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mediaPaths, "mediaPaths");
        kotlin.jvm.internal.o.g(timeRangeList, "timeRangeList");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(jumpSecondCutParams, "jumpSecondCutParams");
        android.app.Activity activity = (android.app.Activity) context;
        boolean b17 = dw3.c.f244181a.b(activity, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        db5.e1.j(activity, b17 ? com.tencent.mm.R.string.f490414ub : 0, b17 ? com.tencent.mm.R.string.f490573yv : com.tencent.mm.R.string.g1f, b17 ? com.tencent.mm.R.string.f490507x1 : com.tencent.mm.R.string.f492249fs4, com.tencent.mm.R.string.f490347sg, new dw3.p0(lVar2, b17, scene, mediaPaths, i19, timeRangeList, jumpSecondCutParams, activity), new dw3.q0(lVar2));
    }

    public final void b(android.content.Intent intent, android.content.Intent editResult) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(editResult, "editResult");
        android.os.Bundle bundleExtra = editResult.getBundleExtra("key_extra_data");
        if (bundleExtra == null) {
            return;
        }
        java.lang.String string = bundleExtra.getString("kThirdPartyVideoExtData");
        if (string == null || string.length() == 0) {
            return;
        }
        try {
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("miaojianExtInfo", string);
            wXMediaMessage.messageExt = jSONObject.toString();
            req.message = wXMediaMessage;
            android.os.Bundle bundle = new android.os.Bundle();
            req.toBundle(bundle);
            intent.putExtra("KSnsUploadFromSkipCompress", true);
            intent.putExtra("Ksnsupload_appid", "wxa5e0de08d96cc09d");
            intent.putExtra("Ksnsupload_timeline", bundle);
            intent.putExtra("KSnsAction", true);
            intent.putExtra("need_result", true);
            intent.putExtra("KSnsUploadShowAppName", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SecondCutUtil", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent c(java.lang.String r18, java.util.List r19, int r20, java.util.List r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw3.u0.c(java.lang.String, java.util.List, int, java.util.List, java.lang.String):android.content.Intent");
    }

    public final android.content.Intent d(java.lang.String scene, int i17, java.lang.String extInfo) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutUtil", "getSecondCutHomeIntent: scene=" + scene + ", duration=" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.setData(android.net.Uri.parse("miaojian://createvideo?scene=" + scene + "&maxDuration=" + i17 + "&from=1" + extInfo));
        intent.setPackage("com.tencent.phoenix");
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        return intent;
    }

    public final android.content.Intent e(java.lang.String scene, java.lang.String extInfo, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.setData(android.net.Uri.parse("miaojian://createvideo?scene=" + scene + "&miaojianExtInfo=" + extInfo + "&maxDuration=" + i17 + "&from=3"));
        intent.setPackage("com.tencent.phoenix");
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        return intent;
    }

    public final void f(android.content.Context context, yz5.l videoInfoSuspendFetcher, java.lang.String scene, int i17, dw3.l0 jumpSecondCutParams, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(videoInfoSuspendFetcher, "videoInfoSuspendFetcher");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(jumpSecondCutParams, "jumpSecondCutParams");
        android.app.Activity activity = (android.app.Activity) context;
        boolean b17 = dw3.c.f244181a.b(activity, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", kz5.c1.k(new jz5.l("view_id", "video_edit_miaojian_jump_tips"), new jz5.l("post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi())), 32337);
        db5.e1.j(activity, b17 ? com.tencent.mm.R.string.f490414ub : 0, b17 ? com.tencent.mm.R.string.f490573yv : com.tencent.mm.R.string.g1f, b17 ? com.tencent.mm.R.string.f490507x1 : com.tencent.mm.R.string.f492249fs4, com.tencent.mm.R.string.f490347sg, new dw3.s0(lVar, b17, activity, videoInfoSuspendFetcher, scene, i17, jumpSecondCutParams), new dw3.t0(lVar));
    }

    public final void h(android.content.Context activity, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(intent, "intent");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/util/SecondCutUtil", "takeSecondCutSigh", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/recordvideo/util/SecondCutUtil", "takeSecondCutSigh", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (activity instanceof android.app.Activity) {
                ((android.app.Activity) activity).overridePendingTransition(com.tencent.mm.R.anim.f477876e0, -1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecondCutUtil", "takeSecondCutSigh: error " + e17.getMessage());
        }
    }
}
