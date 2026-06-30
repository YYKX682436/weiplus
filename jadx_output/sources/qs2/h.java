package qs2;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f366290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f366292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qs2.q f366293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f366294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f366295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, android.content.Context context, android.content.Intent intent, qs2.q qVar, long j17, long j18) {
        super(0);
        this.f366290d = z17;
        this.f366291e = context;
        this.f366292f = intent;
        this.f366293g = qVar;
        this.f366294h = j17;
        this.f366295i = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f366290d;
        android.content.Context context = this.f366291e;
        if (z17) {
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            p2Var.W(p2Var.i(context, 27, false));
        } else {
            com.tencent.mm.plugin.finder.report.p2 p2Var2 = com.tencent.mm.plugin.finder.report.p2.f125237a;
            p2Var2.W(p2Var2.i(context, 16, false));
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.B(4);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(context, this.f366292f);
        qs2.q qVar = this.f366293g;
        long j17 = this.f366294h;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        qVar.wj(true, j17, Ri, this.f366295i, false, this.f366290d);
        return jz5.f0.f302826a;
    }
}
