package ya2;

/* loaded from: classes10.dex */
public final class v0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f460560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f460562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f460564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f460565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f460566g;

    public v0(int i17, int i18, int i19, android.content.Context context, android.content.Intent intent, android.view.View view, boolean z17) {
        this.f460560a = i17;
        this.f460561b = i18;
        this.f460562c = i19;
        this.f460563d = context;
        this.f460564e = intent;
        this.f460565f = view;
        this.f460566g = z17;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        ya2.e1.f460472a.X(this.f460560a, this.f460561b, this.f460562c, this.f460563d, this.f460564e, this.f460565f, this.f460566g);
    }
}
