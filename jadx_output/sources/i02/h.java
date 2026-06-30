package i02;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.plugin.downloader.model.z0 {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient f286516c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f286517d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f286518e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f286519f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f286520g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f286521h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f286522i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f286523j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f286524k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f286525l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f286526m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener f286527n;

    public h(com.tencent.mm.plugin.downloader.model.l0 l0Var) {
        super(l0Var);
        android.content.pm.PackageInfo packageInfo = null;
        this.f286516c = null;
        this.f286522i = null;
        this.f286523j = new java.util.HashMap();
        this.f286524k = new java.util.HashMap();
        this.f286525l = new byte[0];
        this.f286526m = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new i02.d(this), false);
        this.f286527n = new i02.e(this);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f286517d = context;
        this.f286518e = new java.util.HashMap();
        this.f286519f = new java.util.HashMap();
        this.f286520g = new java.util.concurrent.ConcurrentHashMap();
        this.f286521h = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String property = java.lang.System.getProperty("http.agent");
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", property);
        java.lang.String str = (com.tencent.mm.sdk.platformtools.t8.K0(property) ? "Mozilla/5.0 (Linux; Android) AppleWebkit (KHTML, like Gecko)" : property) + " MicroMessenger";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193072b;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getPackageInfo fail, packageName is null");
        } else {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", e17, "", new java.lang.Object[0]);
            }
        }
        if (packageInfo != null) {
            str = ((str + "/") + packageInfo.versionName) + "" + packageInfo.versionCode;
        }
        java.lang.String str3 = str + " NetType/" + com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "User-Agent: %s", str3);
        hashMap.put("User-Agent", str3);
        this.f286522i = hashMap;
    }

    public static void g(i02.h hVar, java.lang.String str, int i17, int i18, boolean z17) {
        hVar.getClass();
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification failed: null task info");
            return;
        }
        if (f17.field_showNotification) {
            z2.k0 k0Var = new z2.k0(hVar.f286517d, "reminder_channel_id");
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                hVar.f286518e.put(str, java.lang.Long.valueOf(currentTimeMillis));
                k0Var.D.when = currentTimeMillis;
            } else {
                java.lang.Long l17 = (java.lang.Long) hVar.f286518e.get(str);
                if (l17 != null) {
                    k0Var.D.when = l17.longValue();
                } else {
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    hVar.f286518e.put(str, valueOf);
                    k0Var.D.when = valueOf.longValue();
                }
            }
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(f17.field_appId, false, false);
            if (!android.text.TextUtils.isEmpty(f17.field_fileName)) {
                if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, FileDownloadInfo.appName=" + f17.field_fileName + ", appId=" + f17.field_appId);
                }
                k0Var.f(f17.field_fileName);
            } else if (j17 == null || com.tencent.mm.sdk.platformtools.t8.K0(j17.field_appName)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, appName is empty");
            } else {
                if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, AppInfo.appName=" + j17.field_appName + ", appId=" + f17.field_appId);
                }
                k0Var.f(j17.field_appName);
            }
            switch (i17) {
                case 1:
                case 2:
                case 3:
                    k0Var.D.icon = android.R.drawable.stat_sys_download;
                    if (i18 == 0) {
                        i18 = 1;
                    }
                    boolean z18 = i18 == 0;
                    k0Var.f469470n = 100;
                    k0Var.f469471o = i18;
                    k0Var.f469472p = z18;
                    k0Var.e(hVar.f286517d.getString(com.tencent.mm.R.string.cek));
                    if (f17.field_reserveInWifi) {
                        k0Var.f469469m = z2.k0.c(hVar.f286517d.getString(com.tencent.mm.R.string.cem));
                    }
                    k0Var.h(2, true);
                    long j18 = f17.field_downloadId;
                    android.content.Context context = hVar.f286517d;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI.class);
                    intent.putExtra("extra_download_id", j18);
                    k0Var.f469463g = android.app.PendingIntent.getActivity(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(268435456));
                    break;
                case 4:
                case 6:
                    hVar.h(str);
                    return;
                case 5:
                    k0Var.D.icon = android.R.drawable.stat_sys_download_done;
                    k0Var.d(true);
                    k0Var.f469463g = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, new android.content.Intent(), fp.g0.a(0));
                    k0Var.e(hVar.f286517d.getString(com.tencent.mm.R.string.ceh));
                    break;
            }
            synchronized (hVar.f286525l) {
                java.lang.Integer num = (java.lang.Integer) hVar.f286520g.get(str);
                if (num == null) {
                    hVar.f286520g.put(str, java.lang.Integer.valueOf(((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).m(k0Var.b(), true)));
                } else {
                    ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(num.intValue(), k0Var.b(), true);
                }
                if (i17 == 4) {
                    hVar.f286520g.remove(str);
                }
            }
        }
    }

    public static void i() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.tmassistantsdk.storage.TMAssistantFile.getSavePathRootDir() + "/.tmp/");
        if (r6Var.m()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "Make download dir result: %b, path:%s", java.lang.Boolean.valueOf(r6Var.J()), r6Var.u());
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean a(long j17) {
        return k(j17, true);
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        if (t0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(t0Var.f97150a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Invalid Request");
            return -1L;
        }
        java.lang.String str = t0Var.f97150a;
        java.lang.String str2 = t0Var.f97156g;
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 != null) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = d(f17.field_downloadId);
            int i17 = d17.f96963f;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, running, return");
                return d17.f96961d;
            }
            if (i17 == 6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, md5 checking, return");
                return d17.f96961d;
            }
            if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, has download finished, install");
                if (t0Var.f97158i) {
                    k02.l.a(d17.f96961d, false, null);
                }
                return d17.f96961d;
            }
        }
        if (f17 == null) {
            f17 = com.tencent.mm.plugin.downloader.model.m0.d(str2);
        }
        i();
        com.tencent.mm.plugin.downloader.model.m0.k(str);
        com.tencent.mm.plugin.downloader.model.m0.j(str2);
        com.tencent.mm.plugin.downloader.model.m0.j(t0Var.f97173x);
        h02.a b17 = com.tencent.mm.plugin.downloader.model.u0.b(t0Var);
        if (!t0Var.f97162m || f17 == null) {
            b17.field_downloadId = java.lang.System.currentTimeMillis();
        } else {
            b17.field_downloadId = f17.field_downloadId;
        }
        b17.field_status = 0;
        b17.field_downloaderType = 2;
        if (f17 != null) {
            int i18 = f17.field_status;
            if (i18 == 2) {
                b17.field_startState = 1;
            } else if (i18 == 4) {
                b17.field_startState = 1;
            } else {
                b17.field_startState = 0;
            }
        } else {
            b17.field_startState = 0;
        }
        if (!t0Var.f97163n || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                b17.field_downloadInWifi = true;
            }
            com.tencent.mm.plugin.downloader.model.m0.a(b17);
            return e(b17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "downloadInWifi, not wifi");
        b17.field_status = 0;
        b17.field_downloadInWifi = true;
        com.tencent.mm.plugin.downloader.model.m0.a(b17);
        return b17.field_downloadId;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean c(long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || com.tencent.mm.sdk.platformtools.t8.K0(c17.field_downloadUrl)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, record not found", java.lang.Long.valueOf(j17));
            return false;
        }
        if (c17.field_downloaderType == 2) {
            ((ku5.t0) ku5.t0.f312615d).h(new i02.f(this, c17, j17), "MicroMsg.FileDownloaderImplTMAssistant");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, downloader type not matched", java.lang.Long.valueOf(j17));
        com.tencent.mm.vfs.w6.h(c17.field_filePath);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask, delete file: %s", c17.field_filePath);
        com.tencent.mm.plugin.downloader.model.m0.i(j17);
        return false;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d(long j17) {
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo;
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        fileDownloadTaskInfo.f96961d = j17;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(c17.field_downloadUrl)) {
            fileDownloadTaskInfo.f96962e = c17.field_downloadUrl;
            fileDownloadTaskInfo.f96963f = c17.field_status;
            java.lang.String str = c17.field_filePath;
            fileDownloadTaskInfo.f96964g = str;
            if (com.tencent.mm.vfs.w6.j(str)) {
                fileDownloadTaskInfo.f96967m = c17.field_downloadedSize;
                fileDownloadTaskInfo.f96968n = c17.field_totalSize;
            } else {
                fileDownloadTaskInfo.f96967m = 0L;
                fileDownloadTaskInfo.f96968n = 0L;
            }
            fileDownloadTaskInfo.f96965h = c17.field_md5;
            fileDownloadTaskInfo.f96973s = c17.field_userSessionId;
            if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
                tMAssistantDownloadTaskInfo = (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo) new i02.c(this, 500L, null, fileDownloadTaskInfo.f96962e).a(gm0.j1.e().d());
            } else {
                try {
                    tMAssistantDownloadTaskInfo = j().getDownloadTaskState(fileDownloadTaskInfo.f96962e);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadTaskState faile: " + e17.toString());
                    tMAssistantDownloadTaskInfo = null;
                }
            }
            if (tMAssistantDownloadTaskInfo != null) {
                int i17 = tMAssistantDownloadTaskInfo.mState;
                if (i17 == 1 || i17 == 2) {
                    fileDownloadTaskInfo.f96963f = 1;
                } else if (i17 == 3) {
                    fileDownloadTaskInfo.f96963f = 2;
                } else if (i17 != 4) {
                    if (fileDownloadTaskInfo.f96963f == 1) {
                        fileDownloadTaskInfo.f96963f = 0;
                    }
                } else if (fileDownloadTaskInfo.f96963f == 6) {
                    fileDownloadTaskInfo.f96963f = 6;
                } else {
                    fileDownloadTaskInfo.f96963f = 3;
                }
                fileDownloadTaskInfo.f96964g = tMAssistantDownloadTaskInfo.mSavePath;
                fileDownloadTaskInfo.f96967m = tMAssistantDownloadTaskInfo.mReceiveDataLen;
                fileDownloadTaskInfo.f96968n = tMAssistantDownloadTaskInfo.mTotalDataLen;
            } else if (fileDownloadTaskInfo.f96963f == 1) {
                fileDownloadTaskInfo.f96963f = 0;
            }
            int i18 = fileDownloadTaskInfo.f96963f;
            if ((i18 == 6 || i18 == 3) && !com.tencent.mm.vfs.w6.j(fileDownloadTaskInfo.f96964g)) {
                fileDownloadTaskInfo.f96963f = 0;
            }
            if (fileDownloadTaskInfo.f96963f == 6) {
                if (!((java.util.HashSet) com.tencent.mm.plugin.downloader.model.n0.f97088a).contains(java.lang.Long.valueOf(fileDownloadTaskInfo.f96961d))) {
                    fileDownloadTaskInfo.f96963f = 3;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_filePath)) {
                c17.field_filePath = fileDownloadTaskInfo.f96964g;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadTask: appId: %s, status: %d, url: %s, path: %s", c17.field_appId, java.lang.Integer.valueOf(fileDownloadTaskInfo.f96963f), fileDownloadTaskInfo.f96962e, fileDownloadTaskInfo.f96964g);
        }
        return fileDownloadTaskInfo;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long e(h02.a aVar) {
        ((ku5.t0) ku5.t0.f312615d).h(new i02.a(this, aVar), "MicroMsg.FileDownloaderImplTMAssistant");
        return aVar.field_downloadId;
    }

    public final void h(java.lang.String str) {
        synchronized (this.f286525l) {
            java.lang.Integer num = (java.lang.Integer) this.f286520g.get(str);
            if (num == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "No notification id found");
                return;
            }
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(num.intValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "cancelNotification, id = " + num);
            this.f286520g.remove(str);
        }
    }

    public final com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient j() {
        if (this.f286516c == null) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient downloadSDKClient = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(this.f286517d).getDownloadSDKClient("WechatDownloadClient");
            this.f286516c = downloadSDKClient;
            downloadSDKClient.registerDownloadTaskListener(this.f286527n);
        }
        this.f286526m.c(240000L, 240000L);
        return this.f286516c;
    }

    public boolean k(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: id = " + j17);
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || com.tencent.mm.sdk.platformtools.t8.K0(c17.field_downloadUrl)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, record not found", java.lang.Long.valueOf(j17));
            return false;
        }
        if (c17.field_downloaderType != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, downloader type not matched", java.lang.Long.valueOf(j17));
            if (c17.field_downloaderType != 4) {
                com.tencent.mm.vfs.w6.h(c17.field_filePath);
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, delete file: " + c17.field_filePath);
                com.tencent.mm.plugin.downloader.model.m0.i(j17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, DOWNLOADER_TYPE_WEBNET.");
            }
            return false;
        }
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = d(c17.field_downloadId);
        int i17 = d17.f96963f;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "download runing, return");
            return true;
        }
        if (i17 == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "md5 checking ,return");
            return true;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "has download finished, install");
            if (c17.field_autoInstall) {
                k02.l.a(d17.f96961d, false, null);
            }
            return true;
        }
        int i18 = c17.field_status;
        if (i18 == 2) {
            c17.field_startState = 1;
        } else if (i18 == 4) {
            c17.field_startState = 2;
        } else {
            c17.field_startState = 0;
        }
        c17.field_startSize = c17.field_downloadedSize;
        c17.field_errCode = 0;
        i();
        if ((c17.field_reserveInWifi || c17.field_downloadInWifi) && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask downloadInWifi, not wifi");
            return true;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            c17.field_downloadInWifi = true;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new i02.g(this, c17, z17, j17), "MicroMsg.FileDownloaderImplTMAssistant");
        return true;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public int removeDownloadTask(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new i02.b(this, j17), "MicroMsg.FileDownloaderImplTMAssistant");
        return 1;
    }
}
