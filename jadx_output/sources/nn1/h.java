package nn1;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f338663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn1.i f338664e;

    public h(nn1.i iVar, java.util.LinkedList linkedList) {
        this.f338664e = iVar;
        this.f338663d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f338663d.size();
        nn1.i iVar = this.f338664e;
        if (size != 0) {
            iVar.f338665d.f92510g.setClickable(true);
            com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = iVar.f338665d;
            backupMoveChooseUI.f92510g.setTextColor(backupMoveChooseUI.getResources().getColor(com.tencent.mm.R.color.f479312vs));
            iVar.f338665d.f92512i.setVisibility(8);
            iVar.f338665d.f92508e.notifyDataSetChanged();
            return;
        }
        iVar.f338665d.f92512i.setVisibility(8);
        iVar.f338665d.f92511h.setVisibility(0);
        com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI2 = iVar.f338665d;
        int i17 = backupMoveChooseUI2.f92521u;
        if (i17 == 0) {
            backupMoveChooseUI2.f92511h.setText(com.tencent.mm.R.string.a7s);
        } else {
            if (i17 != 1) {
                return;
            }
            backupMoveChooseUI2.f92511h.setText(com.tencent.mm.R.string.abz);
        }
    }
}
