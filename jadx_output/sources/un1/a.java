package un1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f429422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f429423e;

    public a(un1.d dVar, com.tencent.mm.sdk.platformtools.o4 o4Var, int i17) {
        this.f429422d = o4Var;
        this.f429423e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f429422d;
        java.lang.String string = o4Var.getString("MMKV_BACKUP_ERROR_CACHE", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct backupReportErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct();
            backupReportErrorStruct.f55369f = this.f429423e;
            backupReportErrorStruct.k();
        } else {
            new com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct(string).k();
            o4Var.D("MMKV_BACKUP_ERROR_CACHE", "");
        }
        o4Var.G("MMKV_BACKUP_NEED_REPORT", false);
    }
}
