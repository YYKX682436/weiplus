package nn1;

/* loaded from: classes12.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI f338662d;

    public g(com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI) {
        this.f338662d = backupMoveChooseUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = this.f338662d;
        if (backupMoveChooseUI.b7().f455457f) {
            nn1.a aVar = backupMoveChooseUI.f92508e;
            java.util.HashSet hashSet = aVar.f338637e;
            if (hashSet.size() == aVar.getCount()) {
                hashSet.clear();
            } else {
                for (int i17 = 0; i17 < aVar.getCount(); i17++) {
                    hashSet.add(java.lang.Integer.valueOf(i17));
                }
            }
            aVar.notifyDataSetChanged();
            aVar.f338636d.d7(hashSet);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
