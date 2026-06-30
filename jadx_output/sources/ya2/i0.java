package ya2;

/* loaded from: classes10.dex */
public final class i0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl0.g f460490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f460492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f460494e;

    public i0(cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str, zy2.i5 i5Var2) {
        this.f460490a = gVar;
        this.f460491b = context;
        this.f460492c = i5Var;
        this.f460493d = str;
        this.f460494e = i5Var2;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        ya2.e1 e1Var = ya2.e1.f460472a;
        cl0.g extInfo = this.f460490a;
        kotlin.jvm.internal.o.f(extInfo, "$extInfo");
        android.content.Context context = this.f460491b;
        zy2.i5 i5Var = this.f460492c;
        java.lang.String appid = this.f460493d;
        kotlin.jvm.internal.o.f(appid, "$appid");
        zy2.ta.a(e1Var, extInfo, context, i5Var, appid, true, this.f460494e, null, 64, null);
    }
}
