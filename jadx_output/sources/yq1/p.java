package yq1;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f464451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f464453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yq1.z f464454i;

    public p(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.Object[] objArr, yq1.z zVar) {
        this.f464449d = str;
        this.f464450e = i17;
        this.f464451f = i18;
        this.f464452g = str2;
        this.f464453h = objArr;
        this.f464454i = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.String str = this.f464449d;
            int i17 = this.f464450e;
            int i18 = this.f464451f;
            java.lang.String str2 = this.f464452g;
            java.lang.Object[] objArr = this.f464453h;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.b(str, i17, i18, str2, java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.Exception e17) {
            this.f464454i.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceImpl", "addToPreload ex %s", e17.getMessage());
        }
    }
}
