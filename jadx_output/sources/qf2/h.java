package qf2;

/* loaded from: classes3.dex */
public final class h implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f362389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qf2.l f362390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f362391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362393e;

    public h(long j17, qf2.l lVar, int i17, int i18, int i19) {
        this.f362389a = j17;
        this.f362390b = lVar;
        this.f362391c = i17;
        this.f362392d = i18;
        this.f362393e = i19;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pm0.v.X(new qf2.f(this.f362389a, this.f362390b, i17, i18, str, this.f362393e, this.f362391c, this.f362392d));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pm0.v.X(new qf2.g(this.f362389a, this.f362390b, this.f362391c, this.f362392d, this.f362393e));
    }
}
