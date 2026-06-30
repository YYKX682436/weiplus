package df2;

/* loaded from: classes3.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f231132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f231133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f231134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(df2.r4 r4Var, kotlin.jvm.internal.c0 c0Var, r45.tm1 tm1Var, java.lang.String str) {
        super(0);
        this.f231132d = r4Var;
        this.f231133e = c0Var;
        this.f231134f = tm1Var;
        this.f231135g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.r4 r4Var = this.f231132d;
        kotlinx.coroutines.r2 r2Var = r4Var.f231221q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        r45.tm1 tm1Var = this.f231134f;
        java.lang.String str = this.f231135g;
        kotlin.jvm.internal.c0 c0Var = this.f231133e;
        int i17 = c0Var.f310112d ? 2 : 1;
        com.tencent.mars.xlog.Log.i("FinderLiveSubscribeNextLiveGuideController", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        ke2.b bVar = new ke2.b(((mm2.c1) r4Var.business(mm2.c1.class)).f328852o, 2, i17, null, 1, ((mm2.e1) r4Var.business(mm2.e1.class)).f328983m, java.lang.Long.valueOf(((mm2.e1) r4Var.business(mm2.e1.class)).f328988r.getLong(0)));
        bVar.t(r4Var.O6(), r4Var.O6().getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        bVar.l().K(new df2.p4(i17, c0Var, r4Var, tm1Var, str));
        return jz5.f0.f302826a;
    }
}
