package ok4;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f346023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, java.lang.String str, java.lang.Long l17) {
        super(0);
        this.f346021d = i17;
        this.f346022e = str;
        this.f346023f = l17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346021d;
        jz5.f0 f0Var2 = null;
        java.lang.Long l17 = this.f346023f;
        java.lang.String str = this.f346022e;
        if (i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = ok4.u.f346041a.a(str);
            if (a17 != null) {
                a17.D = l17 != null ? l17.longValue() : 0L;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReceiveLength >> " + str + ", " + l17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReceiveLength >> " + str + " but data is no find");
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = ok4.u.f346041a.a(str);
            if (a18 != null) {
                a18.f59260u = l17 != null ? l17.longValue() : 0L;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewReceiverLength >> " + str + ", " + l17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewReceiverLength >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
