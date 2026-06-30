package dk2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ff1 f233629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r45.ff1 ff1Var) {
        super(0);
        this.f233629d = ff1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.zb zbVar;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (zbVar = (df2.zb) liveRoomControllerStore.controller(df2.zb.class)) != null) {
            zbVar.l7(this.f233629d, 1);
        }
        return jz5.f0.f302826a;
    }
}
