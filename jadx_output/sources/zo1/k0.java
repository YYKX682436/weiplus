package zo1;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f474662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j17, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        super(1);
        this.f474662d = j17;
        this.f474663e = checkPackageContentUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.tencent.wechat.aff.affroam.f fVar = (com.tencent.wechat.aff.affroam.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f474662d;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474663e;
        com.tencent.wechat.aff.affroam.g gVar = checkPackageContentUI.f92808q;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        int i17 = gVar.f215832g.f215988d;
        int size = (fVar == null || (linkedList = fVar.f215824d) == null) ? 0 : linkedList.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i17));
        linkedHashMap.put("conversationSize", java.lang.Long.valueOf(size));
        com.tencent.mars.xlog.Log.i(checkPackageContentUI.f92799e, "reportLoadData, extraInfoMap = " + linkedHashMap);
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.X;
        zo1.q0 q0Var = new zo1.q0(currentTimeMillis, linkedHashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 9L;
        roamBackupRecoverReport28098Struct.f60067e = 6L;
        q0Var.invoke(roamBackupRecoverReport28098Struct);
        roamBackupRecoverReport28098Struct.k();
        nf.e.f(new zo1.j0(checkPackageContentUI, fVar));
        return jz5.f0.f302826a;
    }
}
