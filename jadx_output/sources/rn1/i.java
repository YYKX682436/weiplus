package rn1;

/* loaded from: classes12.dex */
public class i implements android.content.DialogInterface.OnClickListener {
    public i(rn1.j jVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "user click close. stop recover.");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 18L, 1L, false);
        qn1.c.i().k().b(13737, 4);
        qn1.c.i().h().e();
        qn1.c.i().k().d(true, true, -100);
    }
}
