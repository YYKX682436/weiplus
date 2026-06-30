package qe5;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f362110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f362111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe5.h f362112f;

    public g(com.tencent.mm.pluginsdk.model.app.d dVar, com.tencent.mm.pluginsdk.model.app.d dVar2, qe5.h hVar) {
        this.f362110d = dVar;
        this.f362111e = dVar2;
        this.f362112f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f362110d;
        java.lang.String str = dVar.field_fileFullPath;
        com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f362111e;
        boolean z17 = false;
        long d17 = com.tencent.mm.vfs.w6.d(str, dVar2.field_fileFullPath, false);
        if (d17 > 0) {
            dVar2.field_offset = d17;
            if (this.f362112f.X6(dVar2)) {
                dVar2.field_status = 199L;
            }
            z17 = com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar2, new java.lang.String[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachLocalLogicUIC", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", java.lang.Long.valueOf(d17), java.lang.Long.valueOf(dVar.field_msgInfoId), java.lang.Long.valueOf(dVar2.field_msgInfoId), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(dVar2.field_status), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
