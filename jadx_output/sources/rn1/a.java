package rn1;

/* loaded from: classes12.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397611d;

    public a(com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI, int i17) {
        this.f397611d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "low battery, user click sure. battery:%d", java.lang.Integer.valueOf(this.f397611d));
    }
}
