package qb2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f361196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.g0 f361197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qb2.t f361198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361199g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361200h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z17, qb2.g0 g0Var, qb2.t tVar, java.lang.String str, android.view.View view) {
        super(0);
        this.f361196d = z17;
        this.f361197e = g0Var;
        this.f361198f = tVar;
        this.f361199g = str;
        this.f361200h = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_finder_disable_sendmsg_need_follow", this.f361196d);
        qb2.g0 g0Var = this.f361197e;
        wn.u uVar = g0Var.f361211a.f64738u;
        if (uVar == null) {
            kotlin.jvm.internal.o.o("readyChattingUIC");
            throw null;
        }
        wn.t tVar = uVar.f447380d;
        if (tVar != null) {
            qb2.t tVar2 = this.f361198f;
            ((rb5.l) tVar).l(tVar2.field_sessionId, this.f361199g, bundle, new qb2.d0(tVar2, this.f361200h, g0Var));
        }
        return jz5.f0.f302826a;
    }
}
