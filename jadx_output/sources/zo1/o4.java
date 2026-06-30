package zo1;

/* loaded from: classes5.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f474720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f474722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(long j17, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, boolean z17, yz5.l lVar) {
        super(2);
        this.f474720d = j17;
        this.f474721e = selectPackageUI;
        this.f474722f = z17;
        this.f474723g = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList<com.tencent.wechat.aff.affroam.g> packages = (java.util.ArrayList) obj2;
        kotlin.jvm.internal.o.g(packages, "packages");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f474720d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "getAllBackupPackage complete, error=" + intValue + ", packages.size=" + packages.size() + ", duration=" + currentTimeMillis);
        for (com.tencent.wechat.aff.affroam.g gVar : packages) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Package(" + gVar.f215829d + "): displayName=" + go1.d.f273944a.a(gVar) + ", option=" + gVar.f215835m);
        }
        int size = packages.size();
        zo1.x3 x3Var = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.f92864q;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474721e;
        selectPackageUI.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("fromServer", java.lang.Long.valueOf(this.f474722f ? 1L : 0L));
        linkedHashMap.put("pkgListSize", java.lang.Long.valueOf(size));
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "reportLoadData, extraInfoMap = " + linkedHashMap);
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92937J;
        zo1.b5 b5Var = new zo1.b5(currentTimeMillis, linkedHashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 7L;
        roamBackupRecoverReport28098Struct.f60067e = 7L;
        b5Var.invoke(roamBackupRecoverReport28098Struct);
        roamBackupRecoverReport28098Struct.k();
        pm0.v.X(new zo1.n4(selectPackageUI, packages, this.f474723g));
        return jz5.f0.f302826a;
    }
}
