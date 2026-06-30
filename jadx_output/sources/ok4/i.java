package ok4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f346011d = i17;
        this.f346012e = str;
        this.f346013f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346011d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f346013f;
        java.lang.String str2 = this.f346012e;
        if (i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = ok4.u.f346041a.a(str2);
            if (a17 != null) {
                a17.f59263x = a17.b("FullScreen_FileKey", str != null ? str : "", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenFileKey >> " + str2 + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenFileKey >> " + str2 + " but data is no find");
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = ok4.u.f346041a.a(str2);
            if (a18 != null) {
                a18.f59253n = a18.b("Preview_FileKey", str != null ? str : "", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewFileKey >> " + str2 + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewFileKey >> " + str2 + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
