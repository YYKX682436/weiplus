package com.tencent.mm.recovery.ui;

/* loaded from: classes12.dex */
public class RecoveryUI extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: s, reason: collision with root package name */
    public static volatile java.lang.Thread f192192s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.Object f192193t = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f192194d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f192195e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f192196f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f192197g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f192198h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f192199i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f192200m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f192201n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f192202o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.recoveryv2.RecoveryCrash$Record f192203p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnClickListener f192204q = new android.view.View.OnClickListener() { // from class: c55.m$$a
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            final com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = com.tencent.mm.recovery.ui.RecoveryUI.this;
            java.lang.Thread thread = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
            recoveryUI.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", recoveryUI, array);
            if (android.os.Build.VERSION.SDK_INT >= 26 && !recoveryUI.getPackageManager().canRequestPackageInstalls()) {
                new android.app.AlertDialog.Builder(recoveryUI).setMessage(com.tencent.recovery.wx.R.string.recovery_tips_enable_install_from_unknown_source).setPositiveButton(com.tencent.recovery.wx.R.string.recovery_btn_to_settings, new android.content.DialogInterface.OnClickListener() { // from class: c55.m$$c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        java.lang.Thread thread2 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI2 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                        recoveryUI2.getClass();
                        android.content.Intent intent = new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + recoveryUI2.getPackageName()));
                        intent.addFlags(268435456);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(recoveryUI2, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$0", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        recoveryUI2.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(recoveryUI2, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$0", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }).setNegativeButton(android.R.string.cancel, new c55.m$$d()).create().show();
                yj0.a.h(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            recoveryUI.f192200m.setVisibility(8);
            android.view.View view2 = recoveryUI.f192201n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$8", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$8", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object obj = com.tencent.mm.recovery.ui.RecoveryUI.f192193t;
            synchronized (obj) {
                if (com.tencent.mm.recovery.ui.RecoveryUI.f192192s != null) {
                    com.tencent.mm.recovery.ui.RecoveryUI.f192192s.interrupt();
                }
            }
            java.lang.Thread thread2 = new java.lang.Thread(new java.lang.Runnable() { // from class: c55.m$$e
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z17;
                    final com.tencent.mm.recovery.ui.RecoveryUI recoveryUI2 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                    java.lang.Thread thread3 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                    recoveryUI2.getClass();
                    recoveryUI2.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$f
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.Thread thread4 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                            com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                            if (recoveryUI3.isFinishing()) {
                                return;
                            }
                            recoveryUI3.f192202o.setText(com.tencent.recovery.wx.R.string.recovery_tips_downloading);
                        }
                    });
                    try {
                        final java.io.File O6 = recoveryUI2.O6();
                        recoveryUI2.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$h
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Thread thread4 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                                com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                                if (recoveryUI3.isFinishing()) {
                                    return;
                                }
                                recoveryUI3.f192202o.setText(com.tencent.recovery.wx.R.string.recovery_tips_verifying);
                            }
                        });
                        try {
                            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(O6);
                            try {
                                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                                while (entries.hasMoreElements()) {
                                    if (com.tencent.tinker.loader.shareutil.ShareConstants.RES_MANIFEST.equals(entries.nextElement().getName())) {
                                        zipFile.close();
                                        z17 = true;
                                        break;
                                    }
                                }
                                zipFile.close();
                            } finally {
                            }
                        } catch (java.io.IOException unused) {
                        }
                        z17 = false;
                        if (z17) {
                            recoveryUI2.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    java.io.File file = O6;
                                    java.lang.Thread thread4 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                                    com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                                    if (recoveryUI3.isFinishing()) {
                                        return;
                                    }
                                    android.view.View view3 = recoveryUI3.f192201n;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList3.add(8);
                                    java.util.Collections.reverse(arrayList3);
                                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$6", "(Ljava/io/File;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$6", "(Ljava/io/File;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    try {
                                        recoveryUI3.P6(file);
                                    } catch (java.lang.Throwable unused2) {
                                        recoveryUI3.f192197g.setText(recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_tips_install_failed, recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_btn_official_website)));
                                        recoveryUI3.Q6();
                                    }
                                }
                            });
                            synchronized (com.tencent.mm.recovery.ui.RecoveryUI.f192193t) {
                                com.tencent.mm.recovery.ui.RecoveryUI.f192192s = null;
                            }
                            return;
                        }
                        recoveryUI2.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$i
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Thread thread4 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                                com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                                if (recoveryUI3.isFinishing()) {
                                    return;
                                }
                                recoveryUI3.f192197g.setText(recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_tips_verify_failed, recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_btn_official_website)));
                                recoveryUI3.Q6();
                            }
                        });
                        synchronized (com.tencent.mm.recovery.ui.RecoveryUI.f192193t) {
                            com.tencent.mm.recovery.ui.RecoveryUI.f192192s = null;
                        }
                    } finally {
                        recoveryUI2.runOnUiThread(new java.lang.Runnable() { // from class: c55.m$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.Thread thread4 = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
                                com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = com.tencent.mm.recovery.ui.RecoveryUI.this;
                                if (recoveryUI3.isFinishing()) {
                                    return;
                                }
                                recoveryUI3.f192197g.setText(recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_tips_download_failed, recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_btn_official_website)));
                                recoveryUI3.Q6();
                            }
                        });
                        java.lang.Object obj2 = com.tencent.mm.recovery.ui.RecoveryUI.f192193t;
                    }
                }
            });
            synchronized (obj) {
                com.tencent.mm.recovery.ui.RecoveryUI.f192192s = thread2;
            }
            thread2.start();
            yj0.a.h(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f192205r = new android.view.View.OnClickListener() { // from class: c55.m$$b
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Thread thread = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
            com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = com.tencent.mm.recovery.ui.RecoveryUI.this;
            recoveryUI.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", recoveryUI, array);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse("https://weixin.qq.com"));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recoveryUI, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$9", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            recoveryUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI", "lambda$new$9", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };

    public final java.io.File O6() {
        java.io.File file = new java.io.File(getCacheDir(), "recovery");
        if (!file.exists() && !file.mkdir()) {
            throw new java.lang.RuntimeException("Create recovery dir failed");
        }
        java.io.File file2 = new java.io.File(file, "latest.apk");
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) java.net.URI.create("https://weixin.qq.com/d").toURL().openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(300000);
                try {
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[8192];
                            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                            inputStream.close();
                            return file2;
                        } finally {
                        }
                    } catch (java.lang.Throwable th6) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (java.io.IOException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    public final void P6(java.io.File file) {
        android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(this, getPackageName() + ".external.recovery.provider", file);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "installApk", "(Ljava/io/File;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/recovery/ui/RecoveryUI", "installApk", "(Ljava/io/File;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Q6() {
        android.view.View view = this.f192201n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "switchUpdateToOfficialWebsiteEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/recovery/ui/RecoveryUI", "switchUpdateToOfficialWebsiteEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f192200m.setVisibility(0);
        this.f192200m.setText(com.tencent.recovery.wx.R.string.recovery_btn_official_website);
        this.f192200m.setOnClickListener(this.f192205r);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e == null ? super.getResources() : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.recovery.ui.RecoveryUI.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d55.u.b("MicroMsg.recovery.ui", "activity onDestroy, id = " + this, new java.lang.Object[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        d55.u.b("MicroMsg.recovery.ui", "activity onNewIntent, id = " + this, new java.lang.Object[0]);
    }
}
