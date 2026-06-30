package xe2;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f453864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(r45.f52 f52Var) {
        super(0);
        this.f453864d = f52Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        el2.i2 i2Var;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (i2Var = (el2.i2) liveRoomControllerStore.controller(el2.i2.class)) != null) {
            i2Var.a7(this.f453864d, java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
