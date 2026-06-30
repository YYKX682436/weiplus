package dk2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.pm1 f233597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.pm1 pm1Var) {
        super(0);
        this.f233597d = pm1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.a0 a0Var;
        zg2.d dVar;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (a0Var = (df2.a0) liveRoomControllerStore.controller(df2.a0.class)) != null && (dVar = a0Var.f229647m) != null) {
            dVar.postValue(this.f233597d);
        }
        return jz5.f0.f302826a;
    }
}
