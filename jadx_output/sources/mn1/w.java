package mn1;

/* loaded from: classes12.dex */
public class w implements kn1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn1.y f329891a;

    public w(mn1.y yVar) {
        this.f329891a = yVar;
    }

    @Override // kn1.c
    public void a(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new mn1.v(this, new java.util.HashSet(this.f329891a.f329894b), i17));
    }

    @Override // kn1.c
    public void b(boolean z17) {
        this.f329891a.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveServer", "cancel BackupMoveServer CANCEL, Caller:%s", com.tencent.mm.sdk.platformtools.z3.a());
        if (!z17) {
            wn1.d dVar = new wn1.d();
            dVar.f447414d = mn1.d.i().f309604b;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveServer", "backupSendCancelRequest.");
                sn1.i.R(dVar.toByteArray(), 5);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupMoveServer", e17, "buf to BackupCancelRequest err.", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
        sn1.i.Z();
        sn1.i.a0();
        mn1.d.i().g();
    }

    @Override // kn1.c
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveServer", "onBackupFinish");
        on1.e.a();
        mn1.d.i();
        kn1.f.d().edit().putStringSet("BACKUP_SELECT_SESSION_LIST", null);
        sn1.i.X(21);
    }
}
