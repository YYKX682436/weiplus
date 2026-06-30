package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f206224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f206225e;

    public x(com.tencent.mm.pluginsdk.model.app.d dVar, com.tencent.mm.pluginsdk.model.app.d dVar2) {
        this.f206224d = dVar;
        this.f206225e = dVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f206224d;
        java.lang.String str = dVar.field_fileFullPath;
        com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f206225e;
        boolean z17 = false;
        long d17 = com.tencent.mm.vfs.w6.d(str, dVar2.field_fileFullPath, false);
        if (d17 > 0) {
            dVar2.field_offset = d17;
            if (com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.n7(dVar2)) {
                dVar2.field_status = 199L;
            }
            z17 = com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar2, new java.lang.String[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", java.lang.Long.valueOf(d17), java.lang.Long.valueOf(dVar.field_msgInfoId), java.lang.Long.valueOf(dVar2.field_msgInfoId), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(dVar2.field_status), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
