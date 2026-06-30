package ok4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, long j17) {
        super(0);
        this.f346035d = str;
        this.f346036e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        ok4.u uVar = ok4.u.f346041a;
        java.lang.String str = this.f346035d;
        com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (a17 != null) {
            long j17 = this.f346036e;
            a17.f59242J = j17;
            a17.K = -1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceStartTimeStamp >> " + str + ", " + j17);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceStartTimeStamp >> " + str + " but data is no find");
        }
        return f0Var2;
    }
}
