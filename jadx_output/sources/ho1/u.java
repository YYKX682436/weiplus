package ho1;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282822h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f282823i;

    public u(java.lang.String str, ho1.v vVar, long j17, long j18, java.lang.String str2, long j19) {
        this.f282818d = str;
        this.f282819e = vVar;
        this.f282820f = j17;
        this.f282821g = j18;
        this.f282822h = str2;
        this.f282823i = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("UploadFileAsync", new ho1.t(this.f282818d, this.f282819e, this.f282820f, this.f282821g, this.f282822h, this.f282823i));
    }
}
