package dk2;

/* loaded from: classes.dex */
public final class y9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f234381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f234384i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234385m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(int i17, java.util.List list, dk2.ca caVar, java.util.List list2, int i18, dk2.t9 t9Var, java.lang.String str) {
        super(1);
        this.f234379d = i17;
        this.f234380e = list;
        this.f234381f = caVar;
        this.f234382g = list2;
        this.f234383h = i18;
        this.f234384i = t9Var;
        this.f234385m = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String filePath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadVideosSequentially: video downloaded, index=");
        int i17 = this.f234379d;
        sb6.append(i17);
        sb6.append(", path=");
        sb6.append(filePath);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", sb6.toString());
        this.f234380e.add(filePath);
        pm0.v.X(new dk2.x9(this.f234384i, filePath, this.f234385m, this.f234379d, this.f234383h));
        this.f234381f.b(this.f234382g, i17 + 1, this.f234383h, this.f234380e, this.f234384i);
        return jz5.f0.f302826a;
    }
}
