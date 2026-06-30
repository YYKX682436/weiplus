package rn1;

/* loaded from: classes12.dex */
public class e implements android.content.DialogInterface.OnClickListener {
    public e(rn1.f fVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "user click close. stop recover.");
        qn1.c.i().h().e();
        qn1.c.i().k().d(true, true, -100);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 52L, 1L, false);
        qn1.c.i().k().b(13737, 4);
    }
}
