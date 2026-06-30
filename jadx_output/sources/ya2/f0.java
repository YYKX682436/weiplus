package ya2;

/* loaded from: classes10.dex */
public final class f0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl0.g f460475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f460477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f460478d;

    public f0(cl0.g gVar, android.content.Context context, zy2.i5 i5Var, yz5.l lVar) {
        this.f460475a = gVar;
        this.f460476b = context;
        this.f460477c = i5Var;
        this.f460478d = lVar;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        ya2.e1 e1Var = ya2.e1.f460472a;
        cl0.g extInfo = this.f460475a;
        kotlin.jvm.internal.o.f(extInfo, "$extInfo");
        zy2.ta.a(e1Var, extInfo, this.f460476b, this.f460477c, null, false, null, this.f460478d, 56, null);
    }
}
