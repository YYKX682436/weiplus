package v24;

/* loaded from: classes15.dex */
public class d0 implements com.tencent.mm.plugin.setting.ui.setting.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f432907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f432908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f432909c;

    public d0(android.content.Context context, long j17, wd0.p1 p1Var) {
        this.f432907a = context;
        this.f432908b = j17;
        this.f432909c = p1Var;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.tg
    public void a(boolean z17) {
        if (z17) {
            v24.o0.a(this.f432907a, 3, 1, this.f432908b, 0L, new v24.c0(this), false);
        } else {
            this.f432909c.a();
        }
    }
}
