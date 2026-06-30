package ef0;

/* loaded from: classes12.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.l80 f252359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(bw5.l80 l80Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252359d = l80Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ef0.y1(this.f252359d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ef0.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if0.a0 a0Var = if0.a0.f291012a;
        java.lang.String filePath = this.f252359d.getFilePath();
        kotlin.jvm.internal.o.f(filePath, "getFilePath(...)");
        int e17 = a0Var.e();
        com.tencent.mm.sdk.platformtools.o4 o4Var = if0.a0.f291013b;
        if (e17 != 2 && o4Var.f(a0Var.a(filePath))) {
            java.lang.String u17 = o4Var.u(a0Var.a(filePath), "");
            com.tencent.mars.xlog.Log.i("MicroMsg.TingLocalFileUtil", "getAuthor cacheResult " + u17);
            return u17;
        }
        gp.d dVar = new gp.d();
        try {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                dVar.setDataSource(filePath);
                java.lang.String extractMetadata = dVar.extractMetadata(2);
                com.tencent.mars.xlog.Log.i("MicroMsg.TingLocalFileUtil", "getAuthor artist " + extractMetadata + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                o4Var.D(a0Var.a(filePath), extractMetadata);
                return extractMetadata;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TingLocalFileUtil", "getAuthor ex " + e18.getMessage());
                dVar.release();
                return null;
            }
        } finally {
            dVar.release();
        }
    }
}
