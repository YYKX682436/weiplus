package v24;

/* loaded from: classes15.dex */
public class y implements com.tencent.mm.plugin.setting.ui.setting.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f432963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f432964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f432965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v24.n0 f432966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f432967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f432968f;

    public y(android.content.Context context, int i17, long j17, v24.n0 n0Var, wd0.p1 p1Var, boolean z17) {
        this.f432963a = context;
        this.f432964b = i17;
        this.f432965c = j17;
        this.f432966d = n0Var;
        this.f432967e = p1Var;
        this.f432968f = z17;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.tg
    public void a(boolean z17) {
        if (z17) {
            v24.o0.a(this.f432963a, this.f432964b, 1, this.f432965c, 0L, new v24.x(this), this.f432968f);
        } else {
            this.f432967e.a();
        }
    }
}
