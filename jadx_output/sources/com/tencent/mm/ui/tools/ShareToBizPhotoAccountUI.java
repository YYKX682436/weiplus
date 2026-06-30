package com.tencent.mm.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/tools/ShareToBizPhotoAccountUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ShareToBizPhotoAccountUI extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f210178d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f210179e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f210180f = "";

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShareToBizPhotoAccountUI", "not login");
        if (!com.tencent.mm.sdk.platformtools.a0.f192447j || !getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) {
            a7(false);
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void X6(com.tencent.mm.pluginsdk.ui.p loginResult, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(loginResult, "loginResult");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (com.tencent.mm.ui.tools.da.f210357a[loginResult.ordinal()] != 1) {
            finish();
            return;
        }
        setIntent(intent);
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "system share control bit = %d", java.lang.Integer.valueOf(P));
        if ((P & 2) <= 0) {
            a7(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "share blocked by MM_SYSTEM_SHARE_NOT_ALLOW_SHARE_TO_TIMELINE");
            finish();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a7(boolean z17) {
        java.util.ArrayList arrayList;
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, intent is null");
            c7(1);
            return;
        }
        java.lang.String action = intent.getAction();
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, action is null");
            c7(1);
            return;
        }
        java.lang.String resolveType = intent.resolveType(this);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(resolveType)) {
            kotlin.jvm.internal.o.d(resolveType);
            if (r26.n0.B(resolveType, "image", true)) {
                java.lang.String callerPackage = getCallerPackage();
                kotlin.jvm.internal.o.f(callerPackage, "getCallerPackage(...)");
                this.f210180f = callerPackage;
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "deal, currentCallerPackage: " + this.f210180f);
                android.os.Bundle e17 = com.tencent.mm.sdk.platformtools.c2.e(intent);
                if (kotlin.jvm.internal.o.b(action, "android.intent.action.SEND")) {
                    if (e17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, bundle is null for ACTION_SEND");
                        c7(1);
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "send signal: android.intent.action.SEND");
                    android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
                    if (parcelable == null || !(parcelable instanceof android.net.Uri)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, uri is null or illegal: " + parcelable);
                        c7(2);
                        return;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.W0((android.net.Uri) parcelable)) {
                        this.f210179e = kz5.c0.d(parcelable);
                        e7(kz5.b0.c(parcelable), z17);
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, not accept, " + parcelable);
                        c7(2);
                        return;
                    }
                }
                if (!kotlin.jvm.internal.o.b(action, "android.intent.action.SEND_MULTIPLE")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, unsupported action: " + action);
                    c7(1);
                    return;
                }
                if (e17 == null || !e17.containsKey("android.intent.extra.STREAM")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, action or bundle is illegal, action: " + action + " bundle:" + e17);
                    c7(1);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "send multiple signal: android.intent.action.SEND_MULTIPLE");
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    arrayList = e17.getParcelableArrayList("android.intent.extra.STREAM", android.net.Uri.class);
                } else {
                    java.util.ArrayList parcelableArrayList = e17.getParcelableArrayList("android.intent.extra.STREAM");
                    if (parcelableArrayList != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : parcelableArrayList) {
                            if (obj instanceof android.net.Uri) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                }
                java.util.ArrayList arrayList3 = arrayList == null || arrayList.isEmpty() ? null : new java.util.ArrayList(arrayList);
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, uri list is null or empty");
                    c7(2);
                    return;
                }
                if (arrayList3.size() > 20) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, too many images: " + arrayList3.size() + ", max=20");
                    d7();
                    dp.a.makeText(this, getString(com.tencent.mm.R.string.f493887pi2, 20), 1).show();
                    finish();
                    return;
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    android.net.Uri uri = (android.net.Uri) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, not accept uri: " + uri);
                        c7(2);
                        return;
                    }
                }
                this.f210179e = arrayList3;
                e7(arrayList3, z17);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, mimeType is not supported: " + resolveType);
        c7(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(java.util.List r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI.b7(java.util.List, boolean):void");
    }

    public final void c7(int i17) {
        d7();
        dp.a.makeText(this, i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.tencent.mm.R.string.phz : com.tencent.mm.R.string.f493888pi3 : com.tencent.mm.R.string.f493886pi1 : com.tencent.mm.R.string.f493885pi0 : com.tencent.mm.R.string.f493889pi4, 1).show();
        finish();
    }

    public final void d7() {
        try {
            android.app.ProgressDialog progressDialog = this.f210178d;
            if (progressDialog != null) {
                if (!progressDialog.isShowing()) {
                    progressDialog = null;
                }
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareToBizPhotoAccountUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void e7(java.util.List list, boolean z17) {
        boolean z18;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.net.Uri uri = (android.net.Uri) it.next();
                java.lang.String str = q35.e.f359976a;
                if (com.tencent.mm.sdk.platformtools.t8.e1(this, uri)) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!z18) {
            b7(list, z17);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.tencent.mm.R.string.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.tencent.mm.R.string.fip) : getString(com.tencent.mm.R.string.msk));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            b7(list, z17);
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
        boolean z17 = true;
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 145) {
            if (grantResults[0] != 0) {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhi), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new com.tencent.mm.ui.tools.fa(this), new com.tencent.mm.ui.tools.ga(this));
                return;
            }
            java.util.ArrayList arrayList = this.f210179e;
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = false;
            }
            if (z17) {
                finish();
            } else {
                b7(arrayList, false);
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        r45.g20 g20Var;
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        c01.d9.e().q(837, this);
        d7();
        if (scene instanceof com.tencent.mm.modelsimple.c0) {
            if (i17 == 0 && i18 == 0) {
                a7(false);
                return;
            }
            com.tencent.mm.network.v0 reqResp = ((com.tencent.mm.modelsimple.c0) scene).getReqResp();
            if (reqResp == null || (g20Var = (r45.g20) ((com.tencent.mm.modelbase.o) reqResp).f70711b.f70700a) == null || com.tencent.mm.sdk.platformtools.t8.K0(g20Var.f374833d)) {
                a7(false);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", g20Var.f374833d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
            finish();
        }
    }
}
