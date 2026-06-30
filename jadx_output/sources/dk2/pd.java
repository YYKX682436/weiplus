package dk2;

/* loaded from: classes3.dex */
public final class pd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.pd f233924d = new dk2.pd();

    public pd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.H;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", true);
            bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", false);
            k0Var.statusChange(bVar, bundle);
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.a(liveRoomControllerStore);
        }
        return jz5.f0.f302826a;
    }
}
