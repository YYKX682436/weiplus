package ok4;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f346039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, java.lang.String str2, int i17) {
        super(0);
        this.f346037d = str;
        this.f346038e = str2;
        this.f346039f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.String str = this.f346037d;
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoBitrate >> ");
        java.lang.String str2 = this.f346038e;
        sb6.append(str2);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", ");
        int i18 = this.f346039f;
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", sb6.toString());
        jz5.f0 f0Var = jz5.f0.f302826a;
        jz5.f0 f0Var2 = null;
        if (i18 == 2) {
            ok4.u uVar = ok4.u.f346041a;
            i17 = d17 != null ? d17.f162383b : 0;
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str2);
            if (a17 != null) {
                a17.E = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenVideoBitrate >> " + str2 + ", " + i17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenVideoBitrate >> " + str2 + " but data is no find");
            }
        } else {
            ok4.u uVar2 = ok4.u.f346041a;
            i17 = d17 != null ? d17.f162383b : 0;
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = uVar2.a(str2);
            if (a18 != null) {
                a18.f59261v = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewVideoBitrate >> " + str2 + ", " + i17);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewVideoBitrate >> " + str2 + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
