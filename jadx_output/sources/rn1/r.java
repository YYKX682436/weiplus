package rn1;

/* loaded from: classes12.dex */
public class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.s f397626d;

    public r(rn1.s sVar) {
        this.f397626d = sVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI = this.f397626d.f397627d.f397612a;
        boolean z17 = com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.f92529o;
        backupPcUI.b7();
    }
}
