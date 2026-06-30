package go1;

/* loaded from: classes5.dex */
public final class c implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f273942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f273943e;

    public c(long j17, long j18) {
        this.f273942d = j17;
        this.f273943e = j18;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        long j17 = this.f273942d;
        com.tencent.wechat.aff.affroam.g k17 = r0Var.k(j17);
        if (k17 == null) {
            throw new java.lang.InterruptedException("Fail to get package by id=" + j17);
        }
        xn1.k kVar = new xn1.k();
        po1.a aVar = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR;
        com.tencent.wechat.aff.affroam.i iVar = k17.f215834i;
        kotlin.jvm.internal.o.f(iVar, "getBackupRange(...)");
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo a17 = aVar.a(iVar);
        long c17 = c01.id.c();
        long j18 = a17.f92734h;
        long j19 = c17 - this.f273943e;
        if (j18 <= 0 || j19 <= j18) {
            j18 = j19;
        }
        java.util.HashMap hashMap = (java.util.HashMap) kotlinx.coroutines.l.f(null, new go1.b(a17, j18, kVar, this.f273942d, null), 1, null);
        com.tencent.mars.xlog.Log.i("BackupPackageHelper", "resultMap = " + hashMap.size() + ", timeInfo=" + kVar);
        return hashMap;
    }
}
