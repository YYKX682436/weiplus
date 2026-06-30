package ok4;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f346034e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, int i17) {
        super(0);
        this.f346033d = str;
        this.f346034e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        ok4.u uVar = ok4.u.f346041a;
        java.lang.String str = this.f346033d;
        com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (a17 != null) {
            int i17 = this.f346034e;
            a17.K = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceDurationMS >> " + str + ", " + i17);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceDurationMS >> " + str + " but data is no find");
        }
        return f0Var2;
    }
}
