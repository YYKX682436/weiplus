package df2;

/* loaded from: classes3.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f230912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(df2.p1 p1Var, int i17) {
        super(1);
        this.f230912d = p1Var;
        this.f230913e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v94 it = (r45.v94) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingController", "New replay setting received: [" + it.getBoolean(0) + ',' + it.getBoolean(1) + ',' + it.getBoolean(2) + ',' + it.getBoolean(3) + ']');
        df2.p1 p1Var = this.f230912d;
        df2.p1.Z6(p1Var, it);
        if (this.f230913e == 1) {
            ((mm2.c1) p1Var.business(mm2.c1.class)).Y5 = it;
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingController", "modifyLiveReplaySetting: " + it);
            df2.n1 n1Var = new df2.n1(it, p1Var);
            dk2.xf P6 = p1Var.P6();
            if (P6 != null) {
                p1Var.O6();
                long j17 = ((mm2.e1) p1Var.business(mm2.e1.class)).f328988r.getLong(0);
                long j18 = ((mm2.e1) p1Var.business(mm2.e1.class)).f328983m;
                dk2.r4 r4Var = (dk2.r4) P6;
                com.tencent.mars.xlog.Log.i(r4Var.f234009d, "setReplaySetting liveId:" + j17 + " objectId:" + j18 + " replaySetting:" + it.getBoolean(0) + ", " + it.getBoolean(2) + ", " + it.getBoolean(1) + ", " + it.getBoolean(3));
                pq5.g l17 = new ke2.g(j17, j18, ((mm2.c1) r4Var.m(mm2.c1.class)).f328866q, xy2.c.f(r4Var.f234008c), 0, null, null, null, it, 1073741824L, n1Var, null, 2288, null).l();
                java.lang.Object M = r4Var.M();
                if (M != null && (M instanceof com.tencent.mm.ui.MMActivity)) {
                    l17.f((im5.b) M);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
