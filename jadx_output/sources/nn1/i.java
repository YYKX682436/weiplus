package nn1;

/* loaded from: classes12.dex */
public class i implements ln1.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI f338665d;

    public i(com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI) {
        this.f338665d = backupMoveChooseUI;
    }

    @Override // ln1.m
    public void X0(java.util.LinkedList linkedList, kn1.i iVar, int i17) {
        this.f338665d.f92508e.notifyDataSetChanged();
    }

    @Override // ln1.m
    public void e1(java.util.LinkedList linkedList) {
    }

    @Override // ln1.l
    public void s2(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        this.f338665d.runOnUiThread(new nn1.h(this, linkedList));
    }
}
