package cs;

/* loaded from: classes4.dex */
public final class c extends bs.b {
    @Override // bs.b
    public java.lang.Object a(aq.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoExportPermissionChain", "detectImpl >> start " + java.lang.System.currentTimeMillis() + ' ' + java.lang.Thread.currentThread().getName());
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        cs.b bVar = new cs.b(nVar);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.l(context, bVar);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
