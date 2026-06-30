package ld2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f318091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ml2.l1 f318094g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gk2.e f318095h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, yz5.p pVar, ml2.l1 l1Var, gk2.e eVar) {
        super(0);
        this.f318091d = mMActivity;
        this.f318092e = str;
        this.f318093f = pVar;
        this.f318094g = l1Var;
        this.f318095h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.kv0 a17 = db2.t4.f228171a.a(5874);
        com.tencent.mm.ui.MMActivity mMActivity = this.f318091d;
        ek2.c2 c2Var = new ek2.c2(a17, xy2.c.e(mMActivity), null, 0L, 0L, 0, 0L, 0, null, 248, null);
        az2.j.u(c2Var, this.f318091d, null, 0L, 6, null);
        pq5.g l17 = c2Var.l();
        l17.f(mMActivity);
        return l17.h(new ld2.e(this.f318091d, this.f318092e, this.f318093f, this.f318094g, this.f318095h));
    }
}
