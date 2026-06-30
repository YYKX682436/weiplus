package jo1;

/* loaded from: classes.dex */
public final class a implements q80.f0 {
    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupLiteAppManager", "start LiteApp failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("BACKUP_CONFIG", 4).edit().putString("last_backup_query", jo1.b.f300877a).apply();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLiteAppManager", ya.b.SUCCESS);
    }
}
