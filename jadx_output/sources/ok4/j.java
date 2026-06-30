package ok4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, java.lang.String str) {
        super(0);
        this.f346014d = i17;
        this.f346015e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346014d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f346015e;
        if (i17 == 2) {
            ok4.u uVar = ok4.u.f346041a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str);
            if (a17 != null) {
                long j17 = a17.H;
                a17.C = 1;
                a17.I = currentTimeMillis >= j17 ? (int) (currentTimeMillis - j17) : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsDownLoadComplete >> " + str + ", " + currentTimeMillis + ", " + j17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsDownLoadComplete >> " + str + " but data is no find");
            }
        } else {
            ok4.u uVar2 = ok4.u.f346041a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = uVar2.a(str);
            if (a18 != null) {
                long j18 = a18.F;
                a18.G = currentTimeMillis2 >= j18 ? (int) (currentTimeMillis2 - j18) : 0;
                a18.f59259t = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewDownLoadFinish >> " + str + ", " + currentTimeMillis2 + ", " + j18 + ", " + java.lang.Thread.currentThread().getName());
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewDownLoadFinish >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
