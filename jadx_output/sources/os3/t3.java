package os3;

/* loaded from: classes8.dex */
public class t3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348214d;

    public t3(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348214d = readMailUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348214d;
        if (readMailUI.isFinishing() || readMailUI.isDestroyed()) {
            return;
        }
        long j17 = iPCLong.f68405d;
        readMailUI.E = j17;
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", "doAddDownloadTask fail, downloadId = %d ", java.lang.Long.valueOf(j17));
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("QQMAIL", 4);
        readMailUI.f154924J = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("qqmail_downloadid", readMailUI.E).commit();
        }
        readMailUI.I = 1;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCLong(readMailUI.E), js3.d.class, new os3.e4(readMailUI));
    }
}
