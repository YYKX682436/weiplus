package in2;

/* loaded from: classes10.dex */
public final class l implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in2.s f292855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f292856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292857c;

    public l(in2.s sVar, boolean z17, android.view.View view) {
        this.f292855a = sVar;
        this.f292856b = z17;
        this.f292857c = view;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pm0.v.X(new in2.j(this.f292855a, this.f292856b, this.f292857c));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pm0.v.X(new in2.k(this.f292855a, this.f292856b));
    }
}
