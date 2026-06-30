package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.storage.f9 f9Var) {
        super(3);
        this.f201089d = f9Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String filename = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(filename, "filename");
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2COriginVideoDownloaderCache", "downloader[" + longValue + "] download end, filename=" + filename + ",result=" + booleanValue);
        xf0.u uVar = (xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class));
        com.tencent.mm.storage.f9 f9Var = this.f201089d;
        if (!uVar.bj(f9Var)) {
            ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).getClass();
            if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoOriginalDownloadWithCompress()) == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2COriginVideoDownloaderCache", "try to download compressed video filename= {" + filename + '}');
                gm0.b bVar = gm0.j1.b().f273245h;
                if (bVar != null && (lifecycleScope = bVar.f273145e) != null) {
                    v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.gallery.h(f9Var, null), 1, null);
                }
            }
        }
        if (booleanValue && com.tencent.mm.ui.chatting.gallery.l.f201163a.b(longValue)) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.ui.chatting.gallery.i iVar = new com.tencent.mm.ui.chatting.gallery.i(filename, f9Var, longValue);
            com.tencent.mm.ui.chatting.gallery.j jVar = com.tencent.mm.ui.chatting.gallery.j.f201039a;
            ((yb0.g) b0Var).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.h(context, iVar, jVar);
        }
        com.tencent.mm.ui.chatting.gallery.l lVar = com.tencent.mm.ui.chatting.gallery.l.f201163a;
        com.tencent.mm.ui.chatting.gallery.l.f201165c.remove(java.lang.Long.valueOf(longValue));
        return jz5.f0.f302826a;
    }
}
