package ok4;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f346030f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i17, java.lang.String str, int i18) {
        super(0);
        this.f346028d = i17;
        this.f346029e = str;
        this.f346030f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346028d;
        jz5.f0 f0Var2 = null;
        int i18 = this.f346030f;
        java.lang.String str = this.f346029e;
        if (i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = ok4.u.f346041a.a(str);
            if (a17 != null) {
                a17.B = i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenRespVideoFormat >> " + str + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenRespVideoFormat >> " + str + " but data is no find");
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = ok4.u.f346041a.a(str);
            if (a18 != null) {
                a18.f59258s = i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewRespVideoFormat >> " + str + ", " + i18);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewRespVideoFormat >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
