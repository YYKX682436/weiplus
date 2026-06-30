package gg1;

/* loaded from: classes7.dex */
public final class g0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f271562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f271560a = c1Var;
        this.f271561b = i17;
        this.f271562c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", "play fail");
        gg1.x xVar = new gg1.x(gg1.a.f271526m);
        xVar.f271655b = java.lang.Integer.valueOf(this.f271562c);
        gg1.c1.a(this.f271560a, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        gg1.c1 c1Var = this.f271560a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "play success, url = [%s]", c1Var.f271537c.f261899e);
        int i17 = this.f271561b;
        if (i17 <= 0) {
            return;
        }
        c1Var.f271546l = new gg1.k0(c1Var, i17);
    }
}
