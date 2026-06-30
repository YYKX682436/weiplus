package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class ShareToTimeLineUI extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f210184g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Intent f210185d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f210186e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f210187f;

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShareToTimeLine", "not login");
        if (!com.tencent.mm.sdk.platformtools.a0.f192447j || !getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) {
            a7();
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void X6(com.tencent.mm.pluginsdk.ui.p pVar, android.content.Intent intent) {
        if (pVar.ordinal() != 0) {
            finish();
            return;
        }
        this.f210185d = intent;
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToTimeLine", "now permission = %d", java.lang.Integer.valueOf(P));
        if ((P & 2) > 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToTimeLine", "now allowed to share to friend");
            finish();
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "android.intent.extra.TEXT");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToTimeLine", "postLogin, text = %s", l17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            a7();
            return;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/business/systemshare/?txt=%s", java.net.URLEncoder.encode(l17));
        e7();
        c01.d9.e().a(1200, this);
        c01.d9.e().g(new com.tencent.mm.modelsimple.h1(format, 15, null));
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public void a7() {
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToTimeLine", "launch : fail, intent is null");
            b7();
            finish();
            return;
        }
        java.lang.String action = intent.getAction();
        android.os.Bundle e17 = com.tencent.mm.sdk.platformtools.c2.e(intent);
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToTimeLine", "launch : fail, action is null");
            b7();
            finish();
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "Kdescription");
        java.lang.String resolveType = getIntent().resolveType(this);
        if (com.tencent.mm.sdk.platformtools.t8.K0(resolveType)) {
            b7();
            finish();
            return;
        }
        if (!resolveType.contains("image")) {
            b7();
            finish();
            return;
        }
        android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
        if (parcelable instanceof android.net.Uri) {
            java.lang.String str = q35.e.f359976a;
            if (!com.tencent.mm.sdk.platformtools.t8.e1(this, (android.net.Uri) parcelable)) {
                c7(action, e17, l17);
                return;
            }
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.tencent.mm.R.string.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.tencent.mm.R.string.fip) : getString(com.tencent.mm.R.string.msk));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToTimeLine", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            c7(action, e17, l17);
        }
    }

    public final void b7() {
        dp.a.makeText(this, com.tencent.mm.R.string.j4d, 1).show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r3 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(java.lang.String r13, android.os.Bundle r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareToTimeLineUI.c7(java.lang.String, android.os.Bundle, java.lang.String):void");
    }

    public final void d7(java.lang.String str, java.lang.String str2, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra("sns_kemdia_path", str);
            intent.putExtra("KFilterId", -1);
            arrayList.add(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("Kdescription", str2);
        }
        if (i17 == 4 && com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            arrayList.add(str2);
        }
        if (!c01.d9.h() || gm0.m.r()) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                b7();
            } else {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShareToTimeLineUI.class);
                intent2.putExtra("android.intent.extra.STREAM", com.tencent.mm.sdk.platformtools.i1.b(getContext(), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str))));
                intent2.addFlags(32768).addFlags(268435456);
                intent2.setType("image/*");
                intent2.setAction("android.intent.action.SEND");
                com.tencent.mm.ui.MMWizardActivity.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class).addFlags(268435456).addFlags(32768), intent2);
            }
            finish();
            return;
        }
        intent.putExtra("K_go_to_SnsTimeLineUI", true);
        intent.putExtra("Ksnsupload_source", 12);
        if (i17 == 0) {
            intent.putExtra("KBlockAdd", true);
        }
        intent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f210187f = intent;
        com.tencent.mm.modelsimple.c0 c0Var = i17 != 0 ? i17 != 4 ? null : new com.tencent.mm.modelsimple.c0(5, arrayList, getCallerPackage()) : new com.tencent.mm.modelsimple.c0(1, arrayList, getCallerPackage());
        if (c0Var != null) {
            c01.d9.e().a(837, this);
            gm0.j1.d().g(c0Var);
            e7();
        }
    }

    public final void e7() {
        this.f210186e = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.tools.ma(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(837, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareToTimeLine", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToTimeLine", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhi), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareToTimeLineUI$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.tencent.mm.ui.tools.ShareToTimeLineUI.f210184g;
                    com.tencent.mm.ui.tools.ShareToTimeLineUI shareToTimeLineUI = com.tencent.mm.ui.tools.ShareToTimeLineUI.this;
                    shareToTimeLineUI.getClass();
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    androidx.appcompat.app.AppCompatActivity context = shareToTimeLineUI.getContext();
                    ((sb0.f) jVar).getClass();
                    j35.u.g(context);
                    shareToTimeLineUI.finish();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareToTimeLineUI$$b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.tencent.mm.ui.tools.ShareToTimeLineUI.f210184g;
                    com.tencent.mm.ui.tools.ShareToTimeLineUI.this.finish();
                }
            });
            return;
        }
        if (this.f210185d == null) {
            this.f210185d = getIntent();
        }
        android.content.Intent intent = this.f210185d;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(this.f210185d, "Kdescription");
        c7(this.f210185d.getAction(), com.tencent.mm.sdk.platformtools.c2.e(this.f210185d), l17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToTimeLine", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        c01.d9.e().q(1200, this);
        android.app.ProgressDialog progressDialog = this.f210186e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f210186e.dismiss();
        }
        if (m1Var instanceof com.tencent.mm.modelsimple.h1) {
            if (i17 == 0 && i18 == 0) {
                a7();
                return;
            } else {
                b7();
                finish();
                return;
            }
        }
        if (m1Var instanceof com.tencent.mm.modelsimple.c0) {
            if (i17 == 0 && i18 == 0) {
                android.content.Intent intent = this.f210187f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (m1Var.getReqResp() != null) {
                r45.g20 g20Var = (r45.g20) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                if (g20Var == null || com.tencent.mm.sdk.platformtools.t8.K0(g20Var.f374833d)) {
                    android.content.Intent intent2 = this.f210187f;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("rawUrl", g20Var.f374833d);
                    intent3.putExtra("showShare", false);
                    intent3.putExtra("show_bottom", false);
                    intent3.putExtra("needRedirect", false);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent3, null);
                }
            }
            finish();
        }
    }
}
