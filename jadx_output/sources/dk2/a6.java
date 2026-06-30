package dk2;

/* loaded from: classes3.dex */
public final class a6 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f233178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f233179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.s f233180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233181e;

    public a6(gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, yz5.s sVar, int i17) {
        this.f233177a = eVar;
        this.f233178b = xfVar;
        this.f233179c = k6Var;
        this.f233180d = sVar;
        this.f233181e = i17;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "share live fail!");
        pm0.v.X(new dk2.y5(this.f233178b, this.f233180d, i18, i17, str));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "share live success!");
        pm0.v.X(new dk2.z5(this.f233177a, this.f233178b, this.f233179c, this.f233180d, this.f233181e));
    }
}
