package iz0;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f296042d;

    public a(long j17) {
        this.f296042d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iz0.d dVar = iz0.d.f296044a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f296042d;
        l75.k0 a17 = dVar.a();
        p75.i0 i17 = dm.ib.f237670y.i();
        i17.f352656c = "MicroMsg.TemplateBackgroundVideoInfoStorageManager";
        i17.f352657d = dm.ib.A.i(0).c(dm.ib.B.x(java.lang.Long.valueOf(currentTimeMillis - j17)));
        java.util.List<dm.ib> k17 = i17.a().k(a17, dm.ib.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "getWorkSuccessFinish >> size: " + ((java.util.ArrayList) k17).size() + ", " + j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundStorageClearManager", "startClear >> " + java.lang.Thread.currentThread().getName() + ", size: " + ((java.util.ArrayList) k17).size() + ", " + j17);
        for (dm.ib ibVar : k17) {
            java.lang.String str = ibVar.field_clip_bundle_local_path;
            boolean g17 = com.tencent.mm.vfs.w6.g(str, true);
            if (g17) {
                java.lang.String field_work_id = ibVar.field_work_id;
                kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
                l75.k0 a18 = dVar.a();
                p75.m0 j18 = dm.ib.f237671z.j(field_work_id);
                p75.n0 n0Var = dm.ib.f237670y;
                n0Var.getClass();
                if (n0Var instanceof p75.z) {
                    throw new java.lang.IllegalArgumentException("Not support multi table delete");
                }
                java.lang.String table = n0Var.b();
                p75.h hVar = (p75.h) j18;
                java.lang.String b17 = hVar.b();
                java.lang.String[] e17 = hVar.e();
                kotlin.jvm.internal.o.g(table, "table");
                com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "deleteVideoInfoByWorkTagId >> workTagId: " + field_work_id + ", result: " + (a18.delete(table, b17, e17) != -1));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundStorageClearManager", "clipBundlePath: " + str + ", workId:" + ibVar.field_work_id + ", result: " + g17);
        }
    }
}
