package cs;

/* loaded from: classes4.dex */
public final class a extends bs.b {
    @Override // bs.b
    public java.lang.Object a(aq.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "detectImpl >> start " + java.lang.System.currentTimeMillis() + ' ' + java.lang.Thread.currentThread().getName());
        if (!com.tencent.mm.vfs.w6.j(t0Var.f12965a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "video file is no exist");
            nVar.resumeWith(kotlin.Result.m521constructorimpl(new aq.s0(false, 102)));
        } else if (com.tencent.mm.vfs.w6.j(t0Var.f12966b)) {
            if (t0Var.f12967c.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "export path is null");
                nVar.resumeWith(kotlin.Result.m521constructorimpl(new aq.s0(false, 103)));
            } else {
                nVar.resumeWith(kotlin.Result.m521constructorimpl(new aq.s0(true, 0)));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "cover file is no exist");
            nVar.resumeWith(kotlin.Result.m521constructorimpl(new aq.s0(false, 101)));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
