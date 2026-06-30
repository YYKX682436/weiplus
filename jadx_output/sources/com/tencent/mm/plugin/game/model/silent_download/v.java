package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class v extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f140466d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.game.model.silent_download.n.f140456p0, "GameSilentDownload")};

    public v(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.game.model.silent_download.n.f140456p0, "GameSilentDownload", null);
    }

    public boolean D0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_continueDelay = false;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean J0(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateForceUpdateFlag: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_forceUpdateFlag = i17;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateForceUpdateFlag, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean L0(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_isRunning = z17;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean P0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_noSdcard = false;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean W0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_noEnoughSpace = false;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }

    public boolean b1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_noWifi = false;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }

    public com.tencent.mm.plugin.game.model.silent_download.n y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo: appid is null");
            return null;
        }
        android.database.Cursor rawQuery = rawQuery(java.lang.String.format("select * from %s where %s=?", "GameSilentDownload", "appId"), str);
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
            return null;
        }
        if (!rawQuery.moveToFirst()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo appid:%s, no record in DB", str);
            rawQuery.close();
            return null;
        }
        com.tencent.mm.plugin.game.model.silent_download.n nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
        nVar.convertFrom(rawQuery);
        rawQuery.close();
        return nVar;
    }

    public boolean z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState: appid is null");
            return false;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = y0(str);
        if (y07 == null) {
            return false;
        }
        y07.field_lowBattery = false;
        boolean update = super.update(y07, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState, ret:%b", java.lang.Boolean.valueOf(update));
        return update;
    }
}
