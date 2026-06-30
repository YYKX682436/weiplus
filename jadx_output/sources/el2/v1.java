package el2;

/* loaded from: classes3.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k92 f253930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(el2.c2 c2Var, r45.k92 k92Var, r45.y42 y42Var) {
        super(0);
        this.f253929d = c2Var;
        this.f253930e = k92Var;
        this.f253931f = y42Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.m mVar = com.tencent.mm.plugin.finder.live.plugin.r.f114059n;
        el2.c2 c2Var = this.f253929d;
        android.content.Context m17 = c2Var.m();
        kotlin.jvm.internal.o.f(m17, "access$getContext(...)");
        gk2.e S0 = c2Var.f253762e.S0();
        cm2.h0 h0Var = new cm2.h0(this.f253930e);
        r45.y42 y42Var = this.f253931f;
        h0Var.f43397s = y42Var.getByteString(5);
        h0Var.f43398t = y42Var.getByteString(6);
        java.lang.String string = y42Var.getString(4);
        if (string == null) {
            string = "";
        }
        h0Var.f43387f = string;
        mVar.a(m17, S0, c2Var.f253763f, h0Var);
        return jz5.f0.f302826a;
    }
}
