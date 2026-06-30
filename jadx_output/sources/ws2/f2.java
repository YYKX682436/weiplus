package ws2;

/* loaded from: classes3.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f449035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f449036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f449037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(ws2.j2 j2Var, mm2.i7 i7Var, gk2.e eVar) {
        super(3);
        this.f449035d = j2Var;
        this.f449036e = i7Var;
        this.f449037f = eVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.hd5 hd5Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        r45.o12 resp = (r45.o12) obj3;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f449035d.f449062i = false;
        if (booleanValue) {
            long j17 = this.f449036e.f329147d;
            mm2.i7 i7Var = ((mm2.h5) this.f449037f.a(mm2.h5.class)).f329112g;
            if (j17 == (i7Var != null ? i7Var.f329147d : 0L)) {
                mm2.i7 i7Var2 = ((mm2.h5) this.f449037f.a(mm2.h5.class)).f329112g;
                if (i7Var2 != null && (hd5Var = i7Var2.f329148e) != null) {
                    hd5Var.set(5, 0);
                }
                ((mm2.h5) this.f449037f.a(mm2.h5.class)).N6(null);
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null) {
                    k0Var.statusChange(qo0.b.f365372k2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
