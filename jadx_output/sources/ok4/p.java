package ok4;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, java.lang.String str) {
        super(0);
        this.f346031d = i17;
        this.f346032e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346031d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f346032e;
        if (i17 == 2) {
            ok4.u uVar = ok4.u.f346041a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str);
            if (a17 != null) {
                a17.H = currentTimeMillis;
                a17.C = 0;
                a17.f59265z = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenStartToDownLoad >> " + str + ", " + currentTimeMillis);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenStartToDownLoad >> " + str + " but data is no find");
            }
        } else {
            ok4.u uVar2 = ok4.u.f346041a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = uVar2.a(str);
            if (a18 != null) {
                a18.F = currentTimeMillis2;
                a18.f59259t = 0;
                a18.f59256q = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewStartDownLoadTimeStamp >> " + str + ' ' + a18.F + ' ' + java.lang.Thread.currentThread());
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewStartDownLoadTimeStamp >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
