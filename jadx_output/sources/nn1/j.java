package nn1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn1.k f338666d;

    public j(nn1.k kVar) {
        this.f338666d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = this.f338666d.f338667a;
        nn1.a aVar = backupMoveChooseUI.f92508e;
        java.util.HashSet hashSet = aVar.f338637e;
        hashSet.clear();
        aVar.f338636d.d7(hashSet);
        backupMoveChooseUI.b7().b();
        if (backupMoveChooseUI.b7().b().size() == 0) {
            int i17 = backupMoveChooseUI.f92521u;
            if (i17 == 0) {
                backupMoveChooseUI.f92511h.setText(com.tencent.mm.R.string.a7s);
            } else if (i17 == 1) {
                backupMoveChooseUI.f92511h.setText(com.tencent.mm.R.string.abz);
            }
            backupMoveChooseUI.f92511h.setVisibility(0);
        } else {
            backupMoveChooseUI.f92511h.setVisibility(4);
        }
        backupMoveChooseUI.f92512i.setVisibility(4);
        backupMoveChooseUI.f92509f.setVisibility(0);
        aVar.notifyDataSetChanged();
    }
}
