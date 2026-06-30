package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f141740a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.r0 f141741b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.n6 f141742c = null;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.n5 f141743d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.m6 f141744e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f141745f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f141746g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f141747h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f141748i = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.game.ui.r(this), false);

    public s(android.content.Context context) {
        this.f141740a = context;
    }

    public void a(com.tencent.mm.plugin.game.model.b bVar, com.tencent.mm.plugin.game.model.c0 c0Var) {
        int i17;
        if (bVar == null || c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
            return;
        }
        android.content.Context context = this.f141740a;
        android.view.View view = new android.view.View(context);
        view.setTag(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", java.lang.Integer.valueOf(bVar.f140204g2), java.lang.Integer.valueOf(c0Var.f140243c), java.lang.Integer.valueOf(c0Var.f140242b));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = bVar.field_appId;
        ((kt.c) i0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.app.w.r(context, str) || bVar.I0()) {
            c0Var.f140243c = 1;
        }
        if (c0Var.f140243c == 3) {
            com.tencent.mm.plugin.game.model.z3 a17 = com.tencent.mm.plugin.game.model.z3.a();
            int i18 = bVar.Z;
            a17.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0("com.tencent.android.qqdownloader")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, packageName is null");
            } else {
                try {
                    android.content.pm.PackageInfo a18 = ik1.b.a(context, "com.tencent.android.qqdownloader");
                    i17 = a18 == null ? 1 : a18.versionCode >= i18 ? 0 : 2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, ex = %s", e17.getMessage());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bVar.Z));
                if (i17 != -1 || i17 == 1 || i17 == 2) {
                    c0Var.f140243c = 1;
                }
            }
            i17 = -1;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bVar.Z));
            if (i17 != -1) {
            }
            c0Var.f140243c = 1;
        }
        int i19 = bVar.f140204g2;
        if (i19 != 0) {
            if (i19 == 1) {
                if (this.f141744e == null) {
                    com.tencent.mm.plugin.game.ui.m6 m6Var = new com.tencent.mm.plugin.game.ui.m6(context);
                    this.f141744e = m6Var;
                    m6Var.f141478f = this.f141745f;
                }
                com.tencent.mm.plugin.game.ui.m6 m6Var2 = this.f141744e;
                m6Var2.f141479g = this.f141746g;
                m6Var2.onClick(view);
                com.tencent.mm.game.report.l.g(this.f141740a, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, 9, bVar.field_appId, this.f141746g, bVar.f140210m2, this.f141747h);
                return;
            }
            if (i19 == 2) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(bVar.field_appId);
                if (q17 != null && q17.f96961d > 0) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.r0.i().t(q17.f96961d);
                }
                if (this.f141743d == null) {
                    this.f141743d = new com.tencent.mm.plugin.game.ui.n5(context, null);
                }
                com.tencent.mm.plugin.game.ui.n5 n5Var = this.f141743d;
                n5Var.f141679g = this.f141746g;
                n5Var.f141677e = bVar.U;
                n5Var.onClick(view);
                return;
            }
            if (i19 != 3 && i19 != 4) {
                return;
            }
        }
        int i27 = c0Var.f140243c;
        if (i27 != 3) {
            if (i27 == 4) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.Q)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
                ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(context, bVar.Q);
                com.tencent.mm.game.report.l.g(this.f141740a, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, 25, bVar.field_appId, this.f141746g, bVar.f140210m2, this.f141747h);
                return;
            }
            if (this.f141741b == null) {
                this.f141741b = new com.tencent.mm.plugin.game.ui.r0(context);
            }
            com.tencent.mm.plugin.game.ui.r0 r0Var = this.f141741b;
            r0Var.f141431m = this.f141746g;
            r0Var.f141432n = this.f141747h;
            r0Var.f141433o = "";
            r0Var.onClick(view);
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q18 = com.tencent.mm.plugin.downloader.model.r0.i().q(bVar.field_appId);
        if (q18 != null && q18.f96961d > 0) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().t(q18.f96961d);
        }
        if (this.f141742c == null) {
            this.f141742c = new com.tencent.mm.plugin.game.ui.n6(context);
        }
        com.tencent.mm.plugin.game.ui.n6 n6Var = this.f141742c;
        int i28 = this.f141746g;
        java.lang.String str2 = this.f141747h;
        n6Var.f141682f = i28;
        n6Var.f141683g = str2;
        n6Var.onClick(view);
    }

    public void b(android.widget.ProgressBar progressBar, android.widget.Button button, com.tencent.mm.plugin.game.model.b bVar, com.tencent.mm.plugin.game.model.c0 c0Var) {
        if (progressBar == null || button == null) {
            return;
        }
        button.setEnabled(true);
        button.setVisibility(0);
        if (bVar.f140204g2 == 1) {
            if (!bVar.f140211n2) {
                button.setText(com.tencent.mm.R.string.fk9);
                button.setVisibility(0);
                progressBar.setVisibility(8);
                return;
            } else {
                button.setEnabled(false);
                button.setText(com.tencent.mm.R.string.fk_);
                button.setVisibility(0);
                progressBar.setVisibility(8);
                return;
            }
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (com.tencent.mm.pluginsdk.model.app.w.q(this.f141740a, bVar)) {
            int j17 = r53.f.j(bVar.field_packageName);
            if (bVar.f140215r2 <= j17) {
                button.setVisibility(0);
                progressBar.setVisibility(8);
                if (bVar.f140212o2 == 12) {
                    button.setText(com.tencent.mm.R.string.flu);
                } else {
                    button.setText(com.tencent.mm.R.string.fnb);
                }
            } else if (c0Var.f140242b == 1) {
                progressBar.setVisibility(0);
                progressBar.setProgress(c0Var.f140244d);
                button.setVisibility(8);
            } else {
                if (bVar.f140212o2 == 12) {
                    button.setText(com.tencent.mm.R.string.flw);
                } else {
                    button.setText(com.tencent.mm.R.string.fkb);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", bVar.field_appId, java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(bVar.f140215r2));
            return;
        }
        if (bVar.I0()) {
            button.setVisibility(0);
            progressBar.setVisibility(8);
            if (bVar.f140212o2 == 12) {
                button.setText(com.tencent.mm.R.string.flu);
                return;
            } else {
                button.setText(com.tencent.mm.R.string.fnb);
                return;
            }
        }
        int i17 = bVar.f140204g2;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    button.setText(com.tencent.mm.R.string.fk8);
                    button.setVisibility(0);
                    progressBar.setVisibility(8);
                } else if (i17 != 3) {
                    if (i17 != 4) {
                        button.setVisibility(8);
                        progressBar.setVisibility(8);
                    } else {
                        button.setText(com.tencent.mm.R.string.fka);
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    }
                } else {
                    if (c0Var == null) {
                        button.setText(com.tencent.mm.R.string.fk7);
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                        return;
                    }
                    int i18 = c0Var.f140242b;
                    if (i18 == 0) {
                        button.setText(com.tencent.mm.R.string.fk7);
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    } else if (i18 == 1) {
                        int i19 = c0Var.f140243c;
                        if (i19 == 3) {
                            button.setText(com.tencent.mm.R.string.fn_);
                        } else if (i19 == 1) {
                            progressBar.setProgress(c0Var.f140244d);
                            button.setVisibility(8);
                            progressBar.setVisibility(0);
                        }
                    } else if (i18 == 2) {
                        if (bVar.f140212o2 == 12) {
                            button.setText(com.tencent.mm.R.string.f492207fm0);
                        } else {
                            button.setText(com.tencent.mm.R.string.fn9);
                        }
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    } else if (i18 == 3) {
                        if (bVar.f140212o2 == 12) {
                            button.setText(com.tencent.mm.R.string.fn6);
                        } else {
                            button.setText(com.tencent.mm.R.string.f492218fn5);
                        }
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    }
                }
            } else if (bVar.f140211n2) {
                button.setEnabled(false);
                button.setText(com.tencent.mm.R.string.fk_);
                button.setVisibility(0);
                progressBar.setVisibility(8);
            } else {
                button.setText(com.tencent.mm.R.string.fk9);
                button.setVisibility(0);
                progressBar.setVisibility(8);
            }
        } else {
            if (c0Var == null) {
                button.setVisibility(8);
                progressBar.setVisibility(8);
                return;
            }
            int i27 = c0Var.f140242b;
            if (i27 == 0) {
                if (bVar.f140212o2 == 12) {
                    button.setText(com.tencent.mm.R.string.fn8);
                } else {
                    button.setText(com.tencent.mm.R.string.fn7);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            } else if (i27 == 1) {
                int i28 = c0Var.f140243c;
                if (i28 == 3) {
                    button.setText(com.tencent.mm.R.string.fn_);
                    button.setVisibility(0);
                    progressBar.setVisibility(8);
                } else if (i28 == 1) {
                    progressBar.setProgress(c0Var.f140244d);
                    button.setVisibility(8);
                    progressBar.setVisibility(0);
                }
            } else if (i27 == 2) {
                if (bVar.f140212o2 == 12) {
                    button.setText(com.tencent.mm.R.string.f492207fm0);
                } else {
                    button.setText(com.tencent.mm.R.string.fn9);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            } else if (i27 == 3) {
                if (bVar.f140212o2 == 12) {
                    button.setText(com.tencent.mm.R.string.fn6);
                } else {
                    button.setText(com.tencent.mm.R.string.f492218fn5);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", bVar.field_appId, java.lang.Integer.valueOf(bVar.f140204g2), button.getText());
    }
}
