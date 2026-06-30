package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public abstract class o0 {
    public static void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, int i18, com.tencent.mm.plugin.wepkg.model.a aVar) {
        com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask();
        wepkgDownloadProcessTask.f188351h = i17;
        wepkgDownloadProcessTask.f188352i = str;
        wepkgDownloadProcessTask.f188354n = str3;
        wepkgDownloadProcessTask.f188355o = j17;
        wepkgDownloadProcessTask.f188356p = str4;
        wepkgDownloadProcessTask.f188357q = str5;
        wepkgDownloadProcessTask.f188358r = i18;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.c0(wepkgDownloadProcessTask, aVar, i17, str, str2, str3, j17, str4, str5, i18));
        } else {
            wepkgDownloadProcessTask.f188361u = new com.tencent.mm.plugin.wepkg.model.d0(aVar, wepkgDownloadProcessTask);
            wepkgDownloadProcessTask.d();
        }
    }

    public static java.util.List b(java.lang.String str) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 4001;
        wepkgCrossProcessTask.f188344i.f188374d = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        return wepkgCrossProcessTask.f188348p;
    }

    public static java.util.List c(java.lang.String str) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE;
        wepkgCrossProcessTask.f188344i.f188374d = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        return wepkgCrossProcessTask.f188348p;
    }

    public static com.tencent.mm.plugin.wepkg.model.WepkgVersion d(java.lang.String str) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3001;
        wepkgCrossProcessTask.f188344i.f188374d = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        if (wepkgVersion == null) {
            return null;
        }
        return wepkgVersion;
    }

    public static com.tencent.mm.plugin.wepkg.model.WepkgVersion e(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "getWepkgVersionRecordWithAble", new java.lang.Object[0]);
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3002;
        wepkgCrossProcessTask.f188344i.f188374d = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        if (wepkgVersion == null) {
            return null;
        }
        return wepkgVersion;
    }

    public static void f(java.lang.String str, com.tencent.mm.plugin.wepkg.model.a aVar) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 2004;
        wepkgCrossProcessTask.f188344i.f188374d = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.h0(wepkgCrossProcessTask, aVar));
        } else {
            wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.model.i0(aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.d();
        }
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.plugin.wepkg.model.a aVar) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 4002;
        com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile = wepkgCrossProcessTask.f188347o;
        wepkgPreloadFile.f188363e = str;
        wepkgPreloadFile.f188366h = str2;
        wepkgPreloadFile.f188365g = str3;
        wepkgPreloadFile.f188372q = z17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.e0(wepkgCrossProcessTask, aVar));
        } else {
            wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.model.f0(aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.d();
        }
    }

    public static void h(java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.plugin.wepkg.model.a aVar) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3005;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        wepkgVersion.f188374d = str;
        wepkgVersion.f188377g = str2;
        wepkgVersion.f188390w = z17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.k0(wepkgCrossProcessTask, aVar));
        } else {
            wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.model.l0(aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.d();
        }
    }

    public static void i(java.lang.String str, boolean z17, long j17, long j18) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3004;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        wepkgVersion.f188374d = str;
        wepkgVersion.f188378h = z17;
        wepkgVersion.f188379i = j17;
        wepkgVersion.f188380m = j18;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
    }
}
