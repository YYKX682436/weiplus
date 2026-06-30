package k72;

/* loaded from: classes.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17;
        android.content.Intent intent;
        com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent;
        com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent2 = (com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent) iEvent;
        am.jr jrVar = requestFaceVerifyForPayEvent2.f54694g;
        int i17 = jrVar.f7067a;
        java.lang.String str = jrVar.f7068b;
        java.lang.String str2 = jrVar.f7069c;
        java.lang.String str3 = jrVar.f7070d;
        java.lang.String str4 = jrVar.f7071e;
        java.lang.String str5 = jrVar.f7072f;
        java.lang.String str6 = jrVar.f7073g;
        boolean z18 = jrVar.f7075i;
        android.app.Activity activity = jrVar.f7076j;
        int i18 = jrVar.f7074h;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionEventListener", "receive face check action event, scene: %s, package: %s, sign: %s, title: %s, otherVerifyTitleFront：%s, faceVerifyTitle:%s, useHttp:%s", java.lang.Integer.valueOf(i17), str, str2, str3, str4, str6, java.lang.Boolean.valueOf(z18));
        k72.u uVar = k72.u.B;
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "startFaceCheckAction, scene: %s, packageName: %s, packageSign: %s, otherVerifyTitle: %s, otherVerifyTitleFront:%s, needFrontPage : %s, faceVerifyTitle：%s, requestCode: %s, useHttp: %s", java.lang.Integer.valueOf(i17), str, str2, str3, str4, str5, str6, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z18));
        if (activity == null) {
            requestFaceVerifyForPayEvent = requestFaceVerifyForPayEvent2;
            z17 = false;
        } else {
            uVar.f304749d = new k72.n();
            uVar.f304751f = i17;
            uVar.f304752g = str;
            uVar.f304753h = str2;
            uVar.f304754i = str3;
            uVar.f304755m = str5;
            uVar.f304768z = false;
            z17 = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                vz2.c.k("agreementUI", 0);
                intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI.class);
            } else if (uVar.f304755m.equals("true")) {
                vz2.c.k("agreementUI", 0);
                intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI.class);
            } else {
                vz2.c.k("agreementUI", 1);
                intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.class);
            }
            if (wz2.a.f()) {
                vz2.c.k("kindaCross", 1);
            } else {
                vz2.c.k("kindaCross", 0);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            bundle.putString("package", str);
            bundle.putString("packageSign", str2);
            bundle.putString("otherVerifyTitle", str3);
            bundle.putString("otherVerifyTitleFront", str4);
            bundle.putString("faceVerifyTitle", str6);
            bundle.putBoolean("useHttp", z18);
            intent.putExtras(bundle);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/facedetectaction/model/FaceCheckActionMgr", "startFaceCheckAction", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            uVar.f304762t = new com.tencent.mm.sdk.platformtools.n3("FaceCheckActionMgr_worker");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
                k72.v vVar = new k72.v();
                uVar.A = vVar;
                vVar.a();
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new k72.a(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_paysec_client_secscan, 0), null), 3, null);
            requestFaceVerifyForPayEvent = requestFaceVerifyForPayEvent2;
        }
        am.kr krVar = requestFaceVerifyForPayEvent.f54695h;
        krVar.f7177a = z17;
        if (!z17) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            krVar.f7178b = bundle2;
            bundle2.putInt("err_code", com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION);
            krVar.f7178b.putString("err_msg", "face detect not support");
        }
        return false;
    }
}
