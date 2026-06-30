package sf2;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f407297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(sf2.e1 e1Var, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f407296d = e1Var;
        this.f407297e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.trtc.TRTCCloud T;
        tn0.w0 Q6 = this.f407296d.Q6();
        if (Q6 == null || (T = Q6.T()) == null) {
            return null;
        }
        sf2.e1 e1Var = this.f407296d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f407297e;
        return new dh2.x(liveRoomControllerStore, liveRoomControllerStore.getLiveRoomData(), T, liveRoomControllerStore.getLiveRoomData().f272475i, e1Var, dh2.d0.f232438e);
    }
}
