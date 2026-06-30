package d95;

/* loaded from: classes12.dex */
public final /* synthetic */ class q$$a implements com.tencent.wcdb.core.Database.Config {
    @Override // com.tencent.wcdb.core.Database.Config
    public final void onInvocation(com.tencent.wcdb.core.Handle handle) {
        handle.execute("PRAGMA wal_autocheckpoint = 100");
    }
}
