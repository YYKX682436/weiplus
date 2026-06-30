package sf2;

/* loaded from: classes10.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f407367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(sf2.e1 e1Var, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f407366d = e1Var;
        this.f407367e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sf2.e1 e1Var = this.f407366d;
        tn0.w0 Q6 = e1Var.Q6();
        sf2.m1 m1Var = new sf2.m1(Q6 != null ? Q6.T() : null, e1Var.g7(), e1Var.f7(), this.f407367e.getLiveRoomData().f272475i, e1Var.e7());
        kotlinx.coroutines.r2 r2Var = m1Var.f407210i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        m1Var.f407210i = kotlinx.coroutines.l.d(m1Var.f407205d, null, null, new sf2.l1(m1Var, null), 3, null);
        return m1Var;
    }
}
