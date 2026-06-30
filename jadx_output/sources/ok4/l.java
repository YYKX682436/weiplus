package ok4;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, java.lang.String str) {
        super(0);
        this.f346019d = i17;
        this.f346020e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346019d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f346020e;
        if (i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = ok4.u.f346041a.a(str);
            if (a17 != null) {
                a17.f59265z = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsMoovReady >> " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsMoovReady >> " + str + " but data is no find");
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = ok4.u.f346041a.a(str);
            if (a18 != null) {
                a18.f59256q = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsMoovReady >> " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsMoovReady >> " + str + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
