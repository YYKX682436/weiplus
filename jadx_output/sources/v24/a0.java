package v24;

/* loaded from: classes15.dex */
public class a0 implements com.tencent.mm.plugin.setting.ui.setting.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f432896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f432897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f432898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f432899d;

    public a0(android.content.Context context, long j17, long j18, wd0.p1 p1Var) {
        this.f432896a = context;
        this.f432897b = j17;
        this.f432898c = j18;
        this.f432899d = p1Var;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.tg
    public void a(boolean z17) {
        if (z17) {
            v24.o0.a(this.f432896a, 3, 1, this.f432897b, this.f432898c, new v24.z(this), true);
        } else {
            this.f432899d.a();
        }
    }
}
