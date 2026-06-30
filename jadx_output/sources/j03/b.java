package j03;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j03.d f297023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f297024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f297025c;

    public b(j03.d dVar, com.tencent.mm.vfs.r6 r6Var, yz5.l lVar) {
        this.f297023a = dVar;
        this.f297024b = r6Var;
        this.f297025c = lVar;
    }

    @Override // com.tencent.mm.app.g3
    public void a(java.lang.String str) {
        j03.d.a(this.f297023a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterUploadPlugin", "Upload failed");
        d(str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f297025c.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Failed to upload file: " + str)))));
    }

    @Override // com.tencent.mm.app.g3
    public void b(int i17, java.lang.String str) {
        j03.d.a(this.f297023a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterUploadPlugin", "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f297025c.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Upload canceled: " + str)))));
    }

    @Override // com.tencent.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        j03.d.a(this.f297023a);
        if (i17 == 100) {
            long C = this.f297024b.C();
            d(str);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f297025c.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(C))));
        }
    }

    public final void d(java.lang.String str) {
        if (str != null) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            boolean z17 = false;
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() && m17.f213266a.d(m17.f213267b)) {
                z17 = true;
            }
            j03.d.a(this.f297023a);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterUploadPlugin", "Delete file %s, res: %s", str, java.lang.Boolean.valueOf(z17));
        }
    }
}
