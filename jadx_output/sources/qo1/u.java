package qo1;

/* loaded from: classes5.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f365550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f365551e;

    public u(boolean z17, boolean z18) {
        this.f365550d = z17;
        this.f365551e = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f365550d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.J1);
            com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
            roamBackupRecoverReport28098Struct.f60066d = 23L;
            roamBackupRecoverReport28098Struct.f60067e = 10L;
            roamBackupRecoverReport28098Struct.k();
        }
        if (this.f365551e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.H1);
            com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct2 = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
            roamBackupRecoverReport28098Struct2.f60066d = 23L;
            roamBackupRecoverReport28098Struct2.f60067e = 8L;
            roamBackupRecoverReport28098Struct2.k();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.I1);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct3 = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct3.f60066d = 23L;
        roamBackupRecoverReport28098Struct3.f60067e = 9L;
        roamBackupRecoverReport28098Struct3.k();
    }
}
