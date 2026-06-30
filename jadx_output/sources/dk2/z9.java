package dk2;

/* loaded from: classes.dex */
public final class z9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f234428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f234430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f234432i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(int i17, dk2.ca caVar, java.util.List list, int i18, java.util.List list2, dk2.t9 t9Var) {
        super(1);
        this.f234427d = i17;
        this.f234428e = caVar;
        this.f234429f = list;
        this.f234430g = i18;
        this.f234431h = list2;
        this.f234432i = t9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String errorMsg = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadVideosSequentially: download failed at index ");
        int i17 = this.f234427d;
        sb6.append(i17);
        sb6.append(", error=");
        sb6.append(errorMsg);
        com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", sb6.toString());
        this.f234428e.b(this.f234429f, i17 + 1, this.f234430g, this.f234431h, this.f234432i);
        return jz5.f0.f302826a;
    }
}
