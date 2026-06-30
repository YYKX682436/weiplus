package wp4;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448444f;

    public u(java.lang.String str, int i17, int i18) {
        this.f448442d = str;
        this.f448443e = i17;
        this.f448444f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String workTagId = this.f448442d;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportUploadAction >> workTagId: ");
        sb6.append(workTagId);
        sb6.append(", action: ");
        sb6.append(7);
        sb6.append(", lastWorkType: ");
        int i17 = this.f448443e;
        sb6.append(i17);
        sb6.append(", currentWorkType: ");
        int i18 = this.f448444f;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.p(workTagId);
        snsFakeVideoLogStruct.f60551d = 7;
        snsFakeVideoLogStruct.f60554g = i17;
        snsFakeVideoLogStruct.f60555h = i18;
        snsFakeVideoLogStruct.k();
    }
}
