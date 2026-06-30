package com.tencent.mm.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/tools/ShareToStatusUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ShareToStatusUI extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f210181d;

    /* renamed from: e, reason: collision with root package name */
    public int f210182e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.net.Uri f210183f;

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShareToStatusUI", "not login");
        if (!com.tencent.mm.sdk.platformtools.a0.f192447j || !getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) {
            a7(false);
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void X6(com.tencent.mm.pluginsdk.ui.p loginResult, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(loginResult, "loginResult");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (com.tencent.mm.ui.tools.ia.f210495a[loginResult.ordinal()] != 1) {
            finish();
            return;
        }
        setIntent(intent);
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "now permission = %d", java.lang.Integer.valueOf(P));
        if ((P & 2) <= 0) {
            a7(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "now allowed to share to friend");
            finish();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        return true;
    }

    public final void a7(boolean z17) {
        if (getIntent() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "deal fail, intent is null");
            b7(1);
            finish();
            return;
        }
        java.lang.String action = getIntent().getAction();
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "deal fail, action is null");
            b7(1);
            finish();
            return;
        }
        java.lang.String resolveType = getIntent().resolveType(this);
        int i17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(resolveType)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "getFileType, mimeType is NONE");
        } else {
            kotlin.jvm.internal.o.d(resolveType);
            if (r26.n0.B(resolveType, "image", true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "getFileType, mimeType is image");
                i17 = 1;
            } else if (r26.n0.B(resolveType, "video", true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "getFileType, mimeType is video");
                i17 = 2;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "getFileType, mimeType is NONE");
            }
        }
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "deal fail, mimeType is illegal：" + resolveType);
            b7(3);
            finish();
            return;
        }
        android.os.Bundle e17 = com.tencent.mm.sdk.platformtools.c2.e(getIntent());
        if (!kotlin.jvm.internal.o.b(action, "android.intent.action.SEND") || e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "deal fail, action or bundle is illegal, action: " + action + "  bundle:" + e17);
            b7(1);
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "send signal: " + action);
        android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
        if (parcelable == null || !(parcelable instanceof android.net.Uri)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "deal fail, uri is null or illegal：" + parcelable);
            b7(2);
            finish();
            return;
        }
        android.net.Uri uri = (android.net.Uri) parcelable;
        if (!com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToStatusUI", "deal fail, not accept, " + parcelable);
            b7(2);
            finish();
            return;
        }
        this.f210183f = uri;
        this.f210182e = i17;
        java.lang.String str = q35.e.f359976a;
        if (!com.tencent.mm.sdk.platformtools.t8.e1(this, uri)) {
            c7(uri, i17, z17);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.tencent.mm.R.string.hht), getString(android.os.Build.VERSION.SDK_INT < 33 ? com.tencent.mm.R.string.fip : com.tencent.mm.R.string.msk));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            c7(uri, i17, z17);
        }
    }

    public final void b7(int i17) {
        d7();
        dp.a.makeText(this, i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.mm.R.string.f493123j40 : com.tencent.mm.R.string.f493125j42 : com.tencent.mm.R.string.f493124j41 : com.tencent.mm.R.string.f493126j43, 1).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(android.net.Uri r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareToStatusUI.c7(android.net.Uri, int, boolean):void");
    }

    public final void d7() {
        try {
            android.app.ProgressDialog progressDialog = this.f210181d;
            if (progressDialog != null) {
                kotlin.jvm.internal.o.d(progressDialog);
                if (progressDialog.isShowing()) {
                    android.app.ProgressDialog progressDialog2 = this.f210181d;
                    kotlin.jvm.internal.o.d(progressDialog2);
                    progressDialog2.dismiss();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareToStatusUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(837, this);
        d7();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 145) {
            if (grantResults[0] != 0) {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhi), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new com.tencent.mm.ui.tools.ja(this), new com.tencent.mm.ui.tools.ka(this));
                return;
            }
            android.net.Uri uri = this.f210183f;
            if (uri == null) {
                finish();
            } else {
                kotlin.jvm.internal.o.d(uri);
                c7(uri, this.f210182e, false);
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToStatusUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i17 + ", errMsg = " + str);
        c01.d9.e().q(837, this);
        d7();
        if (scene instanceof com.tencent.mm.modelsimple.c0) {
            if (i17 == 0 && i18 == 0) {
                a7(false);
            } else if (scene.getReqResp() != null) {
                com.tencent.mm.network.v0 reqResp = scene.getReqResp();
                kotlin.jvm.internal.o.e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) reqResp).f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckShareExtensionResponse");
                r45.g20 g20Var = (r45.g20) fVar;
                if (com.tencent.mm.sdk.platformtools.t8.K0(g20Var.f374833d)) {
                    a7(false);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", g20Var.f374833d);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                }
            }
            finish();
        }
    }
}
