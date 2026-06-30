package my2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.e f332720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(my2.e eVar) {
        super(0);
        this.f332720d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        my2.a aVar;
        my2.e eVar = this.f332720d;
        if (((mm2.c1) eVar.P0(mm2.c1.class)).a8() && (aVar = eVar.f332725r) != null) {
            my2.u uVar = (my2.u) aVar;
            r45.me2 me2Var = ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328784b6;
            if (me2Var == null) {
                com.tencent.mars.xlog.Log.i(uVar.f332765f, "resume votingInfo is null");
                qo0.c.a(uVar.f332764e, qo0.b.f365439y2, null, 2, null);
            } else {
                pm0.v.X(new my2.j(me2Var, uVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
