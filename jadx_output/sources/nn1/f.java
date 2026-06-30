package nn1;

/* loaded from: classes12.dex */
public class f extends com.tencent.mm.ui.widget.dialog.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f338660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI f338661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI, java.lang.String[] strArr, int i17, java.lang.String[] strArr2) {
        super(strArr, i17);
        this.f338661f = backupMoveChooseUI;
        this.f338660e = strArr2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public java.lang.CharSequence b(int i17) {
        if (i17 == 1) {
            return this.f338660e[1];
        }
        return null;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public boolean d(int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = this.f338661f;
            backupMoveChooseUI.f7(backupMoveChooseUI.f92521u, backupMoveChooseUI.f92523w, backupMoveChooseUI.f92524x, 0);
        } else if (i17 == 1) {
            com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI2 = this.f338661f;
            backupMoveChooseUI2.f7(backupMoveChooseUI2.f92521u, backupMoveChooseUI2.f92523w, backupMoveChooseUI2.f92524x, 1);
        }
        com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI3 = this.f338661f;
        nn1.a aVar = backupMoveChooseUI3.f92508e;
        int i18 = backupMoveChooseUI3.f92522v;
        if (i18 != aVar.f338639g) {
            aVar.f338639g = i18;
            aVar.notifyDataSetChanged();
        }
        long a76 = backupMoveChooseUI3.a7(backupMoveChooseUI3.f92508e.f338637e);
        if (backupMoveChooseUI3.F && a76 > 0) {
            backupMoveChooseUI3.f92518r.setVisibility(0);
            backupMoveChooseUI3.g7(a76);
        } else if (a76 == 0) {
            backupMoveChooseUI3.f92518r.setVisibility(8);
        }
        super.d(i17);
        return true;
    }
}
