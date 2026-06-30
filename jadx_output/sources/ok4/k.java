package ok4;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f346018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, java.lang.String str, boolean z17) {
        super(0);
        this.f346016d = i17;
        this.f346017e = str;
        this.f346018f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        int i17 = this.f346016d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (i17 == 1) {
            ok4.u uVar = ok4.u.f346041a;
            java.lang.String str = this.f346017e;
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str);
            if (a17 != null) {
                boolean z17 = this.f346018f;
                a17.f59255p = z17 ? 1 : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsFromPreLoad >> " + str + ", " + z17);
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsFromPreLoad >> " + str + "  >> is no have struct");
            }
        }
        return f0Var2;
    }
}
