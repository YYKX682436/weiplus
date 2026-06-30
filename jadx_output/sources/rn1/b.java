package rn1;

/* loaded from: classes12.dex */
public class b implements android.content.DialogInterface.OnClickListener {
    public b(com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "closeImpl merging user click close. stop recover merge.");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 26L, 1L, false);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
        qn1.c.i().h().e();
        qn1.c.i().k().d(true, true, -100);
    }
}
