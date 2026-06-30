package id2;

/* loaded from: classes3.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290857g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(0);
        this.f290854d = u3Var;
        this.f290855e = context;
        this.f290856f = j17;
        this.f290857g = j18;
        this.f290858h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f290855e;
        long j17 = this.f290856f;
        long j18 = this.f290857g;
        yz5.l lVar = this.f290858h;
        id2.u3 u3Var = this.f290854d;
        u3Var.getClass();
        u3Var.f290826n = new com.tencent.mm.plugin.finder.live.widget.xt(context, new id2.r3(u3Var, context, j17, j18, lVar));
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "showReplayCancelWidget");
        com.tencent.mm.plugin.finder.live.widget.xt xtVar = u3Var.f290826n;
        if (xtVar != null) {
            xtVar.w();
        }
        return jz5.f0.f302826a;
    }
}
