package v61;

/* loaded from: classes8.dex */
public class j extends android.content.AbstractThreadedSyncAdapter {
    public j(com.tencent.mm.plugin.account.model.ContactsSyncService contactsSyncService, android.content.Context context) {
        super(context, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl construction");
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public void onPerformSync(android.accounts.Account account, android.os.Bundle bundle, java.lang.String str, android.content.ContentProviderClient contentProviderClient, android.content.SyncResult syncResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl onPerformSync");
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactsSyncService", "Don't auto sync contacts again from now on!!!");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactsSyncService", "ContactsSyncService account not ready, ignore this sync");
        }
    }
}
