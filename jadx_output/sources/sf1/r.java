package sf1;

/* loaded from: classes13.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f407017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407018i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, kotlin.jvm.internal.h0 h0Var4, android.app.Activity activity, java.lang.String str) {
        super(0);
        this.f407013d = h0Var;
        this.f407014e = h0Var2;
        this.f407015f = h0Var3;
        this.f407016g = h0Var4;
        this.f407017h = activity;
        this.f407018i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wu5.c cVar = (wu5.c) this.f407013d.f310123d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        rf1.c cVar2 = (rf1.c) this.f407014e.f310123d;
        if (cVar2 != null) {
            rf1.d.c(cVar2);
        }
        android.content.BroadcastReceiver broadcastReceiver = (android.content.BroadcastReceiver) this.f407015f.f310123d;
        if (broadcastReceiver != null) {
            this.f407017h.unregisterReceiver(broadcastReceiver);
        }
        com.tencent.mm.plugin.appbrand.v0 v0Var = (com.tencent.mm.plugin.appbrand.v0) this.f407016g.f310123d;
        if (v0Var == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.x0.e(this.f407018i, v0Var);
        return jz5.f0.f302826a;
    }
}
