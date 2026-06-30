package rn1;

/* loaded from: classes12.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.h f397616d;

    public g(rn1.h hVar) {
        this.f397616d = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "user click close. stop backup.");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 10L, 1L, false);
        qn1.c.i().l().c(13737, 4);
        qn1.c.i().h().e();
        qn1.c.i().l().d(true);
        qn1.c.i().e().f309609a = -100;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI = this.f397616d.f397617d.f397612a;
        boolean z18 = com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.f92529o;
        backupPcUI.W6(1);
    }
}
